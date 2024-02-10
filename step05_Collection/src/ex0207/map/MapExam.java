package ex0207.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class MapExam {
	private Map<Integer, String> map = new HashMap<Integer,String>();
	public MapExam() {
		map.put(20, "희정");
		map.put(10, "나영");
		map.put(20, "혀리"); // 중복
		map.put(30, "희정");
		map.put(40, "마마");
		
		System.out.println("저장된 key-value 수 : " + map.size());
		System.out.println(map);
		
		/////Map의 key와 value 분리/////////////////////
		Set<Integer> keys = map.keySet(); // keySet() 은 set() 과 비슷
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			int key = it.next();
			String value = map.get(key);
			System.out.println(key + "에 해당하는 value는 " + value);
		
		}
		
		
		// 개선된 for문으로
		for(Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + "에 해당하는 value는 " + value);
		}
		
		
		System.out.println("======== Map.Entry<K, V> 사용하기 ===============");
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet(); // Set안에 Entry<K,V> 형태로 저장해준다.
		Iterator<Entry<Integer, String>> ite = entrySet.iterator();
		while(ite.hasNext()) {
			Map.Entry<Integer, String> entry = ite.next();
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " : " + value);
		}
		
		////////////////////////////////////////////////////////////
		
		System.out.println("======== Map.Entry<K, V> 사용하기 - 개선된 for문===========");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " : " + value);
		}
		
		
	}
	
	public static void main(String[] args) {
		new MapExam();
	}

}
