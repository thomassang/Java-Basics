package day1104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(9527, "�Ʋ���");
		map.put(9528, "������");
		map.put(9529, "ף֦ɽ");
		map.put(9530, "����");
		map.put(9531, "Сǿ");
		map.put(9532, "ʯ���");
		map.put(9533, "����");
		map.put(9534, "����");
		map.put(9535, "����");
		map.put(9536, "����");
		map.put(9537, "Сǿ");
		map.put(9538, "����");
		map.put(9539, "�绨");
		map.put(9540, "����");
		map.put(9541, "�����ϴ�ү");
		//�ظ��ļ����µ�ֵ������ǰ��ֵ
		map.put(9539, "����");
		
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(9527));
		System.out.println(map.get(9999));
		System.out.println(map.remove(9539));
		System.out.println(map);
		
		//ȡ�����еļ�
		Set<Integer> keys= map.keySet();
		for(Iterator<Integer> it = keys.iterator();it.hasNext();){
			Integer k = it.next();
			String v = map.get(k);
			System.out.print(k + "=" + v + "/");
		}
		
		
	}
}
