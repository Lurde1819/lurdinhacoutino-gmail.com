import java.util.Scanner;
 
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fator = 1;
		
		
		System.out.println("Digite o numero inteiro para calcular o fatorial:");
	    int n = sc.nextInt();
	     
	     
	     for (int i = 1; i <= n ;i++ ) {
	    	    fator *=i;
	     }
	    	    System.out.println("O fatorial de " +n+ " e igual a "+fator);
	    	  
	    	    
	    	 
	        
	     sc.close();
	     
	

	}

}

