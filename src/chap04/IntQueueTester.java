package chap04;

import java.util.Scanner;

class IntQueueTester {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    IntQueue s = new IntQueue(8);
    
    while(true) {
		s.print();
		System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capa());
		System.out.print("(1) 인큐 (2) 디큐 (3)피크 (4)덤프 (5)검색 (6)index 검색 (0)종료  ");
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

			case 5 : 
				System.out.println("검색할 값을 입력하세요.");
				x = stdIn.nextInt();
				System.out.println("검색한 데이터는 " + s.search(x) + " 번째에 있습니다.");	
				break;

			case 6 : 
				System.out.println("검색할 값을 입력하세요.");
				x = stdIn.nextInt();
				System.out.println("검색한 데이터의 인덱스 값은 " + s.indexOf(x) + " 입니다.");	
				break;

			}
			
		}	
 	}
}