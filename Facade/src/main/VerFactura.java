package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VerFactura extends JFrame implements ActionListener {

	private JLabel lblFactura;
	private JButton enviar;
	private Fachada sistema;

	public VerFactura(String factura) {
		sistema = Fachada.get();

		this.setLayout(null);
		this.setSize(200, 300);
		this.setVisible(true);

		lblFactura = new JLabel(factura);
		lblFactura.setVerticalAlignment(SwingConstants.TOP);
		lblFactura.setBounds(5, 5, this.getWidth() - 10, this.getHeight() - 10);
		this.getContentPane().add(lblFactura);

		enviar = new JButton("Enviar al correo");
		enviar.setBounds(50, 200, 100, 50);
		enviar.addActionListener(this);
		this.getContentPane().add(enviar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == enviar) {
			sistema.enviar(lblFactura.getText());
		}
	}

}
