package kosa.data;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListExam {

	public static void main(String[] args) {

//		1~45 중복되지 않는 로또번호 6개 출력
//		1.배열로 구현
		int lotto[] = new int[6];
		System.out.print("번호 출력 : ");
		for (int i = 0; i < lotto.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			lotto[i] = num;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto)); 
//		2.List구현
//		List<Integer> list = new ArrayList<Integer>();
//		
//		while (true) {
//			
//			int n = r.nextInt(45) + 1;
//			if (list.contains(n)) {
//				continue;
//			} else {
//				list.add(n);
//			}
//			if (list.size() == 6)
//				break;
//
//		}
//		Collections.sort(list);
//		System.out.println(list);

//---------------------------------------------------------------------	

		//3.Set 구현 (TreeSet) ==> 중복 허용 X
		Random r = new Random();

		Set<Integer>set = new TreeSet<Integer>();
		
		for(int i=0; set.size()<6; i++) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
		
	}
}
