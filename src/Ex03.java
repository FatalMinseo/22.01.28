import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int[] input = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		for (int a = 0; a < input.length; a++) {
			System.out.print(a + 1 + "���� >> ");
			input[a] = sc.nextInt();
		}
		System.out.print("�Է��� ���� : ");
		for (int b = 0; b < input.length; b++) {
			System.out.print(input[b] + " ");
		}
		sc.close();
	}
}
