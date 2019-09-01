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
	 * Restar dos matrices de numeros complejos 
	 * @param m1 Matriz de numeros complejos a restar
	 * @param m2 Matriz de numeros complejos a restar
	 * @return resMatrizComplejo resultado de la operacion realizada
	 */
	public MatrizComplejo restaMatrizComplejos(MatrizComplejo m1, MatrizComplejo m2) {
		MatrizComplejo resMatrizComplejo = new MatrizComplejo(m1.getColumna(),m1.getFila());
		if((m1.getFila()==m2.getFila()) && (m1.getColumna()==m2.getColumna())) {
			for(int i=0;i<m1.getColumna();i++) {
				for(int j=0;j<m2.getFila();j++) {
					resMatrizComplejo.getMatrizCompl()[i][j]=Libreria.resta(m1.getMatrizCompl()[i][j],m2.getMatrizCompl()[i][j]);
				}
			}
			
		}
		return resMatrizComplejo;
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
	
	/**
	 * Multiplicación de dos matrices complejas
	 * @param m1 matriz de numeros complejos a multiplicar
	 * @param m2 matriz de numeros complejos a multiplicar
	 * @return multi resultado de la operación realizada.
	 */
	public MatrizComplejo multiplicacionMatrices(MatrizComplejo m1, MatrizComplejo m2) {
		MatrizComplejo multi = new MatrizComplejo(m1.getColumna(),m2.getFila());
		if(m1.getFila()==m2.getColumna()) {
		for(int i=0; i<m1.getColumna();i++) {
			for(int j=0; j<m2.getFila();j++) {
				Complejo a = new Complejo(0,0);
				a = Libreria.suma(a, Libreria.producto(m1.getMatrizCompl()[i][j], m2.getMatrizCompl()[j][i]));
				multi.getMatrizCompl()[i][j] = a;
			}
			}
		}
		return multi;
	
	}
	
	
	
	/**
	 * Matriz Transpuesta de una matriz de numeros complejos
	 * @param m1 matriz de numeros complejos 
	 * @return matrizTranspuesta de una matriz m1 dada
	 */
	public MatrizComplejo transpuesta(MatrizComplejo m1) {
		MatrizComplejo matrizTranspuesta = new MatrizComplejo(m1.getColumna(),m1.getFila());
		for(int i=0; i<matrizTranspuesta.getColumna();i++) {
			for(int j=0; j<matrizTranspuesta.getFila();j++) {
				matrizTranspuesta.getMatrizCompl()[i][j]=m1.getMatrizCompl()[j][i];
			}
		}
		return matrizTranspuesta;
	}
	
	/**
	 * Matriz conjugada de una matriz de numeros complejos 
	 * @param m1 matriz de numeros complejos
	 * @return matrizConjugada de una matriz m1 dada
	 */
	public MatrizComplejo conjugada(MatrizComplejo m1) {
		MatrizComplejo matrizConjugada = new MatrizComplejo(m1.getColumna(),m1.getFila());
		for(int i=0; i<matrizConjugada.getColumna();i++) {
			for(int j=0; i<matrizConjugada.getFila();j++) {
				matrizConjugada.getMatrizCompl()[i][j] = m1.getMatrizCompl()[i][j].getConjugado();
			}
		}
		return matrizConjugada;
	}
	
	
	
	/**
	 * Matriz adjunta de una matriz de numeros complejos 
	 * @param m1 matriz de numeros complejos
	 * @return matrizAdjunta de una matriz m1 dada
	 */
	
	public MatrizComplejo adjunta(MatrizComplejo m1) {
		return conjugada(transpuesta(m1));
	}
	
	
	/**
	 * Norma de una matriz de numeros complejos 
	 * @param m1 matriz de numeros complejos
	 * @return norma numero de tipo double que retorna la norma de una matriz m1 dada
	 */
	
	public double normaMatriz(MatrizComplejo m1) {
		double a=0.0;
		for(int i=0;i<m1.getColumna();i++) {
			for(int j=0;j<m1.getFila();j++) {
				a+=Math.pow(m1.getMatrizCompl()[i][j].getModulo(), 2);
			}
		}
		double norma = Math.sqrt(a);
		return norma;
		
	}
	
	/**
	 * Calcular la distancia entre dos matrices dadas
	 * @param m1 matriz de numeros complejos 
	 * @param m2 matriz de numeros complejos
	 * @return distancia numero de tipo double que retorna la distancia entree dos matrices de complejos dadas
	 */
	public double distanciaMatriz(MatrizComplejo m1, MatrizComplejo m2) {
		double distancia=this.normaMatriz(this.restaMatrizComplejos(m1, m2));
		return distancia;
		
	}
	
	
	/**
	 * Revisa si la matriz dada es unitaria 
	 * @param m
	 */
	
	
	

}



