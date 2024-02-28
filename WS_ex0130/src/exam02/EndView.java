package exam02;
/**
  ��û ����� ����� view
*/
public class EndView{
	
	
	private String msg = "��ǰ�� ��ϵǾ����ϴ�.";
	
   /**
     �������� �޽����� ����ϴ� �޼ҵ� 
   */
   public static void printMessage(String message){
      System.out.println(message+"\n");
   }

   /**
     ��ü�˻� ����� ����ϴ� �޼ҵ�
   */
   public static void printSelectAll(Goods[] arr){ //service�� �ִ� �ּҰ� ���޵Ǿ���.
	   GoodsService service = new GoodsService();
	   
	   if(arr.length == 0) {
		   System.out.println("��ǰ ����� ����ֽ��ϴ�.");
		   return;
	   }

	   for(int i = 0; i < arr.length; i++) {
		   if(arr[i] != null)  System.out.println(arr[i].getCode() + " | " + arr[i].getName() 
				   + " | " + arr[i].getPrice() + " | " + arr[i].getExplain());
		   
	   }
   }

   /**
     ��ǰ�ڵ忡 �ش��ϴ� ������ ����ϴ� �޼ҵ� 
   */
   public static void printSelectByCode(Goods goods){
	   
	   if(goods != null) System.out.println(goods.getName()  + " | " + goods.getPrice() 
	   		+ " | " + goods.getExplain());
	   else System.out.println(goods.getCode() + "�� �߸��Ǿ� �˻��Ҽ�  �����ϴ�.");
	   
  
   }


}