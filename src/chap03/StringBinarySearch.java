package chap03;
import java.util.Scanner;
import java.util.Arrays;

class StringBinarySearch {
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		String[] x = {
				"abstract", "assert", "boolean", "break", "byte",
				"case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else",
				"enum", "extends", "final", "finally", "float",
				"for", "goto", "if", "implements", "import",
				"instanceof", "int", "interface", "long"
		};
		
		System.out.print("���ϴ� Ű���带 �Է��Ͻÿ�.");
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "�� x[" + idx + "]�� �ֽ��ϴ�.");
				
	}		

}
