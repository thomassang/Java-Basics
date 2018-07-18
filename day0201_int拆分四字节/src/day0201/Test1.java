  package day0201;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("��������");
		int n = new Scanner(System.in).nextInt();
		
		System.out.println("--��ֳ��ĸ�byteֵ-------------");
		//��n��ֵ���ݵ�f1�����������в��
		//��f1���������У�ֱ�Ӵ�ӡ��ʾ��ֽ��
		f1(n);
	}

	private static void f1(int n) {
		/**
		 * 11001101	10011110 11100100 10010011
		 */
		byte b1 = (byte) (n >> 24);
		byte b2 = (byte) (n >> 16);
		byte b3 = (byte) (n >> 8);
		byte b4 = (byte) (n >> 0);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		/**
		 * 11001101	
		 * 10011110
		 * 11100100 
		 * 10010011
		 * 
		 * r:
		 * 11001101	10011110 11100100 10010011
		 */
		
		int r = 0;
		//�ֽ�ֵ����24�ٲ�����������0,8,16,24
		//��r��λ�򣬽���ڱ��浽r
		r = r | (b1 << 24 >>> 0);
		r = r | (b2 << 24 >>> 8);
		r = r | (b3 << 24 >>> 16);
		r = r | (b4 << 24 >>> 24);
		
		System.out.println(r);
		
      /*
       * 11111111 11111111 11111111 11001101
       * 00000000 00000000 00000000 11111111 &
       * 00000000 00000000 00000000 11001101
       *
       * 255 0xff 0x000000ff
       */
		
		r = 0;
		
		//�ֽ�ֵ��0x000000ff��λ�룬
		//����24,16,8,0λ����r��λ��
		//����ڱ��浽r
		
		r = r | ((b1 & 0x000000ff) << 24);
		r = r | ((b2 & 0x000000ff) << 16);
		r = r | ((b3 & 0x000000ff) << 8);
		r = r | ((b4 & 0x000000ff) << 0);
		
		System.out.println(r);

	}
	

}
