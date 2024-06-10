package oop5;

import java.util.Scanner;

public class RegularExam {

	public static void main(String[] args) {
		
		//abc ¹®ÀÚ¸¦ Æ÷ÇÔ ¿©ºÎ Ã¼Å©
//		Scanner sc = new Scanner(System.in);
//		System.out.print("ÀÔ·Â:");
//		String str = sc.nextLine();
//		
//		//abc ¹®ÀÚ¸¦ Æ÷ÇÔ ¿©ºÎ Ã¼Å©: 
//		if(str.matches(".*abc.*")) {
//			System.out.println("¸ÅÄª");
//		}else {
//			System.out.println("ºñ¸ÅÄª");
//		}

		
		//¼ýÀÚ¸¸ 3ÀÚ¸® À¯¹« ÆÇ´Ü ==> \\
//		Scanner sc = new Scanner(System.in);
//		System.out.print("ÀÔ·Â:");
//		String str = sc.nextLine();
//		
//		//abc ¹®ÀÚ¸¦ Æ÷ÇÔ ¿©ºÎ Ã¼Å©: 
//		if(str.matches("[\\d]{3}")) {
//			System.out.println("¸ÅÄª");
//		}else {
//			System.out.println("ºñ¸ÅÄª");
//		}
		
		//¾ËÆÄºª, ¼ýÀÚ¸¸ 5ÀÚ¸® ÀÌ»ó
//		Scanner sc = new Scanner(System.in);
//		System.out.print("ÀÔ·Â:");
//		String str = sc.nextLine();
//		
//		//abc ¹®ÀÚ¸¦ Æ÷ÇÔ ¿©ºÎ Ã¼Å©: 
//		if(str.matches("[\\w]{5,}")) {
//			System.out.println("¸ÅÄª");
//		}else {
//			System.out.println("ºñ¸ÅÄª");
//		}

	
		//ÇÑ±Û 3~5
//		Scanner sc = new Scanner(System.in);
//		System.out.print("ÀÔ·Â:");
//		String str = sc.nextLine();
//		
//	
//		if(str.matches("[°¡-ÆR]{3,5}")) {
//			System.out.println("¸ÅÄª");
//		}else {
//			System.out.println("ºñ¸ÅÄª");
//		}
		
		
		//ÀÌ¸ÞÀÏ°ËÁõ
		//dolsam77@nate.com => ¸ÅÄª
		//423dolsam77@nate.com => ºñ¸ÅÄª
		//dolsam77nate.com => ºñ¸ÅÄª
		//dolsam77@nate.comcom => ºñ¸ÅÄª
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("ÀÔ·Â: ");
//		String str = sc.nextLine();
//		
//		if(str.matches("^[\\D]\\w+@\\w+\\.\\w{2,3}$")){
//			System.out.println("¸ÅÄª");
//		}else {
//			System.out.println("ºñ¸ÅÄª");
//		}

		
		
		//ÀÌ¹ÌÁö ÆÄÀÏ ±¸º°(?!) => ´ë¼Ò¹®ÀÚ ±¸ºÐ ¾øÀÌ
		//abc.gif, abc.jpg, abc.PNG, abc.txt
//		if(str.matches("^\\S+\\.(?!)(jpg|gif|png)$")) {
//			System.out.println("ÀÌ¹ÌÁö ÆÄÀÏ");
//		}else {
//			System.out.println("ÀÏ¹ÝÆÄÀÏ");
//		}
		
		//¸ðµç ¼ýÀÚ Á¦°Å
//		String message = "SW °³¹ßÀÚ5132 Ã³¿ì¿Í ±Ù¹«¿©°Ç ¼±Áø±¹ ¼öÁØÀ¸·Î °³¼±ÇØ¾ß 543¡¼¼­¿ï=´º½Ã½º¡½±èÇü¼· ±âÀÚ = ¹Ú±ÙÇý ´ëÅë·ÉÀº 23ÀÏ ¼ÒÇÁÆ®¿þ¾î(SW) Áß½É»çÈ¸¸¦ ½ÇÇöÇÏ±â À§ÇØ¼­´Â SWÀÇ °¡Ä¡¸¦ Á¦´ë·Î ÀÎÁ¤ÇÏ´Â µ¥¼­ Ãâ¹ßÇØ¾ß ÇÑ´Ù°í ¸»Çß´Ù. ¹Ú ´ëÅë·ÉÀº ÀÌ³¯ ¿ÀÀü ÆÇ±³ Å×Å©³ë¹ë¸®¿¡¼­ ¿­¸° 'SW Áß½É»çÈ¸ ½ÇÇö Àü·«º¸°íÈ¸'¿¡¼­ ¿ì¸®³ª¶ó°¡ IT °­±¹À¸·Î Áö¼Ó ¹ßÀüÇÏ±â À§ÇØ¼­´Â SW ºÐ¾ßÀÇ °æÀï·Â È®º¸°¡ ½Ã±ÞÇÑ °úÁ¦¶ó¸ç ÀÌ°°ÀÌ ¹àÇû´Ù. ¹Ú ´ëÅë·ÉÀº ½ÃÀå¿¡¼­ SWÀÇ °¡Ä¡¸¦ Á¦´ë·Î ÀÎÁ¤ÇÏÁö ¾Ê¾Æ SW ±â¾÷µéÀÇ ¼öÀÍ¼ºÀÌ ¾ÇÈ­µÇ°í, ¿ì¼öÇÑ ÀÎÀç°¡ À¯ÀÔµÇÁö ¾Ê´Â ¾Ç¼øÈ¯ÀÇ °í¸®¸¦ ²÷¾î¾ß ÇÑ´Ù¸ç °ø°øºÎ¹®ÀÇ SW Á¦°ªÁÖ±â ³ë·ÂÀÌ ¹Î°£À¸·Î È®»êµÅ Ã¢ÀÇ¼º°ú ³ë·ÂÀÌ ¿ÂÀüÈ÷ º¸´ä ¹Þ´Â È¯°æÀ» Á¶¼ºÇØ ³ª°¡µµ·Ï ³ë·ÂÇÒ °ÍÀÌ¶ó°í ¾à¼ÓÇß´Ù.  ÀÌ¾î ±×µ¿¾È °ø°ø Á¤º¸È­»ç¾÷ÀÌ ¿ÀÈ÷·Á ¹Î°£ SW ½ÃÀåÀ» À§Ãà½ÃÅ²´Ù´Â ÁöÀûÀÌ ÀÖ¾ú´Âµ¥ ¹Î°£ÀÇ ±â¼ú°ú »ê¾÷¹ßÀüÀ» À§ÇÑ ¸¶Áß¹° ¿ªÇÒÀ» ÇØ¾ß ÇÒ Á¤ºÎ°¡ ¿ÀÈ÷·Á ¹Î°£½ÃÀåÀ» À§Ãà½ÃÅ°´Â ÀÏÀÌ ÀÖ¾î¼­´Â ¾È µÉ °ÍÀÌ¶ó¸ç ¹Î°£½ÃÀå¿¡ ¹ÌÄ¡´Â ¿µÇâÀ» »çÀü¿¡ Æò°¡ÇÏ´Â µî °ø°ø Á¤º¸È­»ç¾÷ ÃßÁøÀýÂ÷¸¦ °³¼±ÇÒ ÇÊ¿ä°¡ ÀÖ´Ù°í Áø´ÜÇß´Ù.  ¹Ú ´ëÅë·ÉÀº ¶Ç SW °³¹ßÀÚÀÇ Ã³¿ì¿Í ±Ù¹«¿©°Çµµ ¼±Áø±¹ ¼öÁØÀ¸·Î °³¼±ÇÒ ÇÊ¿ä°¡ ÀÖ´Ù¸ç SW °³¹ßÀÚ°¡ '²ÞÀÇ Á÷¾÷'ÀÌ µÅ ÃÖ°íÀÇ ÀÎÀçµéÀÌ À¯ÀÔµÇ°í ÀÌµéÀÌ SW »ê¾÷ ¹ßÀüÀ» ÀÌ²ø¾î°¡°í, ±×·¡¼­ ¼ÒÇÁÆ®¿þ¾î °³¹ßÀÚµéÀÇ Ã³¿ì°¡ ´õ¿í °³¼±µÇ´Â ¼±¼øÈ¯ ±¸Á¶¸¦ ¸¸µé¾î ³ª°¡¾ß ÇÏ°Ú´Ù°í °­Á¶Çß´Ù.  Æ¯È÷ ÀÚ¶ó³ª´Â ¹Ì·¡¼¼´ë¿¡ ´ëÇÑ SW ±³À°ÀÌ ¹«¾ùº¸´Ù Áß¿äÇÏ´Ù¸ç SW Áß½É»çÈ¸ÀÇ ÁÖ¿ªÀÌ µÉ ¹Ì·¡ ¼¼´ë°¡ 'ÄÄÇ»ÅÍÀû »ç°í'¸¦ ±âº»¼Ò¾çÀ¸·Î °®Ãâ ¼ö ÀÖµµ·Ï ÃÊ¡¤ÁßµîÇÐ±³¿¡¼­ºÎÅÍ SW±³À°À» °­È­ÇØ¾ß ÇÑ´Ù°í ¸»Çß´Ù.";
//
//		
//		String num[] = {"543","5132"};
//		String result = message;
//		for(String n: num) {
//			result = result.replaceAll(n, "");
//		}
//		
//		System.out.println(result);
		
	
		
	}
	
}
	
		
		 
		
		
	

		
		







