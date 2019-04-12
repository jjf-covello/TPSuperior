package EDT;
import java.math.*;
import java.util.*;

public class NumeroComplejo {
	
	public List<NumeroComplejo> nSolucines; 
	
	public float parteReal;
	public float parteImaginaria;

	public float modulo;
	public double fase;
	
	
	
	

	public List<NumeroComplejo> getnSolucines() {
		return nSolucines;
	}


	public void setnSolucines(List<NumeroComplejo> nSolucines) {
		this.nSolucines = nSolucines;
	}


	public void ObtenerParteImaginariayReal(){
		
		float resultadoDeFase= (float) Math.tan(fase);
		float resultadoDelModulo= (float) Math.pow(this.getModulo(), 2);
		
		
		float a=1;
		float b=resultadoDelModulo;
		float c= resultadoDeFase;
	    float z1 = (-b + (float) Math.sqrt((float) Math.pow(b,2) -(4*a*c)))/(2*a);
		
	    float z2 = (-b - (float) Math.sqrt((float) Math.pow(b,2) -(4*a*c)))/(2*a);
		
	    float y1 = (float) Math.sqrt(z1);
	    		
	    float y2=	(float) Math.sqrt(z2);
	    
	    float y3=	(-( (float) Math.sqrt(z1)));
	    
	    float y4=	(-((float) Math.sqrt(z2)));
	    
	    float x1= y1/ resultadoDeFase;
	    
	    Puntos punto1= new Puntos();
	    Puntos punto2= new Puntos();
	    Puntos punto3= new Puntos();
	    Puntos punto4= new Puntos();
	    Puntos puntoResultado= new Puntos();
	    punto1.setX(x1);
	    punto1.setY(y1);
	    
	    
	    float x2= y2/resultadoDeFase;
	    punto2.setX(x2);
	    punto2.setY(y2);
	    
	    
	    float x3= y3/resultadoDeFase;
	    punto3.setX(x3);
	    punto3.setY(y3);
	    
	    
	    float x4= y4/resultadoDeFase;
	    
	    punto4.setX(x4);
	    punto4.setY(y4);
	    
	    
	    List<Puntos> lista = new ArrayList<Puntos>(Arrays.asList(punto1, punto2, punto3, punto4));
	    
	    
	    
	    
	    if(0<resultadoDeFase&&resultadoDeFase< ((Math.PI)*0.5) )
	    {
	    	 lista.stream().filter(punto->(punto.getY() > 0)&&(punto.getX() > 0) ).toArray() ;
	    	 puntoResultado=lista.get(0);
	    }else { if(resultadoDeFase< (Math.PI)) {
	   	 lista.stream().filter(punto->(punto.getY() > 0)&&(punto.getX() < 0) ).toArray() ;
    	 puntoResultado=lista.get(0);
	    	
	    	
	    	
	    }else {
	    	if(resultadoDeFase< (1.5)*(Math.PI)) {
	    		lista.stream().filter(punto->(punto.getY() < 0)&&(punto.getX() < 0) ).toArray() ;
	       	 puntoResultado=lista.get(0);
	   	    		
	    		
	    	}else {
	    		
	    		lista.stream().filter(punto->(punto.getY() < 0)&&(punto.getX() > 0) ).toArray() ;
	       	 puntoResultado=lista.get(0);
	   	    	
	    		
	    	}
	    	
	    	
	    }
	    
	    	
	    	
	    	
	    }
	    
	    
	    
	    
	    this.setParteImaginaria(puntoResultado.getY());
	    this.setParteReal(puntoResultado.getX());
	    
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
		
		
		double resultado= Math.atan((this.getParteImaginaria()/this.getParteReal()));
		
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





}
