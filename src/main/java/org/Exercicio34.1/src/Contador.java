
public class Contador {
	
	 private static int cont;
	 
	public static int incremento() {
		 return cont ++;
	}
	
	public static int retirar() {
		return cont --;
	}
	
	public static int zerar() {
		return cont = 0;
	}
	
	public static int obtervalor() {
		return cont;
	}
}