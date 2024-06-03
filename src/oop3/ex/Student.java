package oop3.ex;

public class Student extends Man {
    public Student(String name) {
        super(name);
    }

    
    String study() {
        return getName() + "공부나 열심히해";
    }
}





