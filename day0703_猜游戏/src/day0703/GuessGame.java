package day0703;

import java.util.Scanner;

/**
 * ����
 */
public abstract class GuessGame {
	/*
	 * �����ֺͲ��ַ�������Ϸ��ͨ����Ϸ����
	 */
	public void Start(){
		//�������ֵ
		String r = suiji();
		
		//��ʾ��ʾ
		tishi();
		
		while(true){
			
			String c = new Scanner(System.in).nextLine();
			//�Ƚ�c��r�����õ��ȽϽ��
			String result = bijiao(c,r);
			
			System.out.println(result);
			
			System.out.print("������£� ");
			//�ж��Ƿ��ǲ¶ԵĽ��
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
