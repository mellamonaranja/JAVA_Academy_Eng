
public class OperatorEx03 {
	public static void main(String [] args) {
		
		float f = 123.77777f;
		double d = 234.88888;
		
		System.out.println(f);
		System.out.println(d);
		
//		 %f : �Ǽ��� ���, ������ ����(%)�ؼ� f�����͸� ����ϰڴ�
//		String.format("%f",f);
//		%f�� f�� ���� ����
		
		String str1 = String.format("%.2f",f);
//		�Ҽ��� ���� ��°�ڸ����� ���� ����
		System.out.println(str1);
		
		String.format("%.4f", d);
//		�Ҽ��� ���� ��°�ڸ����� ������
		
		String str2 = String.format("%.4f", d);
		System.out.println(str2);
		
		
		
		
		
	}

}