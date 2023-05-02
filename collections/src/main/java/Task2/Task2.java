package Task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2 {

    public static final int TOTAL_VALUES_OF_ELEMENTS = 1000000;
    public static final int COUNTER_OF_ELEMENT = 100000;

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkendList = new LinkedList<>();

        setRandomElements(arrayList, linkendList);

        getResultTimesRunArrayList(arrayList);
        getResultTimesRunLinkedList(linkendList);

    }

    public static Integer random(int Min, int Max) {
        return (int) ((Math.random() * (Max - Min)) + Min);
    }

    public static void setRandomElements(List<String> arrayList, List<String> linkendList) {
        for (int i = 0; i < TOTAL_VALUES_OF_ELEMENTS; i++) {
            int numbers = random(0, 999);
            arrayList.add(String.valueOf(numbers));
            linkendList.add(String.valueOf(numbers));
        }
    }

    public static void getResultTimesRunArrayList(List<String> arrayList) {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < COUNTER_OF_ELEMENT; i++) {
            arrayList.get(getRandom(0, TOTAL_VALUES_OF_ELEMENTS));
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Время выполнения отбора в ArrayList " + (endTime - startTime) + " ms");
    }

    public static void getResultTimesRunLinkedList(List<String> linkendList) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < COUNTER_OF_ELEMENT; i++) {
            linkendList.get(getRandom(0, TOTAL_VALUES_OF_ELEMENTS));
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Время выполнения отбора в LinkedList " + (endTime - startTime) + " ms");
    }

    public static Integer getRandom(int Min, int Max) {
        return (int) ((Math.random() * (Max - Min)) + Min);
    }

}
