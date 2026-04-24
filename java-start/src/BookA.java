import java.util.Scanner;

class BookA {
   String title; 
    int price;
   public BookA(String title, int price) { 
      this.title = title;
      this.price = price;
   }

   public static void main(String[] args) {
      BookA [] b = new BookA[3]; 
      Scanner sc = new Scanner(System.in);
      
      for(int i=0; i<b.length ;i++) {
         System.out.print("제목 입력:");
         String title= sc.nextLine();
         System.out.print("가격 입력 :");
         int price= sc.nextInt();
         sc.nextLine();
           b[i]   = new BookA(title,price); // 배열 요소 객체 생성
      }
      
      for(int j=0; j<b.length ;j++) {
         System.out.print(b[j].title + ", " + b[j].price);
      }
      
      sc.close();
   }
}