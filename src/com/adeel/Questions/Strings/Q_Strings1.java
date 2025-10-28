package com.adeel.Questions.Strings;
// Defanging an IP Address
public class Q_Strings1 {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
        System.out.println(defangIPaddr1(address));
        System.out.println(defangIPaddr2(address));
    }

    static String defangIPaddr(String address){
        return address.replace(".", "[.]");
    }

    // Normal for loop
    static String defangIPaddr1(String address){
        String result = "";
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.'){
                result = result + "[.]";
            }else{
                result = result + address.charAt(i);
            }
        }
        return result;
    }

    // Adv doe loop
    static String defangIPaddr2(String address){
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()){
            if (c == '.'){
                sb.append("[.");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
