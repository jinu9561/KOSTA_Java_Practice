package exam02;
/**
  요청 결과를 출력할 view
*/
public class EndView{
	
	
	private String msg = "상품이 등록되었습니다.";
	
   /**
     성공여부 메시지를 출력하는 메소드 
   */
   public static void printMessage(String message){
      System.out.println(message+"\n");
   }

   /**
     전체검색 결과를 출력하는 메소드
   */
   public static void printSelectAll(Goods[] arr){ //service에 있는 주소가 전달되었다.
	   GoodsService service = new GoodsService();
	   
	   if(arr.length == 0) {
		   System.out.println("상품 목록이 비어있습니다.");
		   return;
	   }

	   for(int i = 0; i < arr.length; i++) {
		   if(arr[i] != null)  System.out.println(arr[i].getCode() + " | " + arr[i].getName() 
				   + " | " + arr[i].getPrice() + " | " + arr[i].getExplain());
		   
	   }
   }

   /**
     상품코드에 해당하는 상세정보 출력하는 메소드 
   */
   public static void printSelectByCode(Goods goods){
	   
	   if(goods != null) System.out.println(goods.getName()  + " | " + goods.getPrice() 
	   		+ " | " + goods.getExplain());
	   else System.out.println(goods.getCode() + "는 잘못되어 검색할수  없습니다.");
	   
  
   }


}