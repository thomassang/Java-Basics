package day0703;

import java.util.Random;

public class GuessNumberGame extends GuessGame{

	@Override
	public String suiji() {
		int r = 1+new Random().nextInt(1000);
		
		//����ת���ַ�������
		return String.valueOf(r);
	}

	@Override
	public void tishi() {
		System.out.println("�Ѳ�����һ��[1,1000)��Χ���������");
		System.out.println("�²�������Ǽ��� ");
	}

	@Override
	public String bijiao(String c, String r) {
		//�ַ���ת����int ����
		int cc = Integer.parseInt(c);
		int rr = Integer.parseInt(r);
		
		if(cc>rr){
			return "��";
		}else if(cc<rr){
			return "С";
		}else{
			return "��ϲ�㣬�¶���";
		}
	}

	@Override
	public boolean caidui(String result) {

		return "��".equals(result);
	}
	
}
