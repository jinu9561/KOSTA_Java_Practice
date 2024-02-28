package ex0201.final_abstract;

//Error 를 수정하고 이유를 주석으로 처리하세요.

final class FinalClassExam{ // 상속불가, 생성가능
	final int i = -999999; // 고정값, 초기화 필수, 값 변경 불가
}


abstract class AbstractClassExam{ // 상속가능, 생성불가
    abstract String abstractMethodExam(int i,String s);   //기능없고 재정의 위한 메소드 
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
	
//	int finalMethodExam(int i, int j){ // 상속받은 클래스를 오버로딩 할땐 인수가 같으면 안된다.
//		return i*j;
//	} // final 메소드는 재정의 불가
	
}

//class Sample02 extends FinalClassExam{  } // // final 클래스는 상속불가


 
 abstract class Sample03 extends AbstractClassExam{
	 String abstractMethodExam(String s, int i){ 
		return s+i;
	 }
	abstract String abstractMethodExam(int i,String s);    // 인수 다르게 바꿈

	void sampleMethod03(){
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

class AbstractFinalClassTest{
    public static void main(String args[]){
		AbstractClassExam ace; //= new AbstractClassExam(); // abstract 클래스는 생성불가
		FinalClassExam fce = new FinalClassExam();
		// fce.i=100000; // final 변수 값변경 불가
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}
