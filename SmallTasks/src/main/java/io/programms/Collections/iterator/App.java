package io.programms.Collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) {
        List<String> states = new ArrayList<>();
        states.add("Germany");
        states.add("Spain");
        states.add("Russia");
        states.add("France");

        Iterator<String> iter = states.iterator();

        List<String> statesNew = new ArrayList<>(states);

        ListIterator<String> iterList = statesNew.listIterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
            iter.remove();
            System.out.println(states);
        }

        while (iterList.hasNext()) {
            System.out.println(iterList.next());
        }
        while (iterList.hasPrevious()) {
            System.out.println(iterList.previous());
        }

    }
}
