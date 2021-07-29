package sub1;

public class Banana {
	private String country;
	private int price;
	
	public Banana() {
		this.price=2000;
		this.country = "대한민국";
	}
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("바나나 고향: "+country);
		System.out.println("바나나 몸값:"+price);
		return super.toString();
	}
}
