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
				
				if(fasor1.isEsCoseno()) {
					
					fasor2.convertirDeSenoACoseno();
					
					
				}else {
					
					
					fasor1.convertirDeCosenoASeno();
					
					
				}
				
		
				
			}else {}
			
			NumeroComplejo resultado=new NumeroComplejo();
			
			float modulo1=fasor1.getAmplitud();
			float modulo2=fasor2.getAmplitud();
			double fase1= fasor1.getFase();
			double fase2= fasor2.getFase();
			
			float parteRealResultado= modulo1 * (float)Math.cos(fase1) + modulo2 * (float) Math.cos(fase2);
			float parteImaginariaResultado=modulo1 * (float)Math.sin(fase1) + modulo2 * (float) Math.sin(fase2);
			
			resultado.setParteReal(parteRealResultado);
			resultado.setParteImaginaria(parteImaginariaResultado);
			resultado.setFase(resultado.obtenerFase());
			resultado.setModulo(resultado.obtenerModulo());
			
	
			
			Fasores fasorResultado= new Fasores();
			
				
				fasorResultado.setEsCoseno(true);
				fasorResultado.setFase(resultado.getFase());
				fasorResultado.setFrecuencia(fasor1.getFrecuencia());
				fasorResultado.setAmplitud(resultado.getModulo());
				
			
			return fasorResultado;
			
			
			
			
		}else {
			
			throw new TienenDistintoFrecuenciaException();
			
			
			
			
		}
		
		
		
	}

	
	
	
}
