package Miscelleneous;

class Student {
    Student name() {
        System.out.println("The name is ....");
        return this;
    }

    Student study() {
        System.out.println("Giving the best in my study...");
        return this;
    }
}

public class First {

    public static void main(String[] args) {
        new Student()
                .name()
                .study();

    }
}
//With the above code we are calling more than one methods with an anonymous class 
