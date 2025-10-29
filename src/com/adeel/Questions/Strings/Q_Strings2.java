package com.adeel.Questions.Strings;
// Shuffle String
public class Q_Strings2 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s,indices));
    }
    static String restoreString(String s, int[] indices){
        char[] output = new char[indices.length];
        for (int i = 0; i < s.length(); i++) {
            output[indices[i]] = s.charAt(i);
        }
        return new String(output);
    }
}
