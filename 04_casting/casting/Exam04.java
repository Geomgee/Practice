package casting;

public class Exam04 {
	public static void main(String[] args) {
		// 문자열을 기본타입으로 강제 변환
		String str = "100";
		System.out.println(str + 100); //"문자열"+숫자=>문자열로 변경

		byte b = Byte.parseByte(str);
		System.out.println(b + 100);
		
		short s = Short.parseShort(str);
		System.out.println(s + 100);

		int i = Integer.parseInt(str);
		System.out.println(i + 100);
	
		long l = Long.parseLong(str);
		System.out.println(l + 100);
		
		float f = Float.parseFloat(str);
		System.out.println(f + 100);
	
		double d = Double.parseDouble(str);
		System.out.println(d + 100);

		//boolean b = Boolean.parseBoolean(str);
		//System.out.println(b + 100); //boolean은 True or False로 결과를 출력하기 때문
		//문자열을 Boolean 타입으로 변환하면 false가 된다.
		boolean b1 = Boolean.parseBoolean("str");
		System.out.println(b1);
		boolean b2 = Boolean.parseBoolean("0");
		System.out.println(b2);
		boolean b3 = Boolean.parseBoolean("1");
		System.out.println(b3);
		
	}
}
