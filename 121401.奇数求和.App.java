package pac;


public class App {
/*
    奇数求和，求下列算式的值:
            1+3+5+7+....+2147483647=?
*/
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while(i<=2147483647){
//            System.out.println(i);
//            System.out.println(i%2);
            if(i%2==1){
                sum=sum+i;
                i+=2;
            }
        }
        System.out.println("求和结果得："+sum);
    }
}
