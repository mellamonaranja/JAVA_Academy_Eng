
public class OperatorEx04 {
	
	public static void main(String[] args) {
		
		
		System.out.println( 1234.777);
		
		
		System.out.println( Math.round(1234.777));
//		�Ҽ��� ���� ù°�ڸ��� �ݿø��ϴ� �Լ�, so 1235
		
		System.out.println( Math.round(1234.777)*10);
		System.out.println( Math.round(1234.777*10)/10.0);
//		���� �����̸鼭, �Ҽ��� ù°�ڸ� ������

		System.out.println( Math.round(1234.777*100)/100.0);
//		���� �����̸鼭, �Ҽ��� ��°�ڸ� ������
		
		System.out.println( Math.round(1234.777*1000)/1000.0);
//		���� �����̸鼭, �Ҽ��� ��°�ڸ� ������		
	}

}