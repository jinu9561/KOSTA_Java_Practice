package ex0126.overloading;

//MethodOverloadingExam.java
class OverloadedMethod{
	private int i; // 전역필드 0 은닉(외부에서 접근 안됨)
       
	public void  setOverload(int i){
		this.i = i; // 전달된 인수의 값을 전역필드에 넣어라(대입)
	}
	
	public int getOverload(){
		return i;
	}
	
//=================================================================================
	
	//setOverload를 Overloading하세요. 리턴도 하세요.
	
	int setOverload() {
		return this.i;
	}
	
	//setOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	
	String setOverload(String str) {
		return "스트링";
	}
	
	//setOverload를 또 또Overloading 하세요. 리턴 안해요
	protected void setOverload(double ... d) {
		this.i = 100;
	}

//=================================================================================

	//getOverload를 Overloading하세요. 리턴도 하세요.
	
	public int getOverload(int i) {
		return this.i * 100;
	}
	
	//getOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	
	public String getOverload(String str) {
		return "넹";
	}
	
	//getOverload를 또 또Overloading 하세요. 리턴 안해요
	void getOverload(boolean b) {
		this.i += 1;
	}
	
	
}

class  MethodOverloadingExam{
       
  public static void main(String [] agr){
     //OverloadedMethod객체에서 호출가능한  메소드들을 한번씩 호출하세요.
	  
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

