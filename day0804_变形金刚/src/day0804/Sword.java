package day0804;

public class Sword implements Weapon{

	@Override
	public void kill() {
		System.out.println("ˣ��");
	}

	@Override
	public String getNmae() {

		return "���콣";
	}

	@Override
	public int getType() {

		return Weapon.TYPE_COLD;
	}

}
