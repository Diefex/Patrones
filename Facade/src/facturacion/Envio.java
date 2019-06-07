package facturacion;

public class Envio {

	private static Envio envio;

	private Envio() {

	}

	public static Envio get() {
		if (envio == null) {
			envio = new Envio();
		}
		return envio;
	}

	public void enviar(String factura) {
		System.out.println("---------------- Enviando por E-mail----------------");
		System.out.println(factura);
	}

}
