package com.adeel.Questions.Strings;
// Decrypt String from Alphabet to Integer Mapping
// Tricky
public class Q_Strings9 {
    public static void main(String[] args) {
        String s = "10#11#12";

        Q_Strings9 obj = new Q_Strings9();
        System.out.println(obj.freqAlphabets(s));

    }
    public String freqAlphabets(String s) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < s.length();) {
            if(i + 2 < s.length() && s.charAt(i+2) == '#'){
                // take two digits before #
                int num = Integer.parseInt(s.substring(i, i+2));
                output.append((char)('a' + num - 1));
                i = i+3; // Skip two digits plus #
            }else{
                int num = s.charAt(i) - '0';
                output.append((char)('a' + num -1));
                i++;
            }
        }


        return output.toString();
    }
}
