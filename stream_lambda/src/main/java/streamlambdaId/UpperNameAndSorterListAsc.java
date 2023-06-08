package streamlambdaId;

import streamlambdaId.members.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UpperNameAndSorterListAsc {

    private final List<Human> members;
    private final Predicate<Human> membersSex;
    private final Predicate<Human> orderThan;

    protected UpperNameAndSorterListAsc(List<Human> members, Predicate<Human> membersSex, Predicate<Human> orderThan) {
        this.members = members;
        this.membersSex = membersSex;
        this.orderThan = orderThan;
    }

    public List<String> UpperSorterListMembers() {

        List<String> newUpperSorterListMembers = members.stream()
                .filter(membersSex.and(orderThan))
                .map(Human -> Human.getName().toUpperCase())
                .sorted()
                .toList();

        return new ArrayList<>(newUpperSorterListMembers);
    }
}
