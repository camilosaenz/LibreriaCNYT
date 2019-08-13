import static org.junit.Assert.assertEquals;


import java.util.ArrayList;

import org.junit.Test;




public class Pruebas {
	@Test
	public void test() {
	}

	@Test
	public void SumarComplejos() {
		Complejo a = new Complejo(2,1);
		Complejo b = new Complejo(3,2);
		Complejo res = Libreria.suma(a,b);
		assertEquals(5,res.getReal(),1.0);
		assertEquals(3,res.getImag(),1.0);
	}
	
	@Test
	public void RestarComplejos() {
		Complejo a = new Complejo(10,5);
		Complejo b = new Complejo(3,2);
		Complejo res = Libreria.resta(a,b);
		assertEquals(7,res.getReal(),1.0);
		assertEquals(3,res.getImag(),1.0);
	}
	
	@Test
	public void ProductoComplejos() {
		Complejo a = new Complejo(2,3);
		Complejo b = new Complejo(4,5);
		Complejo res = Libreria.producto(a,b);
		assertEquals(-7,res.getReal(),6.0);
		assertEquals(22,res.getImag(),6.0);
	}
	
	@Test 
	public void DividirComplejos() {
		Complejo a = new Complejo(-3,1);
		Complejo b = new Complejo(1,-5);
		Complejo res = Libreria.division(a,b);
		assertEquals(0,res.getReal(),4.0);
		assertEquals(3,res.getImag(),4.0);
	}
	
	
	@Test 
	public void moduloComplejo() {
		Complejo a = new Complejo(4,-3);
		assertEquals(3.0,a.getModulo(),4.0);
	}
	
	
	@Test
	public void faseComplejo() {
		Complejo a = new Complejo(4,-3);
		assertEquals(4,a.getFase(),5.0);
	}
	
	@Test 
	public void conjugadoComplejo() {
		Complejo b = new Complejo(3,2);
		assertEquals(3,b.getReal(),1.0);
		assertEquals(2,b.getImag(),1.0);
	}
	
	
	
	
	
	
}
