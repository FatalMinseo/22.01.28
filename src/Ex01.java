import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];
		System.out.println("들어가 있는 짝수는 ");
		for (int a = 0; a <= array.length; a++) {
			array[a] = sc.nextInt();
			
		}
		for (int b = 0; b <= array.length; b++) {
			if (array[b] % 2 == 0) {
				System.out.print(array[b] + " ");
			}
		}
	}
}
