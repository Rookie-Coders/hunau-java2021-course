package Strtime;
import java.util.Scanner;
public class Strtime {
        public static void main(String [] args){
                Scanner input = new Scanner(System.in);
                String str1,str2;
                int count = 0,address;

                System.out.print("请输入整串：");
                str1 = input.next();
                System.out.print("请输入子串：");
                str2 = input.next();
                if(!str1.contains(str2)){
                        System.out.print("出现次数为0");
                }
                else{
                        while(str1.length()!=0){
                                address = str1.indexOf(str2);
                                if(address !=-1){
                                        count++;
                                        str1=str1.substring(address +str2.length());
                                }
                                else break;
                        }
                        System.out.print("出现次数为"+count);
                }

        }
}
