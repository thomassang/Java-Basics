package day0805;

public class Test2 {
	public static void main(String[] args) {
		Weapon w1 = f1();
		w1.kill();
		
		System.out.println(w1);
		
		Weapon w2 = f2("倚天剑");
		w2.kill();
	}

	private static Weapon f2(/*final*/ String name) {
		//没有名字的类，就叫匿名内部类
		//局部内部类中，使用外面的局部变量
		//局部变量必须是final的
		//java7中final必须手写，java8中，final可以省略
		Weapon w = new Weapon(){
			@Override
			public void kill() {
				System.out.println("使用"+name+"进攻，----");
			} 
			
		};
		
		return w;
	}

	private static Weapon f1() {
		class AK47 implements Weapon{

			@Override
			public void kill() {
				System.out.println("使用AK47进攻：突突突突突突~");				
			}

		}
		
		AK47 a =  new AK47();
		
		return a;
	}
}
