public class Fatorial {
	
	
  //fatorial(5) = 5 * fatorial(4)	
  public static int fatorialRC(int num) {
	  if(num == 0) {
		  return 1;
	  }
	  return num * fatorialRC(num -1);
  }
}
   
