import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while(true){
            Scanner scanner=new Scanner(System.in);
            int num=scanner.nextInt();
            if(num==1){
                System.out.println((int)(Math.random()*100)+","+(int)(Math.random()*100));
            }
        }
    }
}
