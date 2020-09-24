package jrazek.matura.testy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public static List<String> returnLines(File f){
        List <String> list = new ArrayList<>();
        try{
            Scanner reader = new Scanner(f);
            while(reader.hasNextLine()){
                list.add(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
