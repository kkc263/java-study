import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 문자로 입력하세요.\n");

        String input = sc.nextLine();

        System.out.println("입력 문자열: " + input);

        double num = Double.parseDouble(input);
        System.out.println("숫자로 변환: " + num);

        String str1 = Double.toString(num);
        System.out.println("다시 문자열로 변환(toString): " + str1);

        String str2 = String.valueOf(num);
        System.out.println("다시 문자열로 변환(valueOf): " + str2);
    }
}