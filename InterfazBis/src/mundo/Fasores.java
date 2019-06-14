package mundo;

public class Fasores {
	
	public boolean esCoseno;
	public double fase;       
	public float amplitud;   
	public float frecuencia;
	
	
	
	
	public float getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(float frecuencia) {
		this.frecuencia = frecuencia;
	}
	public boolean isEsCoseno() {
		return esCoseno;
	}
	public void setEsCoseno(boolean esCoseno) {
		this.esCoseno = esCoseno;
	}
	public double getFase() {
		return fase;
	}
	public void setFase(double fase) {
		this.fase = fase;
	}
	public float getAmplitud() {
		return amplitud;
	}
	public void setAmplitud(float amplitud) {
		this.amplitud = amplitud;
	}
	
	 /*
	public Fasores convertirEquivalenteEnCoseno() {
		
		if(!esCoseno) {
			
			Fasores transformado  = new Fasores();
			transformado.setAmplitud(amplitud);
			transformado.setFase(fase-(Math.PI*(0.5)));
			transformado.setEsCoseno(true);
			transformado.setFrecuencia(frecuencia);
			
			return transformado;
		}
		return this;
		
	}
	*/
	
	 
	public void convertirDeSenoACoseno() {
		if(!esCoseno) {
		fase=fase-(Math.PI*(0.5));
		this.setEsCoseno(true);	
		}
		
	}
	
	/*
   public void convertirDeCosenoASeno() {
		
		this.setFase((this.getFase()+((Math.PI)/2)));
		
		
		this.setEsCoseno(false);	
		
		
	}*/
	
	
	

        
    
}



