
public class string {
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
	}
}
