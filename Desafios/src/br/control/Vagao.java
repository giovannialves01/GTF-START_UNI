package br.control;

public class Vagao extends Transporte {

	public Vagao(String valor, String peso) {
		super(valor, peso);
		
	}
	
	public double calculaFrete(String distancia) {
		return ((Double.parseDouble(peso) * 0.07) * (Double.parseDouble(valor) * 0.01) + Double.parseDouble(distancia)* 0.5);
	}
}
