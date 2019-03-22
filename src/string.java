
public class string {
	/*
	public static void main(String[] args) {
		int LENGTH = 3;
		int COLUMN = 6;
		int m, n;
		char[][] show = new char[LENGTH][COLUMN];
		char[] lower = {'a', 'b', 'c', 'd', 'e', 'f'};
		char[] upper = {'A', 'B', 'C', 'D', 'E', 'F'};
		char[] characters = {'+', '-', '*', '/', '=', '\"'};
		
		show[0] = lower;
		show[1] = upper;
		show[2] = characters;
		
		for (m = 0; m < LENGTH; m++) {
			for (n = 0; n < COLUMN; n++) {
				System.out.print(show[m][n] + "\t");
			}
			System.out.print('\n');
		}		
	}*/
	/*
	// practice 1, chapter 5
	public static void main(String[] args) {
		int[] integers = new int[21];
		
		for (int i = 0; i < 21; i++) {
			integers[i] = i;
		}
		for (int i = 0; i < 21; i++) {
			System.out.print("integer[" + i + "] = " + integers[i] + "\n");
		}
	}*/
	/*
	//practice 2, chapter 5
	public static void main(String[] args) {
		int[][] array = new int[10][2];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {
				array[i][j] = 1;
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.print("\n");
		}
	}*/
	
	//practice 3, chapter 5
	public static void main(String[] args) {
		int[][] array = new int[10][2];
		int[][] array2 = array;
		int[][] array3 = array;
		// initialize array
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {
				array[i][j] = 1;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					array2[i][j] = 1; 
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 1) {
					array3[i][j] = 2; 
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
