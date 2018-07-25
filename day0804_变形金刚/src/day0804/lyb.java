package day0804;

public class lyb implements Weapon{

	@Override
	public void kill() {
		System.out.println("ÔúËÀÄã");
	}

	@Override
	public String getNmae() {
		// TODO Auto-generated method stub
		return "ÀÇÑÀ°ô";
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return Weapon.TYPE_NUCLEAR;
	}

}
