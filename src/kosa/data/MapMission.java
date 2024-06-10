package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapMission {

	public static void main(String[] args) {

		// �̸�, ������ �ѽ����� Map �ڷᱸ���� ǥ���Ͻÿ�. ex)���ڹ�:90, ���ڹ�: 60
		// 1.���� �����ڸ� ���
		// 2.����,���,�ְ�����,�������� ��� Collections => max(),min()
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("���ڹ�", 90);
		map.put("���ڹ�", 60);
		map.put("���ڹ�", 50);

		for (String key : map.keySet()) {
			System.out.println("������: " + key);
		}
//		Iterator<String> keys = map.keySet().iterator();
//        while (keys.hasNext()){
//            String key = keys.next();
//            System.out.println("KEY : " + key); 
//        }
//
//		System.out.println("����� ������: " + map.size());
//		
//		if(map.containsKey("LG")) {
//			map.remove("2");
//		}
//		

		// Map ��ü��� ���(key,value) : key����
		// Map Set => Iterator
		// Key => keySet()
		// value => values : Collection
		// (key,value) => entrySet(): Set
//		
//		Set set = map.entrySet();
//		Iterator iter = set.iterator();
//		
//		while(iter.hasNext()) {
//			Map.Entry<String,String> e = (Map.Entry<String, String>)iter.next();
//			System.out.println("key: " + e.getKey()+",value: " + e.getValue());
//			
//		}

		Collection<Integer> scores = map.values();
		int sum = 0;
		int maxScore = Collections.max(scores);
		int minScore = Collections.min(scores);

		for (int score : scores) {
			sum += score;
		}

		double average = (double) sum / scores.size();

		System.out.println("����: " + sum);
		System.out.println("���: " + average);
		System.out.println("�ְ�����: " + maxScore);
		System.out.println("��������: " + minScore);

	}

}
