package com.testing;

public class alpha {
	public static void main(String[] args) {
		// Print A

		System.out.println("Print A");
		System.out.println();
		int a = 4;
		for (int i = 0; i < a; i++) {
			for (int k = 0; k < (a - 1) - i; k++) {
				System.out.print(" ");

			}
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i || i == a / 2) {
					System.out.print("* ");

				} else {
					System.out.print("  ");

				}
			}
			System.out.println("  ");

		}
		System.out.println();
		System.out.println();

		// Print B

		System.out.println("Print B");
		System.out.println();
		int b = 5;
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < b; j++) {
				if (i == 0 || j == 0 || i == b - 1 || j == b - 1 || i == b / 2) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println("");

		}
		System.out.println();
		System.out.println();

		// Print C

		System.out.println("Print C");
		System.out.println();
		int c = 5;
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < c; j++) {
				if (i == 0 || j == 0 || i == c - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("");
		}
		System.out.println();
		System.out.println();

		// Print D

		System.out.println("Print D");
		System.out.println();
		int d = 5;
		for (int i = 0; i < d; i++) {
			for (int j = 0; j < d; j++) {
				if (i == 0 || j == 0 || i == d - 1 || j == d - 1) {
					System.out.print("*");

				} else {
					System.out.print(" ");

				}

			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print E

		System.out.println("Print E");
		System.out.println();
		int e = 5;
		for (int i = 0; i < e; i++) {
			for (int j = 0; j < e; j++) {
				if (i == 0 || j == 0 || i == e - 1 || i == e / 2) {
					System.out.print("*");

				} else {
					System.out.print(" ");

				}

			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		// Print F

		System.out.println("Print F");
		System.out.println();
		int f = 5;
		for (int i = 0; i < f; i++) {
			for (int j = 0; j < f; j++) {
				if (i == 0 || j == 0 || i == f / 2) {
					System.out.print("*");

				} else {
					System.out.print(" ");

				}

			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print G

		System.out.println("Print G");
		System.out.println();
		int g = 5;
		for (int i = 0; i < g; i++) {
			for (int j = 0; j < g; j++) {
				if (i == 0 || j == 0 || i == g - 1 || i == g / 2 & j >= 3 || j == g - 1 & i == (g - 1) - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}

			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print H

		System.out.println(" Print H");
		System.out.println();
		int h = 5;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < h; j++) {
				if (j == 0 || i == h / 2 || j == h - 1) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print I

		System.out.println(" Print I");
		System.out.println();
		int i1 = 5;
		for (int i = 0; i < i1; i++) {
			for (int j = 0; j < i1; j++) {
				if (i == 0 || j == i1 / 2 || i == i1 - 1) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print J

		System.out.println(" Print J");
		System.out.println();
		int j1 = 5;
		for (int i = 0; i < j1; i++) {
			for (int j = 0; j < j1; j++) {
				if (i == 0 || j == j1 / 2 || i == j1 - 1 & j <= 2 || j == 0 & i == (j1 - 1) - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print K

		System.out.println(" Print K");
		System.out.println();
		int k1 = 5;
		for (int i = 0; i < k1; i++) {
			for (int j = 0; j < k1; j++) {
				if (j == 0 || i + j == k1 - 2 || i - j == (k1 - 2) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print L

		System.out.println(" Print L");
		System.out.println();
		int l = 5;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				if (i == l - 1 || j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print M

		System.out.println(" Print M");
		System.out.println();
		int m = 5;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (j == 0 || j == m - 1 || i == j & j <= (m - 1) / 2 || i + j == m - 1 & i <= (m - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print N

		System.out.println(" Print N");
		System.out.println();
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print O
		System.out.println(" Print O");
		System.out.println();
		int o = 5;
		for (int i = 0; i < o; i++) {
			for (int j = 0; j < o; j++) {
				if (i == 0 || j == 0 || i == o - 1 || j == o - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print P
		System.out.println(" Print P");
		System.out.println();
		int p = 5;
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < p; j++) {
				if (i == 0 || j == 0 || i == p / 2 || j == p - 1 & i <= (p / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print Q
		System.out.println("Print Q");
		System.out.println();
		int q = 5;
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < q; j++) {
				if (i == 0 & j < q - 1 || j == 0 & i < q - 1 || i == (q - 1) - 1 & j < q - 1
						|| j == (q - 1) - 1 & i < q - 1 || i == j & i >= q / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print R
		System.out.println(" Print R");
		System.out.println();
		int r = 5;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				if (i == 0 || j == 0 || i == r / 2 || j == r - 1 & i <= r / 2 || i == r / 2 + j - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print S
		System.out.println(" Print S");
		System.out.println();
		int s = 5;
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++) {
				if (i == 0 || i == s / 2 || i == s - 1 || j == 0 & i <= s / 2 || j == s - 1 & i >= s / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print T
		System.out.println(" Print T");
		System.out.println();
		int t = 5;
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t; j++) {
				if (i == 0 || j == t / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print U
		System.out.println("Print U");
		System.out.println();
		int u = 5;
		for (int i = 0; i < u; i++) {
			for (int j = 0; j < u; j++) {
				if (j == 0 || i == u - 1 || j == u - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print V
		System.out.println("Print V");
		System.out.println();
		int v = 5;
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				if (i == j & j <= (v - 1) / 2 || i + j == v - 1 & i <= (v - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// Print W
		System.out.println(" Print W");
		System.out.println();
		int w = 5;
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < w; j++) {
				if (j == 0 || j == w - 1 || i == j & j >= w / 2 || i + j == w - 1 & i >= w / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// Print X
		System.out.println(" Print X");
		System.out.println();
		int x = 5;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (i == j || i + j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println();
		System.out.println();

		// Print Y
		System.out.println(" Print Y");
		System.out.println();
		int y = 5;
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < y; j++) {
				if (j == y / 2 & i >= y / 2 || i == j & j <= y / 2 || i + j == y - 1 & i <= y / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// Print Z
		System.out.println("Print Z");
		System.out.println();
		int z = 5;
		for (int i = 0; i < z; i++) {
			for (int j = 0; j < z; j++) {
				if (i == 0 || i == z - 1 || i + j == z - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
