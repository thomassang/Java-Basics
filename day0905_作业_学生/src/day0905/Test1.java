package day0905;

public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student(9527,"华安","男孩子",24);
		Student s2 = new Student(9527,"华安","男孩子",24);
		Student s3 = new Student(1001,"秋香","女孩子",16);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.getId() == s2.getId());
		System.out.println(s2.getId() == s3.getId());
	}

}
