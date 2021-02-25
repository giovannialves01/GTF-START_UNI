package br.control;

public class Multiply {
	
	public void error(String msg, int multiplicando, int intervaloInit, int IntervaloFim) {
		System.out.println("Multiplicando: " + multiplicando);
		System.out.println("Início do intervalo: " + intervaloInit);
		System.out.println("Fim do intervalo: " + IntervaloFim);
		System.out.println(msg);
		return;
	}
	
	public void multiplicador(int multiplicando, int intervaloInit, int IntervaloFim) {
		
		
		
		if (multiplicando < 0 || 3000 < multiplicando) {
			error("O multiplicando deve ser maior que 0 e menor que 3000", multiplicando, intervaloInit, IntervaloFim);
			return;
			
		}
		if (intervaloInit < 0 || 3000 < multiplicando) {
			error("Tanto o início do intervalalo deve ser maior que 0 e menor que 3000", multiplicando, intervaloInit, IntervaloFim);
			return;
		}
		
		if (intervaloInit - IntervaloFim > 9 || IntervaloFim - intervaloInit > 9) {
			error("A diferença entre o intervalo deve ser menor que 11", multiplicando, intervaloInit, IntervaloFim);
			return;
		}
		
		if(IntervaloFim > intervaloInit) {
			System.out.println("Error");
			return;
		}
		
		
		System.out.println("Multiplicando: " + multiplicando);
		System.out.println("Início do intervalo: " + intervaloInit);
		System.out.println("Fim do intervalo: " + IntervaloFim);
		
		for (int i = intervaloInit; i <= IntervaloFim; i++) {
			int result = multiplicando * i;
			System.out.println(multiplicando + " x " + i + " = " + result);
			
		}
		return;
	}
	
}
