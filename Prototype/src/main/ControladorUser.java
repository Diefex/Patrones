package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import datos.BaseDeDatos;
import datos.Persona;

public class ControladorUser implements ActionListener {

	private User vista;

	public ControladorUser(User vista) {
		super();
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.getBtnNuevaPersona()) {
			NuevaPersona np = new NuevaPersona(false);
		}

		if (e.getSource() == vista.getBtnAgregarHijo()) {
			NuevaPersona np = new NuevaPersona(true);
		}

		if (e.getSource() == vista.getBtnModificarDatos()) {
			Persona persona = BaseDeDatos.getBD().personas.get(User.getList().getSelectedIndex());
			VerDatos Vd = new VerDatos(persona);
		}

		if (e.getSource() == vista.getBtnQuitarPersona()) {
			User.quitarPersona(BaseDeDatos.getBD().personas.get(User.getList().getSelectedIndex()));
		}
	}

}
