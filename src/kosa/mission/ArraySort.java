package kosa.mission;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,5};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	
		
			for (int i = 0; i <arr.length; i++) {
	            System.out.print(arr[arr.length-1-i]+", ");

	            
		}
			System.out.println();
			
			for(int i=arr.length-1; i>=0; i--) {
				System.out.print(arr[i]+", ");
			}
			
			System.out.println();
			
			int arr2[][] = {{2,90},{1,60},{3,20}};//[3][2]
			Arrays.sort(arr2, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					//���ı��� �ۼ� => 2���� �迭 �ȿ� 1���� ù��° �ε����� �������� ��������
					if(o1[0]<o2[0]) {
						return 1;
				
				}else if(o1[0] > o2[0]) {
					return -1;
				}else {
					return 0;
				}
				
			}
			});
			
			System.out.println(Arrays.deepToString(arr2));
			
	}

}
