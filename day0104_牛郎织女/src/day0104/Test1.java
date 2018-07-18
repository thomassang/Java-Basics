package day0104;

public class Test1 {
	public static void main(String[] args) {

		System.out.println("牛郎织女星相距16.4光年，");
		System.out.println("光速299792458米/秒，");
		System.out.println("喜鹊身长0.46米，");
		System.out.println("牛郎织女相会，需要多少只喜鹊？");
		
		//先计算一光年多少米
		long ly = 299792458L * 60 * 60 * 24 * 365;
		
		//16.4光年多少米
		double d = 16.4 * ly;
		
		//喜鹊数量
		double r = d/0.46;
		
		//向上取整
		//math.ceil(r)取整结果是double类型，有点零
		//强制类型转换
		long n = (long) Math.ceil(r);
		
		System.out.println("需要"+n+"只喜鹊。");
				
	}

}
