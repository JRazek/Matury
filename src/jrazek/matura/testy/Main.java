package jrazek.matura.testy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> list = new ArrayList();

    public static void main(String[] args) {
        list = FileReader.returnLines(new File("./DANE_PR/dziennik.txt"));
        Zad.doYourJob1();
        Zad.doYourJob2(4);
    }
}
