package exercicio35;


public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private float saldo;
	
	
	
	//Construtor
	public ContaBancaria(String nomeCliente, String numConta, float saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	//getters and setters
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	//Método
	public  void sacar( Double valor) {
		if(saldo > 0 && saldo >= valor){
			 saldo -= valor;
		}
	}
	
	
	public void depositar(Double valor) {
		if(valor > 0) {
			this.saldo = (float) (saldo + valor);
		}
		
	}
	
	
}
