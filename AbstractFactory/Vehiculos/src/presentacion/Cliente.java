package presentacion;

import java.util.Scanner;

import fabricas.AcuraFactory;
import fabricas.PorscheFactory;
import fabricas.RollRoyceFactory;
import fabricas.VehiculoFactory;
import fabricas.colores.ColorFactory;
import vehiculos.Vehiculo;

public class Cliente {

	Scanner sc = new Scanner(System.in);

	public void iniciar() {
		System.out.println("Que proveedor desea?");
		String proveedor = sc.nextLine();

		if (proveedor.equalsIgnoreCase("Acura")) {
			OrdenarVehiculo(new AcuraFactory());
		} else if (proveedor.equalsIgnoreCase("Porsche")) {
			OrdenarVehiculo(new PorscheFactory());
		} else if (proveedor.equalsIgnoreCase("Roll Royce")) {
			OrdenarVehiculo(new RollRoyceFactory());
		} else {
			System.out.println("Proveedor no disponible");
		}
	}

	public void OrdenarVehiculo(VehiculoFactory fabrica) {
		Vehiculo vehiculo;
		System.out.println("que vehiculo desea?");
		String tipo = sc.nextLine();

		if (tipo.equalsIgnoreCase("Sedan")) {
			vehiculo = fabrica.crearSedan();
		} else if (tipo.equalsIgnoreCase("Coupe")) {
			vehiculo = fabrica.crearCoupe();
		} else if (tipo.equalsIgnoreCase("Camioneta")) {
			vehiculo = fabrica.crearCamioneta();
		} else {
			vehiculo = null;
			System.out.println("vehiculo no disponible");
		}

		ColorFactory fabricaColor = new ColorFactory();
		System.out.println("que color desea?");
		String color = sc.nextLine();
		if (color.equalsIgnoreCase("Negro")) {
			vehiculo.setColor(fabricaColor.crearColor(0, 0, 0));
		} else if (color.equalsIgnoreCase("Rojo")) {
			vehiculo.setColor(fabricaColor.crearColor(250, 0, 0));
		} else if (color.equalsIgnoreCase("Verde")) {
			vehiculo.setColor(fabricaColor.crearColor(0, 250, 0));
		} else if (color.equalsIgnoreCase("Azul")) {
			vehiculo.setColor(fabricaColor.crearColor(0, 0, 250));
		} else if (color.equalsIgnoreCase("Blanco")) {
			vehiculo.setColor(fabricaColor.crearColor(250, 250, 250));
		} else {
			vehiculo = null;
			System.out.println("color no disponible");
		}

		System.out.println("Su vehiculo esta listo:");
		System.out.println("Marca: " + vehiculo.getMarca());
		System.out.println("Modelo: " + vehiculo.getModelo());
		System.out.println("Color: " + vehiculo.getColor());
	}

}
