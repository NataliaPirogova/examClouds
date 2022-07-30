package com.tasks.lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void replacing(String str){
        String s1 = "o?O?bject-oriented programming";
        String s2 = "OOP";
        int count=0;
        Pattern pattern = Pattern.compile(s1);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            count++;
            if(count%2==0){
                str=str.replace(s1,s2);
            }
        }
    }

    public static void main(String[] args) {
        String string = "Object-oriented programming is a programming language model organized around objects rather than actions and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
    replacing(string);
        System.out.println(string);
    }
}
