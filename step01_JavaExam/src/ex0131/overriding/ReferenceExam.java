package ex0131.overriding;

class ObjectExam{
	private String str;
	
	public ObjectExam(){}
	public ObjectExam(String str){
//		this.str = str;
		this.str = str + super.toString(); // ���ڿ��� + �ּҰ�
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
			String s01="������"; 
			String s02="Java";
			String s03=new String("������");
			
			ObjectExam oe1=new ObjectExam("���ִ°� �԰�ʹ�");
			ObjectExam oe2=new ObjectExam("�ȳ�");
			
			// println(Object obj) or print(...) : �μ��� Object ���޵Ǹ� obj.toString() �ڵ� ȣ��
			// 							Object�� ���ǵǾ� �Ҵ� toString() �޼ҵ�� ��ü�� �ּҸ� Ŭ�����̸� 
			//							@hashcode�� ������ ���ڿ��� ���� �������ش�.				
			
			
			System.out.println(c);//
			System.out.println(s01.toString());// ���ڿ�
			System.out.println(s02);// ���ڿ�
			System.out.println(s03);// ���ڿ�
			
			System.out.println(oe1);// �ּҰ� -> �������Ŵ� ���
			System.out.println(oe2);// �ּҰ� -> �������Ŵ� ���
			
			
	}
}
