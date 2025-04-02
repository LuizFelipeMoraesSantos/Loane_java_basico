

public class TesteContador {
	
	static void imprimirValor() {
		System.out.println(Contador.obtervalor());
	}

	public static void main(String[] args) {
		
		Contador.incremento();
		imprimirValor();
		
		
		Contador.incremento();
		imprimirValor();
		
		Contador.retirar();
		imprimirValor();
		
		Contador.zerar();
		imprimirValor();
	}

}
