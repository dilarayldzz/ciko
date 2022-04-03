package com.ciko;

public class FirstClass {

    public static void main(String[] args) {

        String str = "Adnan";

        System.out.println("reverse(str) = " + reverse(str));

    }

    public static String reverse (String str){
        String newstr = "";
        for (int i = str.length()-1; i >=0; i--) {
            newstr+=str.charAt(i);

        }

        return newstr;
    }

    public static void adnan (){
        System.out.println("adnan");
    }

}
