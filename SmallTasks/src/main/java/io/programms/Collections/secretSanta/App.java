package io.programms.Collections.secretSanta;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.*;

public class App {

    public static void main(String[] args) {
        System.out.println("Текущие участники на дарение подарков:");
        getEntities().forEach(System.out::println);
        System.out.println("Назначенные пары (Первый -> Второму ... Последний -> Первому):");
        getPairsOfPersons(getEntities()).entrySet().forEach(System.out::println);

    }

    public static Map<Person, Person> getPairsOfPersons(Set<Person> persons) {
        Map<Person, Person> pairs = new HashMap<>();
        persons.forEach((key) -> pairs.put(key, null));

        List<Person> listOfPersons = new ArrayList<>(pairs.keySet());
        Collections.shuffle(listOfPersons);

        for (var pair: pairs.entrySet()) {
            Person personKey = pair.getKey();

            Person currentPerson = null;

            for (var personValue: listOfPersons) {
                if (!personKey.getId().equals(personValue.getId())) {
                    pairs.put(personKey, personValue);
                    currentPerson = personValue;
                    break;
                }
            }
            listOfPersons.remove(currentPerson);

        }
        return pairs;
    }

    private static Set<Person> getEntities() {

        String[] names = {"Alex","Sasha","Maxim","John","Nikolay","Jack"};
        int[] ids = new int[names.length];
        Random rn = new Random();
        int maximum = names.length;
        int minimum = 1;
        int count = 0;

        while (ArrayUtils.contains(ids, 0)) {
            int randomNum = rn.nextInt(maximum - minimum + 1) + minimum;
            if(ids[count] == 0 && !ArrayUtils.contains(ids, randomNum)) {
                ids[count] = randomNum;
            }
            count++;
            if (count == ids.length) {
                count = 0;
            }
        }

        Set<Person> persons = new HashSet<>();
        count = 0;
        for (String name: names) {
            persons.add(new Person(ids[count], name));
            count++;
        }
        return persons;
    }
}
