package day0703;

import java.util.Scanner;

/**
 * 父类
 */
public abstract class GuessGame {
	/*
	 * 猜数字和猜字符两种游戏的通用游戏流程
	 */
	public void Start(){
		//产生随机值
		String r = suiji();
		
		//显示提示
		tishi();
		
		while(true){
			
			String c = new Scanner(System.in).nextLine();
			//比较c和r，并得到比较结果
			String result = bijiao(c,r);
			
			System.out.println(result);
			
			System.out.print("请继续猜： ");
			//判断是否是猜对的结果
			if(caidui(result)){
				break;
			}
		}
	}

	public abstract String suiji();

	public abstract void tishi() ;

	public abstract String bijiao(String c, String r) ;

	public abstract boolean caidui(String result);
}
