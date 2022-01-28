import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int[] input = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		for (int a = 0; a < input.length; a++) {
			System.out.print(a + 1 + "번답 >> ");
			input[a] = sc.nextInt();
		}
		System.out.print("입력한 답은 : ");
		for (int b = 0; b < input.length; b++) {
			System.out.print(input[b] + " ");
		}
		sc.close();
	}
}
