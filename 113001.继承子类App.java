package pac;

import java.util.Random;

public class App extends R{
    public static void main(String[] args) {
        System.out.println(boy_filePath);
        System.out.println(girl_filePath);
        int i=new Random().nextInt(2);//随机数2以内的整数（不包括2）
        System.out.println(i);
        System.out.println(array2d[i][new Random().nextInt(3)]);

    }
}
