package step03_Exception.ex0205;

public class ExceptionExam {

	public static void main(String[] args) {
		
		System.out.println("-----메인 시작하기-----------");
		
		System.out.println("args = " + args);
		System.out.println("args = " + args.length);
		
		if(args.length > 0) {
			for(String s : args) {
				System.out.println(s);
			}
		}
		
//		String param = args[0];
//		System.out.println(param);
		
		try {
			String param = args[0];
			System.out.println("param = " + param);
			
			int convertNo = Integer.parseInt(param);
			
			int result = 100/convertNo;
			
			System.out.println("변환한 숫자 = " + convertNo);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("e = " + e); // e.toString() 호출함
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요 : " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("예외 발생여부롸 상관없이 무조건 실행됩니다.^^ㅗ");
		}
		
		System.out.println("-----메인 끝---------------");

	}

}
