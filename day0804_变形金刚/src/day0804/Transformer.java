package day0804;

public class Transformer {
	/**
	 * ���ν��ʹ�������ӿ�
	 * �����ӿڶ���ɱ��ν�յ�һ����Ա����
	 */
	private Weapon w;

	public void setWeapon(Weapon w){
		this.w = w;
	}

	public void attack(){
		if(w == null){
			System.out.println("�������ң�������");

			return;
		}

		String s = null;
		switch(w.getType()){
		case Weapon.TYPE_COLD: s = "�����"; break;
		case Weapon.TYPE_HOT: s = "�ȱ���"; break;
		case Weapon.TYPE_NUCLEAR: s = "�˱���"; break;
		}
		//ʹ�ú���������������
		System.out.println("ʹ��"+s+w.getNmae()+"����");

		w.kill();
	}
}
