package day0601;
/**
 * ��װ��
 * 		��ص����ݺͷ�������
 * 		��װ��car����
 */
public class car {
	String brand;//Ʒ��
	String color;//��ɫ
	int speed;//�ٶ�
	
	//���췽��
	public car(	String brand,String color,int speed){
		//��ͬ���ֲ�������
		//������this.xxx�����ʳ�Ա����
		
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}
	
	public void go(){
		System.out.println(color + brand + "ǰ��,�ٶȣ�" + speed);
	}
	
	public void stop(){
		System.out.println(color + brand + "ֹͣ");
		
	}

}
