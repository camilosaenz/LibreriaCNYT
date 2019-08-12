import static org.junit.Assert.assertEquals;


import java.util.ArrayList;

import org.junit.Test;




public class Pruebas {
	@Test
	public void test() {
	}

	@Test
	public void SumarComplejos() {
		Complejo a = new Complejo(-3,1);
		Complejo b = new Complejo(1,-5);
		Complejo res = Libreria.suma(a,b);
		assertEquals(0,res.getReal(),2.0);
		assertEquals(3,res.getImag(),4.0);
	}
	
	@Test
	public void RestarComplejos() {
		Complejo a = new Complejo(-3,1);
		Complejo b = new Complejo(1,-5);
		Complejo res = Libreria.resta(a,b);
		assertEquals(2,res.getReal(),4.0);
		assertEquals(-5,res.getImag(),6.0);
	}
	
	@Test
	public void ProductoComplejos() {
		Complejo a = new Complejo(-3,1);
		Complejo b = new Complejo(1,-5);
		Complejo res = Libreria.producto(a,b);
		assertEquals(2,res.getReal(),6.0);
		assertEquals(5,res.getImag(),6.0);
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
		Complejo b = new Complejo(4,-3);
		assertEquals(new Complejo(4.0,3.0),b.getConjugado());
	}
	
	@Test
	public void conversionPolar() {
		Complejo a = new Complejo(4,-3);
		ArrayList<Double> polar = new ArrayList<Double>();
		polar.add(5.0);
		polar.add(-0.6435011087932844);
		assertEquals(polar,a.conversion());
	}
	
	
	
	
	
}
