package jrazek.matura.testy;

import java.util.List;

public class Zad {
    public static List<Integer> bubbleSort(List<Integer> l){
        if(l.size() > 1){
            boolean done = false;
            while(!done){
                int buffer;
                done = true;
                for(int i = 0; i < l.size() - 1; i ++){
                    if(l.get(i) < l .get(i + 1)){
                        buffer = l.get(i);
                        l.set(i, l.get(i + 1));
                        l.set(i + 1, buffer);
                        done = false;
                    }

                }
            }
        }
        return l;
    }
    public static void doYourJob3(int n){

    }
}
