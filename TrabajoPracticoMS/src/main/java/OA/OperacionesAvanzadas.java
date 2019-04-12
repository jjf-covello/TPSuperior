package OA;
import EDT.NumeroComplejo;

public class OperacionesAvanzadas {
	
	
	public NumeroComplejo potenciacion(NumeroComplejo complejo1, int exponente) 
		{
		
		 
		 NumeroComplejo resultado= new NumeroComplejo();
		 float nuevoModulo= (float) Math.pow( complejo1.getModulo() , exponente);
		 resultado.setModulo(nuevoModulo);
		 resultado.setFase( (complejo1.getFase())*exponente);
		 resultado.ObtenerParteImaginariayReal();
		 
		
		
		return resultado ;
		}
	
	public NumeroComplejo radicacion(NumeroComplejo complejo, int raiz) {
		
		NumeroComplejo resultado= new NumeroComplejo();
		 float nuevoModulo= (float) Math.pow( complejo.getModulo() , (1/raiz));
		 resultado.setModulo(nuevoModulo);
		 resultado.setFase( complejo.getFase()/raiz);
		 resultado.ObtenerParteImaginariayReal();
		 
		 
		 for(int i=1; i < raiz;i++) {
			 
			 
			 NumeroComplejo resultadoW= new NumeroComplejo();
			 resultadoW.setModulo(nuevoModulo);
			 resultadoW.setFase( resultado.getFase()+ (2*i*(Math.PI))/raiz);
			 resultadoW.ObtenerParteImaginariayReal();
			 
			 resultado.getnSolucines().add(resultadoW);
			 }
		 
		 
		 return resultado;
		 
		 
	}
}
