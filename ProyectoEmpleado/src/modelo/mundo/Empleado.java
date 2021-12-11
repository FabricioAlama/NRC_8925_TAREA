package modelo.mundo;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {
     
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private int genero; // 1 Femenino || 2 Masculino
	private String imagen;
	private double salario;
	
	private Fecha fechaNacimiento;
	private Fecha fechaIngreso;
	
	//Metodo constructor
	public Empleado() {
		nombreEmpleado="";
		apellidoEmpleado="";
		genero= 0;
		imagen="";
		salario = 0.0;
		fechaNacimiento= new Fecha();
		fechaIngreso=new Fecha();
		
	}
	
	public Empleado (String pNombreEmpleado, String pApellidoEmpleado, int pGenero, 
			String pImagen, double pSalario, Fecha pFechaN, Fecha pFechaI ) {
		
		nombreEmpleado= pNombreEmpleado;
		apellidoEmpleado= pApellidoEmpleado;
		genero= pGenero;
		imagen= pImagen;
		salario = pSalario;
		fechaNacimiento= pFechaN;
		fechaIngreso=pFechaI;
	}
	
	
	//metodos analizadores permiten obtener o modificar la informacion de los atributos
    // getters obtener y setters cambiar o modificar
	
	public String getNombre() {
		return nombreEmpleado;	
	}
	
	public String getApellido() {
		return apellidoEmpleado;
	}
	public int getGenero() {
		return genero;
		
	}
	
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}
	public String Imagen() {
		return imagen;
		
	}
	public double Salario() {
		return salario;
	}
	
	public Fecha getFechaActual() {
		GregorianCalendar gc= new GregorianCalendar();
		int dia = gc.get(Calendar.DAY_OF_MONTH);
		int mes = gc.get(Calendar.MONTH)+1;
		int anio = gc.get(Calendar.YEAR);
		
		Fecha fechaActual = new Fecha(dia, mes,anio);
		return fechaActual;
	}
	
	public void setEmpleado(String pNombreEmpleado, String pApellidoEmpleado, 
			int pGenero, String pImagen, double pSalario) {
		
		nombreEmpleado= pNombreEmpleado;
		apellidoEmpleado= pApellidoEmpleado;
		genero= pGenero;
		imagen= pImagen;
		salario = pSalario;
	}
	
	public void setSalario(double pSalario) {
		salario= pSalario;
	}
	//metodos funcionales calcule la antiguedad en años
	public int calcularAntiguedad() {
		int antiguedad=0;
		antiguedad =fechaIngreso.darDiferenciaEnMeses(getFechaActual())/12;
		return antiguedad;
	}
		
		//metodo funcional calcule la edad del empleado en años
		public int calcularEdad() {
			int edad=0;
			edad =fechaNacimiento.darDiferenciaEnMeses(getFechaActual())/12;
			return edad;
	}
	
		//metodo funcional calcular prestaciones = antiguedad*salario/12
	    public double calcularPrestaciones() {
		     double prestaciones = 0 ;
		     prestaciones  = (calcularAntiguedad() * Salario ())/12;
			return prestaciones;
			}
	// metodo permite visualizar la informacion del empleado
	    
	    public void mostrarDatos() {
			
			  System.out.println("\nDatos del Empleado ");
			  System.out.println("\nNombre: " + nombreEmpleado);
			  System.out.println("Apellido: " +apellidoEmpleado );
			  System.out.println("Genero: " + genero); 
			  //System.out.println("Imagen: " + imagen); 
			  
			  System.out.println("Salario: " + salario); 
			  System.out.println("Prestaciones: " + calcularPrestaciones()); 
			  System.out.println("Antiguedad: " + calcularAntiguedad()); 
		  }

		public void mostrarInformacion() {
			
			// TODO Auto-generated method stub
			  System.out.println("\nDatos del Empleado ");
			  System.out.println("\nNombre: " + nombreEmpleado);
			  System.out.println("Apellido: " +apellidoEmpleado );
			  System.out.println("Genero: " + genero); 
			  //System.out.println("Imagen: " + imagen); 
			  System.out.println("Salario: " + salario); 
			  System.out.println("Prestaciones: " + calcularPrestaciones()); 
			  System.out.println("Antiguedad: " + calcularAntiguedad()); 
			
		}  
	    
}