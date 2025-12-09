package ejerciciostipoexamen;

import java.util.Scanner;

public class EjercicioRepasoUnidad22025 {

	static boolean existeUsuario(String[][] usuarios, String nombre) {
		boolean existe=false;
		nombre=nombre.toUpperCase();
		
		for (int i=0;i<usuarios.length;i++) {
			if (usuarios[i][0]!=null) {
				if (usuarios[i][0].equals(nombre)){
					existe=true;
				}
			}
		}
		return existe;
	}
	
	static void insertarUsuario(String[][] usuarios, String nombre, String pass, String edad) {
	
		
		
		//static boolean existeUsuario(String[][] usuarios, String nombre)
		if (!existeUsuario(usuarios,nombre)) {
			System.out.println("El usuario no existe. Podemos proseguir.");
			boolean passValido = contieneMayuscula(pass) && contieneNumero(pass) && contieneEspecial(pass) 
					&& longitudValida(pass);
			if (passValido) {
			
				System.out.println("Password valido.Podemos continuar");
				boolean edadValida=validarEdad(edad);
				if (edadValida) {
					System.out.println("Edad valida. Podemos continuar.");
					System.out.println("Podemos insertar el usuario en la primera que sea null.");
					boolean insertado=false;
					for (int i=0;i<usuarios.length && !insertado;i++) {
						if (usuarios[i][0]==null) {
							usuarios[i][0]=nombre.toUpperCase();
							usuarios[i][1]=pass;
							usuarios[i][2]=edad;
							insertado=true;
						}
					}
					
					
					
				}
			}
		
		
		
		}
	
	
	
	}
	
	
	
	
	private static boolean validarEdad(String edad) {
		int edadNumero = Integer.parseInt(edad);
		boolean edadValida=false;
		if (edadNumero>0) {
			edadValida=true;
		}

		return edadValida;
	}

	private static boolean longitudValida(String pass) {
		boolean valido=false;
		if (pass.length()>8)
			valido=true;

		return valido;
	}

	private static boolean contieneEspecial(String pass) {
		String especial = "?._!-";
		boolean valido=false;
		for (int i=0;i<pass.length();i++) {
			if (especial.contains(pass.substring(i, i+1))) {
				valido=true;
			}
		}
			
		return valido;	
	}

	private static boolean contieneNumero(String pass) {
		String numeros = "0123456789";
		boolean valido=false;
		for (int i=0;i<pass.length();i++) {
			if (numeros.contains(pass.substring(i, i+1))) {
				valido=true;
			}
		}
			
		return valido;	
		}

	private static boolean contieneMayuscula(String pass) {
		String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		boolean valido=false;
		for (int i=0;i<pass.length();i++) {
			if (mayusculas.contains(pass.substring(i, i+1))) {
				valido=true;
			}
		}
			
		return true;
	}

	public static void main(String[] args) {

		/*El main debe incluir:
			1. Crear nuevo usuario 

			2. Mostrar todos los usuarios 

			3. Mostrar usuarios con edad mayor o igual que X 

			4. Salir*/
		
		String [][] usuarios = new String [20][3];
		
		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		System.out.println("=========Menú==============");
		System.out.println("1.-Crear un nuevo usuario");
		System.out.println("2.-Mostrar todos los usuarios");
		System.out.println("3.-Mostrar usuarios con edad mayor o igual que X");
		System.out.println("4.-Salir");
		opcion=teclado.nextInt();
		teclado.nextLine();
		
		while (opcion!=4) {
			if (opcion==1) {
			
			System.out.println("Nombre: ");	
			String nombre = teclado.nextLine();
			System.out.println("Password: ");	
			String password = teclado.nextLine();
			System.out.println("Edad: ");	
			String edad = teclado.nextLine();
			
				
			insertarUsuario(usuarios,nombre,password,edad);
			
				
			}else if (opcion==2) {
				
				mostrarUsuarios(usuarios);

			}else if (opcion==3) {
				
				//static void mostrarMayoresQue(String[][] usuarios, int edadMinima)
			}
			else if (opcion==4) {
				
			} else {
				System.out.println("Opción incorrecta.");
			}
			System.out.println("=========Menú==============");
			System.out.println("1.-Crear un nuevo usuario");
			System.out.println("2.-Mostrar todos los usuarios");
			System.out.println("3.-Mostrar usuarios con edad mayor o igual que X");
			System.out.println("4.-Salir");
			opcion=teclado.nextInt();
			teclado.nextLine();
		
		
		
		}
		
		
	
	}

	private static void mostrarUsuarios(String[][] usuarios) {

		System.out.println("Listado de usuarios: ");
		for (int i=0;i<usuarios.length;i++) {
			if (usuarios[i][0]!=null) { //Comprobamos que el nombre no sea null, que significa que la posicion ya está ocupada
				System.out.println("Nombre: " + usuarios[i][0] + " - " + "Password: " + usuarios[i][1] + " - Edad: " + usuarios[i][2]);
			}
						
		}
	}

}
