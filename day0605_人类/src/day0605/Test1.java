package day0605;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("����","��",24);
		Student s = new Student();
		Employee e = new Employee();
		
		s.name = "����";
		s.gender = "��";
		s.age = 33;
		s.school = "����ش�ѧ";
		
		e.name = "����";
		e.gender = "��";
		e.age = 21;
		e.salary = 9000;
		
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
	}

}
