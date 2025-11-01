package com.adeel.Questions.Strings;
//Count Items Matching a Rule
import java.util.ArrayList;

public class Q_Strings4 {
    public static void main(String[] args) {
        // Create a list of list
        ArrayList<ArrayList<String>> items = new ArrayList<>();

        // Create inner lists
        ArrayList<String> item1 = new ArrayList<>();
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");

        ArrayList<String> item2 = new ArrayList<>();
        item2.add("computer");
        item2.add("silver");
        item2.add("lenovo");

        ArrayList<String> item3 = new ArrayList<>();
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");

        items.add(item1);
        items.add(item2);
        items.add(item3);

        System.out.println(items);

        String rulekey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, rulekey, ruleValue));

    }

    static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;

        if( ruleKey.equals("type")) index = 0;
        else if (ruleKey.equals("color")) index = 1;
        else if (ruleKey.equals("name")) index = 2;


        for (int row = 0; row < items.size(); row++) {
            if(items.get(row).get(index).equals(ruleValue)){
                count++;
            }
        }


        return count;
    }
}
