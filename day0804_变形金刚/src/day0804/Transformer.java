package day0804;

public class Transformer {
	/**
	 * 变形金刚使用武器接口
	 * 武器接口定义成变形金刚的一个成员变量
	 */
	private Weapon w;

	public void setWeapon(Weapon w){
		this.w = w;
	}

	public void attack(){
		if(w == null){
			System.out.println("用体重砸！！！！");

			return;
		}

		String s = null;
		switch(w.getType()){
		case Weapon.TYPE_COLD: s = "冷兵器"; break;
		case Weapon.TYPE_HOT: s = "热兵器"; break;
		case Weapon.TYPE_NUCLEAR: s = "核兵器"; break;
		}
		//使用核武器狼牙棒进攻
		System.out.println("使用"+s+w.getNmae()+"进攻");

		w.kill();
	}
}
