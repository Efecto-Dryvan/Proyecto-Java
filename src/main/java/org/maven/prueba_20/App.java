package org.maven.prueba_20;

/**
 * Hello world!
 *
 */
public class App 
{
public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		System.out.println("Suma: " + sum(a,b));
		System.out.println("Resta: " + rest(a,b));
		System.out.println("Multiplicación: " + mult(a,b));
		System.out.println("División: " + div(a,b));
	}

	public static int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	public static int mult(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	public static int rest(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public static int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	
		
		/*
		final Logger LOGGER = Logger.getLogger(App.class.getName());
		
		for (int left = 0; left < 10; left++) {

			for (int right = 0; right < 10; right++) {
				LOGGER.log(Level.INFO, "Pair: ({0},{1})", new Object[] {left, right});
			}
		}*/
}
