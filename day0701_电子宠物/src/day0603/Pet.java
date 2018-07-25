package day0603;
/**
 * 父类
 */
public abstract class Pet {
		String name;//名字
		int full;//饱食度
		int happy;//快乐度
		
		public Pet(String name,int full,int happy){
			this.name = name;
			this.full = full;
			this.happy = happy;
		}
		
		//喂食
		public void feed(){
			
			if(full == 100){
				System.out.println(name + "说：你想撑死我吗？");
				
				return;//方法结束
			}
			
			System.out.println("给" + name + "喂食");
			full += 10;
			System.out.println("饱食度" + full);
		}
		//玩耍
		public void play(){
			if(full == 0){
				System.out.println(name + "说：你想让我快乐的饿死吗？");
				return;
			}
			
			System.out.println("陪" + name + "玩耍");
			full -= 10;
			happy += 10;
			System.out.println("饱食度: " + full + "快乐度: " + happy);
		}
		//惩罚
		public void punish(){

			System.out.println("打" + name + "小屁屁" + name + "哭叫： 你个坏人：！" + cry());
			happy -= 10;
			System.out.println("快乐度："+ happy);
			
		}
		
		//作为通用方法，在父类中定义
		//实现交给子类完场
		public abstract String cry();
		/*{
			// 哭叫声
			//在子类中，要重写这个方法，来放回具体的哭叫声			
			
			//此代码无意义
			return "此处有哭叫声";
		}*/
		
}


