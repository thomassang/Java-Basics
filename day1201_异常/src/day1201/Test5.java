package day1201;

import java.rmi.UnexpectedException;
import java.util.Scanner;

/**
 * �Զ���һ���쳣
 * @author sj154
 * �û�����½���û������󣬻�������󣬷ֱ��������쳣����ʾ
 * ���������ࣺ
 * UsernameNotFoundException
 * WrongPasswordException
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.println("�û�����");
		String n = new Scanner(System.in).nextLine();
		System.out.println("���룺");
		String p = new Scanner(System.in).nextLine();
		
		try {
			login(n,p);
			System.out.println("��ӭ��½");
		} catch (UsernameNotFoundException e) {
			System.out.println("�û�������ȷ");
			// TODO: handle exception
		}catch (WrongPasswordException e) {
			System.out.println("���벻��ȷ");
			// TODO: handle exception
		}
	}

	private static void login(String n, String p) throws UsernameNotFoundException, WrongPasswordException {
		// abc  123
		if(! n.equals("abc")){
			throw new UsernameNotFoundException();
		}
		if(! p.equals("123")){
			throw new WrongPasswordException();
		}
	}

}
