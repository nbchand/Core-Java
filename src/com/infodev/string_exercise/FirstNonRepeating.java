/*
72.Write a Java program to find the first non-repeating character from a stream of
characters.
 */
package com.infodev.string_exercise;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class FirstNonRepeating {
    private final static int MAX_CHAR = 256;

    public static void findFirstNonRepeating() {
        // inDLL[x] contains pointer to a DLL node if x is
        // present in DLL. If x is not present, then
        // inDLL[x] is NULL
        List<Character> inDLL = new ArrayList<Character>();

        // repeated[x] is true if x is repeated two or more
        // times. If x is not seen so far or x is seen only
        // once. then repeated[x] is false
        boolean[] repeated = new boolean[MAX_CHAR];

        // Let us consider following stream and see the
        // process
        String stream = "helloeveryone";
        for (int i = 0; i < stream.length(); i++) {
            char x = stream.charAt(i);

            // We process this character only if it has not
            // occurred or occurred only once. repeated[x]
            // is true if x is repeated twice or more.s
            if (!repeated[x]) {
                // If the character is not in DLL, then add
                // this at the end of DLL.
                if (!(inDLL.contains(x))) {
                    inDLL.add(x);
                } else // Otherwise remove this character from
                // DLL
                {
                    inDLL.remove((Character) x);
                    repeated[x] = true; // Also mark it as repeated
                }
            }

            // Print the current first non-repeating
            // character from stream
            if (inDLL.size() != 0) {
                System.out.print("First non-repeating character so far is ");
                System.out.println(inDLL.get(0));
            }
        }
    }

    public static void performTask() {
        findFirstNonRepeating();
    }
}
