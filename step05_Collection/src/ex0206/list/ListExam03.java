package ex0206.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExam03 {
	List<Emp> list = new ArrayList<Emp>();
	
	public ListExam03() {
		// list �� ��� 5�� �߰�
		list.add(new Emp(14485, "����", 28, "����"));
		list.add(new Emp(63234, "����", 21, "�뱸"));
		list.add(new Emp(53126, "����", 78, "�����ϰ�"));
		list.add(new Emp(53687, "��ȣ", 128, "Ķ�����Ͼ�"));
		list.add(new Emp(36685, "����", 2, "�����ϰ�"));
		
//		System.out.println(list);
		
		for(Emp e : list) {
			System.out.println(e);
		}
	}
	
	// �̸��� �ش��ϴ� ��� ���� �˻� (��������: �̸� �ߺ� �ȵ�)
	public Emp selectByName(String name) {
		for(Emp e : list) {
			if(e.getEname().equals(name)) {
				return e;
			}
		}
		return null;
	}
	
	// �ּҿ� �ش��ϴ� ��� ���� �˻� (��������: �ּ� �ߺ� ����)
		public List<Emp> selectByAddr(String addr) {
			List<Emp> searchList = new ArrayList<Emp>();
			
			for(Emp e : list) {
				if(e.getAddr().equals(addr)) {
					searchList.add(e);
				}
			}
			return searchList;
		}
	
	// �����ȣ�� �������� ������ ��� ����
	public List<Emp> sortByEmpno(){
		List<Emp> shallowCopyList = new ArrayList<Emp>(list); // list�� ī�Ǻ��� ����
//		System.out.println("������ : ");
		
		Collections.sort(shallowCopyList);
		
		return shallowCopyList;
	}
	
	public static void main(String[] args) {
		ListExam03 list = new ListExam03();
		
		System.out.println("---1.�̸����� �˻�---");
		System.out.println(list.selectByName("����"));
		System.out.println(list.selectByName("��ö"));
		
		System.out.println("---2.�ּҷ� �˻�----");
		List<Emp> searchList = list.selectByAddr("�����ϰ�");
		
		if(searchList.isEmpty()) {
			System.out.println("�׷��ּҾ���");
		} else {
			for(Emp e : searchList) {
				System.out.println(e + " ");
			}
		}
		
		System.out.println("\n3. ���Ŀ���----");
		List<Emp> sortResult = list.sortByEmpno();
		for(Emp emp : sortResult) {
			System.out.println(emp);
		}
		
	}
	

}
