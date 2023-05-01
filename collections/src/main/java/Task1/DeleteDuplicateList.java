package Task1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DeleteDuplicateList {

    // Обратил внимание, что у дубликатов одинаковый Hash
    // LinkedHashSet, чтобы в List вернулся список как и передавали, только без дублей

    public List<String> DeleteDuplicate(List<String> arrayList) {

        Set<String> set = new LinkedHashSet<>(arrayList);

        return new ArrayList<>(set);

    }



}
