import java.util.Scanner;

public class Ex03_2 {

	public static void main(String[] args) {

		int[] answer = { 1, 4, 3, 2, 1 };
		int[] input = new int[5];
		int sum = 0;
		String ox = "";
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		for (int a = 0; a < input.length; a++) {
			System.out.print(a + 1 + "���� >> ");
			input[a] = sc.nextInt();
			if (input[a] == answer[a]) {
				sum += 20;
				ox += "O ";
			} else {
				ox += "X ";
			}
		}
		System.out.println("����Ȯ��");
		System.out.print(ox);
		System.out.println("���� : " + sum);
		sc.close();
	}
}
