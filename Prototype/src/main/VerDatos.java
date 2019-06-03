package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import datos.Persona;

public class VerDatos extends JFrame implements ActionListener {

	private Persona persona;

	public VerDatos(Persona persona) {
		this.persona = persona;
		this.setSize(425, 222);
		getContentPane().setLayout(null);

		JLabel lbl1 = new JLabel("Nombre:");
		lbl1.setBounds(10, 11, 92, 20);
		getContentPane().add(lbl1);

		JLabel lbl2 = new JLabel("Apellido:");
		lbl2.setBounds(10, 42, 92, 20);
		getContentPane().add(lbl2);

		JLabel lbl3 = new JLabel("Direccion:");
		lbl3.setBounds(10, 73, 92, 20);
		getContentPane().add(lbl3);

		JLabel lbl4 = new JLabel("Telefono:");
		lbl4.setBounds(10, 104, 92, 20);
		getContentPane().add(lbl4);

		JLabel lblNombre = new JLabel(this.persona.getNombre());
		lblNombre.setBounds(112, 14, 280, 17);
		getContentPane().add(lblNombre);

		JLabel lblApellido = new JLabel(this.persona.getApellido());
		lblApellido.setBounds(112, 45, 280, 17);
		getContentPane().add(lblApellido);

		JLabel lblDireccion = new JLabel(this.persona.getDireccion());
		lblDireccion.setBounds(112, 107, 280, 17);
		getContentPane().add(lblDireccion);

		JLabel lblTelefono = new JLabel(this.persona.getTelefono());
		lblTelefono.setBounds(112, 76, 280, 17);
		getContentPane().add(lblTelefono);

		JButton btnModificarDatos = new JButton("Modificar Datos");
		btnModificarDatos.setBounds(105, 152, 185, 23);
		btnModificarDatos.addActionListener(this);
		getContentPane().add(btnModificarDatos);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		User.quitarPersona(persona);
		NuevaPersona np = new NuevaPersona(false);
		np.setDatos(persona);
		this.dispose();
	}

}
