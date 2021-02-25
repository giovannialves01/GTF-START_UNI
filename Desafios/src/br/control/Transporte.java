package br.control;

public abstract class Transporte extends Carga{
	
	public Transporte(String valor, String peso) {
		super(valor, peso);
	}
	
	public int calculaFrete(int distancia) {
		return (Integer.parseInt(valor) * distancia);
	}
}
