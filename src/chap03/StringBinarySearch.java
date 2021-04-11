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
		
		System.out.print("원하는 키워드를 입력하시오.");
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0)
			System.out.println("그 값으 요소가 없습니다.");
		else
			System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
				
	}		

}
