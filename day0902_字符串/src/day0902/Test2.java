package day0902;

public class Test2 {
	public static void main(String[] args) {
		String s0 = "abcdefghijklmnopqrstuvwxyz"; 
		String s = " ";
		
		/**
		 * 获得系统时间毫秒值
		 * 从1970年1月1日0点开始的毫秒值
		 */
		long t = System.currentTimeMillis();
		for(int i = 0; i<100000;i++){
			s += s0;
		}
		t = System.currentTimeMillis()-t;
		
		System.out.println(t);
	}

}
