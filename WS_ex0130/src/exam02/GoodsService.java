package exam02;
/**
  각 요청에 대한 로직(기능)을 담당할 클래스
  (등록 , 전체검색, 부분검색, 수정, 삭제 등등.....)
*/
public class GoodsService{

	//상품을 관리할 배열 선언
	private Goods goodsArr[] = new Goods[10];
	public static int count;//0 배열방에 저장 객체의 개수 
	
    // 초기치 데이터를 세팅하는 메소드
	String [][] data;
	
	public void init(String [][] data){
		for(int i = 0; i < data.length; i++) {
			goodsArr[i] = create(data[i]);
			count++;
		}
	}//메소드끝

	public GoodsService() {}
	
	public GoodsService(String[][] data) {
		for(String[] row : data) {
		}
	}

	/**
      Goods를 생성해서 값을 설정하고 생성된 Goods를 리턴하는 메소드 
    */
	private Goods create(String[] row){//{"A01" , "새우깡" , "2500" , "짜고 맛나다."}
		Goods g = new Goods(row[0], row[1], row[2], row[3]);
		return g;
	}

	/**
     등록(등록실패 - 중복인경우, 배열의 길이 벗어난경우)
	 @return : 
			 0이면 상품코드 중복 ,
			 1이면 등록성공, 
			 -1이면 배열의 길이 벗어남
	 */
   
	public int insert(Goods goods){
		if(count > goodsArr.length-1) return -1;
	   
		   //중복체크 
		for(int i = 0; i < count; i++) 
			if(goods.getCode().toLowerCase().equals(goodsArr[i].getCode().toLowerCase())) return 0;
	   
		goodsArr[count++] = goods;
		return 1;
	}


   /**
     전체검색
   */
   public Goods[] selectAll( ){
	   if(count == 0) return null;
	   return goodsArr;
	   
       //
   }

   /**
     상품코드에 해당하는 상품 검색
	 @return : 만약 code에 해당하는 값이 있으면 Goods를 리턴하고
	           없으면 null 리턴
   */
   public Goods selectByCode(String code){
	   for(int i = 0; i < count; i++) 
		   if(goodsArr[i].getCode().toLowerCase().equals(code.toLowerCase())) return goodsArr[i];
       return null;
   }


   /**
    상품코드에 해당하는 가격, 설명 수정하기 
	@return : true이면 수정완료, false이면 수정실패
   */
   public boolean update(Goods goods){ //수정하려는 코드, 변경값 - 가격, 설명
      
	   Goods searchGoods = this.selectByCode(goods.getCode());
	   
	   if(searchGoods != null) {
		   searchGoods.setPrice(goods.getPrice());
		   searchGoods.setExplain(goods.getExplain());
		   return true;
	   }
       return false;
       
       
   }
}