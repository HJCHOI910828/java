package sub1;

public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Smasung - powerOn");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Smasung - powerOff");
	}

	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		System.out.println("Smasung - chUp");
	}

	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		System.out.println("Smasung - chOff");
	}

}
