package jrazek.matura.testy;


import java.io.File;
import java.util.List;

public class Main {
private static class Pair<T,E>{
    T k;
    E v;
}
    static int binToDec(String bin){
        int dec = 0;
        int pow = 0;
        for(int i = bin.length() - 1; i >= 0; i --){
            int cv = Character.getNumericValue(bin.charAt(i));
            dec += cv * Math.pow(2, pow);
            pow ++;
        }
        return dec;
    }
    static String decToBin(int dec){
        StringBuilder reversedNum = new StringBuilder();
        while(dec != 0){
            reversedNum.append(dec % 2);
            dec /= 2;
        }
        StringBuilder ok = new StringBuilder();
        for(int i = reversedNum.length() - 1; i >= 0; i --){
            ok.append(reversedNum.charAt(i));
        }
        return ok.toString();
    }
    static String decToHex(int dec){
        String table = "0123456789ABCDEF";
        StringBuilder reversedTable = new StringBuilder();
        while(dec != 0){
            reversedTable.append(table.charAt(dec % 16));
            dec /= 16;
        }
        reversedTable.reverse();
        return reversedTable.toString();
    }
    public static Pair<Integer, Integer> findPair(int num){
        List< Pair< Integer, Integer > > applicable;
        for(int i = 0; i <= num/2; i ++){
            int n1 = i;
            int n2 = num - i;
            float rate = Math.round( 10.f*((float)n1)/((float)n2) ) / 10.f;

        }
        return new Pair<>();
    }
    public static void main(String[] args) {

    }
}
