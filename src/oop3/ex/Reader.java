package oop3.ex;

public class Reader extends Man implements Speakable{

	public Reader(String name) {
		super(name);
	}
	
	@Override
	public String speak() {
		
		return getName() + " �ڹ�ȭ����";
	}

}


