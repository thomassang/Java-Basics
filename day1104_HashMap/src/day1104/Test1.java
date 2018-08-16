package day1104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(9527, "唐伯虎");
		map.put(9528, "华夫人");
		map.put(9529, "祝枝山");
		map.put(9530, "旺财");
		map.put(9531, "小强");
		map.put(9532, "石榴姐");
		map.put(9533, "春香");
		map.put(9534, "夏香");
		map.put(9535, "秋香");
		map.put(9536, "冬香");
		map.put(9537, "小强");
		map.put(9538, "华安");
		map.put(9539, "如花");
		map.put(9540, "似玉");
		map.put(9541, "看门老大爷");
		//重复的键，新的值覆盖以前的值
		map.put(9539, "花如");
		
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(9527));
		System.out.println(map.get(9999));
		System.out.println(map.remove(9539));
		System.out.println(map);
		
		//取出所有的键
		Set<Integer> keys= map.keySet();
		for(Iterator<Integer> it = keys.iterator();it.hasNext();){
			Integer k = it.next();
			String v = map.get(k);
			System.out.print(k + "=" + v + "/");
		}
		
		
	}
}
