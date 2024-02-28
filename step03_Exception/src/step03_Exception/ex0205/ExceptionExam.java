package step03_Exception.ex0205;

public class ExceptionExam {

	public static void main(String[] args) {
		
		System.out.println("-----���� �����ϱ�-----------");
		
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
			
			System.out.println("��ȯ�� ���� = " + convertNo);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("e = " + e); // e.toString() ȣ����
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ��� : " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("���� �߻����η� ������� ������ ����˴ϴ�.^^��");
		}
		
		System.out.println("-----���� ��---------------");

	}

}
