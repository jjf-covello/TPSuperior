package SF;
import EDT.NumeroComplejo;

public class SumaDeFasores {
	
	
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
		
		if(this.frecuenciasIguales(fasor1, fasor2)) {
			
			if(!this.sonFuncionesIguales(fasor1, fasor2)) {
				
				
				fasor1.covertirFuncion();
		
				
			}else {}
			
			NumeroComplejo complejo1= new NumeroComplejo();
			NumeroComplejo complejo2=new NumeroComplejo();
			NumeroComplejo resultado=new NumeroComplejo();
			
			complejo1.setModulo((fasor1.getAmplitud()));
			complejo1.setFase(fasor1.getFase());
			complejo1.ObtenerParteImaginariayReal();
			
			complejo2.setModulo((fasor2.getAmplitud()));
			complejo2.setFase(fasor2.getFase());
			complejo2.ObtenerParteImaginariayReal();
			
			float parteRealResultado= complejo2.getParteReal() + complejo1.getParteReal();
			float parteImaginariaResultado=complejo2.getParteImaginaria() + complejo1.getParteImaginaria();
			
			resultado.setParteReal(parteRealResultado);
			resultado.setParteImaginaria(parteImaginariaResultado);
			resultado.setFase(resultado.obtenerFase());
			resultado.setModulo(resultado.obtenerModulo());
			
			Fasores fasorResultado= new Fasores();
			
			if(fasor1.isEsCoseno()) {
				
				fasorResultado.setEsCoseno(true);
				fasorResultado.setFase(resultado.getFase());
				fasorResultado.setFrecuencia(fasor1.getFrecuencia());
				fasorResultado.setAmplitud(resultado.getModulo());
				
				
			}else {
				
				
				fasorResultado.setEsCoseno(false);
				fasorResultado.setFase(resultado.getFase());
				fasorResultado.setFrecuencia(fasor1.getFrecuencia());
				fasorResultado.setAmplitud(resultado.getModulo());
				
				
			}
			
			return fasorResultado;
			
			
			
			
		}else {
			
			throw new TienenDistintoFrecuenciaException();
			
			
			
			
		}
		
		
		
	}

	
	
	
}
