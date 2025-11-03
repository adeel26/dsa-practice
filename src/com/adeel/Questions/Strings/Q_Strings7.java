package com.adeel.Questions.Strings;
// To Lower Case
public class Q_Strings7 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }
    static String toLowerCase(String s) {
        StringBuilder output = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] >= 65 && c[i] <= 90){
                output.append((char)(c[i] + 32));
            }else{
                output.append(c[i]);
            }
        }

        return output.toString();
    }
}

/*
Not Efficient

static String toLowerCase(String s) {
        String output = "";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] >= 65 && c[i] <= 90){
                output = output + (char)(c[i] + 32);
            }else{
                output = output + c[i];
            }
        }

        return output;
    }

 */