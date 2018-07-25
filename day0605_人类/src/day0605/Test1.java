package day0605;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("张三","男",24);
		Student s = new Student();
		Employee e = new Employee();
		
		s.name = "三天";
		s.gender = "男";
		s.age = 33;
		s.school = "加里敦大学";
		
		e.name = "王五";
		e.gender = "男";
		e.age = 21;
		e.salary = 9000;
		
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
	}

}
