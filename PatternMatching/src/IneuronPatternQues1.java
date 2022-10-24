
public class IneuronPatternQues1 {

	public static void main(String[] args) {

		int n = 9;

		// name
////////////A
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n - 1 || (i == (n - 1) / 2 && j > (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			for (int j = 0; j < n; j++) {
				if (i == j || (i == (n - 1) / 2 && j < (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			// J
			System.out.print("  ");
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2 && i < (n - 1) || i == (n - 1) && j < (n - 1) / 2
						|| j == 0 && i > (3 * n / 4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			// E
			System.out.print("  ");
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == (n - 1) || i == (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			// E
			System.out.print("  ");
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == (n - 1) || i == (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			//T
			System.out.print("  ");
			for (int j = 0; j < n; j++) {
				if (i == 0 || j==(n-1)/2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			
			
			
			System.out.println();

		}

		System.out.println();

		// for character I
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == (n - 1) || ((j == (n - 1) / 2) && i < (n - 1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			// for Character N
			System.out.print("     ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == (n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			// for Character E
			System.out.print("     ");

			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == (n - 1) || i == (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			// for Character U
			System.out.print("     ");
			for (int j = 0; j < n; j++) {
				if (j == 0 && i < n - 1 || j == n - 1 && i < n - 1 || (i == (n - 1) && j > 0 && j < n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			// for Character R
			System.out.print("     ");
			for (int j = 0; j < n; j++) {
				if ((j == 0) || (i == 0 && j < n - 1) || (i == (n - 1) / 2 && j < n - 1)
						|| (j == n - 1 && i < (n - 1) / 2 && i > 0) || ((i == j) && i > (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			// for Character O
			System.out.print("     ");
			for (int j = 0; j < n; j++) {
				if (i == 0 && j > 0 && j < n - 1 || i == n - 1 && j > 0 && j < n - 1 || j == 0 && i > 0 && i < n - 1
						|| j == n - 1 && i > 0 && i < n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			// for Character N
			System.out.print("     ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == (n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();
		}

	}
}
