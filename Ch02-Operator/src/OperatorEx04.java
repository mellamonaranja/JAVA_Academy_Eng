
public class OperatorEx04 {
	
	public static void main(String[] args) {
		
		
		System.out.println( 1234.777);
		
		
		System.out.println( Math.round(1234.777));
//		소수점 이하 첫째자리를 반올림하는 함수, so 1235
		
		System.out.println( Math.round(1234.777)*10);
		System.out.println( Math.round(1234.777*10)/10.0);
//		정수 형태이면서, 소수점 첫째자리 보여짐

		System.out.println( Math.round(1234.777*100)/100.0);
//		정수 형태이면서, 소수점 둘째자리 보여짐
		
		System.out.println( Math.round(1234.777*1000)/1000.0);
//		정수 형태이면서, 소수점 셋째자리 보여짐		
	}

}
