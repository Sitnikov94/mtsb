package Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> namesList = Arrays.asList( "get", "Get", "get", "geT", "set", "set", "SET", "get", "GET", "get");

        List<String> arrayList = new ArrayList<>(namesList);

        System.out.println("Список ДО изменений: " + arrayList);

        DeleteDuplicateList delete = new DeleteDuplicateList();

        arrayList = delete.deleteDuplicate(arrayList);

        System.out.println("Список ПОСЛЕ изменений: " + arrayList);

    }

}