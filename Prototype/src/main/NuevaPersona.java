package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import datos.BaseDeDatos;
import datos.Persona;

public class NuevaPersona extends JFrame implements ActionListener {
	private JTextField txtNombres;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtTelefono;

	private boolean clon;

	public NuevaPersona(boolean clon) {
		this.clon = clon;

		this.setSize(451, 285);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		txtNombres = new JTextField();
		txtNombres.setBounds(112, 42, 312, 20);
		getContentPane().add(txtNombres);
		txtNombres.setColumns(10);

		JLabel lblNombre = new JLabel("Nombres");
		lblNombre.setBounds(10, 42, 92, 20);
		getContentPane().add(lblNombre);

		JLabel lblSegundoApellido = new JLabel("Apellido");
		lblSegundoApellido.setBounds(10, 73, 92, 20);
		getContentPane().add(lblSegundoApellido);

		txtApellido = new JTextField();
		txtApellido.setText("");
		txtApellido.setColumns(10);
		txtApellido.setBounds(112, 73, 312, 20);
		getContentPane().add(txtApellido);

		txtDireccion = new JTextField();
		txtDireccion.setText("");
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(112, 135, 312, 20);
		getContentPane().add(txtDireccion);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(10, 135, 92, 20);
		getContentPane().add(lblTelefono);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(10, 104, 92, 20);
		getContentPane().add(lblDireccion);

		txtTelefono = new JTextField();
		txtTelefono.setText("");
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(112, 104, 312, 20);
		getContentPane().add(txtTelefono);

		JButton btnAgregarPersona = new JButton("Agregar Persona");
		btnAgregarPersona.setBounds(146, 190, 143, 47);
		btnAgregarPersona.addActionListener(this);
		getContentPane().add(btnAgregarPersona);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 177, 414, 2);
		getContentPane().add(separator);

		if (this.clon) {
			txtApellido.setEnabled(false);
			txtDireccion.setEnabled(false);
			txtTelefono.setEnabled(false);
		}

		this.setVisible(true);
	}

	public void setDatos(Persona persona) {
		txtNombres.setText(persona.getNombre());
		txtApellido.setText(persona.getApellido());
		txtDireccion.setText(persona.getDireccion());
		txtTelefono.setText(persona.getTelefono());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Persona persona;
		if (clon) {
			persona = BaseDeDatos.getBD().personas.get(User.getList().getSelectedIndex()).clonarDatos();
			persona.setNombres(txtNombres.getText());
		} else {
			persona = new Persona();
			persona.setNombres(txtNombres.getText());
			persona.setApellido(txtApellido.getText());
			persona.setDireccion(txtDireccion.getText());
			persona.setTelefono(txtTelefono.getText());
		}
		User.agregarPersona(persona);
		this.dispose();
	}
}
