import java.util.*;
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() != 0){
            if (s.charAt(0)=='-' || s.charAt(0) == '+'){
                return Integer.parseInt(String.valueOf(func(s.substring(1,s.length()),0, s.charAt(0))));
        }
        }
        return func(s,1, '+');
    }
    public int func(String s, Integer flag, char p){
        String s2 = "";
        for(int i = 0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                s2 += s.charAt(i);
            }else{
                break;
            }
        }
        if(s2 == ""){
            s2 = "0";
        }
        try{
            return (flag == 0 && p == '-') ? -Integer.parseInt(s2.toString()) : Integer.parseInt(s2.toString());

        }
        catch(NumberFormatException e){
            return (flag == 0 && p == '-') ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
