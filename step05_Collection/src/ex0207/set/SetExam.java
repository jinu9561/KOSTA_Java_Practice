package ex0207.set;

import java.util.HashSet;
import java.util.Set;

public class SetExam {
	Set<String> set = new HashSet<String>();
	
	public SetExam(String[] args) {
		// set 데이터 추가
		for(String s : args) {
			boolean re = set.add(s);
			System.out.println(s + " 추가결과 = " + re);
		}
		System.out.println("Set size() = " + set.size());
		System.out.println("set = " + set); // set.toString 호출 
	}
	
	public static void main(String[] args) {
		new SetExam(args);
	}

}
