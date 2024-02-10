package ex0201.final_abstract;

//Error �� �����ϰ� ������ �ּ����� ó���ϼ���.

final class FinalClassExam{ // ��ӺҰ�, ��������
	final int i = -999999; // ������, �ʱ�ȭ �ʼ�, �� ���� �Ұ�
}


abstract class AbstractClassExam{ // ��Ӱ���, �����Ұ�
    abstract String abstractMethodExam(int i,String s);   //��ɾ��� ������ ���� �޼ҵ� 
    final int finalMethodExam(int i, int j){ 
        return i+j;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
//	int finalMethodExam(int i, int j){ // ��ӹ��� Ŭ������ �����ε� �Ҷ� �μ��� ������ �ȵȴ�.
//		return i*j;
//	} // final �޼ҵ�� ������ �Ұ�
	
}

//class Sample02 extends FinalClassExam{  } // // final Ŭ������ ��ӺҰ�


 
 abstract class Sample03 extends AbstractClassExam{
	 String abstractMethodExam(String s, int i){ 
		return s+i;
	 }
	abstract String abstractMethodExam(int i,String s);    // �μ� �ٸ��� �ٲ�

	void sampleMethod03(){
		System.out.println("void sampleMethod03() ȣ�� ��");
	}
}

class AbstractFinalClassTest{
    public static void main(String args[]){
		AbstractClassExam ace; //= new AbstractClassExam(); // abstract Ŭ������ �����Ұ�
		FinalClassExam fce = new FinalClassExam();
		// fce.i=100000; // final ���� ������ �Ұ�
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}
