package day0604;

public class Student {
	int id;//id
	String name;//����
	String gender;//�Ա�
	int age;//����
	
	public Student(){	
	}
	
	public Student(int id,String name){
		/*
		this.id = id;
		this.name = name;
		*/
		this(id, name, null);
	}
	
	public Student(int id,String name,String gender){
		/*
		this.id = id;
		this.name = name;
		this.gender = gender;
		*/
		//�ӹ��췽����������һ�����صĹ��췽����
		//Ŀ���Ǽ��ٴ����ظ�
		this(id, name, gender, 0);
	}
	
	public Student(int id,String name,String gender,int age){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String toString(){
		return "id:"+id+",name:"+name+",gender:"+gender+",age:"+age;
	}
	

}
