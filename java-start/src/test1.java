

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(String name){
    	this.name = name;
    	age =0;
    	
    }

  

    void checkAdult() {
    	 System.out.println("이름: " + name);
         System.out.println("나이: " + age);
    	if (age >= 19) {
            System.out.println("성인 입니다.");
        } else if (age >= 10) {
            System.out.println("청소년 입니다.");
        } else {
            System.out.println("소인 입니다.");
        }
    }
}

public class test1 {

    public static void main(String[] args) {

        Person p = new Person("john", 19);
        p.checkAdult();
    }
}


