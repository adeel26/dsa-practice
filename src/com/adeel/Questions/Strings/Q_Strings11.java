package com.adeel.Questions.Strings;
// Robot Return to Origin
public class Q_Strings11 {
    public static void main(String[] args) {
        String moves = "UD";
        Q_Strings11 obj = new Q_Strings11();
        System.out.println(obj.judgeCircle(moves));
    }
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);
            if(ch == 'U'){
                y++;
            }
            else if(ch == 'D'){
                y--;
            }
            else if(ch == 'R'){
                x++;
            }
            else if(ch == 'L'){
                x--;
            }
        }

        return (x == 0 && y==0);
    }
}
