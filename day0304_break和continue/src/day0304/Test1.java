package day0304;

public class Test1 {
	public static void main(String[] args) {
		// [0,1)
		//double d = Math.random();
		//System.out.println(d);

		//>0.999
		for(int i=1; ;i++) {
			double d = Math.random();
			if(d>0.999) {
				System.out.println(
						"��"+i+"�Σ�"+d);
				break;
			}
		}

		System.out.println("ѭ������");

	}
}





