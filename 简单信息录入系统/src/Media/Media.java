package Media;
import java.util.*;
class MyMedia{
    Scanner in = new Scanner(System.in);
    int year,month,day;
    String mediaName;   //出版物名称
    String mediaType;   //出版物类型
    float price;        //出版物价格
    String press;       //出版社（磁带发行商）
    String artist;      //作者（演唱者）
    String bookISBN;    //书的ISBN编号
    String editor;      //书的编辑
    String daytime;     //书的出版时间
    void mediaNameInput(){}   //出版物名称输入成员函数
    void mediaPriceInput(){}    //价格输入成员函数
    void mediaPressInput(){}    //出版社（磁带发行商）输入成员函数
    void artistInput(){}         //作者（演唱者）输入成员函数
    void mediaBookISBNInput(){}   //书的编号输入成员函数
    void mediaEditorInput(){}   //书的编辑输入成语函数
    void daytimeInput(){}       //书的出版日期输入函数
    void input(){
        mediaNameInput();
        mediaPriceInput();
        mediaPressInput();
        artistInput();
        mediaBookISBNInput();
        mediaEditorInput();
        daytimeInput();
    }
    void Print(){
        System.out.println(mediaType+"的名字是:"+mediaName);
        System.out.println(mediaType+"的价格是:"+price);
        System.out.println(mediaType+"的出版社是:"+press);
        System.out.println(mediaType+"的作者是:"+artist);
        System.out.println(mediaType+"的ISBN是:"+bookISBN);
        System.out.println(mediaType+"的编辑是:"+editor);
        System.out.println(mediaType+"的出版日期是:"+year+"年"+(month+1)+"月"+day+"日");
        System.out.println("\n\n");
    }
}

class Book extends MyMedia{
    void mediaNameInput(){
        mediaType = "书";
        System.out.print("请输入书的名字：");
        mediaName = in.next();
    }
    void mediaPriceInput(){
        System.out.print("请输入书的价格：");
        price = in.nextFloat();
    }
    void mediaPressInput(){
        System.out.print("请输入书的出版社：");
        press = in.next();
    }
    void artistInput(){
        System.out.print("请输入书的作者：");
        artist = in.next();
    }
    void mediaBookISBNInput(){
        System.out.print("请输入书的ISBN：");
        bookISBN = in.next();
    }
    void mediaEditorInput(){
        System.out.print("请输入书的编辑：");
        editor = in.next();
    }
    void daytimeInput(){
        System.out.print("请输入书的出版日期(yyyy-mm-dd)：");
        Scanner in = new Scanner(System.in);
        daytime  = in.next();
    }
}

class CD extends MyMedia{
    void mediaNameInput(){
        mediaType = "CD";
        System.out.print("请输入CD的名字：");
        mediaName = in.next();
    }
    void mediaPriceInput(){
        System.out.print("请输入CD的价格：");
        price = in.nextFloat();
    }
    void mediaPressInput(){
        System.out.print("请输入CD的出版社：");
        press = in.next();
    }
    void artistInput(){
        System.out.print("请输入CD的作者：");
        artist = in.next();
    }
    void mediaBookISBNInput(){
        System.out.print("请输入CD的ISBN：");
        bookISBN = in.next();
    }
    void mediaEditorInput(){
        System.out.print("请输入CD的编辑：");
        editor = in.next();
    }
    void daytimeInput(){
        System.out.print("请输入书的出版日期(yyyy-mm-dd)：");
        Scanner in = new Scanner(System.in);
        daytime  = in.next();

    }
}

class Tap extends MyMedia{
    void mediaNameInput(){
        mediaType = "磁带";
        System.out.print("请输入磁带的名字：");
        mediaName = in.next();
    }
    void mediaPriceInput(){
        System.out.print("请输入磁带的价格：");
        price = in.nextFloat();
    }
    void mediaPressInput(){
        System.out.print("请输入磁带的出版社：");
        press = in.next();
    }
    void artistInput(){
        System.out.print("请输入磁带的作者：");
        artist = in.next();
    }
    void mediaBookISBNInput(){
        System.out.print("请输入磁带的ISBN：");
        bookISBN = in.next();
    }
    void mediaEditorInput(){
        System.out.print("请输入磁带的编辑：");
        editor = in.next();
    }
    void daytimeInput(){
        System.out.print("请输入书的出版日期(yyyy-mm-dd)：");
        Scanner in = new Scanner(System.in);
        daytime  = in.next();

    }
}
class show{
    public void showMymedia(MyMedia a){
        System.out.println("您输入了以下信息：");
        a.Print();

    }
}
public class Media {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        show s = new show();
        System.out.println("请选择你要进行的操作（请输入1——4中的任一数字）：\n");
        int flag;
        while(true){
            System.out.println("1:请输入书的信息；\n2:请输入CD的信息；\n3:请输入磁带的信息；\n4退出系统；");
            flag = in.nextInt();
            if(flag ==4) break;
            while(flag<1||flag>4) {
                System.out.println("输入错误，请重新输入！");
                flag = in.nextInt();
            }
            switch(flag) {
                case 1:
                    Book b = new Book();
                    b.input();
                    System.out.println();
                    s.showMymedia(b);
                    break;

                case 2:

                    CD c = new CD();
                    c.input();
                    System.out.println();
                    s.showMymedia(c);
                    break;
                case 3:
                    Tap t = new Tap();
                    t.input();
                    System.out.println();
                    s.showMymedia(t);
                    break;

                default: break;
            }

        }

    }
}
