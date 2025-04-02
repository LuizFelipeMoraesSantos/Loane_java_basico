package exercicio35;

public class Teste {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria(null,null,0);
		
		conta.setNomeCliente("Luiz Felipe");
		conta.setNumConta("23252629844");
		conta.setSaldo(0);
		
		conta.depositar(1820.00);
		System.out.println(conta.getSaldo());
		
		
		conta.sacar(100.00);
		System.out.println(conta.getSaldo());
		

	}

}
