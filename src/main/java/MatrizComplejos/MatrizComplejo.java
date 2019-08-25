package src.main.java.MatrizComplejos;
import java.util.Arrays;
import java.util.Objects;

import src.main.java.Complejos.*;
public class MatrizComplejo {
	private int fila, columna;
	private Complejo[][] matrizCompl;
	
	
	public MatrizComplejo(int fila, int columna) {
		this.fila=fila;
		this.columna=columna;
		this.matrizCompl= new Complejo[fila][columna];
	}
	
	public Complejo[][] getMatrizCompl() {
		return matrizCompl;
	}
	
	public void setMatrizCompl(Complejo[][] fila) {
		this.matrizCompl=fila;
	}
	
	public int getFila() {
		return fila;
	}
	
	public int getColumna() {
		return columna;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null || getClass()!=o.getClass()) {
			return false;
		}
		MatrizComplejo that = (MatrizComplejo) o;
		Boolean equalmatrix=true;
		
		if(fila==that.fila && columna==that.columna) {
			for(int i=0; i<fila && fila==that.fila && columna==that.columna;i++) {
				for(int j=0; j<columna;j++) {
					equalmatrix=this.getMatrizCompl()[i][j].equals(that.getMatrizCompl()[i][j]);
				}
			}
		}
		return equalmatrix;
	}

	
	@Override
	public int hashCode() {
		int result = Objects.hash(fila,columna);
		result = 31*result+Arrays.hashCode(matrizCompl);
		return result;
		
	}
	
	
	

}
