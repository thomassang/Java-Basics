package day0603;
/**
 * ����
 */
public abstract class Pet {
		String name;//����
		int full;//��ʳ��
		int happy;//���ֶ�
		
		public Pet(String name,int full,int happy){
			this.name = name;
			this.full = full;
			this.happy = happy;
		}
		
		//ιʳ
		public void feed(){
			
			if(full == 100){
				System.out.println(name + "˵�������������");
				
				return;//��������
			}
			
			System.out.println("��" + name + "ιʳ");
			full += 10;
			System.out.println("��ʳ��" + full);
		}
		//��ˣ
		public void play(){
			if(full == 0){
				System.out.println(name + "˵���������ҿ��ֵĶ�����");
				return;
			}
			
			System.out.println("��" + name + "��ˣ");
			full -= 10;
			happy += 10;
			System.out.println("��ʳ��: " + full + "���ֶ�: " + happy);
		}
		//�ͷ�
		public void punish(){

			System.out.println("��" + name + "Сƨƨ" + name + "�޽У� ������ˣ���" + cry());
			happy -= 10;
			System.out.println("���ֶȣ�"+ happy);
			
		}
		
		//��Ϊͨ�÷������ڸ����ж���
		//ʵ�ֽ��������곡
		public abstract String cry();
		/*{
			// �޽���
			//�������У�Ҫ��д������������Żؾ���Ŀ޽���			
			
			//�˴���������
			return "�˴��п޽���";
		}*/
		
}


