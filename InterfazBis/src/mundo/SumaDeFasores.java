package mundo;
import mundo.NumeroComplejo;

public class SumaDeFasores {
	
	public OperacionesAvanzadas operadorAvanzado= new OperacionesAvanzadas();
	public Operacion operadorBasico= new Operacion();
	public boolean convertidoACoseno;
	
	
	
	public boolean isConvertidoACoseno() {
		return convertidoACoseno;
	}


	public void setConvertidoACoseno(boolean convertidoACoseno) {
		this.convertidoACoseno = convertidoACoseno;
	}


	public boolean frecuenciasIguales(Fasores fasor1 , Fasores fasor2) {
		
		
		
		boolean condicion = ((fasor1.getFrecuencia())==(fasor2.getFrecuencia()));
		
		
		return condicion;
		
	}
	
	
	public boolean sonFuncionesIguales(Fasores fasor1 , Fasores fasor2) {
		
		
		boolean condicion= fasor1.isEsCoseno() && fasor2.isEsCoseno();
		return condicion;
		
	}
	
	
	
	public Fasores realizarOperacion(Fasores fasor1 , Fasores fasor2) throws TienenDistintoFrecuenciaException {
		
		if(!this.frecuenciasIguales(fasor1, fasor2)) {
					
					throw new TienenDistintoFrecuenciaException();
						
			}
		
		fasor2.convertirDeSenoACoseno();
		fasor1.convertirDeSenoACoseno();
			
		NumeroComplejo resultado=new NumeroComplejo();
		NumeroComplejo complejo1 = new NumeroComplejo();
		NumeroComplejo complejo2 = new NumeroComplejo();
		
		complejo1.setModulo(fasor1.getAmplitud());
		complejo2.setModulo(fasor2.getAmplitud());
		complejo1.setFase((float)fasor1.getFase());
		complejo2.setFase((float)fasor2.getFase());
		complejo1.ObtenerParteImaginariayReal();
		complejo2.ObtenerParteImaginariayReal();
		
		resultado=operadorBasico.suma(complejo1, complejo2);
		
				
	
			
		Fasores fasorResultado= new Fasores();
			
				
		fasorResultado.setEsCoseno(true);
		fasorResultado.setFase((double)resultado.getFase());
		fasorResultado.setFrecuencia(fasor1.getFrecuencia());
		fasorResultado.setAmplitud(resultado.getModulo());
				
			
		return fasorResultado;

	}
}
