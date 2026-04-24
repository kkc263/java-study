package ex1;

class Animal {
    String name;
    int age;
    String color;

    void eat() {
        System.out.println("먹는다");
    }

    void sleep() {
        System.out.println("잔다");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("멍멍 짖는다");
    }

    void run() {
        System.out.println("달린다");
    }
}



