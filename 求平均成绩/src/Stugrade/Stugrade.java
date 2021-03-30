package Stugrade;
import java.util.Scanner;

public class Stugrade {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入学生个数：");
        int stu_number = input.nextInt();
        StuInfo[] stuinfo= new StuInfo[stu_number];
        for(int i=0;i<stu_number;i++){
            StuInfo tempStu = new StuInfo();
            System.out.print("请输入第"+(i+1)+"名学生姓名：");
            tempStu.name = input.next();
            System.out.print("请输入第"+(i+1)+"名学生学号：");
            tempStu.S_num = input.next();
            System.out.print("请输入第"+(i+1)+"名学生成绩：");
            tempStu.score = input.nextFloat();
            System.out.println();
            input.nextLine();
            stuinfo[i]=tempStu;
        }
            float avg =0,sum=0;
            for(int j=0;j<stu_number;j++){

                sum+=stuinfo[j].score;
                avg=sum/stu_number;
            }
    System.out.println("学生的平均成绩是："+avg );

    }
}
class  StuInfo{
     String name;
     String S_num;
     float score;

}
