package kosa.oop;

public class BookMain {

	public static void main(String[] args) {
		
		int total = 0;
		
	       
        Book arr[] = {new Book("JAVA", 30000),
        		new Book("JSP", 20000),
        		new Book("Oracle", 15000)
        };
        
        for(Book b: arr) {
        	b.discount();
        	b.printDiscountedPrice();
        	total += b.discountedPrice;
        }
        
        System.out.println("รัวี: " + total);
      
        
       
   

	}

	
}




