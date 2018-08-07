package com.dylan;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Dylan");
        for (int i = 0; i < strArrayList.size(); i++) {
            System.out.println(strArrayList.get(i));
        }
        for (String strItem : strArrayList) {
            System.out.println(strItem);
        }

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        intArrayList.add(5);
        for (int j = 0; j < intArrayList.size(); j++) {
            System.out.println(intArrayList.get(j));
        }
        for (int intItem : intArrayList) {
            System.out.println(intItem);
        }

        ArrayList<Double> dblArrayList = new ArrayList<Double>();
        dblArrayList.add(23.2);
        for (int k = 0; k < dblArrayList.size(); k++) {
            System.out.println(dblArrayList.get(k));
        }
        for (double dblItem : dblArrayList) {
            System.out.println(dblItem);
        }
    }
}
