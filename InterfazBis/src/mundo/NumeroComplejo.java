package mundo;

import java.math.*;
import java.util.*;

public class NumeroComplejo {
	
	public List<NumeroComplejo> nSolucines; 
	public List<NumeroComplejo> raicesPrimarias;
	
	public float parteReal;
	public float parteImaginaria;

	public float modulo;
	public double fase;
	
	
	
	

	public List<NumeroComplejo> getRaicesPrimarias() {
		return raicesPrimarias;
	}


	public void setRaicesPrimarias(List<NumeroComplejo> raicesPrimarias) {
		this.raicesPrimarias = raicesPrimarias;
	}


	public List<NumeroComplejo> getnSolucines() {
		return nSolucines;
	}


	public void setnSolucines(List<NumeroComplejo> nSolucines) {
		this.nSolucines = nSolucines;
	}


	public void ObtenerParteImaginariayReal(){
		
		float parteReal= this.getModulo()* (float)Math.cos(this.getFase());
		float parteImaginaria= this.getModulo() * (float)Math.sin(this.getFase());  
	    
	    this.setParteImaginaria(parteImaginaria);
	    this.setParteReal(parteReal);
	    
	   	}
	
	
	public float getModulo() {
		return modulo;
	}
	public void setModulo(float modulo) {
		this.modulo = modulo;
	}
	public double getFase() {
		return fase;
	}
	public void setFase(double fase) {
		this.fase = fase;
	}
	public float getParteReal() {
		return parteReal;
	}
	public void setParteReal(float parteReal) {
		this.parteReal = parteReal;
	}
	public float getParteImaginaria() {
		return parteImaginaria;
	}
	public void setParteImaginaria(float parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}

	public NumeroComplejo ObtenerConjugado(){

		NumeroComplejo complejo=new NumeroComplejo();
		
		complejo.setParteReal(this.getParteReal());
		complejo.setParteImaginaria(-(this.getParteImaginaria()));
		return complejo;
		
	}
	
	
	public float obtenerModulo() {
		
		
		float baseReal= this.getParteReal();
		int n=2;
		float resultado1 = (float) Math.pow(baseReal, n);
		float baseImaginaria= this.getParteImaginaria();
		float resultado2 = (float) Math.pow(baseImaginaria, n);
		float modulocuadrado=(resultado1+resultado2);
		float modulo = (float) Math.sqrt(modulocuadrado);
		
		
		return modulo;
		
		
		
	}
	
	
	public float obtenerFase() {
		
		float pi = (float)Math.PI;
		
		float resultado= (float)/*Math.toRadians*/(Math.atan((this.getParteImaginaria())/(this.getParteReal())));
	
		
		if(((this.getParteReal())<0 && (this.getParteImaginaria())<0) ||((this.getParteReal())<0 && (this.getParteImaginaria())>0) ) {
			
			resultado= resultado + pi;
			
		}else {if((this.getParteReal())>0 && (this.getParteImaginaria())<0) {
			
			resultado= resultado + 2* pi;
			
		}}
		
		return resultado;

	}
	
	
	public void elevarParteImaginara(int exponente) {
		
		float resultado= (float) Math.pow(this.getParteImaginaria(), exponente);
		int congruencia= exponente % 4;
		
		
		switch(congruencia) {
		
		case 0:
			this.setParteImaginaria(0);
			this.setParteReal((this.getParteReal()+resultado));
			break;
		
		case 1:
			this.setParteImaginaria(resultado);
			break;
			
			
		case 2:
		
			this.setParteReal((this.getParteReal()-resultado));
			break;
	
			
			
		case 3:
		
			this.setParteImaginaria((-resultado));
			break;
			
		
		}
		
		
		
	}

	public String mostrar() {
		
		return " "+ parteReal +" + "+ parteImaginaria+" j";
	
	}
	 
	public String mostrarPolar() {
		
		return "[ "+ modulo +" , " + fase + " ]"; 
	
	}
	
	public List<String> mostrarSolucionesPolar() {
	
	List<String> resultado=new ArrayList();
	 long contador= this.getnSolucines().stream().count();
	 //long contadorRaices= this.getRaicesPrimarias().stream().count();
	 //System.out.println("otras soluciones son...");
	 for(int i=0;i<contador;i++) {
		 resultado.add(this.getnSolucines().get(i).mostrarPolar());
	 }
	 
	  
	return resultado;
}	
	
	
	public List<String> mostrarSoluciones() {
		
		List<String> resultado=new ArrayList();
		 long contador= this.getnSolucines().stream().count();
		 //long contadorRaices= this.getRaicesPrimarias().stream().count();
		 //System.out.println("otras soluciones son...");
		 for(int i=0;i<contador;i++) {
			 resultado.add(this.getnSolucines().get(i).mostrar());
		 }
		 
		  
		return resultado;
	}

	public List<String> mostrarRaicesPrimitivas(){
		
		List<String> resultado=new ArrayList();
		 long contadorRaices= this.getRaicesPrimarias().stream().count();
		 //System.out.println("otras soluciones son...");
		 for(int i=0;i<contadorRaices;i++) {
			 resultado.add(this.getRaicesPrimarias().get(i).mostrar());
		 }
		
		return resultado;
		
	}
	
	public List<String> mostrarRaicesPrimitivasPolar(){
		
		List<String> resultado=new ArrayList();
		 long contadorRaices= this.getRaicesPrimarias().stream().count();
		 //System.out.println("otras soluciones son...");
		 for(int i=0;i<contadorRaices;i++) {
			 resultado.add(this.getRaicesPrimarias().get(i).mostrarPolar());
		 }
		
		return resultado;
		
	}


}
