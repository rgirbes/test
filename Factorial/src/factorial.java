import java.util.*;

/**
 * Classe que calcula el factorial d’un nombre.
 *
 * @author Roger Girbes
 * @version 2014
 */
public class factorial {
	/**
	 * Calcula el factorial de n. n! = n * (n-1) * (n-2) * (n-3) * ... * 1
	 * 
	 * @param n és el número al que es calcularà el factorial.
	 *           
	 * @return n! és el resultat del factorial de n
	 */
	public static double factorial(double n) {
		if (n == 0)
			return 1;
		else {
			double resultat = n * factorial(n - 1);
			return resultat;
		}
	}
	
	public static void main (String [] args){
		System.out.println(factorial(5));
	}

}
