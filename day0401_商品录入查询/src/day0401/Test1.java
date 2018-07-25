package day0401;

import java.util.Scanner;

public class Test1 {
	static String[] names = {"iPhone X","С��8","��ΪP20","vivo NEX","oppo FIND X"}; //��Ʒ��
	static double[] price = {7200, 2800, 4699, 3099, 2300}; //�۸�
	static int[] numbers = {200, 500, 600, 200, 100}; //����
	
	public static void main(String[] args) {
		outer:
		while(true) {
			//��ʾ�˵�
			showMenu();
			//���ѡ���ֵ
			int c = new Scanner(System.in).nextInt();
			switch(c) {
			case 1: f1(); break;
			case 2: f2(); break;
			case 3: f3(); break;
			case 4: f4(); break;
			case 5: break outer;
			}
		}
	}

	private static void showMenu() {
		System.out.println("---------------------------");
		System.out.println("1. ��Ʒ�б�");
		System.out.println("2. ��Ʒ¼��");
		System.out.println("3. ��Ʒ��ѯ");
		System.out.println("4. ͳ����Ϣ");
		System.out.println("5. �˳�");
		System.out.println("---------------------------");
		System.out.print("ѡ��");
	}

	private static void f1() {
		//��������
		for(int i=0;i<names.length;i++) {
			System.out.println(
			 (i+1)+". ���ƣ�"+names[i]+
			 " �۸�"+price[i]+
			 " ������"+numbers[i]+
			 " �ܼۣ�"+(price[i]*numbers[i]));
		}
	}

	private static void f2() {
		//��������
		for(int i=0;i<names.length;i++) {
			System.out.println("--��"+(i+1)+"����Ʒ----------");
			System.out.print("���ƣ�");
			String n = new Scanner(System.in).nextLine();
			System.out.print("�۸�");
			double p = new Scanner(System.in).nextDouble();
			System.out.print("������");
			int r = new Scanner(System.in).nextInt();
			//¼�����Ʒ���ݣ���������
			names[i] = n;
			price[i] = p;
			numbers[i] = r;
		}
		//����f1()������������ʾ��Ʒ�б�
		f1();
	}

	private static void f3() {
		//�����ѯ��Ʒ����
		System.out.print("��Ʒ���ƣ�");
		String s = new Scanner(System.in).nextLine();
		//����
		for(int i=0;i<names.length;i++) {
			//����ͬ����
			//�ַ�����ȱȽϣ���equals()����
			if(s.equals(names[i])) {
				System.out.println(
				 (i+1)+". ���ƣ�"+names[i]+
				 " �۸�"+price[i]+
				 " ������"+numbers[i]+
				 " �ܼۣ�"+(price[i]*numbers[i]));
				return; //��������
			}
		}
		System.out.println("û���ҵ���Ʒ");
	}

	private static void f4() {
		/*
		 * �����ܼ�
		 * ���۾���
		 * ��ߵ���
		 * ����ܼ�
		 */
		double hwzj = 0;//�����ܼ�
		double djzj = 0;//�����ܼ�
		double zgdj = 0;//��ߵ���
		double zgzj = 0;//����ܼ�
		//��������
		for(int i=0;i<names.length;i++) {
			hwzj += price[i]*numbers[i];
			djzj += price[i];
			//������۱�zgdj��
			if(price[i] > zgdj) {
				zgdj = price[i];
			}
			if(price[i]*numbers[i] > zgzj) {
				zgzj = price[i]*numbers[i];
			}
		}
		System.out.println("�����ܼۣ�"+hwzj);
		System.out.println("���۾��ۣ�"+(djzj/names.length));
		System.out.println("��ߵ��ۣ�"+zgdj);
		System.out.println("����ܼۣ�"+zgzj);
	}
}









