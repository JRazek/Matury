package jrazek.matura.testy;

public class Zad {
    public static void doYourJob1(){
        for(int i = -4; i <= 14; i += 3){
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
        for(int i = -4; i <= 14; i ++){
            if(i == 2) break;
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
        for(int i = 12; i >= -12; i -=4){
            System.out.print(i);
            System.out.print(", ");
        }
        for(int i = 12; i >= -12; i -=4){
            if(i == 0) break;
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
    }
    public static void doYourJob2(int n){
        System.out.println(4f/(n+1));
        float sum1 = 0;
        float sum2 = 0;
        float product1 = 1;
        for(int i = 1; i < n; i ++){
            sum1+=(1f/(2f*i));
        }
        System.out.println(sum1);

        for(int i = 1; i <= n; i ++){
            product1*=((float)(i+3)/n);
        }
        System.out.println(product1);

        for(int i = 1; i <= n; i ++){
            sum2 += ((2f*(3*Math.pow(2,i-1)))/i);
        }
        System.out.println(sum2);
    }
}
