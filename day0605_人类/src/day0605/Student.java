package day0605;

public class Student extends Person{
	String school;
	
	//day07���
	public Student(){
		System.out.println("Student()");
	}
	
	public Student(String name, String gender, int age, String school){
		/*this.name = name;
		this.gender = gender;
		this.age = age;
		this.school = school;
		*/
		
		//super();//mĬ����������
		super(name,gender, age);
		System.out.println("Student(1,2,3,4)");
		
	}
	/**
	 * ��дtoString��������
	 * �Ӹ���̳еķ���
	 * �����������¶��壬��д��д��
	 */
	public String toString(){
		
		String s = super.toString();
		
		return s+ ", "+school;
	}

}
