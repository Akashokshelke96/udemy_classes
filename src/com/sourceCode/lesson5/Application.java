package com.sourceCode.lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        LinkedHashMap<String, String> dictionary = new LinkedHashMap<String,String>();//if used TreeMap it sorts in natural order
        dictionary.put("akash","need to be best");                                     //that is alphabetical order
        dictionary.put("contagious","easily spreads");
        dictionary.put("awesome","on another level");

//        for(String word: dictionary.keySet()){
//            System.out.println(word);
//
//        }
        for(Map.Entry<String, String> word1:dictionary.entrySet()){
            System.out.println(word1.getKey());
            System.out.println(word1.getValue());
        }
    }
}
