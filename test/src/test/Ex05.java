package test;  // 패키지 선언 (폴더 개념)

// 책 클래스 (설계도)
class Book {

    String title; // 책 제목 저장 변수

    // 생성자: 객체 생성 시 제목 초기화
    Book(String title) {
        this.title = title; // 객체 변수 = 입력값
    }
}

// 실행 클래스
public class Ex05 {

    public static void main(String[] args) {

        // Book 객체를 3개 저장할 배열 생성
        Book[] b = new Book[3];

        // 각각 객체 생성 후 배열에 저장
        b[0] = new Book("자바의 정석");
        b[1] = new Book("파이썬 정석");
        b[2] = new Book("C언어 정석");

        // 배열 길이만큼 반복하면서 출력
        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i].title); // 각 객체의 title 출력
        }
    }
}