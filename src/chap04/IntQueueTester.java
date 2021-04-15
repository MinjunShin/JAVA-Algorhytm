package chap04;

import java.util.Scanner;

class IntQueueTester {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    IntQueue s = new IntQueue(64);
    
    while(true) {
		System.out.println("현재 데이터 수 : " + s.size() + " / " );
		System.out.print("(1) 푸시 (2)팝 (3)피크 (4)덤프 (0)종료");
		int menu = stdIn.nextInt();
		if(menu == 0) break;
		
		int x;
		switch(menu) {
		 case 1 :
			System.out.println("데이터 입력 : ");
			x = stdIn.nextInt();
			try {
				s.enque(x);
			} catch (IntQueue.OverflowQueueException e) {
				System.out.println("큐가 가득 찼습니다.");
			}
			break;
			
		 case 2 :
			 try {
				 x = s.deque();
				 System.out.println("deque한 데이터는 " + x + " 입니다.");
			 } catch (IntQueue.EmptyQueueException e) {
				 System.out.println("큐가 비어있습니다.");
			 }
			 break;
			 
		  case 3 :
			  try {
				  x = s.peek();
				  System.out.println("peek한 데이터는 "+ x + " 입니다.");
			  } catch (IntQueue.EmptyQueueException e) {
				  System.out.println("큐가 비어있습니다.");
			  }
			  break;
			  
		  case 4 : 
			  s.dump();
			  break;
			}
		}
	
 	}
}
			  