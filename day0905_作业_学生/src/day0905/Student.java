package day0905;

public class Student {
		private int id;
		private String name;
		private String gender;
		private int age;

		public Student() {
			super();
		}
		public Student(int id, String name, String gender, int age) {
			super();
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

		@Override
		public boolean equals(Object obj) {
			/**
			 * 先进行判断obj的几种情况
			 */
			if(obj == null) {
				return false;
			}
			if(obj == this){
				return true;
			}
			if(! (obj instanceof Student)){
				return false;
			}
			
			/*this.x 有同名变量必须写this.x*/
			Student p = (Student) obj;//先向下转型
			return id == p.id && name == p.name && gender == p.gender && age == p.age;

		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "学号是"+id+"的"+name+"是一个"+age+"岁的"+gender;
		}
}
