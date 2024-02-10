package ex0130;

/**
 * �л��� ������ �����ϴ� ����(���, ����, �˻�...)
*/

public class StudentService {
	private Student stArr[] = new Student [5];
	private int count;
	
	// �ʱ�ġ ������ 3������ �����ϱ�
	
	public StudentService() {
		stArr[count++] = this.create("����",28,"����");
		stArr[count++] = this.create("����",21,"�ָ�����");
		stArr[count++] = this.create("�ÿ�",102,"�︪��");
	}
	
	
	// Student ��ü�� �����ؼ� �������ִ� �޼ҵ� �ۼ�
	private Student create(String name, int age, String addr) {
		Student st = new Student(name,age,addr);
		
		return st;
	}
	
	// �л��� ���� ����ϱ�
	// �迭�� ��踦 ����� "���̻� �߰� �� �� �����ϴ�." �޼��� ���
	// �߰��� �����ϸ� "��ϵǾ����ϴ�". �޼��� ���
	
	public void insert(Student st) {
		// �迭�濡 �μ��� ���޵� �л� ������ �߰��Ѵ�.

		boolean flag = false;
		
		if(count < stArr.length) {
			
			for(int i = 0; i < count; i++) {
				if(stArr[i].getName().equals(st.getName())) {
					System.out.println("�̹� ��ϵ� �л��Դϴ�.");
					flag = true;
				}
			}
			if(flag == false) stArr[count++] = st;
			
			
		} else System.out.println("���̻� �߰� �� �� �����ϴ�.");
		
		
		
		
	}
	
	// ��ü �л��� ���� ��ȸ�ϱ�
	
	public void selectAll() {
		System.out.println("-------------��ü �л� ���� ��ȸ(" + count + "��)------------------");
		for(int i = 0; i < count; i++) {
			System.out.println("�̸� : " + stArr[i].getName() + "\t");
			System.out.println("���� : " + stArr[i].getAge() + "\t");
			System.out.println("�ּ� : " + stArr[i].getAddr());
			System.out.println();			
		}
	}
	
	// �̸��� �ش��ϴ� �л��� ���� �˻��ϱ�
	
	public void selectByName(String name) {
		
		for(int i = 0; i < count; i++) {
			if(stArr[i].getName().equals(name)) {
				System.out.println("�̸� : " + stArr[i].getName() + "\t");
				System.out.println("���� : " + stArr[i].getAge() + "\t");
				System.out.println("�ּ� : " + stArr[i].getAddr());
				System.out.println();
				return;
			}  
		} System.out.println("�������� �ʴ� �л��Դϴ�!");
		
	
	}
	
	// �̸��� �ش��ϴ� �л��� ���̿� �ּ� �����ϱ�
	// �̸��� �ش��ϴ� �л��� �ִ��� ã�Ƽ� ������ "���� �� �� �����ϴ�." ���
	// ������ �����ϰ� �����Ǿ����ϴ� ���
	
	public void update(Student st) {
		st.getName();
		
		for(int i = 0; i < count; i++) {
			if(stArr[i].getName().equals(st.getName())) {
				stArr[i].setAddr(st.getAddr());
				stArr[i].setAge(st.getAge());
				
				System.out.println("�����Ǿ����ϴ�.");
				return;
			}
		}
		System.out.println("���� �� �� �����ϴ�.");
	}
	
}
