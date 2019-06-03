package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import componentes.Proyecto;

public class main extends JFrame implements ActionListener {

	private static main user;
	private ArrayList<Proyecto> proyectos;
	private DefaultListModel modelo;
	JButton btnVerProyecto;
	JButton btnNuevoProyecto;
	JList list;

	public static main get() {
		if (user == null) {
			user = new main();
		}
		return user;
	}

	private main() {

		proyectos = new ArrayList<Proyecto>();

		modelo = new DefaultListModel();

		getContentPane().setLayout(null);

		btnNuevoProyecto = new JButton("Nuevo Proyecto");
		btnNuevoProyecto.addActionListener(this);
		btnNuevoProyecto.setBounds(10, 207, 145, 43);
		getContentPane().add(btnNuevoProyecto);

		list = new JList();
		list.setBounds(10, 11, 414, 182);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(modelo);
		getContentPane().add(list);

		btnVerProyecto = new JButton("Ver Proyecto");
		btnVerProyecto.setBounds(279, 207, 145, 43);
		btnVerProyecto.addActionListener(this);
		getContentPane().add(btnVerProyecto);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(450, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		get();
	}

	public void nuevoProyecto(Proyecto proyecto, Proyecto padre) {
		if (padre == null) {
			proyectos.add(proyecto);
			modelo.addElement(proyecto.getNombre());
		} else {
			padre.nuevaTarea(proyecto);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnNuevoProyecto) {
			NuevoProyecto nuevo = new NuevoProyecto(this, null);
		}

		if (e.getSource() == btnVerProyecto) {
			VerProyecto ver = new VerProyecto(proyectos.get(list.getSelectedIndex()));
		}

	}

}
