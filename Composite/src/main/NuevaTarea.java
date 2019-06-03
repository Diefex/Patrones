package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import componentes.Proyecto;
import componentes.Tarea;

public class NuevaTarea extends JFrame implements ActionListener {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	JButton btnAsignar;
	Proyecto padre;
	VerProyecto ver;

	public NuevaTarea(Proyecto padre, VerProyecto ver) {
		this.padre = padre;
		this.ver = ver;
		this.setSize(369, 237);
		getContentPane().setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 11, 57, 26);
		getContentPane().add(lblNombre);

		JLabel lblDiasAsignados = new JLabel("Dias asignados:");
		lblDiasAsignados.setBounds(10, 85, 85, 26);
		getContentPane().add(lblDiasAsignados);

		JLabel lblEncargado = new JLabel("Encargado:");
		lblEncargado.setBounds(10, 48, 57, 26);
		getContentPane().add(lblEncargado);

		btnAsignar = new JButton("Asignar");
		btnAsignar.setBounds(128, 136, 85, 52);
		btnAsignar.addActionListener(this);
		getContentPane().add(btnAsignar);

		textField = new JTextField();
		textField.setBounds(105, 88, 238, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(105, 51, 238, 20);
		getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(105, 14, 238, 20);
		getContentPane().add(textField_2);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAsignar) {
			Tarea tarea = new Tarea(textField_1.getText(), textField_2.getText(),
					Integer.parseInt(textField.getText()));
			padre.nuevaTarea(tarea);
			ver.getTareas().addElement(tarea.getNombre());
			ver.setTerminar();
			this.dispose();
		}
	}

}
