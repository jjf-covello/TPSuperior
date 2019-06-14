package mundo;
import mundo.NumeroComplejo;
import java.util.ArrayList;
import java.util.List;



public class OperacionesAvanzadas {
	
	
	public NumeroComplejo potenciacion(NumeroComplejo complejo1, int exponente) {
		
		 NumeroComplejo resultado= new NumeroComplejo();
		 float nuevoModulo= (float) Math.pow(complejo1.getModulo(),exponente);
		 resultado.setModulo(nuevoModulo);
		 resultado.setFase((complejo1.getFase())*exponente);
		 resultado.ObtenerParteImaginariayReal();
		
		 //resultado.nSolucines.add(resultado);
		 
		 return resultado;
		}
	
	
	public int GCD(int a, int b) {
		   if (b==0) return a;
		   return GCD(b,a%b);
		}
	
	
	public int MaxComDiv(int num1, int num2){
		
		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);
		int res;
		
		do {
			res=b;
			b=a%b;
			a=res;
			
		} while(b!=0);
		
		return res;
	}
	
	
	
	public NumeroComplejo radicacion(NumeroComplejo complejo, int raiz) {
		
		NumeroComplejo resultado= new NumeroComplejo();
		float nuevoModulo= (float) Math.pow( Math.E , Math.log(complejo.getModulo())/raiz);
		 
		 //NumeroComplejo resultado2= potenciacion(complejo, 1/raiz);
		 resultado.setModulo(nuevoModulo);
		 resultado.setFase( complejo.getFase()/raiz);
		 resultado.ObtenerParteImaginariayReal();
		 
		 List<NumeroComplejo> nSoluciones= new ArrayList();
		 List<NumeroComplejo> raicesPrimarias= new ArrayList();
		 resultado.setnSolucines(nSoluciones);
		 resultado.setRaicesPrimarias(raicesPrimarias);
		 resultado.getnSolucines().add(resultado);
		 
		 
		 
		 for(int i=1; i < raiz;i++) {
			 
			 
			 NumeroComplejo resultadoW= new NumeroComplejo();
			 resultadoW.setModulo(nuevoModulo);
			 resultadoW.setFase( resultado.getFase()+ (2*i*(Math.PI))/raiz);
			 resultadoW.ObtenerParteImaginariayReal();
			 
			 resultado.getnSolucines().add(resultadoW);
			 
			 if(MaxComDiv(i,raiz) == 1) {
				 resultado.getRaicesPrimarias().add(resultadoW);
				 
			 }
			 }
		 
		 
		 
		 
		 return resultado;
		 
		 
	}
}
