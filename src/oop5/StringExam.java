package oop5;

import java.util.Arrays;
import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
//		 1.String ��ü ���� ����� ������
//		String str = "ABC";
//		String str2 = "ABC";
//		String str3 = new String("ABC");
//		String str4 = new String("ABC");
//		
//		
//		if(str.equals(str3)) {
//			System.out.println("����");
//		}
//		else {
//			System.out.println("�ٸ���");
//		}

		// 2.String Ŭ���� �Һ��� Ư¡
//		str.concat("DEF");
//		System.out.println(str);

//		String str5 = str.concat("DEF");
//		System.out.println(str5);
//		
//		StringBuffer sb = new StringBuffer("ABC");
//		sb.append("DEF");
//		System.out.println(sb);

//		�ش� ���ڿ��� ��ġ�� �ľ� => indexOf("���ڿ�") => �ش� ���ڿ��� �ε���, ������ -1
//		String sql = "integer.valueOf(board)";
//		System.out.println(sql.indexOf("board"));
//		System.out.println(sql.length());
//		
//		for(int i=0; i<sql.length(); i++) {
//			System.out.print(sql.charAt(i));
//		}
	

//		���ڿ� �κ����� : subString(5), subString(5,10)
		// ����: sql���� "board" ���ڿ��� ���
//		System.out.println(sql.substring(sql.indexOf("board"),sql.indexOf("board")+5));

		// ����
		String fileName = "kosa.jpg";
		String head = "";
		String pattern = "";

		head = fileName.substring(0, fileName.indexOf("."));
		pattern = fileName.substring(fileName.indexOf(".") + 1);

		System.out.println(head + ":" + pattern);

		// ����
		String id = "kosa";
		String m_id = "Kosa";

		if (id.equalsIgnoreCase(m_id)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}

		// ���ڿ� ==> String[] ��ȯ
		String fruits = "���,����,����,��";
		String arr[] = fruits.split(",");
		System.out.println(Arrays.deepToString(arr));

		// ���ڿ� ==> char[]��ȯ
		String str5 = "abcdef";
		char arr2[] = str5.toCharArray();
		System.out.println(Arrays.toString(arr2));

		// ���ڿ� ==> byte[]��ȯ
		String str6 = "abcdef";
		byte arr3[] = str6.getBytes();
		System.out.println(Arrays.toString(arr3));

		// ���ڿ� <==> ������
		String str7 = "100";
		int num2 = 0;
		num2 = Integer.parseInt(str7);
		System.out.println(num2);

		int num3 = 10;
		String str8 = String.valueOf(num3);
//		String str8 = 10 + "";
		System.out.println(str8);

		System.out.println("-------------------------");
		
		

	}
}
