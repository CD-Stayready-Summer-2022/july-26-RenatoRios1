package com.codedifferently;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for(int i = 0;  i < input.length(); i++){
            if(!treeMap.containsKey(input.charAt(i))){
                treeMap.put(input.charAt(i), 1);
            }else{
                treeMap.put(input.charAt(i), treeMap.get(input.charAt(i))+1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<Character, Integer> entry:  treeMap.entrySet()){
            stringBuilder.append(String.format("%c:%d ", entry.getKey(), entry.getValue()));
        }
        return stringBuilder.substring(0, stringBuilder.length()-1);

    }
}
