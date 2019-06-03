package protocolos;

public abstract class Protocolo {

	protected String Nombre;
	protected String Direccion;
	protected String VelocidadMaxima;
	protected String EsclavosMaximos;

	public void usar() {
		System.out.println("	Usando protocolo " + Nombre);
		System.out.println("	Direccion: " + Direccion);
		System.out.println("	Velocidad Maxima: " + VelocidadMaxima);
		System.out.println("	Esclavos maximos: " + EsclavosMaximos);
	}

}
