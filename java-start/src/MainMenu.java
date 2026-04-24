import java.util.Scanner;

class Menu {
   String order;

   Menu(String order) {
      this.order = order;
   }

   void printMenu() {
      System.out.println("김기찬 카페 메뉴는: " + order);
   }
}

public class MainMenu {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      Menu[] menuArr = new Menu[3];
      menuArr[0] = new Menu("Coffee");
      menuArr[1] = new Menu("Tea");
      menuArr[2] = new Menu("Juice");

      while (true) {
         System.out.print("메뉴 번호 입력 (0 입력 시 종료): ");
         int num = sc.nextInt();

         if (num == 0) {
            System.out.println("프로그램 종료");
            break;
         }

         switch (num) {
         case 1:
            menuArr[0].printMenu();
            break;
         case 2:
            menuArr[1].printMenu();
            break;
         case 3:
            menuArr[2].printMenu();
            break;
         default:
            System.out.println("없는 메뉴입니다.");
         }
      }

      sc.close();
   }
}