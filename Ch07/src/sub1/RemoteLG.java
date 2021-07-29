package sub1;

public class RemoteLG implements RemoteControl{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LG - powerOn");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LG - powerOff");
	}

	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		System.out.println("LG - chUp");
	}

	@Override
	public void chDown() {
		System.out.println("LG - chDown");
	}

}
