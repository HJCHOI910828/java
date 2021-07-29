package sub1;

public class Apple {
	
	private String country;
	private int price;
	
	public Apple() {
		this.price=2000;
		this.country = "대한민국";
	}
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("사과 고향: "+country);
		System.out.println("사과 몸값:"+price);
		return super.toString();
	}
}
