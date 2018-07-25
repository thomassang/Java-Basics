package day0805;

public class Test2 {
	public static void main(String[] args) {
		Weapon w1 = f1();
		w1.kill();
		
		System.out.println(w1);
		
		Weapon w2 = f2("���콣");
		w2.kill();
	}

	private static Weapon f2(/*final*/ String name) {
		//û�����ֵ��࣬�ͽ������ڲ���
		//�ֲ��ڲ����У�ʹ������ľֲ�����
		//�ֲ�����������final��
		//java7��final������д��java8�У�final����ʡ��
		Weapon w = new Weapon(){
			@Override
			public void kill() {
				System.out.println("ʹ��"+name+"������----");
			} 
			
		};
		
		return w;
	}

	private static Weapon f1() {
		class AK47 implements Weapon{

			@Override
			public void kill() {
				System.out.println("ʹ��AK47������ͻͻͻͻͻͻ~");				
			}

		}
		
		AK47 a =  new AK47();
		
		return a;
	}
}
