package day0605;

public class Student extends Person{
	String school;
	
	//day07添加
	public Student(){
		System.out.println("Student()");
	}
	
	public Student(String name, String gender, int age, String school){
		/*this.name = name;
		this.gender = gender;
		this.age = age;
		this.school = school;
		*/
		
		//super();//m默认隐含调用
		super(name,gender, age);
		System.out.println("Student(1,2,3,4)");
		
	}
	/**
	 * 重写toString（）方法
	 * 从父类继承的方法
	 * 在子类中重新定义，重写编写。
	 */
	public String toString(){
		
		String s = super.toString();
		
		return s+ ", "+school;
	}

}
