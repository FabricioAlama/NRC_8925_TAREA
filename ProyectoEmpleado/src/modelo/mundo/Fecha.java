package modelo.mundo;

public class Fecha {
	   private int dia;
	   private int mes;
	   private int anio;

	//Constructor

	   public Fecha (int pDias, int pMes, int pAnio) {
		
	   dia= pDias;
	   mes= pMes;
	   anio= pAnio;
	   }
	   
	   public Fecha () {
			
		   dia= 0;
		   mes= 0;
		   anio= 0;
		   }

	   //Métodos analizadores GETTERS


	   public int  getDia() {
		return dia;
		
	   }
	   public int getMes() {
		return mes;
		
	   }
	   public int getAnio() {
		return anio;
	   }

	 

	  //Metodos funcionales
	 //Completar código
	  public int darDiferenciaEnMeses (Fecha pFecha) {
		int numeroMeses = 0;
		int difAnios =  pFecha.getAnio() - anio* 12;
		int difMese = 0;
		if (mes < pFecha.getMes()) {
			difMese =  pFecha.getMes() - mes;
		}
		int difDias = 0;
		if (mes < pFecha.getMes()) {
			difDias = (pFecha.getDia() - dia )/ 30;
		}
		numeroMeses = difAnios + difMese + difDias;
		return numeroMeses;
	  }


	  //dd-mm-aaaa
	  public String toString() {
		return dia + "-"+mes+"-"+anio;
	  	}
	  }
