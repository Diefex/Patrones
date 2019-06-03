package main;

import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import datos.BaseDeDatos;
import datos.Persona;

public class User extends JFrame {

	private static User usuario;
	private ControladorUser controladorUser;

	private static DefaultListModel modelo;
	private static JList list;

	private JButton btnNuevaPersona;
	private JButton btnModificarDatos;
	private JButton btnAgregarHijo;
	private JButton btnQuitarPersona;

	public static void main(String[] args) {

		usuario = new User(new ControladorUser(usuario));

	}

	private User(ActionListener controlador) {

		this.setBounds(20, 20, 586, 337);
		getContentPane().setLayout(null);

		controladorUser = new ControladorUser(this);

		list = new JList();
		list.setBounds(10, 11, 546, 230);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		getContentPane().add(list);

		modelo = new DefaultListModel();
		for (int i = 0; i < BaseDeDatos.getBD().personas.size(); i++) {
			modelo.add(i, BaseDeDatos.getBD().personas.get(i).getNombre());
		}
		list.setModel(modelo);
		list.setSelectedIndex(0);

		btnNuevaPersona = new JButton("Nueva Persona");
		btnNuevaPersona.setBounds(10, 252, 129, 23);
		btnNuevaPersona.addActionListener(controladorUser);
		getContentPane().add(btnNuevaPersona);

		btnModificarDatos = new JButton("Ver Datos");
		btnModificarDatos.setBounds(149, 252, 129, 23);
		btnModificarDatos.addActionListener(controladorUser);
		getContentPane().add(btnModificarDatos);

		btnAgregarHijo = new JButton("Agregar Hijo");
		btnAgregarHijo.setBounds(288, 252, 129, 23);
		btnAgregarHijo.addActionListener(controladorUser);
		getContentPane().add(btnAgregarHijo);

		btnQuitarPersona = new JButton("Quitar Persona");
		btnQuitarPersona.addActionListener(controladorUser);
		btnQuitarPersona.setBounds(427, 252, 129, 23);
		getContentPane().add(btnQuitarPersona);

		this.setVisible(true);
	}

	public JButton getBtnNuevaPersona() {
		return btnNuevaPersona;
	}

	public JButton getBtnModificarDatos() {
		return btnModificarDatos;
	}

	public static DefaultListModel getModelo() {
		return modelo;
	}

	public JButton getBtnAgregarHijo() {
		return btnAgregarHijo;
	}

	public JButton getBtnQuitarPersona() {
		return btnQuitarPersona;
	}

	public static JList getList() {
		return list;
	}

	public static void agregarPersona(Persona persona) {
		BaseDeDatos.agregarPersona(persona);
		modelo = new DefaultListModel();
		for (int i = 0; i < BaseDeDatos.getBD().personas.size(); i++) {
			modelo.add(i, BaseDeDatos.getBD().personas.get(i).getNombre());
		}
		list.setModel(modelo);
		list.setSelectedIndex(0);
	}

	public static void quitarPersona(Persona persona) {
		BaseDeDatos.quitarPersona(persona);
		modelo = new DefaultListModel();
		for (int i = 0; i < BaseDeDatos.getBD().personas.size(); i++) {
			modelo.add(i, BaseDeDatos.getBD().personas.get(i).getNombre());
		}
		list.setModel(modelo);
		list.setSelectedIndex(0);
	}

}
