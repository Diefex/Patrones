package user;

import java.util.Scanner;

import protocolo.fabricas.I2CFactory;
import protocolo.fabricas.RS485Factory;
import protocolo.fabricas.SPIFactory;
import protocolos.Protocolo;
import protocolos.fabricas.ProtocoloFactory;

public class Usuario {

	public void iniciar() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Que protocolo desea usar?");
			System.out.println("1. SPI");
			System.out.println("2. I2C");
			System.out.println("3. RS485");
			Protocolo protocolo;
			int op = sc.nextInt();
			switch (op) {

			case 1: {
				ProtocoloFactory fabrica = new SPIFactory();
				protocolo = fabrica.crearProtocolo();
				break;
			}

			case 2: {
				ProtocoloFactory fabrica = new I2CFactory();
				protocolo = fabrica.crearProtocolo();
				break;
			}

			case 3: {
				ProtocoloFactory fabrica = new RS485Factory();
				protocolo = fabrica.crearProtocolo();
				break;
			}

			default: {
				protocolo = null;
				System.out.println("Seleccion Invalida");
				System.exit(0);
			}

			}

			if (protocolo != null) {
				protocolo.usar();
				System.out.println("\n" + "\n" + "\n");
			}
		}
	}

}
