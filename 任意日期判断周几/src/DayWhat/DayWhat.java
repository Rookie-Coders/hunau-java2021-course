package DayWhat;
import java.util.Scanner;
public class DayWhat {
    public static void main(String[] args) {
        Out out = new Out();
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        System.out.print("请输入月份：");
        int month = input.nextInt();
        System.out.print("请输入日期：");
        int day = input.nextInt();
        if (month == 1 || month == 2) {
            year--;
            month = month + 12;
        }
        int century = year / 100;
        double LastNum = year - (century * 100);
        double Demo = Math.floor(century / 4.0) - (2 * century) + LastNum + Math.floor(LastNum / 4) + (13 * (month + 1) / 5.0) + day-1;
        double Week = Demo % 7;
        //System.out.println(Week);
        System.out.print(out.dayq(Week));

    }
}
class Out {
    String num ;
    String dayq(double flag)
    {
        switch ((int) flag) {
            case 0:
                num="今天是周日";
                break;
            case 1:
                 num= "今天是周一";
                 break;
            case 2:
                 num= "今天是周二";
                break;
            case 3:
                 num= "今天是周三";
                break;
            case 4:
                num = "今天是周四";
                break;
            case 5:
                num =  "今天是周五";
                break;
            case 6:
                num =  "今天是周六";
                break;
        }
        return num;
    }

}