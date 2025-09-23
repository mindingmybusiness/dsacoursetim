package dsacoursetim;

public class FactorialRecursion {
	
	public static void main(String[] args) {
		int num =7 ;
		System.out.println(recursiveFactorial(num));
	}
	
	public static int iterativeFactorial(int num) {
		if(num == 0) {
			return 1;
		}
		int factorial =1;
		for(int i=1;i<=num;i++) {
			factorial *=i;
		}
		return factorial;
	}
	
	public static int recursiveFactorial(int num) {
		if(num == 0) {
			return 1;
		}
		int factorial = num*recursiveFactorial(num-1);
		System.out.println(num);
		return factorial;
	}

}
