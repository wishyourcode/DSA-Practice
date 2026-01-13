package arraylist;

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        // creating of the Arraylist
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        ArrayList<Float> list4 = new ArrayList<>();
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

        // add elements
        list1.add(5);
        list1.add(12);
        list1.add(51);
        list1.add(45);
        list1.add(6);
        System.out.println(list1);
        list2.add("vishal");
        list2.add("Mishra");
        System.out.println(list2);
        list3.add(true);
        list3.add(10 > 20);
        list3.add(10 == 20);
        list3.add(null);
        System.out.println(list3);
        list4.add(2.3f);
        list4.add(5.3f);
        list4.add(2.2f);
        list4.add(55.9f);
        System.out.println(list4);

        // add elements
        int data1 = list1.getFirst();
        int data2 = list1.getLast();
        int data3 = list1.get(3);
        int data4 = list1.get(2);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);
        list2.add(1, "Piyush");// first is the index and second is the element to be added
        System.out.println(list2);

        // set element
        list3.set(2, true);
        System.out.println(list3);

        // delete elements
        list1.remove(1);
        System.out.println(list1);

        // size of the list
        int size = list1.size();
        System.out.println(size);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list4.get(i) + " ");
        }
    }

}