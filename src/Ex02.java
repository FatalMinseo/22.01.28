import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		int[] starcount = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int c = 0; c < starcount.length; c++) {
			System.out.print("숫자 입력 : ");
			starcount[c] = sc.nextInt();
			System.out.print(starcount[c] + " : ");
			for (int a = 0; a < starcount[c]; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
