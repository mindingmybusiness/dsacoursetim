package pattern.programs;

public class Square {

	public static void main(String[] args) {
		/*
		 * print square shape of stars
		 */
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * print hollow square shape of stars
		 */
		System.out.println("--------------------");
		
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10;j++) {
				if(i==0 || j==0 || i==10 || j==10) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		
	}
}
