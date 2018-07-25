package day0804;

public class AK47 implements Weapon{

	@Override
	public void kill() {
		System.out.println("¿ªÇ¹");
	}

	@Override
	public String getNmae() {
		return "Ak47";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_HOT;
	}

}
