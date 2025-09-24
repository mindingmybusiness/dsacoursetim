package pattern.programs;

public class Triangle {

	public static void main(String[] args) {
		int num = 5;
		printHollowRATriangle(num);
	}

	/*
	 * print a right angle triangle
	 */
	public static void printRightAngleTriangle(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	/*
	 * print a hollow right angle triangle
	 */
	public static void printHollowRATriangle(int num) {
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i || i == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}
				System.out.println();
			}
		}

	}
}
