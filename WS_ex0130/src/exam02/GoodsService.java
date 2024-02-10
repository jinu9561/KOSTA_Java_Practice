package exam02;
/**
  �� ��û�� ���� ����(���)�� ����� Ŭ����
  (��� , ��ü�˻�, �κа˻�, ����, ���� ���.....)
*/
public class GoodsService{

	//��ǰ�� ������ �迭 ����
	private Goods goodsArr[] = new Goods[10];
	public static int count;//0 �迭�濡 ���� ��ü�� ���� 
	
    // �ʱ�ġ �����͸� �����ϴ� �޼ҵ�
	String [][] data;
	
	public void init(String [][] data){
		for(int i = 0; i < data.length; i++) {
			goodsArr[i] = create(data[i]);
			count++;
		}
	}//�޼ҵ峡

	public GoodsService() {}
	
	public GoodsService(String[][] data) {
		for(String[] row : data) {
		}
	}

	/**
      Goods�� �����ؼ� ���� �����ϰ� ������ Goods�� �����ϴ� �޼ҵ� 
    */
	private Goods create(String[] row){//{"A01" , "�����" , "2500" , "¥�� ������."}
		Goods g = new Goods(row[0], row[1], row[2], row[3]);
		return g;
	}

	/**
     ���(��Ͻ��� - �ߺ��ΰ��, �迭�� ���� ������)
	 @return : 
			 0�̸� ��ǰ�ڵ� �ߺ� ,
			 1�̸� ��ϼ���, 
			 -1�̸� �迭�� ���� ���
	 */
   
	public int insert(Goods goods){
		if(count > goodsArr.length-1) return -1;
	   
		   //�ߺ�üũ 
		for(int i = 0; i < count; i++) 
			if(goods.getCode().toLowerCase().equals(goodsArr[i].getCode().toLowerCase())) return 0;
	   
		goodsArr[count++] = goods;
		return 1;
	}


   /**
     ��ü�˻�
   */
   public Goods[] selectAll( ){
	   if(count == 0) return null;
	   return goodsArr;
	   
       //
   }

   /**
     ��ǰ�ڵ忡 �ش��ϴ� ��ǰ �˻�
	 @return : ���� code�� �ش��ϴ� ���� ������ Goods�� �����ϰ�
	           ������ null ����
   */
   public Goods selectByCode(String code){
	   for(int i = 0; i < count; i++) 
		   if(goodsArr[i].getCode().toLowerCase().equals(code.toLowerCase())) return goodsArr[i];
       return null;
   }


   /**
    ��ǰ�ڵ忡 �ش��ϴ� ����, ���� �����ϱ� 
	@return : true�̸� �����Ϸ�, false�̸� ��������
   */
   public boolean update(Goods goods){ //�����Ϸ��� �ڵ�, ���氪 - ����, ����
      
	   Goods searchGoods = this.selectByCode(goods.getCode());
	   
	   if(searchGoods != null) {
		   searchGoods.setPrice(goods.getPrice());
		   searchGoods.setExplain(goods.getExplain());
		   return true;
	   }
       return false;
       
       
   }
}