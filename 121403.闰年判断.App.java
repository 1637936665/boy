package pac;

import java.util.Scanner;

public class App {
/*
    根据闰年算法，公元4年是闰年，且周期是4年，如果公元有0年，即为闰年。因为公元没有0年，那公元前1年就是是闰年。
    公元后闰年（3200年内）的判断规则如下： 
            1、非整百年：四年一闰，百年不闰。若某个年份能被4整除但不能被100整除，则是闰年。（公元4年是闰年，公元100年不是闰年）。
            2、整百年：百年不闰，四百年一闰。对于整百年，若某个年份能被400整除，则也是闰年。（公元100年不是闰年，公元400年是闰年）。
    公元前闰年（-3200年内）的判断规则如下：
            1、非整百年：年数除以4余数为1是闰年，即公元前-1、-5、-9……是闰年。
            2、整百年：对于整百年，年数除以400余数为1是闰年，即公元前-401、-801……是闰年。
*/
    public static void main(String[] args) {
        //声明一个String类型的公元前后成员变量
        String str;
        //声明一个String类型的平闰年成员变量
        String str2;
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.println("\n请输入公元前3200年至公元后3200年内要判断的年份：");
            int year=scanner.nextInt();
            if(year<0) {
                str="公元前";
                //Math.abs()该函数是求绝对值
                int year2=Math.abs(year);
                if(year2%4==1) {
                    str2="是闰年";
                    System.out.println(str+year2+str2);
                }else {
                    str2="是平年";
                    System.out.println(str+year2+str2);
                }
            //公元后
            }else {
                str="公元";
                //百年不闰，四百年一闰
                if(year%4==0&&year%100!=0||year%400==0) {
                    str2="是闰年";
                    System.out.println(str+year+str2);
                }else {
                    str2="是平年";
                    System.out.println(str+year+str2);
                }
            }
        }
    }
}
