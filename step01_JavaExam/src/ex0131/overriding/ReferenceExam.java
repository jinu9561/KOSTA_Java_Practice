package ex0131.overriding;

class ObjectExam{
	private String str;
	
	public ObjectExam(){}
	public ObjectExam(String str){
//		this.str = str;
		this.str = str + super.toString(); // 문자열값 + 주소값
	}
	
	@Override
	public String toString() {
		return str;
	}
}
//////////////////////////////////////////////////////////////////////
class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			String s01="장희정"; 
			String s02="Java";
			String s03=new String("월요일");
			
			ObjectExam oe1=new ObjectExam("맛있는거 먹고싶다");
			ObjectExam oe2=new ObjectExam("안녕");
			
			// println(Object obj) or print(...) : 인수로 Object 전달되면 obj.toString() 자동 호출
			// 							Object에 정의되어 았는 toString() 메소드는 객체의 주소를 클래스이름 
			//							@hashcode의 형태의 문자열로 만들어서 리턴해준다.				
			
			
			System.out.println(c);//
			System.out.println(s01.toString());// 문자열
			System.out.println(s02);// 문자열
			System.out.println(s03);// 문자열
			
			System.out.println(oe1);// 주소값 -> 뭐먹을거니 출력
			System.out.println(oe2);// 주소값 -> 뭐먹을거니 출력
			
			
	}
}
