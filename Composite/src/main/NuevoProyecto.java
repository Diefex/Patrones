package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import componentes.Proyecto;

public class NuevoProyecto extends JFrame implements ActionListener {
	private JTextField textField;
	private JTextField textField_1;
	JButton btnNuevoProyecto;
	private main main;
	private Proyecto padre;

	public NuevoProyecto(main main, Proyecto padre) {
		this.main = main;
		this.padre = padre;
		getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 45, 414, 38);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNombreDelProyecto = new JLabel("Nombre del Proyecto");
		lblNombreDelProyecto.setBounds(10, 11, 140, 23);
		getContentPane().add(lblNombreDelProyecto);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 128, 414, 38);
		getContentPane().add(textField_1);

		JLabel lblEncargadoDelProyecto = new JLabel("Encargado del Proyecto");
		lblEncargadoDelProyecto.setBounds(10, 94, 140, 23);
		getContentPane().add(lblEncargadoDelProyecto);

		btnNuevoProyecto = new JButton("Nuevo Proyecto");
		btnNuevoProyecto.addActionListener(this);
		btnNuevoProyecto.setBounds(151, 177, 128, 43);
		getContentPane().add(btnNuevoProyecto);

		this.setSize(456, 265);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNuevoProyecto) {
			Proyecto proyecto = new Proyecto(textField.getText(), textField_1.getText(), padre);
			main.nuevoProyecto(proyecto, padre);
			this.dispose();
		}
	}
}
