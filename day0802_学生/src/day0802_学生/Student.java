package day0802_ѧ��;

public class Student {
	/**
	 * ��Ա����һ�㶼��Ƴ�˽��
	 * ����ʹ�ù����ķ����������Ʊ�����ֵ������
	 * 
	 * ������еĳ�Ա�����ǳ��࣬Ϊ��ͬ�����÷��㣬����ѡ��default��
	 * ���ϣ�����༯���������������ѡ��protected
	 */
	private int id;
	private String name;
	private String gender;
	private int age;
	
	public Student() {}

	public Student(int id, String name, String gender, int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
