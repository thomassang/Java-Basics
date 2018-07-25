package day0802_Ñ§Éú;

public class Test1 {
	public static void main(String[] args) {
		Student s = new Student();
		//s.id = 9527;
		s.setId(9527);
		s.setName("ÌÆ²®»¢");
		s.setGender("ÄÐ");
		s.setAge(66);
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getGender());
		System.out.println(s.getAge());
	}
}
