package EDT;
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
		
		float parteReal= this.getModulo()* (float)Math.cos(fase);
		float parteImaginaria= this.getModulo() * (float)Math.sin(fase);  
	    
	    this.setParteImaginaria(parteReal);
	    this.setParteReal(parteImaginaria);
	    
	   	}/*
		 * 
		 * 	 * y/x=rsF
		 * 
		 * x=y/resultadoDeFase
		 * 
		 * y2= resultado del modulo- (rsf/y)2
		 * y2 -resuMod= -(rsf/y2)
		 * 
		 * y4-y2resuMod= rsf
		 * z2 -z -rsf=0
		 * 
		 *  (1+- (1+4*1*rsf).sqrt())/2
		 *  
		 *  z2=y
		 * 
		
		return 12;
	
	*/
	
	
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
		int resultado1 = (int) Math.pow(baseReal, n);
		float baseImaginaria= this.getParteImaginaria();
		int resultado2 = (int) Math.pow(baseImaginaria, n);
		
		float modulo = (float) Math.sqrt((resultado1+resultado2));
		
		
		return modulo;
		
		
		
	}
	
	
	public double obtenerFase() {
		
		
		double resultado= Math.toRadians(Math.atan((parteImaginaria/parteReal)));
		
		if((parteReal<0 && parteImaginaria<0) ||(parteReal<0 && parteImaginaria>0) ) {
			
			
			resultado= resultado + Math.PI;
			
		}else {if(parteReal>0 && parteImaginaria<0) {
			
			resultado= resultado+ 2* Math.PI;
			
		}else {}
		 }
		
		
		
	
		
			
		
		
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

	public void mostrar() {
		
		
		System.out.println("El modulo es "+ modulo +"la fase es "+ fase + "su parte imaginaria es "+ parteImaginaria +"su parte real es "+ parteReal);
		
		
		
		
		
	}
	
	public void mostrarSoluciones() {
		
		
		 long contador= this.getnSolucines().stream().count();
		 long contadorRaices= this.getRaicesPrimarias().stream().count();
		 System.out.println("otras soluciones son...");
		 for(int i=0;i<contador;i++) {
			 
			 
			 
			 this.getnSolucines().get(i).mostrar();
		 }
		 
		 System.out.println("sus raices primitivas son...");
		 for(int i=0;i<contadorRaices;i++) {
			 	 this.getnSolucines().get(i).mostrar();
		 }
		 
		
	}




}
