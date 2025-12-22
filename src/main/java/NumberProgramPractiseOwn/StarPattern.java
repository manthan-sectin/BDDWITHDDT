package NumberProgramPractiseOwn;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; // Number of rows
		// 1. Simple Triangle Pattern
		System.out.println("Simple Triangle Pattern:");
		for (int i = 1; i <= n; i++) {
		System.out.println("* ".repeat(i));
		}
		// 2. Inverted Triangle Pattern
		System.out.println("\nInverted Triangle Pattern:");
		for (int i = n; i >= 1; i--) {
		System.out.println("* ".repeat(i));
		}
		// 3. Right-Aligned Triangle Pattern
		System.out.println("\nRight-Aligned Triangle Pattern:");
		for (int i = 1; i <= n; i++) {
		System.out.print(" ".repeat(n - i));
		System.out.println("* ".repeat(i));
		}
		// 4. Pyramid Pattern
		System.out.println("\nPyramid Pattern:");
		for (int i = 1; i <= n; i++) {
		System.out.print(" ".repeat(n - i));
		System.out.println("*".repeat(2 * i - 1));
		}
		// 5. Inverted Pyramid Pattern
		System.out.println("\nInverted Pyramid Pattern:");
		for (int i = n; i >= 1; i--) {
		System.out.print(" ".repeat(n - i));
		System.out.println("*".repeat(2 * i - 1));
		}
		// 6. Diamond Pattern
		System.out.println("\nDiamond Pattern:");
		for (int i = 1; i <= 2 * n - 1; i++) {
		int row = (i <= n) ? i : (2 * n - i);
		System.out.print(" ".repeat(n - row));
		System.out.println("*".repeat(2 * row - 1));
	}
	}
}
