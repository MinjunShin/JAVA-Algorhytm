package chap02;

import java.util.Scanner;

class YMD {
	int y;  // 년
	int m;  // 월(1~12)
	int d;  // 일(1~31)
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // 윤년
		};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
		// 1을 반환하면 윤년, 0을 반환하면 평년이다.
		// 4로 나누어 떨어지는 해를 윤년으로 하여, 1년을 366일로 한다.
		// 하지만 그래도 정확하지 않으므로 100으로 나누어 떨어지고
		// 400으로 나누어 떨어지지 않는 해는 평년으로 한다.
	}
	
	public YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	public int after(int n) {
		
		if( d+n > mdays[isLeap(y)][m-1]) {
			return d + n - mdays[isLeap(y)][m-1];
		}
		
		else 
			return d+n;

	}
	
	public int before(int n) {
		
		if( d-n < 0) {
			return mdays[isLeap(y)][m-2] + (d-n);
		}
		
		else 
			return d-n;
	}
	
	
}


public class YMDprint {	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("년 :"); int year = stdIn.nextInt();
		System.out.print("월 :"); int month = stdIn.nextInt();
		System.out.print("일 :"); int day = stdIn.nextInt();
		
		YMD printYMD = new YMD (year, month, day);
		
		System.out.print("n일 전/후의 날짜 :"); int n = stdIn.nextInt();	
		
		System.out.println(n + "일 후의 날짜는" + printYMD.after(n) + "일 입니다.");
		System.out.println(n + "일 전의 날짜는" + printYMD.before(n) + "일 입니다.");
	}

}
