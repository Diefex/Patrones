package clientes;

public class GenClientes {

	public Cliente getCliente() {
		String numero = "";
		int num = 0;
		num = (int) (Math.random() * (100)) + 300;
		numero += num;
		num = (int) (Math.random() * (899)) + 100;
		numero += num;
		num = (int) (Math.random() * (8999)) + 1000;
		numero += num;
		int seg = ((int) (Math.random() * (10))) + 1;
		return new Cliente(numero, seg);
	}

}
