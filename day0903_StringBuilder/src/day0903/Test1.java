package day0903;

public class Test1 {
	public static void main(String[] args) {
		String s0 = "abcdefghijklmnopqrstuvwxyz"; 
		StringBuilder sb = new StringBuilder();
		
		//获得系统时间毫秒值
		long t = System.currentTimeMillis();
		/**
		 * 从1970年1月1日0点开始的毫秒值
		 */
		for(int i = 0; i<1000000;i++){
			sb.append(s0);
		}
		t = System.currentTimeMillis()-t;
		
		System.out.println(t);
	}

}
