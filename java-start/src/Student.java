

import java.util.Scanner;

class StudentP{
   String name;
    int score;

    StudentP(String name, int score) {
        this.name = name;
        this.score = score;
    }   
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //학생수 키보드로 부터 입력
      System.out.print("반학생수 입력하세요:");
      int cnt= sc.nextInt();
      sc.nextLine();
      //학생수만큼 배열 객체 생성
      StudentP [] stu = new StudentP[cnt]; 
      //반복문을통해서 배열 요소 객체 생성
      // 값을 키보드로부터 입력받음
      for(int i=0; i<stu.length;i++) {
         System.out.print((i+1)+"번째 학생 이름 입력:");
         String name= sc.nextLine();
         System.out.print((i+1)+"번째 학생 점수 입력:");
         int score= sc.nextInt();
         sc.nextLine();
         stu[i] = new StudentP(name,score);         
      }
      //이름 검색
      while(true) {
         System.out.print("검색할 이름은:");
         String sname= sc.nextLine();
         
         if(sname.equals("그만")) break;       
      }     
   }
}