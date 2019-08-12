import java.util.ArrayList;

public class Complejo {
	private double real, imaginario,modulo,fase;

	public Complejo(double r, double im) {
		real=r;
		imaginario=im;
	}
	
	/**
	 * Retorna parte real del numero
	 * @return real 
	 */
	
	public double getReal() {
		return real;
	}
	
	
	/**
	 * Cambia la parte real del numero
	 * @param n numero de tipo double por el cual se cambiara la parte real
	 */
	public void setReal(double n) {
		real=n;
	}
	

	
	/**
	 * Retorna parte imaginaria del numero
	 * @return imaginario
	 */
	
	public double getImag() {
		return imaginario;
		
	}
	
	
	/**
	 * Cambia la parte imaginaria del numero
	 * @param n numero de tipo double por el cual se cambiara la parte imaginaria
	 */
	
	public void setImag(double n) {
		imaginario=n;
	}
	
	
	/**
	 * Retorna el modulo del numero complejo
	 * @return modulo
	 */
	
	public double getModulo() {
		this.modulo = Math.sqrt((Math.pow(this.real, 2)+(Math.pow(this.imaginario, 2))));
		return modulo;
	}
	
	/**
	 * Retorna el conjugado del numero complejo 
	 * @return conjugado
	 */
	
	public Complejo getConjugado() {
		this.imaginario = this.imaginario*(-1);
		return this;
	}
	
	/**
	 * Retorna la fase del numero complejo
	 * @return
	 */
	
	public double getFase() {
		this.fase = Math.atan(imaginario/real);
		return fase;
		
	}
	
	public ArrayList<Double> conversion(){
		ArrayList<Double> ListaPolar = new ArrayList<Double>();
		ListaPolar.add(this.getModulo());
		ListaPolar.add(this.getFase());
		return ListaPolar;
	}
	
	
	
	

}
