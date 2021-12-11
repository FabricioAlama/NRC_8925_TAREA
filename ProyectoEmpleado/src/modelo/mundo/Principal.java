package modelo.mundo;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		//DECLARAR VARIABLES
		Scanner scanner = new Scanner(System.in);
		int opc = 0;
		//declara variables para poder pedir al usuario los datos del empleado e ingresar

		Empleado empleado = new Empleado();
		String nombre, apellido, imagen = null;
		int genero, dia, mes, anio;
		double salario;
		Fecha fechaNac, fechaIngreso;
		
		
		//OPCIONES SISTEMA  1.INGRESAR DATOS  2.CALCULAR LA EDAD   3.CALCULAR LA ANTIGUEDAD DEL EMPLEADO EN LA EMPRESA
				//4.CALCULAR PRESTACIONES  5.VISUALIZAR LA INFORMACION
		do {
			
			System.out.println("			MENÚ PRINCIPAL      ");
			System.out.println("");
			System.out.println("1. Ingresar datos del empleado. ");
			System.out.println("2. Calcular la edad del empleado. ");
			System.out.println("3. Calcular la antiguedad del empleado en la empresa.");
			System.out.println("4. Calcular las prestaciones del empleado.");
			System.out.println("5. Visualizar la informacion del empleado.");
			System.out.println("6. Salir.");
			System.out.println("");
			
			try {
				System.out.println("\n Elija una de las opciones: ");
				opc = scanner.nextInt();
							
			}
			catch(InputMismatchException e) {
				System.out.println("Debe ingresar solo números ");
				opc = 6;
				e.printStackTrace();
			}
			
			switch(opc) {
				case 1:
					System.out.println("Ingreso de datos del empleado ");
					System.out.println("Nombre: ");
			        nombre = scanner.next();
			        
					System.out.println("Apellido: ");
			        apellido = scanner.next();
			        			        
					genero=0;
			        do {
			        	try {
							System.out.println("Genero 1 - para masculino, 2 - para femenino: ");
							genero= scanner.nextInt();
										
						}
						catch(InputMismatchException e) {
							System.out.println("Debe ingresar solo números ");
							System.out.println("***Ingrese Correctamente***");
							genero = 0;
							scanner.nextLine();
						}
			        }while (genero<1 || genero>2);
			        
			        do {
			        	try {
							System.out.println("Ingrese el Salario de 100 hasta 500 ");
					        salario = scanner.nextDouble();
						}
						catch(InputMismatchException e) {
							System.out.println("Debe ingresar solo números  double ");
							System.out.println("**Ingrese Correctamente**");
							salario = 0;
							e.printStackTrace();	
						}
			        }while (salario<100 || salario>500);
					
					
					do {
						System.out.println("Ingrese dia de nacimiento del numero 1 hasta el dia 31 ");
					    dia = scanner.nextInt();
					}while (dia<01 || dia>31);
					
			        do {
			        	System.out.println("Ingrese mes de nacimiento del 1 hasta el mes 12: ");
				        mes = scanner.nextInt();
			        }while (mes<01 || mes>12);
			        
			        do {
			        	System.out.println("Ingrese año de nacimiento 1974 hasta 2021 : ");
				        anio = scanner.nextInt();
			        }while (anio<1974 || anio>2021);
			        
			        fechaNac = new Fecha(dia, mes, anio);
			        
			        do {
			        	System.out.println("Ingrese dia de ingreso del dia 1 hasta el dia 31: ");
				        dia = scanner.nextInt();	
			        }while (dia<01 || dia>31);
			        
			        do {
			        	
			        	System.out.println("Ingrese mes de ingreso del mes 1 hasta el mes 12: ");
			      
			        	mes = scanner.nextInt();
			        	
			        }while (mes<01 || mes>12);
			        
			        do {
			        	 System.out.println("Ingrese anio de ingreso de 1974 hasta 2021 :");
					      anio = scanner.nextInt();
			        }while (anio<1974 || anio>2021);
			       
			        
			        fechaIngreso = new Fecha(dia, mes, anio);
			        
			        empleado.setEmpleado(nombre, apellido, genero, imagen, salario);
					break;
				case 2:
					
					
					System.out.println("Edad del empelado: " + empleado.calcularEdad());
					break;
					
					
				case 3:
					
					System.out.println("Antiguedad del empelado: " + empleado.calcularAntiguedad());
					break;
					
					
				case 4:
					
					
					System.out.println("Prestaciones del empelado: " + empleado.calcularPrestaciones());
					break;
					
				case 5:
					
					
					empleado.mostrarInformacion();
					break;
					
				case 6:
					
					
					System.out.println("***Proceso 100% terminado***");
					break;
					
				default:
					System.out.println("**Ingrese Correctamente**");
					System.out.println("Digite la opción solo entre 1 y 6");
			}
		} while(opc != 6);
	}
}