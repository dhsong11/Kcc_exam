package kosa.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main {
	Member m;
	
	//객체 직렬화
	public void insert() {
		m = new Member("홍길동",20,new Video("1","서울의 봄","정우성"));
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			}catch(Exception e2) {}
		}
	}
	
	//객체 역직렬화
	public void show() {
	
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m=(Member)ois.readObject();
			System.out.println(m);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			}catch(Exception e2) {
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		Main main = new Main();
		
		main.insert();
		main.m = null;
		main.show();
		
		  
		
	}

}
