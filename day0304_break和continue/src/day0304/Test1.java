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
						"第"+i+"次："+d);
				break;
			}
		}

		System.out.println("循环结束");

	}
}





