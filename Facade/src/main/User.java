package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import pago.MedioPago;
import pago.PayPal;
import pago.Pse;
import pago.Tarjeta;

public class User extends JFrame implements ActionListener {

	JButton saldo;
	JButton pago;

	Fachada sistema;

	private User() {

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setSize(300, 300);
		this.setVisible(true);

		JLabel lbl = new JLabel("Bienvenido al Portal de Pagos");
		lbl.setBounds(0, 20, this.getWidth(), 20);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.getContentPane().add(lbl);

		saldo = new JButton("Ver Saldo");
		saldo.setBounds(75, 80, 150, 50);
		saldo.addActionListener(this);
		this.getContentPane().add(saldo);

		pago = new JButton("Transacción");
		pago.setBounds(75, 150, 150, 50);
		pago.addActionListener(this);
		this.getContentPane().add(pago);

		sistema = Fachada.get();
	}

	public static void main(String[] args) {

		User user = new User();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == saldo) {
			String numCuenta = JOptionPane.showInputDialog("Ingrese su numero de Cuenta");
			JOptionPane.showMessageDialog(this, sistema.saldo(numCuenta));
		}

		if (e.getSource() == pago) {
			String numCuentaCliente = JOptionPane.showInputDialog("Ingrese su numero de Cuenta");
			String numCuentaDestino = JOptionPane.showInputDialog("Ingrese el numero de cuenta del destinatario");
			String[] medios = { "Pse", "PayPal", "Tarjeta" };
			MedioPago medioPago;
			switch (JOptionPane.showOptionDialog(this, "Seleccione un medio de pago", null, JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, medios, medios[0])) {
			case 0: {
				medioPago = new Pse();
				break;
			}
			case 1: {
				medioPago = new PayPal();
				break;
			}
			case 2: {
				medioPago = new Tarjeta();
				break;
			}
			default: {
				medioPago = new Tarjeta();
			}
			}
			long valor = Long.parseLong(JOptionPane.showInputDialog("Ingrese el valor"));
			JOptionPane.showMessageDialog(this, sistema.pagar(numCuentaCliente, numCuentaDestino, medioPago, valor));
			String factura = sistema.factura(numCuentaCliente);
			VerFactura vf = new VerFactura(factura);
		}

	}

}
