package exam02;
import java.util.Scanner;
/**
 Ű���� �Է��� �޾� �� ����� ȣ������ View
*/
public class MenuView{

 private Scanner sc = new Scanner(System.in);
 private GoodsService service = new GoodsService(); //�������� �ʱ�ȭ

  /**
    ��ü �޴��� ����ϴ� �޼ҵ� 
  */
  public void printMenu(String [][] data){

      //���� ���� �ʱ�ġ �����͸� ���񽺿� �����ؼ� �迭�� �����Ѵ�.
      service.init(data);


	  while(true){
         System.out.println("---------------------------------------------------------------------------");
		 System.out.println("1.���     2.��ü�˻�      3.��ǰ�ڵ�˻�    4. �����ϱ�     9.����");
		 System.out.println("----------------------------------------------------------------------------");

         System.out.print("�޴� ���� > ");
		 int menuChoice = Integer.parseInt( sc.nextLine());

		 switch(menuChoice){
             case 1 : 
				 this.inputInsert() ; break;
			 case 2 : 
				 Goods [] goodsArr = service.selectAll(); 
			     EndView.printSelectAll(goodsArr);
			      break;
			 case 3 : 
				 this.inputSelectByCode(); break;
			 case 4 : 
				 this.inputUpdate() ; break;
			 case 9 : 
				 System.out.println("������ �� �̿����ּ���. ���α׷� �����մϴ�.");
				 System.exit(0); 
			 break;
			 default: System.out.println("�޴��� 1~4 or 9 �� �Է����ּ���.");

		 }//switch��

	  }//while��

  } //printMenu��

  /**
     ��ϰ��� Ű���� �Է�
  */
  public void inputInsert(){
       //Ű�����Է� 4�� �ޱ� 
	   System.out.print("��ǰ�ڵ� > ");
	   String code = sc.nextLine();

	   System.out.print("��ǰ�̸� > ");
	   String name = sc.nextLine();

	   System.out.print("��ǰ���� > ");
	   int price = Integer.parseInt(sc.nextLine());

	   System.out.print("��ǰ���� > ");
	   String explain = sc.nextLine();


	 //�����ڸ� �߰��Ͽ� ���� ��������(������ �ʱ�ȭ)
       Goods goods = new Goods(code, name, price, explain);

	   int result = service.insert(goods);
	   
	   if(result==-1)
		  EndView.printMessage("���̻� ����� �� �����ϴ�.");
	   else if(result==0)
		  EndView.printMessage(code+"�� �ߺ��̹Ƿ� ����Ҽ� �����ϴ�.");
	   else 
           EndView.printMessage("��ǰ�� ��ϵǾ����ϴ�.");
  }

  /**
    ��ǰ�ڵ� �˻� Ű���� �Է�
  */
  public void inputSelectByCode(){
       System.out.print("�˻��Ϸ��� ��ǰ�ڵ� > ");
	   String code = sc.nextLine();

	  Goods goods = service.selectByCode( code );
	  if(goods==null){
          EndView.printMessage(code+"�� �߸��Ǿ� �˻��Ҽ� �����ϴ�.");
	  }else{
          EndView.printSelectByCode(goods);
	  }
  }

  /**
    �����ϱ� Ű���� �Է� 
  */
  public void inputUpdate(){
       //Ű�����Է� 4�� �ޱ� 
	   System.out.print("�����Ϸ��� ��ǰ�ڵ� > ");
	   String code = sc.nextLine();

	   System.out.print("���� ��ǰ���� > ");
	   int price = Integer.parseInt(sc.nextLine());

	   System.out.print("���� ��ǰ���� > ");
	   String explain = sc.nextLine();

	   //�� 3���� ������ �ϳ��� Goods��ü�� �����.
	   Goods goods = new Goods(code, price, explain); //�����ڸ� �߰��Ͽ� ���� ��������(������ �ʱ�ȭ)
	  
	   
	   if(service.update(goods) ){
          EndView.printMessage("��ǰ�� �����Ǿ����ϴ�.");
	   }else{
          EndView.printMessage("��ǰ�� ���������ʾҽ��ϴ�.");
	   }


  }//�޼ҵ峡



}//Ŭ������