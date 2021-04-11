package chap03;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


class BinSearch_ComparatorEx {

	static class PhyscData {
		
		private String name;
		private int height;
		private double vision;

		//������
		public PhyscData(String name, int height, double vision) {
			this.name = name; this.height = height; this.vision = vision;
		}
		
		//���ڿ��� ��ȯ�ϴ� �޼���(����Ȯ�ο�)
		public String toString() {			
			return name + " " + height + " " + vision;
		}
		
		//������������ �����ϱ� ���� comparator
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
		PhyscData[] x = {  // Ű�� ������������ ���ĵǾ� ����.
				new PhyscData("�̳���", 162, 0.3),
				new PhyscData("������", 168, 0.4),
				new PhyscData("������", 173, 0.7),
				new PhyscData("���Ѱ�", 169, 0.8),
				new PhyscData("��ȣ��", 174, 1.2),
				new PhyscData("ȫ�ر�", 173, 1.5),
				new PhyscData("�̼���", 175, 2.0),								
		};
		
		System.out.println("ã�� �÷���? : ");
		double vision = stdIn.nextDouble();
		int idx = Arrays.binarySearch(x, // �迭 x����
				new PhyscData("", 0, vision), // Ű�� vision�� ��Ҹ�
				PhyscData.VISION_ORDER // VISION_ORDER�� ����Ͽ� �˻�
		);

		if(idx < 0)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else {
			System.out.println(vision + "�� x[" + idx + "]�� �ֽ��ϴ�.");
			System.out.println("ã�� ������ : " + x[idx]); // �ڵ����� toString �޼��� ȣ��
				
		}
		
	}

}
