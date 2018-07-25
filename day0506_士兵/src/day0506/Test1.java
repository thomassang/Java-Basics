package day0506;

public class Test1 {
	public static void main(String[] args) {
		//新建soldier对象，
		//吧对象的内存地址，保存到变量s1
		Soldier s1 = new Soldier();
		Soldier s2 = new Soldier();
		
		//引用变量s1找到对象的内存空间
		//并访问它的id变量。
		s1.id = 9527;
		s2.id = 9528;
		
		//用s1控制第一个士兵执行前进方法。
		s1.go();
		s2.go();
		
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		s1.attact();
		
	}

}
