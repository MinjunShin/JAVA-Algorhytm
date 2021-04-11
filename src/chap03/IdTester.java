package chap03;


class Id {
	
	private static int counter = 0;
	private int id;
	
	public Id() { id = ++counter; } // 생성자
	
	public int getId() {return id;} // id를 반환하는 인스턴스 메서드
	
	public static int getCounter() {return counter;} // counter를 반환하는 메서드
	
}


public class IdTester {

	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();

		System.out.println("a의 아이디 : " + a.getId());
		System.out.println("b의 아이디 : " + b.getId());
		
		System.out.println("부여한 아이디 개수 :" + Id.getCounter());
	}

}
