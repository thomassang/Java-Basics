package day0603;

public class Dog extends Pet{
	public Dog(String name, int full, int happy){
		
		//����û���޲ι��죬�����ֶ������޲ι���
		super(name,full,happy);
	}
	
	public String cry(){
		return "��������";
	}

}
