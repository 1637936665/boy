import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {

        int arr[][]={
                {5,6},
                {300,500},
                {900,666},
                {7,0}
        };
        while(true){
            int a=(int)(Math.random()*10%4);
            System.out.println(arr[a][0]+","+arr[a][1]);
            Thread.sleep(1000);
            System.out.println("靓仔，过去一秒了！");
        }
    }
}
