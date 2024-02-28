package ex0126.overloading;

//MethodOverloadingExam.java
class OverloadedMethod{
	private int i; // �����ʵ� 0 ����(�ܺο��� ���� �ȵ�)
       
	public void  setOverload(int i){
		this.i = i; // ���޵� �μ��� ���� �����ʵ忡 �־��(����)
	}
	
	public int getOverload(){
		return i;
	}
	
//=================================================================================
	
	//setOverload�� Overloading�ϼ���. ���ϵ� �ϼ���.
	
	int setOverload() {
		return this.i;
	}
	
	//setOverload�� �� Overloading �ϼ���. �� �ٸ� ������ ���� �ϼ���.
	
	String setOverload(String str) {
		return "��Ʈ��";
	}
	
	//setOverload�� �� ��Overloading �ϼ���. ���� ���ؿ�
	protected void setOverload(double ... d) {
		this.i = 100;
	}

//=================================================================================

	//getOverload�� Overloading�ϼ���. ���ϵ� �ϼ���.
	
	public int getOverload(int i) {
		return this.i * 100;
	}
	
	//getOverload�� �� Overloading �ϼ���. �� �ٸ� ������ ���� �ϼ���.
	
	public String getOverload(String str) {
		return "��";
	}
	
	//getOverload�� �� ��Overloading �ϼ���. ���� ���ؿ�
	void getOverload(boolean b) {
		this.i += 1;
	}
	
	
}

class  MethodOverloadingExam{
       
  public static void main(String [] agr){
     //OverloadedMethod��ü���� ȣ�Ⱑ����  �޼ҵ���� �ѹ��� ȣ���ϼ���.
	  
	  OverloadedMethod om = new OverloadedMethod();
	  
	  om.setOverload(1);
	  om.setOverload(3.5, 3.4, 5.7);
	  om.setOverload("dklas");
	  om.setOverload();
	  
	  om.getOverload();
	  om.getOverload(true);
	  om.getOverload(5341);
	  om.getOverload("dsadklj");
        
	}   


}

