package com.adeel.Questions.Strings;
// Goal Parser Interpretation
public class Q_Strings3 {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
        System.out.println(interpretOptimized(command));
    }
    static String interpret(String command) {
        String output = "";
        char[] c = command.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 'G')
            {
                output = output + 'G';
            }
            if (c[i] == '(' && (i+1) < c.length)
            {
                if(c[i+1] == ')')
                {
                    output = output + 'o';
                    i++; // skip the next ')'  For Optimization
                }
                else if(c[i+1] == 'a')
                {
                    output = output + "al";
                    i = i+3; // skip 'a', 'l', and ')' For Optimization
                }
            }
        }
        return output;
    }

    static String interpretOptimized(String command){
        StringBuilder output = new StringBuilder();
        char[] c = command.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 'G')
            {
                output.append('G');
            }
            if (c[i] == '(' && (i+1) < c.length)
            {
                if(c[i+1] == ')')
                {
                    output.append('o');
                    i++; // skip the next ')'  For Optimization
                }
                else if(c[i+1] == 'a')
                {
                    output.append("al");
                    i = i+3; // skip 'a', 'l', and ')' For Optimization
                }
            }
        }
        return output.toString();
    }
}
