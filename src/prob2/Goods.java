package prob2;

public class Goods {

	private String name;
	private String price;
	private String number;
	
	Goods(String name,String price,String number){
		this.name = name;
		this.price = price;
		this.number = number;
	}
	
	public void show(){
		System.out.println(name+"(가격:"+price+"원)이 "+number+"개 입고 되었습니다.");
	}
	
}
