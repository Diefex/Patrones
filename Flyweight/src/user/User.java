package user;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.LinkedList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import clientes.Cliente;
import clientes.GenClientes;
import flyweight.Canal;
import flyweight.CanalFactory;

public class User extends JFrame implements Runnable {

	public static void main(String[] args) {
		User patronFlyweight = new User();
	}

	boolean enServicio;
	Thread servicio;

	LinkedList<Cliente> cola;
	JList lstCola;
	DefaultListModel mdlCola;
	GenClientes generador = new GenClientes();
	CanalFactory canales;

	JLabel[] lblCanales = new JLabel[10];

	public User() {
		// Configuraciones del JFrame y componentes graficos---------
		this.setBounds(100, 100, 500, 300);
		this.setLayout(new GridLayout(1, 2));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnlCanales = new JPanel();
		pnlCanales.setLayout(new GridLayout(10, 1));
		pnlCanales.setSize(this.getWidth() / 2, this.getHeight());

		for (int i = 0; i < 10; i++) {
			JLabel lblCanal = new JLabel("Canal " + (i + 1));
			lblCanales[i] = lblCanal;
			pnlCanales.add(lblCanal);
		}
		this.add(pnlCanales);
		JPanel pnlCola = new JPanel();
		pnlCola.setLayout(new BorderLayout());
		lstCola = new JList();
		lstCola.setSize(this.getWidth() / 2, this.getHeight());
		pnlCola.add(lstCola, BorderLayout.CENTER);
		pnlCola.add(new JLabel("Cola de Espera"), BorderLayout.NORTH);
		this.add(pnlCola);

		mdlCola = new DefaultListModel();
		// ----------------------------------------------------------
		canales = new CanalFactory();
		cola = new LinkedList<Cliente>();

		servicio = new Thread(this);
		servicio.start();
		enServicio = true;

	}

	public synchronized void generarClientes() {
		if (cola.size() < 200) {
			int numClientes = 5 + (int) (Math.random() * 10);
			for (int i = 0; i < numClientes; i++) {
				cola.offer(generador.getCliente());
			}
			System.out.println(numClientes + " clientes nuevos");
		}
	}

	public synchronized void comunicarClientes() {
		while (cola.peek() != null) {
			Canal ch = canales.getCanal();
			if (ch != null) {
				ch.comunicar(cola.poll());
			} else {
				return;
			}
		}
	}

	public synchronized void refrescarCola() {
		mdlCola.clear();
		for (Cliente c : cola) {
			mdlCola.addElement(c.getNumero());
		}
		lstCola.setModel(mdlCola);
	}

	@Override
	public void run() {
		long t1 = System.currentTimeMillis();
		long t2 = 0;
		long iteracion;
		long seg = 5000;
		int temp = 0;

		while (enServicio) {

			comunicarClientes();

			t2 = System.currentTimeMillis();
			iteracion = (t2 - t1);
			seg += iteracion;
			t1 = t2;
			if (seg >= 1000) {
				temp++;
				for (Canal c : canales.getCanalPool()) {
					if (c.isOcupado()) {
						c.tiempo();
					}
				}
				refrescarCola();
				seg -= 1000;
			}
			if (temp >= 5) {
				generarClientes();
				temp = 0;
			}
			int i = 0;
			for (Canal c : canales.getCanalPool()) {
				if (!c.isOcupado()) {
					lblCanales[i].setText("Canal " + c.getNumero() + " libre");
					lblCanales[i].setForeground(Color.cyan);
				} else {
					lblCanales[i].setText(c.getComunicando());
					lblCanales[i].setForeground(Color.blue);
				}
				i++;
			}
		}
	}

}
