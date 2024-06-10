package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapMission {

	public static void main(String[] args) {

		// 이름, 점수를 한쌍으로 Map 자료구조로 표현하시오. ex)김자바:90, 박자바: 60
		// 1.시험 응시자만 출력
		// 2.총점,평균,최고점수,최저점수 출력 Collections => max(),min()
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("김자바", 90);
		map.put("박자바", 60);
		map.put("송자바", 50);

		for (String key : map.keySet()) {
			System.out.println("응시자: " + key);
		}
//		Iterator<String> keys = map.keySet().iterator();
//        while (keys.hasNext()){
//            String key = keys.next();
//            System.out.println("KEY : " + key); 
//        }
//
//		System.out.println("요소의 사이즈: " + map.size());
//		
//		if(map.containsKey("LG")) {
//			map.remove("2");
//		}
//		

		// Map 전체목록 출력(key,value) : key없이
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

		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최저점수: " + minScore);

	}

}
