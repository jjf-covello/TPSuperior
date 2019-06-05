package mundo;
import mundo.NumeroComplejo;
import java.util.ArrayList;
import java.util.List;

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
		float nuevoModulo= (float) Math.pow( Math.E , Math.log(complejo.getModulo())/raiz);
		 
		 NumeroComplejo resultado2= potenciacion(complejo, 1/raiz);
		resultado.setModulo(nuevoModulo);
		 resultado.setFase( complejo.getFase()/raiz);
		 resultado.ObtenerParteImaginariayReal();
		 
		 List<NumeroComplejo> nSoluciones= new ArrayList();
		 List<NumeroComplejo> raicesPrimarias= new ArrayList();
		 resultado.setnSolucines(nSoluciones);
		 resultado.setRaicesPrimarias(raicesPrimarias);
		 
		 
		 
		 
		 for(int i=1; i < raiz;i++) {
			 
			 
			 NumeroComplejo resultadoW= new NumeroComplejo();
			 resultadoW.setModulo(nuevoModulo);
			 resultadoW.setFase( resultado.getFase()+ (2*i*(Math.PI))/raiz);
			 resultadoW.ObtenerParteImaginariayReal();
			 
			 resultado.getnSolucines().add(resultadoW);
			 if(raiz%i != 0) {
				 resultado.getRaicesPrimarias().add(resultadoW);
				 
			 }
			 }
		 
		 
		 
		 
		 return resultado;
		 
		 
	}
}
