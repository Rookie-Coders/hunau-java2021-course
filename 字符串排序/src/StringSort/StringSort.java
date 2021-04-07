package StringSort;
import java.util.*;
public class StringSort {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("请输入需要排序的字符串：");
        String Str_Origin = input.nextLine();//输入原字符串
        String[] Str_Arr = Str_Origin.split(" ");//按空格分割字符串
        int [] Num_Arr = Transition.String_to_arr(Str_Arr);//整型数组存储转换后的数据
        Arrays.sort(Num_Arr);//排序字符串
        System.out.println("排序前字符串："+Str_Origin);
        System.out.println("排序后字符串："+(Transition.Arr_to_string(Num_Arr)));
    }
}
class Transition{
     static int[] String_to_arr(String [] str_arr){//将字符串转换为整型数组
        int [] arr =new int[str_arr.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(str_arr[i]);
        }
        return arr;//返回整型数组
    }
     static String Arr_to_string(int [] num_arr){//将整型数组转换为字符串
        StringBuffer Str_Sort = new StringBuffer();//用来存储转换后的字符串
        for(int i=0;i< num_arr.length;i++){
            Str_Sort.append(num_arr[i]+" ");
        }
        return Str_Sort.toString();//返回字符串
    }
}