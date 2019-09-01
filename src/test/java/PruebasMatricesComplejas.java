package src.test.java;
import src.main.java.Complejos.*;
import src.main.java.MatrizComplejos.LibreriaMatrizComplejo;
import src.main.java.MatrizComplejos.MatrizComplejo;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class PruebasMatricesComplejas {
	
	@Test 
	public void sumaDeMatrices() {
		LibreriaMatrizComplejo a = new LibreriaMatrizComplejo();
		MatrizComplejo m1 = new MatrizComplejo(2,1);
		m1.addComplejo(new Complejo(1,2), 0, 0);
		m1.addComplejo(new Complejo(1,2), 1, 0);
		
		MatrizComplejo m2 = new MatrizComplejo(2,1);
		m2.addComplejo(new Complejo(6,3), 0, 0);
		m2.addComplejo(new Complejo(5,1), 1, 0);
		
		
		MatrizComplejo resp = new MatrizComplejo(2,1);
		resp.addComplejo(new Complejo(7,5), 0, 0);
		resp.addComplejo(new Complejo(6,3), 1, 0);
		
		resp.equals(a.sumaMatrizComplejos(m1, m2));
	}
	
	
	@Test
	public void restaDeMatrices() {
		LibreriaMatrizComplejo a =new LibreriaMatrizComplejo();
		MatrizComplejo m1 = new MatrizComplejo(2,1);
		m1.addComplejo(new Complejo(1,2), 0, 0);
		m1.addComplejo(new Complejo(1,2), 1, 0);
		
		
		MatrizComplejo m2 = new MatrizComplejo(2,1);
		m2.addComplejo(new Complejo(6,3), 0, 0);
		m2.addComplejo(new Complejo(5,1), 1, 0);
		
		

		MatrizComplejo resp = new MatrizComplejo(2,1);
		resp.addComplejo(new Complejo(-5,-1), 0, 0);
		resp.addComplejo(new Complejo(-4,1), 1, 0);
		
		resp.equals(a.restaMatrizComplejos(m1, m2));
		
	}
	
	
	@Test 
	public void productoEscalarM() {
		LibreriaMatrizComplejo a =new LibreriaMatrizComplejo();
		MatrizComplejo m1 = new MatrizComplejo(2,1);
		m1.addComplejo(new Complejo(6,3), 0, 0);
		m1.addComplejo(new Complejo(5,1), 1, 0);
	
		MatrizComplejo resp = new MatrizComplejo(2,1);
		resp.addComplejo(new Complejo(12,21), 0, 0);
		resp.addComplejo(new Complejo(13,13), 1, 0);
		
		resp.equals(a.productoEscalarMatriz(new Complejo(3,2),m1));
	}
	
	
	@Test
	public void multiMatrices() {
		LibreriaMatrizComplejo a =new LibreriaMatrizComplejo();
		MatrizComplejo m1 = new MatrizComplejo(3,3);
		m1.addComplejo(new Complejo(3,2), 0, 0);
		m1.addComplejo(new Complejo(1,0), 1, 0);
		m1.addComplejo(new Complejo(4,-1), 2, 0);
		m1.addComplejo(new Complejo(0,0), 0, 1);
		m1.addComplejo(new Complejo(4,2), 1, 1);
		m1.addComplejo(new Complejo(0,0), 2, 1);
		m1.addComplejo(new Complejo(5,-6), 0, 2);
		m1.addComplejo(new Complejo(0,1), 1, 2);
		m1.addComplejo(new Complejo(4,0), 2, 2);
		
		
		
		MatrizComplejo m2 = new MatrizComplejo(3,3);
		m2.addComplejo(new Complejo(5,0), 0, 0);
		m2.addComplejo(new Complejo(0,0), 1, 0);
		m2.addComplejo(new Complejo(7,-4), 2, 0);
		m2.addComplejo(new Complejo(2,-1), 0, 1);
		m2.addComplejo(new Complejo(4,5), 1, 1);
		m2.addComplejo(new Complejo(2,7), 2, 1);
		m2.addComplejo(new Complejo(6,-4), 0, 2);
		m2.addComplejo(new Complejo(2,0), 1, 2);
		m2.addComplejo(new Complejo(0,0), 2, 2);
		
		
		MatrizComplejo resp = new MatrizComplejo(3,3);
		resp.addComplejo(new Complejo(26,-52), 0, 0);
		resp.addComplejo(new Complejo(9,7), 1, 0);
		resp.addComplejo(new Complejo(48,-21), 2, 0);
		resp.addComplejo(new Complejo(60,24), 0, 1);
		resp.addComplejo(new Complejo(1,29), 1, 1);
		resp.addComplejo(new Complejo(15,22), 2, 1);
		resp.addComplejo(new Complejo(26,0), 0, 2);
		resp.addComplejo(new Complejo(14,0), 1, 2);
		resp.addComplejo(new Complejo(20,-22), 2, 2);
		
		resp.equals(a.multiplicacionMatrices(m1, m2));
	
	}
	
	@Test
	public void esTranspuesta() {
		LibreriaMatrizComplejo a =new LibreriaMatrizComplejo();
		MatrizComplejo m1 = new MatrizComplejo(3,3);
		m1.addComplejo(new Complejo(3,2), 0, 0);
		m1.addComplejo(new Complejo(1,0), 1, 0);
		m1.addComplejo(new Complejo(4,-1), 2, 0);
		m1.addComplejo(new Complejo(0,0), 0, 1);
		m1.addComplejo(new Complejo(4,2), 1, 1);
		m1.addComplejo(new Complejo(0,0), 2, 1);
		m1.addComplejo(new Complejo(5,-6), 0, 2);
		m1.addComplejo(new Complejo(0,1), 1, 2);
		m1.addComplejo(new Complejo(4,0), 2, 2);
		
		MatrizComplejo resp = new MatrizComplejo(3,3);
		resp.addComplejo(new Complejo(3,2), 0, 0);
		resp.addComplejo(new Complejo(0,0), 1, 0);
		resp.addComplejo(new Complejo(5,-6), 2, 0);
		resp.addComplejo(new Complejo(1,0), 0, 1);
		resp.addComplejo(new Complejo(4,2), 1, 1);
		resp.addComplejo(new Complejo(0,1), 2, 1);
		resp.addComplejo(new Complejo(4,-1), 0, 2);
		resp.addComplejo(new Complejo(0,0), 1, 2);
		resp.addComplejo(new Complejo(4,0), 2, 2);
		
		resp.equals(a.transpuesta(m1));
		
	}
	
	@Test
	public void esConjugada() {
		LibreriaMatrizComplejo a =new LibreriaMatrizComplejo();
		MatrizComplejo m1 = new MatrizComplejo(3,3);
		m1.addComplejo(new Complejo(3,2), 0, 0);
		m1.addComplejo(new Complejo(1,0), 1, 0);
		m1.addComplejo(new Complejo(4,-1), 2, 0);
		m1.addComplejo(new Complejo(0,0), 0, 1);
		m1.addComplejo(new Complejo(4,2), 1, 1);
		m1.addComplejo(new Complejo(0,0), 2, 1);
		m1.addComplejo(new Complejo(5,-6), 0, 2);
		m1.addComplejo(new Complejo(0,1), 1, 2);
		m1.addComplejo(new Complejo(4,0), 2, 2);
		
		MatrizComplejo resp = new MatrizComplejo(3,3);
		resp.addComplejo(new Complejo(3,-2), 0, 0);
		resp.addComplejo(new Complejo(1,0), 1, 0);
		resp.addComplejo(new Complejo(4,1), 2, 0);
		resp.addComplejo(new Complejo(0,0), 0, 1);
		resp.addComplejo(new Complejo(4,-2), 1, 1);
		resp.addComplejo(new Complejo(0,0), 2, 1);
		resp.addComplejo(new Complejo(5,6), 0, 2);
		resp.addComplejo(new Complejo(0,-1), 1, 2);
		resp.addComplejo(new Complejo(4,0), 2, 2);
		
		resp.equals(a.conjugada(m1));
		
	}
	
	
	@Test
	public void esAdjunta() {
		LibreriaMatrizComplejo a =new LibreriaMatrizComplejo();
		MatrizComplejo m1 = new MatrizComplejo(3,3);
		m1.addComplejo(new Complejo(5,0), 0, 0);
		m1.addComplejo(new Complejo(0,0), 1, 0);
		m1.addComplejo(new Complejo(7,-4), 2, 0);
		m1.addComplejo(new Complejo(2,-1), 0, 1);
		m1.addComplejo(new Complejo(4,5), 1, 1);
		m1.addComplejo(new Complejo(2,7), 2, 1);
		m1.addComplejo(new Complejo(6,-4), 0, 2);
		m1.addComplejo(new Complejo(2,0), 1, 2);
		m1.addComplejo(new Complejo(0,0), 2, 2);
		
		MatrizComplejo resp = new MatrizComplejo(3,3);
		resp.addComplejo(new Complejo(5,0), 0, 0);
		resp.addComplejo(new Complejo(2,1), 1, 0);
		resp.addComplejo(new Complejo(6,4), 2, 0);
		resp.addComplejo(new Complejo(0,0), 0, 1);
		resp.addComplejo(new Complejo(4,-5), 1, 1);
		resp.addComplejo(new Complejo(2,0), 2, 1);
		resp.addComplejo(new Complejo(7,4), 0, 2);
		resp.addComplejo(new Complejo(2,-7), 1, 2);
		resp.addComplejo(new Complejo(0,0), 2, 2);
		
		resp.equals(a.adjunta(m1));
	}
	
	@Test 
	public void norma() {
		LibreriaMatrizComplejo a =new LibreriaMatrizComplejo();
		MatrizComplejo m1 = new MatrizComplejo(3,1);
		m1.addComplejo(new Complejo(3,0), 0, 0);
		m1.addComplejo(new Complejo(-6,0), 1, 0);
		m1.addComplejo(new Complejo(2,0), 2, 0);
		
		assertEquals(7,a.normaMatriz(m1),1.0);
	}
	
	@Test 
	public void distancia() {
		LibreriaMatrizComplejo a =new LibreriaMatrizComplejo();
		MatrizComplejo m1 = new MatrizComplejo(2,1);
		m1.addComplejo(new Complejo(1,2), 0, 0);
		m1.addComplejo(new Complejo(1,2), 1, 0);
		
		
		MatrizComplejo m2 = new MatrizComplejo(2,1);
		m1.addComplejo(new Complejo(6,3), 0, 0);
		m1.addComplejo(new Complejo(5,1), 1, 0);

		assertEquals(6.557438524302,a.distanciaMatriz(m1, m2),1.0);

	}
	
	@Test
	public void esUnitaria() {
		LibreriaMatrizComplejo a =new LibreriaMatrizComplejo();
		MatrizComplejo m1 = new MatrizComplejo(3,3);
		m1.addComplejo(new Complejo(5,0), 0, 0);
		m1.addComplejo(new Complejo(0,0), 1, 0);
		m1.addComplejo(new Complejo(7,-4), 2, 0);
		m1.addComplejo(new Complejo(2,-1), 0, 1);
		m1.addComplejo(new Complejo(4,5), 1, 1);
		m1.addComplejo(new Complejo(2,7), 2, 1);
		m1.addComplejo(new Complejo(6,-4), 0, 2);
		m1.addComplejo(new Complejo(2,0), 1, 2);
		m1.addComplejo(new Complejo(0,0), 2, 2);
		
		assertEquals(false,a.Unitaria(m1));
	}
	
	@Test
	public void esHermitiana() {
		LibreriaMatrizComplejo a =new LibreriaMatrizComplejo();
		MatrizComplejo m1 = new MatrizComplejo(3,3);
		m1.addComplejo(new Complejo(5,0), 0, 0);
		m1.addComplejo(new Complejo(0,0), 1, 0);
		m1.addComplejo(new Complejo(7,-4), 2, 0);
		m1.addComplejo(new Complejo(2,-1), 0, 1);
		m1.addComplejo(new Complejo(4,5), 1, 1);
		m1.addComplejo(new Complejo(2,7), 2, 1);
		m1.addComplejo(new Complejo(6,-4), 0, 2);
		m1.addComplejo(new Complejo(2,0), 1, 2);
		m1.addComplejo(new Complejo(0,0), 2, 2);
		
		assertTrue(a.Hermitiana(m1));
	}
	
	
	@Test
	public void prodTensor() {
		LibreriaMatrizComplejo a =new LibreriaMatrizComplejo();
		MatrizComplejo m1 = new MatrizComplejo(2,1);
		m1.addComplejo(new Complejo(1,2), 0, 0);
		m1.addComplejo(new Complejo(1,2), 1, 0);
		
		
		MatrizComplejo m2 = new MatrizComplejo(3,1);
		m2.addComplejo(new Complejo(3,0), 0, 0);
		m2.addComplejo(new Complejo(-6,0), 1, 0);
		m2.addComplejo(new Complejo(2,0), 2, 0);
		
		MatrizComplejo resp = new MatrizComplejo(6,1);
		resp.addComplejo(new Complejo(3,6), 0, 0);
		resp.addComplejo(new Complejo(-6,-12), 1, 0);
		resp.addComplejo(new Complejo(2,4), 2, 0);
		resp.addComplejo(new Complejo(3,6), 3, 0);
		resp.addComplejo(new Complejo(-6,-12), 4, 0);
		resp.addComplejo(new Complejo(2,4), 5, 0);
		
		resp.equals(a.productoTensor(m1, m2));
	}
	
}


