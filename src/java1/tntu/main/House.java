package java1.tntu.main;

import java.util.*;

public class House {
    public static void main(String[] args) {
        Wisskas wisskas= new Wisskas();
        ScotlandCat Markiz =  new ScotlandCat("Markiz, apex cat ", 5);
        System.out.println("Lab4");
        Markiz.eat(wisskas);
        System.out.println();

                List<ScotlandCat> catList = new ArrayList<>();

                ScotlandCat cat1 = new ScotlandCat("Markiz", 11);
                ScotlandCat cat2 = new ScotlandCat("Markiza", 9);
                ScotlandCat cat3 = new ScotlandCat("Alice", 5);
                ScotlandCat cat4 = new ScotlandCat("Arc", 2);
                ScotlandCat cat5 = new ScotlandCat("Arc", 2);

                catList.add(cat1);
                catList.add(cat2);
                catList.add(cat3);
                catList.add(cat4);
                catList.add(cat5);

                System.out.println("Lab6");
                System.out.println("Name sort: ");

                Collections.sort(catList, new Comparator<ScotlandCat>() {
                    @Override
                    public int compare(ScotlandCat cat1, ScotlandCat cat2) {
                        return cat1.getName().compareTo(cat2.getName());
                    }
                });
                for (ScotlandCat cat : catList){
                    System.out.println(cat);
                }

                System.out.println();
                System.out.println("Age sort: ");

                Collections.sort(catList, new Comparator<ScotlandCat>() {
                    @Override
                    public int compare(ScotlandCat cat1, ScotlandCat cat2) {
                        return Integer.compare(cat1.getAge(), cat2.getAge());
                    }
                });
                for (ScotlandCat cat : catList){
                    System.out.println(cat);
                }

                System.out.println();
                System.out.println("NO DUBLICATE:");
                Set<ScotlandCat> ucat = new HashSet<>(catList);
                for(ScotlandCat cat : ucat){
                    System.out.println(cat);
                }
            }
        }
