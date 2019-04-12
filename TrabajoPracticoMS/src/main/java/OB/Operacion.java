package OB;
import EDT.NumeroComplejo;

public class Operacion {
	
	public NumeroComplejo suma(NumeroComplejo complejo1, NumeroComplejo  complejo2) { 
		
		NumeroComplejo complejo3=new NumeroComplejo();
		
		complejo3.setParteImaginaria((complejo1.getParteImaginaria()+complejo2.getParteImaginaria()));
		complejo3.setParteReal((complejo1.getParteReal()+complejo2.getParteReal()));
		
		return complejo3;
		
	}
	public NumeroComplejo resta(NumeroComplejo complejo1, NumeroComplejo  complejo2) 
	{
		
		NumeroComplejo complejo3=new NumeroComplejo();
		
		complejo3.setParteImaginaria((complejo1.getParteImaginaria()-complejo2.getParteImaginaria()));
		complejo3.setParteReal((complejo1.getParteReal()-complejo2.getParteReal()));
		
		return complejo3;
		
		
	}
	
	public NumeroComplejo multiplicacion(NumeroComplejo complejo1, NumeroComplejo  complejo2)
	{
       NumeroComplejo complejo3=new NumeroComplejo();
		
       float a= complejo1.getParteReal();
       float b=complejo1.getParteImaginaria();
       float c=complejo2.getParteReal();
       float d=complejo2.getParteImaginaria();
       
       
       float parteRealResultado= (a*c-b*d);
       float parteImaginariaResultado= (a*d +b*c);
       
       complejo3.setParteReal(parteRealResultado);
       complejo3.setParteImaginaria(parteImaginariaResultado);
       
       
		return complejo3;
		
		
		
		
		
		
		
	}
	
	public NumeroComplejo cociente(NumeroComplejo complejo1, NumeroComplejo  complejo2)
	{
		

	       NumeroComplejo complejo3=new NumeroComplejo();
		
		   float a= complejo1.getParteReal();
	       float b=complejo1.getParteImaginaria();
	       float c=complejo2.getParteReal();
	       float d=complejo2.getParteImaginaria();
	       
	       
	       float parteRealResultado= (a*c-b*d)/(c*c+d*d);
	       float parteImaginariaResultado= (a*d +b*c)/(c*c+d*d);
	       
	       complejo3.setParteReal(parteRealResultado);
	       complejo3.setParteImaginaria(parteImaginariaResultado);
	       
	       
			return complejo3;
				
	
		
		
		
		
	}

}
