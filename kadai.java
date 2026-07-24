import java.io.*;
public class Main {
 
public static void main(String[] args) {
      int a = 5;
      int b = 0;
      try{
            int result = a/b;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("エラーが発生しました：0で割ることはできません");
        }finally{
            System.out.println("計算処理を終了しました");
        }   

 } 
}

