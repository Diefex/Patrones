package main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;

import componentes.Proyecto;
import componentes.ProyectoI;

public class VerProyecto extends JFrame implements ActionListener {

	JButton btnNuevaTarea;
	JButton btnNuevoSubproyecto;
	JButton btnVerSubproyecto;
	JLabel lblDiasParaTerminar;
	JList list;
	private Proyecto proyecto;
	private DefaultListModel tareas;

	public VerProyecto(Proyecto p) {
		this.proyecto = p;
		getContentPane().setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(10, 38, 299, 24);
		getContentPane().add(lblNombre);

		JLabel lblNombreDelProyecto = new JLabel(proyecto.getNombre());
		lblNombreDelProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDelProyecto.setBounds(10, 62, 299, 24);
		getContentPane().add(lblNombreDelProyecto);

		JLabel lblEncargadoDelProyecto = new JLabel(proyecto.getEncargado());
		lblEncargadoDelProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncargadoDelProyecto.setBounds(10, 146, 299, 24);
		getContentPane().add(lblEncargadoDelProyecto);

		JLabel lblEncargado = new JLabel("Encargado");
		lblEncargado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncargado.setBounds(10, 122, 299, 24);
		getContentPane().add(lblEncargado);

		JLabel lblTareas = new JLabel("Tareas & Sub-Proyectos");
		lblTareas.setHorizontalAlignment(SwingConstants.CENTER);
		lblTareas.setBounds(10, 204, 299, 14);
		getContentPane().add(lblTareas);

		tareas = new DefaultListModel();
		for (ProyectoI tarea : proyecto.getTareas()) {
			tareas.addElement(tarea.getNombre());
		}

		list = new JList();
		list.setBounds(10, 229, 299, 80);
		list.setModel(tareas);
		getContentPane().add(list);

		lblDiasParaTerminar = new JLabel("Dias para Terminar: " + proyecto.getDias());
		lblDiasParaTerminar.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDiasParaTerminar.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiasParaTerminar.setBounds(10, 320, 299, 30);
		getContentPane().add(lblDiasParaTerminar);

		btnNuevaTarea = new JButton("Nueva Tarea");
		btnNuevaTarea.setBounds(98, 361, 131, 24);
		btnNuevaTarea.addActionListener(this);
		getContentPane().add(btnNuevaTarea);

		btnNuevoSubproyecto = new JButton("Nuevo Sub-Proyecto");
		btnNuevoSubproyecto.setBounds(98, 390, 131, 24);
		btnNuevoSubproyecto.addActionListener(this);
		getContentPane().add(btnNuevoSubproyecto);

		btnVerSubproyecto = new JButton("Ver sub-proyecto");
		btnVerSubproyecto.setBounds(98, 419, 131, 24);
		btnVerSubproyecto.addActionListener(this);
		getContentPane().add(btnVerSubproyecto);

		if (proyecto.getPadre() != null) {
			JLabel lblSubproyectoDeProyecto = new JLabel("Sub-proyecto de: " + proyecto.getPadre().getNombre());
			lblSubproyectoDeProyecto.setHorizontalAlignment(SwingConstants.CENTER);
			lblSubproyectoDeProyecto.setBounds(10, 97, 299, 14);
			getContentPane().add(lblSubproyectoDeProyecto);
		}

		this.setSize(337, 493);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNuevoSubproyecto) {
			NuevoProyecto subproyecto = new NuevoProyecto(main.get(), proyecto);
			this.dispose();
		}
		if (e.getSource() == btnNuevaTarea) {
			NuevaTarea tarea = new NuevaTarea(proyecto, this);
		}
		if (e.getSource() == btnVerSubproyecto) {
			VerProyecto versubproyecto = new VerProyecto((Proyecto) proyecto.getTareas().get(list.getSelectedIndex()));
			this.dispose();
		}
	}

	public DefaultListModel getTareas() {
		return tareas;
	}

	public void setTerminar() {
		lblDiasParaTerminar.setText("Dias para Terminar: " + proyecto.getDias());
	}

}
