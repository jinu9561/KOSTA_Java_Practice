package exam02;
public class  StartView{
	public static void main(String[] args) {
       String [][] data = new String [][]{
                     {"A01" , "�����" , "2500" , "¥�� ������."},  //---> Goods 
                     {"A02" , "������" , "3500" , "�����̰� �޴�."},  //---> Goods 
                     {"A03" , "���ڱ�" , "5000" , "���ڸ��� ����Ѹ�."},  // ---> Goods 
					 {"A04" , "��Ϲ���Ĩ" , "2200" , "���� �ϴ�."},
                     {"A05" , "��Ĩ" , "3000" , "����ϴ�."}
                     
                };

		System.out.println("***** ���α׷� �����մϴ�. ********************");

       MenuView mv  = new MenuView();//�������� �ʱ�ȭ
	   mv.printMenu( data );
	}
}
