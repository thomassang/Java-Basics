package day1204;

import java.io.File;
import java.util.Scanner;

public class Text_my {
	public static void main(String[] args) {
		System.out.println("��������Ҫ���ҵ��ļ��У�");
		String s = new Scanner(System.in).nextLine();

		File dir = new File(s);

		if(! dir.isDirectory()){
			System.out.println("��������ȷ���ļ���");
			return;
		}
		//����Ŀ¼	
		wenjian(dir,0);

	}

	public static void wenjian(File dir, int level) {

		//System.out.println(dir.getName());//����ļ�������
		level++; //ÿ����һ�Σ�level��1
		File[] files = dir.listFiles(); //��ȡָ��Ŀ¼�µ�ǰ�������ļ��л����ļ�����
		for (File f : files) {
			if (f.isDirectory()) { //������ļ��У���������wenjian����
				wenjian(f, level);
			} else { //����ֱ������ļ���
				if(f.getName().endsWith(".jpg") || f.getName().endsWith(".jpeg") || f.getName().endsWith(".png")){
					System.out.println(f.getAbsolutePath());
				}
			}
		}
	}
}
