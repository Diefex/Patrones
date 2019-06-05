package main;

import java.util.Scanner;

import usuarios.AdminDecorator;
import usuarios.Administrador;
import usuarios.Profesor;
import usuarios.Usuario;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static Usuario user;

	public static void main(String[] args) {
		System.out.println("Que tipo de usuario va ingresar?");
		System.out.println("1. Profesor");
		System.out.println("2. Administrativo");
		switch (sc.nextInt()) {
		case 1: {
			user = new Profesor();
			break;
		}
		case 2: {
			user = new AdminDecorator(new Administrador());
			break;
		}
		}
		System.out.println("a que base de datos dese acceder?");
		System.out.println("1. Biblioteca");
		System.out.println("2. Tesis");
		System.out.println("3. Administrativa");
		switch (sc.nextInt()) {
		case 1: {
			user.accesoBiblioteca();
			break;
		}
		case 2: {
			user.accesoTesis();
			break;
		}
		case 3: {
			if (user instanceof AdminDecorator) {
				AdminDecorator admin = (AdminDecorator) user;
				admin.accesoAdmin();
			} else {
				System.out.println("Usted no tiene acceso a esta base de datos");
			}
			break;
		}
		}
	}

}
