package day1201;

import java.rmi.UnexpectedException;
import java.util.Scanner;

/**
 * 自定义一个异常
 * @author sj154
 * 用户名登陆，用户名错误，或密码错误，分别用两个异常来表示
 * 建立两个类：
 * UsernameNotFoundException
 * WrongPasswordException
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.println("用户名：");
		String n = new Scanner(System.in).nextLine();
		System.out.println("密码：");
		String p = new Scanner(System.in).nextLine();
		
		try {
			login(n,p);
			System.out.println("欢迎登陆");
		} catch (UsernameNotFoundException e) {
			System.out.println("用户名不正确");
			// TODO: handle exception
		}catch (WrongPasswordException e) {
			System.out.println("密码不正确");
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
