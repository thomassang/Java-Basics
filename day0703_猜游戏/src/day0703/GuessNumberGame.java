package day0703;

import java.util.Random;

public class GuessNumberGame extends GuessGame{

	@Override
	public String suiji() {
		int r = 1+new Random().nextInt(1000);
		
		//数字转成字符串返回
		return String.valueOf(r);
	}

	@Override
	public void tishi() {
		System.out.println("已产生了一个[1,1000)范围的随机整数");
		System.out.println("猜猜这个数是几： ");
	}

	@Override
	public String bijiao(String c, String r) {
		//字符串转换成int 整数
		int cc = Integer.parseInt(c);
		int rr = Integer.parseInt(r);
		
		if(cc>rr){
			return "大";
		}else if(cc<rr){
			return "小";
		}else{
			return "恭喜你，猜对啦";
		}
	}

	@Override
	public boolean caidui(String result) {

		return "对".equals(result);
	}
	
}
