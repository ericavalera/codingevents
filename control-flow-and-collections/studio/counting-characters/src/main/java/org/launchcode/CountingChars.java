package org.launchcode;

import java.util.HashMap;

public class CountingChars{
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense" +
                " says at least one of the two terms has to be zero to start with." +
                " So if you move all the terms over to one side, you can put the" +
                " quadratics into a form that can be factored allowing that side" +
                " of the equation to equal zero. Once you’ve done that, it’s pretty" +
                " straightforward from there.";

        //converts quote into character array
        char[] stringCharacters = quote.toCharArray();
        HashMap<Character, Integer> charCounter = new HashMap<>();
//        iterates through HashMap key/values
        for (char i : stringCharacters) {
//            checking for character keys
            if (charCounter.containsKey(i)) {
//                adding value +1 for each instance
                charCounter.put(i, charCounter.get(i) + 1);
            } else {
                charCounter.put(i, 1);
            }
        }
        System.out.println(charCounter);
    }
}
