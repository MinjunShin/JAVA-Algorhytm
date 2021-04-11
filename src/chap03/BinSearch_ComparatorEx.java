package chap03;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


class BinSearch_ComparatorEx {

	static class PhyscData {
		
		private String name;
		private int height;
		private double vision;

		//생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name; this.height = height; this.vision = vision;
		}
		
		//문자열을 반환하는 메서드(정보확인용)
		public String toString() {			
			return name + " " + height + " " + vision;
		}
		
		//오름차순으로 정렬하기 위한 comparator
		/*public static final Comparator<PhyscData> HEIGHT_ORDER
		= new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator <PhyscData>{

			public int compare(PhyscData o1, PhyscData o2) {
				return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;					   
			}			
		}*/
		
		
		public static final Comparator<PhyscData> VISION_ORDER
		= new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator <PhyscData> {

			public int compare(PhyscData o1, PhyscData o2) {
				return (o1.vision > o2.vision) ? 1 : (o1.vision < o2.vision) ? -1 : 0;
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = {  // 키의 오름차순으로 정렬되어 있음.
				new PhyscData("이나령", 162, 0.3),
				new PhyscData("유지훈", 168, 0.4),
				new PhyscData("전서현", 173, 0.7),
				new PhyscData("김한결", 169, 0.8),
				new PhyscData("이호연", 174, 1.2),
				new PhyscData("홍준기", 173, 1.5),
				new PhyscData("이수민", 175, 2.0),								
		};
		
		System.out.println("찾는 시력은? : ");
		double vision = stdIn.nextDouble();
		int idx = Arrays.binarySearch(x, // 배열 x에서
				new PhyscData("", 0, vision), // 키가 vision인 요소를
				PhyscData.VISION_ORDER // VISION_ORDER를 사용하여 검색
		);

		if(idx < 0)
			System.out.println("그 값의 요소가 없습니다.");
		else {
			System.out.println(vision + "은 x[" + idx + "]에 있습니다.");
			System.out.println("찾은 데이터 : " + x[idx]); // 자동으로 toString 메서드 호출
				
		}
		
	}

}
