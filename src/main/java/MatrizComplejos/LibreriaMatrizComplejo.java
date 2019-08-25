package src.main.java.MatrizComplejos;
import src.main.java.Complejos.*;
import src.main.java.MatrizComplejos.*;


public class LibreriaMatrizComplejo {
	private Libreria matriz = new Libreria();
	
	
	/**
	 * Sumar dos vectores de números complejos
	 * @param v1 vector de numeros complejos a sumar
	 * @param v2 vector de numeros complejos a sumar
	 * @return sumvectores resultado de la operacion realizada
	 */
	
	public static Complejo[] sumaVectores(Complejo[] v1, Complejo[] v2) {
		if(v1.length==v2.length) {
			Complejo[] sumvectores = new Complejo [v1.length];
			for (int i=0; i<v1.length;i++) {
					Complejo resp = Libreria.suma(v1[i], v2[i]);
					sumvectores[i]=resp;
				}
			return sumvectores;
		}
		else {
			return null;
		}
	
	}
	
	/**
	 * Inversa de vectores complejos
	 */
	
	
	
	
	/**
	 * Multiplicación de un escalar por un vector complejo
	 * @param v1 vector de numeros complejos a multiplicar
	 * @param a numero complejo a multiplicar
	 * @return multev resultado de la operacion realizada
	 */

	public static Complejo[] productoEscalarVector(Complejo[]v1, Complejo a) {
		Complejo[] multev = new Complejo[v1.length];
		for (int i=0; i<v1.length;i++) {
			Complejo resp= Libreria.producto(v1[i], a);
			multev[i]=resp;
		}
		return multev;
	}
	
	
	/**
	 * Sumar dos matrices de números complejos
	 * @param a Matriz de numeros complejos a sumar
	 * @param b Matriz de numeros complejos a sumar 
	 * @return sumMatrizComplejo resultado de la operacion realizada
	 */
	
	public MatrizComplejo sumaMatrizComplejos(MatrizComplejo a, MatrizComplejo b) {
		if((a.getFila()==b.getFila()) && (a.getColumna()==b.getColumna())) {
			MatrizComplejo sumMatrizComplejo = new MatrizComplejo(a.getFila(),a.getColumna());
			for(int i=0;i<a.getFila();i++) {
				for(int j=0;j<b.getColumna();j++) {
					sumMatrizComplejo.getMatrizCompl()[i][j] = Libreria.suma(a.getMatrizCompl()[i][j], b.getMatrizCompl()[i][j]);
				}
			}
			return sumMatrizComplejo;
			
		}
		else {
			return null;
		}
		
	}
	
	/**
	 * Inversa de matrices Complejos
	 */
	
	
	
	
	
	/**
	 * Multiplicacion de un escalar por una matriz compleja
	 * @param m1 matriz de numeros complejos a multiplicar
	 * @param a numero complejo a multiplicar
	 * @return multem resultado de la operacion realizada
	 */
	
	public MatrizComplejo productoEscalarMatriz(MatrizComplejo m1, Complejo a) {
		MatrizComplejo multem = new MatrizComplejo(m1.getFila(),m1.getColumna());		
			for(int i=0; i<m1.getFila();i++) {
				for (int j=0;i<m1.getColumna();j++) {
					multem.getMatrizCompl()[i][j] = Libreria.producto(m1.getMatrizCompl()[i][j],a);
			}
		}
		return multem;
	}
	
	
	
	
	
	

}



