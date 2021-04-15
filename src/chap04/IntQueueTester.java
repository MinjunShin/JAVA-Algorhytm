package chap04;

import java.util.Scanner;

class IntQueueTester {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    IntQueue s = new IntQueue(64);
    
    while(true) {
		System.out.println("���� ������ �� : " + s.size() + " / " );
		System.out.print("(1) Ǫ�� (2)�� (3)��ũ (4)���� (0)����");
		int menu = stdIn.nextInt();
		if(menu == 0) break;
		
		int x;
		switch(menu) {
		 case 1 :
			System.out.println("������ �Է� : ");
			x = stdIn.nextInt();
			try {
				s.enque(x);
			} catch (IntQueue.OverflowQueueException e) {
				System.out.println("ť�� ���� á���ϴ�.");
			}
			break;
			
		 case 2 :
			 try {
				 x = s.deque();
				 System.out.println("deque�� �����ʹ� " + x + " �Դϴ�.");
			 } catch (IntQueue.EmptyQueueException e) {
				 System.out.println("ť�� ����ֽ��ϴ�.");
			 }
			 break;
			 
		  case 3 :
			  try {
				  x = s.peek();
				  System.out.println("peek�� �����ʹ� "+ x + " �Դϴ�.");
			  } catch (IntQueue.EmptyQueueException e) {
				  System.out.println("ť�� ����ֽ��ϴ�.");
			  }
			  break;
			  
		  case 4 : 
			  s.dump();
			  break;
			}
		}
	
 	}
}
			  