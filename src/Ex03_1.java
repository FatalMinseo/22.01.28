import java.util.Scanner;

public class Ex03_1 {

	public static void main(String[] args) {

		int[] answer = { 1, 4, 3, 2, 1 };
		int[] input = new int[5];
		int sum = 0;
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		for (int a = 0; a < input.length; a++) {
			System.out.print(a + 1 + "���� >> ");
			input[a] = sc.nextInt();
		}
		System.out.println("����Ȯ��");
		for (int b = 0; b < input.length; b++)
			if (input[b] == answer[b]) {
				sum += 20;
				System.out.print("O ");
			} else {
				System.out.print("X ");
			}
		System.out.println("���� : " + sum);
		sc.close();
	}
}
