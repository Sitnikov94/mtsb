package regexpId;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> textList = Arrays.asList(
                "Сейчас 23:59",
                "Буду дома в 00:00",
                "01:33 время возвращения домой",
                "Не бывает время 25:00",
                "Надо же, такое бывает",
                "А что если ошибка во времени 14;00",
                "И 25:69 не бывает",
                "15:30");

        SearchTimeInListText printTimeInText = new SearchTimeInListText(textList);

        printTimeInText.printAndSearchTimeInText();
    }

}