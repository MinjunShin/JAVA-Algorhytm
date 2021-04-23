package chap05;

import java.util.Scanner;

public class Hanoi {
	static void move(int no, int x, int y) {
	if(no > 1) 
		move (no-1, x, 6-x-y);
	
	System.out.println("¿ø¹Ý[" + no + "]À» " + x + "±âµÕ¿¡¼­" + y + "±âµÕÀ¸·Î ¿Å±è");
	}
}
