import java.util.Scanner;

public class Ex02_1 {

	public static void main(String[] args) {

		int[] starcount = new int[11];
		Scanner sc = new Scanner(System.in);
		for (int c = 0; c < starcount.length; c++) {
			System.out.print("숫자 입력 : ");
			starcount[c] = sc.nextInt();
		}
		for (int a = 0; a < starcount.length; a++) {
			
			for (int b = 0; b < starcount[a]; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
