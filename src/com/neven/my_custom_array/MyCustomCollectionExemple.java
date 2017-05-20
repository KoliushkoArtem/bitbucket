package com.neven.my_custom_array;

public class MyCustomCollectionExemple {
    public static void main(String[] args) {
        MyCustomCollection myCustomArray = new MyCustomCollection();

        System.out.println("Array filling");
        for (int i = 0; i < 20; i++) {
            myCustomArray.add(i);
            System.out.println(myCustomArray);
        }
        System.out.println("Filled array :");
        System.out.println(myCustomArray);
        System.out.println("Remove non exist number");
        myCustomArray.remove(20);
        System.out.println(myCustomArray);
        System.out.println("Remove exist number");
        myCustomArray.remove(99);
        System.out.println(myCustomArray);
        System.out.println("Find non exist number 5");
        System.out.println(myCustomArray.findByMeaning(5));
        System.out.println("Find exist number 91");
        System.out.println(myCustomArray.findByMeaning(91));
        System.out.println("Find max element");
        System.out.println(myCustomArray.findMaxElement());
        System.out.println("Find min element");
        System.out.println(myCustomArray.findMinElement());
        System.out.println("Find mean meaning");
        System.out.println(myCustomArray.findMeanMeaning());
        System.out.println("Find non exist index 25");
        System.out.println(myCustomArray.findByIndex(25));
        System.out.println("Find exist index 0");
        System.out.println(myCustomArray.findByIndex(0));
    }
}
