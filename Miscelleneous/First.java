package Miscelleneous;
public class Student{
    Student display(){
        System.out.println("In the display");
        return this;
    }
    Student debug(){
        System.out.println("In the debug section");
        return this;
    }
}

public class First {
    
    public static void main(String[] args) {
        new Student.display()
                .debug();

    }
}
