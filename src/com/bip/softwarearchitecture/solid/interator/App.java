package com.bip.softwarearchitecture.solid.interator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println(name);
        }

        String[] myNames = {"Kkaaa", "kikiki", "Hoho"};
        for (java.util.Iterator<String> iter = Arrays.stream(myNames).iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println(name);
        }

        ArrayList<String> listName = new ArrayList<>();
        listName.add("Tuan");
        listName.add("Tuan1");
        listName.add("Tuan2");
        listName.add("Tuan3");



        listName.removeIf(s -> s.equals("Tuan2"));


        for (String item : listName) {
            System.out.println(item);
        }



/*        for (java.util.Iterator<String> iter = listName.iterator(); iter.hasNext(); ) {
            String name = iter.next();
            System.out.println(name);
            System.out.println("Size: " + listName.size());
            if (name.equals("Tuan2")) {
                iter.remove();
            }
            System.out.println("Size: " + listName.size());
        }*/

    }
}
