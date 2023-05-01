package Task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final int MAX_ELEMENT = 1000000;
        final int COUNTER = 100000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < MAX_ELEMENT; i ++){
            int number = getRandomIntegerBetweenRange(0, 100);
            arrayList.add(number);
            list.add(number);
        }



    }

    public static int getRandomIntegerBetweenRange(double min, double max){
        int x = (int) ((Math.random()*((max-min)+1))+min);
        return x;
    }
}
