// ================= 부모 클래스 =================
class AnimalEx {

    String name; // 이름 저장
    int age;     // 나이 저장

    // 부모 생성자
    AnimalEx(String name, int age) {
        this.name = name; // 객체 name 초기화
        this.age = age;   // 객체 age 초기화
    }

    // 부모 메서드
    void show() {
        System.out.println("이름: " + name); // 이름 출력
        System.out.println("나이: " + age);  // 나이 출력
    }
}


// ================= 자식 클래스 =================
class DogEx extends AnimalEx {

    String breed; // 품종 저장

    // 자식 생성자
    DogEx(String name, int age, String breed) {

        super(name, age); 
        // 🔥 부모 생성자 호출
        // → AnimalEx(name, age) 실행됨

        this.breed = breed; // 자식 변수 초기화
    }

    // 자식 메서드
    void showDog() {

        show(); 
        // 🔥 부모 메서드 사용 (상속받은 기능)

        System.out.println("품종: " + breed); // 품종 출력
    }
}


// ================= 실행 클래스 =================
public class Ex06 {

    public static void main(String[] args) {

        // 객체 생성
        DogEx d = new DogEx("바둑이", 3, "푸들");

        /*
        🔥 실행 순서 (시험 핵심)
        1. new DogEx()
        2. super(name, age) → 부모 생성자 실행
        3. this.breed 초기화
        4. 객체 완성
        */

        // 메서드 실행
        d.showDog();
    }
}