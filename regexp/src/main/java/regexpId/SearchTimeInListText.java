package regexpId;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchTimeInListText {

    private final Pattern REGEXP_TIME_PATTERN = Pattern.compile("(?:[0-1][0-9]|2[0-3]):[0-5][0-9]");
    private final List<String> textList;

    protected SearchTimeInListText(List<String> textList) {
        this.textList = textList;
    }

    public void printAndSearchTimeInText() {
        for (String text : textList) {
            Matcher matcher = REGEXP_TIME_PATTERN.matcher(text);
            if (matcher.find()) {
                System.out.println("Найдено время " + matcher.group() + " в тексте: " + text);
            } else {
                System.out.println("Время задано некорректно или не найдено в тексте: " + text);
            }
        }
    }


}
