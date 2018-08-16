package day1104;

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
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
		}
/*		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((gender == null) ? 0 : gender.hashCode());
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (age != other.age)
				return false;
			if (gender == null) {
				if (other.gender != null)
					return false;
			} else if (!gender.equals(other.gender))
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}*/

		public int hashCode() {
			/**//**
			 * 1)��ͬ���ԣ�����������ͬ��ϣֵ
			 * 2����ͬ���ԣ������������ͬ��ϣֵ
			 * 
			 * ��ѧ�ҷ�����һ���㷨
			 * ��һ����Ч�Ĺ����㷨
			 * 
			 *//*
*/			
			int p = 31;
			int r = 1;
			r = r*p + id;
			r = r*p + name.hashCode();
			r = r*p + gender.hashCode();
			r = r*p + age;
			
			return r ;
			
		}
		@Override
		public boolean equals(Object obj) {
			if(obj == null){ return false;}
			if(obj == this){return true;}
			if(! (obj instanceof Student)){return false;}
			
			Student s = (Student) obj;
			return id == s.id && name.equals(s.name) && gender.equals(s.gender) && age == s.age;

		}
		
}
