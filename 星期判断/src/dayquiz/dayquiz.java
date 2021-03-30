package dayquiz;
import java.util.Scanner;
public class dayquiz {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner input = new Scanner(System.in);
        int flag = input.nextInt();
        if (flag < 0 || flag > 6) {
            System.out.println("输入错误！");
        } else {
            switch (flag) {
                case 0:
                    System.out.println("今天是周日");
                    break;
                case 1:
                    System.out.println("今天是周一");
                    break;
                case 2:
                    System.out.println("今天是周二");
                    break;
                case 3:
                    System.out.println("今天是周三");
                    break;
                case 4:
                    System.out.println("今天是周四");
                    break;
                case 5:
                    System.out.println("今天是周五");
                    break;
                case 6:
                    System.out.println("今天是周六");
                    break;
            }
        }
    }
}