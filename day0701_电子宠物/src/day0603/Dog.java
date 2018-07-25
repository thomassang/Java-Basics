package day0603;

public class Dog extends Pet{
	public Dog(String name, int full, int happy){
		
		//父类没有无参构造，必须手动调用无参构造
		super(name,full,happy);
	}
	
	public String cry(){
		return "汪！！！";
	}

}
