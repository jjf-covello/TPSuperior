package IUS;

import java.io.InputStreamReader;
import java.util.Scanner;

import EDT.NumeroComplejo;
import OB.Operacion;
import SF.Fasores;
import SF.SumaDeFasores;
import SF.TienenDistintoFrecuenciaException;
import OA.OperacionesAvanzadas;

import java.io.BufferedReader;

public class Main {
	
	
	public static void main(String[] args) throws TienenDistintoFrecuenciaException {
		
		String seguir= "s";
		Scanner scanner = new Scanner(System.in);
		String eleccion;
		
		System.out.println("Bienvenido ¿que desea hacer? (operacion Basica, operacion avanzada, Suma de Fasores)");
		eleccion = scanner.nextLine();
		
		
		while(seguir=="s") {
		switch(eleccion) {
		
		case "operacion Basica":
			
			Operacion operador= new Operacion();
			NumeroComplejo numeroComplejo1= new NumeroComplejo();
			NumeroComplejo numeroComplejo2= new NumeroComplejo();
			System.out.println("¿Que Operacion desea realizar?(suma, resta, division, multiplicacion)");
			eleccion= scanner.nextLine();
			switch(eleccion) {
			
			case "suma":
				
				System.out.println("Desea ingresar el numero Como polar o de forma binomica. (SOLO ESCRIBA "+"polar"+" o "+"binomica"+")");
				eleccion= scanner.nextLine();
				if(eleccion=="polar") {

					System.out.println("ingrese el valor del modulo del primer numero");
					float modulo1= Integer.parseInt(scanner.nextLine());
					
					System.out.println("ingrese el valor de la fase del primer numero");				
					float fase1= Integer.parseInt(scanner.nextLine());
					
					System.out.println("ingrese el valor del modulo del segundo numero");
					float modulo2= Integer.parseInt(scanner.nextLine());

					System.out.println("ingrese el valor de la fase del segundo numero");
					float fase2= Integer.parseInt(scanner.nextLine());
	
					numeroComplejo1.setFase(fase1);
					numeroComplejo1.setModulo(modulo1);
					numeroComplejo2.setFase(fase2);
					numeroComplejo2.setModulo(modulo2);
					numeroComplejo1.ObtenerParteImaginariayReal();
					numeroComplejo2.ObtenerParteImaginariayReal();
					
					NumeroComplejo numeroComplejo3=operador.suma(numeroComplejo1, numeroComplejo2);
					numeroComplejo3.mostrar();
					
				}else {
				
				System.out.println("ingrese el valor de parte real del primer numero");
				float valorReal1= Integer.parseInt(scanner.nextLine());
				
				System.out.println("ingrese el valor de parte imaginaria del primer numero");				
				float valorImaginario1= Integer.parseInt(scanner.nextLine());
				
				System.out.println("ingrese el valor de parte real del segundo numero");
				float valorReal2= Integer.parseInt(scanner.nextLine());

				System.out.println("ingrese el valor de parte imaginaria del segundo numero");
				float valorImaginario2= Integer.parseInt(scanner.nextLine());
				
				numeroComplejo1.setParteImaginaria(valorImaginario1);
				numeroComplejo1.setParteReal(valorReal1);
				numeroComplejo2.setParteImaginaria(valorImaginario2);
				numeroComplejo2.setParteReal(valorReal2);
				
				NumeroComplejo complejoResultado= operador.suma(numeroComplejo1, numeroComplejo2);
				complejoResultado.mostrar();
				}
				
				break;
				
			case "multiplicacion":
				
				
				System.out.println("Desea ingresar el numero Como polar o de forma binomica. (SOLO ESCRIBA "+"polar"+" o "+"binomica"+")");
				eleccion= scanner.nextLine();
				if(eleccion=="polar") {

					System.out.println("ingrese el valor del modulo del primer numero");
					float modulo1= Integer.parseInt(scanner.nextLine());
					
					System.out.println("ingrese el valor de la fase del primer numero");				
					float fase1= Integer.parseInt(scanner.nextLine());
					
					System.out.println("ingrese el valor del modulo del segundo numero");
					float modulo2= Integer.parseInt(scanner.nextLine());

					System.out.println("ingrese el valor de la fase del segundo numero");
					float fase2= Integer.parseInt(scanner.nextLine());
	
					numeroComplejo1.setFase(fase1);
					numeroComplejo1.setModulo(modulo1);
					numeroComplejo2.setFase(fase2);
					numeroComplejo2.setModulo(modulo2);
					numeroComplejo1.ObtenerParteImaginariayReal();
					numeroComplejo2.ObtenerParteImaginariayReal();
					
					NumeroComplejo numeroComplejo3=operador.multiplicacion(numeroComplejo1, numeroComplejo2);
					numeroComplejo3.mostrar();
					
				}else {
				
				System.out.println("ingrese el valor de parte real del primer numero");
				float valorReal1= Integer.parseInt(scanner.nextLine());
				
				System.out.println("ingrese el valor de parte imaginaria del primer numero");				
				float valorImaginario1= Integer.parseInt(scanner.nextLine());
				
				System.out.println("ingrese el valor de parte real del segundo numero");
				float valorReal2= Integer.parseInt(scanner.nextLine());

				System.out.println("ingrese el valor de parte imaginaria del segundo numero");
				float valorImaginario2= Integer.parseInt(scanner.nextLine());
				
				numeroComplejo1.setParteImaginaria(valorImaginario1);
				numeroComplejo1.setParteReal(valorReal1);
				numeroComplejo2.setParteImaginaria(valorImaginario2);
				numeroComplejo2.setParteReal(valorReal2);
				
				NumeroComplejo complejoResultado= operador.multiplicacion(numeroComplejo1, numeroComplejo2);
				complejoResultado.mostrar();
				}
				
				break;
			
			case"cociente":
			
				System.out.println("Desea ingresar el numero Como polar o de forma binomica. (SOLO ESCRIBA "+"polar"+" o "+"binomica"+")");
				eleccion= scanner.nextLine();
				if(eleccion=="polar") {

					System.out.println("ingrese el valor del modulo del primer numero");
					float modulo1= Integer.parseInt(scanner.nextLine());
					
					System.out.println("ingrese el valor de la fase del primer numero");				
					float fase1= Integer.parseInt(scanner.nextLine());
					
					System.out.println("ingrese el valor del modulo del segundo numero");
					float modulo2= Integer.parseInt(scanner.nextLine());

					System.out.println("ingrese el valor de la fase del segundo numero");
					float fase2= Integer.parseInt(scanner.nextLine());
	
					numeroComplejo1.setFase(fase1);
					numeroComplejo1.setModulo(modulo1);
					numeroComplejo2.setFase(fase2);
					numeroComplejo2.setModulo(modulo2);
					numeroComplejo1.ObtenerParteImaginariayReal();
					numeroComplejo2.ObtenerParteImaginariayReal();
					
					NumeroComplejo numeroComplejo3=operador.cociente(numeroComplejo1, numeroComplejo2);
					numeroComplejo3.mostrar();
					
				}else {
				
				System.out.println("ingrese el valor de parte real del primer numero");
				float valorReal1= Integer.parseInt(scanner.nextLine());
				
				System.out.println("ingrese el valor de parte imaginaria del primer numero");				
				float valorImaginario1= Integer.parseInt(scanner.nextLine());
				
				System.out.println("ingrese el valor de parte real del segundo numero");
				float valorReal2= Integer.parseInt(scanner.nextLine());

				System.out.println("ingrese el valor de parte imaginaria del segundo numero");
				float valorImaginario2= Integer.parseInt(scanner.nextLine());
				
				numeroComplejo1.setParteImaginaria(valorImaginario1);
				numeroComplejo1.setParteReal(valorReal1);
				numeroComplejo2.setParteImaginaria(valorImaginario2);
				numeroComplejo2.setParteReal(valorReal2);
				
				NumeroComplejo complejoResultado= operador.cociente(numeroComplejo1, numeroComplejo2);
				complejoResultado.mostrar();
				}
				
				break;
				
				
			case"resta":
			
				System.out.println("Desea ingresar el numero Como polar o de forma binomica. (SOLO ESCRIBA "+"polar"+" o "+"binomica"+")");
				eleccion= scanner.nextLine();
				if(eleccion=="polar") {

					System.out.println("ingrese el valor del modulo del primer numero");
					float modulo1= Integer.parseInt(scanner.nextLine());
					
					System.out.println("ingrese el valor de la fase del primer numero");				
					float fase1= Integer.parseInt(scanner.nextLine());
					
					System.out.println("ingrese el valor del modulo del segundo numero");
					float modulo2= Integer.parseInt(scanner.nextLine());

					System.out.println("ingrese el valor de la fase del segundo numero");
					float fase2= Integer.parseInt(scanner.nextLine());
	
					numeroComplejo1.setFase(fase1);
					numeroComplejo1.setModulo(modulo1);
					numeroComplejo2.setFase(fase2);
					numeroComplejo2.setModulo(modulo2);
					numeroComplejo1.ObtenerParteImaginariayReal();
					numeroComplejo2.ObtenerParteImaginariayReal();
					
					NumeroComplejo numeroComplejo3=operador.resta(numeroComplejo1, numeroComplejo2);
					numeroComplejo3.mostrar();
					
				}else {
				
				System.out.println("ingrese el valor de parte real del primer numero");
				float valorReal1= Integer.parseInt(scanner.nextLine());
				
				System.out.println("ingrese el valor de parte imaginaria del primer numero");				
				float valorImaginario1= Integer.parseInt(scanner.nextLine());
				
				System.out.println("ingrese el valor de parte real del segundo numero");
				float valorReal2= Integer.parseInt(scanner.nextLine());

				System.out.println("ingrese el valor de parte imaginaria del segundo numero");
				float valorImaginario2= Integer.parseInt(scanner.nextLine());
				
				numeroComplejo1.setParteImaginaria(valorImaginario1);
				numeroComplejo1.setParteReal(valorReal1);
				numeroComplejo2.setParteImaginaria(valorImaginario2);
				numeroComplejo2.setParteReal(valorReal2);
				
				NumeroComplejo complejoResultado= operador.resta(numeroComplejo1, numeroComplejo2);
				complejoResultado.mostrar();
				}
				
				break;
			
			
			}	
			
			break;
			
			
		case "operacion avanzada":

			
			

			NumeroComplejo Complejo1= new NumeroComplejo();
			NumeroComplejo Complejo2= new NumeroComplejo();
			OperacionesAvanzadas operacionAvanzada= new OperacionesAvanzadas();
			System.out.println("¿Que Operacion desea realizar?(radicacion o potenciacion");
			eleccion= scanner.nextLine();
			
			
			switch(eleccion){
			
			case "potenciacion":
				

				System.out.println("Desea ingresar el numero Como polar o de forma binomica. (SOLO ESCRIBA "+"polar"+" o "+"binomica"+")");
				eleccion= scanner.nextLine();
				if(eleccion=="polar") {

					System.out.println("ingrese el valor del modulo del primer numero");
					float modulo1= Integer.parseInt(scanner.nextLine());
					
					System.out.println("ingrese el valor de la fase del primer numero");				
					float fase1= Integer.parseInt(scanner.nextLine());
					
					System.out.println("ingrese la potencia");
					int potencia= Integer.parseInt(scanner.nextLine());

					Complejo1.setFase(fase1);
					Complejo1.setModulo(modulo1);
					Complejo1.ObtenerParteImaginariayReal();
					
					
					NumeroComplejo numeroComplejo3=operacionAvanzada.potenciacion(Complejo1, potencia);
					numeroComplejo3.mostrar();
					
				}else {
				
				System.out.println("ingrese el valor de parte real del primer numero");
				float valorReal1= Integer.parseInt(scanner.nextLine());
				
				System.out.println("ingrese el valor de parte imaginaria del primer numero");				
				float valorImaginario1= Integer.parseInt(scanner.nextLine());
				

				System.out.println("ingrese la potencia");
				int potencia= Integer.parseInt(scanner.nextLine());
				
				Complejo1.setParteImaginaria(valorImaginario1);
				Complejo1.setParteReal(valorReal1);
				Complejo1.setModulo(Complejo1.obtenerModulo());
				Complejo1.setFase(Complejo1.obtenerFase());
				
				
				NumeroComplejo complejoResultado= operacionAvanzada.potenciacion(Complejo1, potencia);
				complejoResultado.mostrar();
				}
				
				break;

				
				
				
		
			case "radicacion":
				System.out.println("Desea ingresar el numero Como polar o de forma binomica. (SOLO ESCRIBA "+"polar"+" o "+"binomica"+")");
				eleccion= scanner.nextLine();
				if(eleccion=="polar") {

					System.out.println("ingrese el valor del modulo del primer numero");
					float modulo1= Integer.parseInt(scanner.nextLine());
					
					System.out.println("ingrese el valor de la fase del primer numero");				
					float fase1= Integer.parseInt(scanner.nextLine());
					
					System.out.println("ingrese la raiz");
					int potencia= Integer.parseInt(scanner.nextLine());

					Complejo1.setFase(fase1);
					Complejo1.setModulo(modulo1);
					Complejo1.ObtenerParteImaginariayReal();
					
					
					NumeroComplejo numeroComplejo3=operacionAvanzada.radicacion(Complejo1, potencia);
					numeroComplejo3.mostrar();
					numeroComplejo3.mostrarSoluciones();
				}else {
				
				System.out.println("ingrese el valor de parte real del primer numero");
				float valorReal1= Integer.parseInt(scanner.nextLine());
				
				System.out.println("ingrese el valor de parte imaginaria del primer numero");				
				float valorImaginario1= Integer.parseInt(scanner.nextLine());
				
				System.out.println("ingrese el valor de la raiz");
				int potencia= Integer.parseInt(scanner.nextLine());
				
				Complejo1.setParteImaginaria(valorImaginario1);
				Complejo1.setParteReal(valorReal1);
				Complejo1.setModulo(Complejo1.obtenerModulo());
				Complejo1.setFase(Complejo1.obtenerFase());
				
				
				NumeroComplejo complejoResultado= operacionAvanzada.radicacion(Complejo1, potencia);
				complejoResultado.mostrar();
				complejoResultado.mostrarSoluciones();
				}
				
				
				
				
			break;
			
			
			}
			
			
			break;
			
			
			
			
			
			
			
			
			
		case "suma de fasores":
			


			Fasores fasor1= new Fasores();
			Fasores fasor2= new Fasores();
			SumaDeFasores sumadorFasores= new SumaDeFasores();
			
			
			
			System.out.println("ingrese si el 1er fasor es Seno o Coseno");
			String senoOCoseno= scanner.nextLine();
			if(senoOCoseno=="coseno") {
				
				fasor1.setEsCoseno(true);
				
				
			}else {
				
				fasor1.setEsCoseno(false);
				
				
			}

			System.out.println("ingrese si el 2do fasor es Seno o Coseno");
			senoOCoseno= scanner.nextLine();
			if(senoOCoseno=="coseno") {
				
				fasor2.setEsCoseno(true);
				
				
			}else {
				
				fasor2.setEsCoseno(false);
				
				
			}
			
			
			
			
			System.out.println("ingrese la amplitud del 1er fasor");
			float amplitud1= Integer.parseInt(scanner.nextLine());
			
			fasor1.setAmplitud(amplitud1);
			
			System.out.println("ingrese la amplitud del 2do fasor");
			float amplitud2= Integer.parseInt(scanner.nextLine());

			fasor2.setAmplitud(amplitud2);
			
			System.out.println("ingrese la fase del 1er fasor");
			float fase1= Integer.parseInt(scanner.nextLine());
			
			fasor1.setFase(fase1);
			
			
			System.out.println("ingrese la fase del 2do fasor");
			float fase2= Integer.parseInt(scanner.nextLine());
			
			
			fasor2.setFase(fase2);
			

			System.out.println("ingrese la frecuencia del 1er fasor");
			float frecuencia1= Integer.parseInt(scanner.nextLine());
			
			fasor1.setFrecuencia(frecuencia1);

			System.out.println("ingrese la frecuencia del 2do fasor");
			float frecuencia2= Integer.parseInt(scanner.nextLine());

			fasor1.setFrecuencia(frecuencia2);
			
			Fasores fasorResultado= sumadorFasores.realizarOperacion(fasor1, fasor2);
			fasorResultado.mostrar();
			
		
		
		}
		
		
		System.out.println("Si desea continuar Presione s");
		seguir=scanner.nextLine();
		
		
		
		}
		
		
		
		
		
		
		
	}

}
