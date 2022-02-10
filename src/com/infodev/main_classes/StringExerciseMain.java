package com.infodev.main_classes;

import com.infodev.array_exercise.DifferentCharacters;
import com.infodev.string_exercise.*;

/**
 * A single main class for all the classes inside com.infodev.string_exercise package
 * @author Narendra
 * @version 1.0
 * @since 1/27/2022
 */
public class StringExerciseMain {
    /**
     * Runs all the static performTask() methods inside all the classes present in com.infodev.string_exercise package
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        //Q.N. 1)
        LastChar.performTask("Hello");
        //Q.N. 2)
        CheckEqual.performTask();
        //Q.N. 3)
        StringToArray.performTask();
        //Q.N. 4)
        StringReverse.performTask();
        //Q.N. 5)
        WhiteSpaceNumbers.performTask("Hello world  ");
        //Q.N. 6)
        UpperAndLowerCase.performTask("A Quick Brown Fox");
        //Q.N. 7)
        SpecialCharacterFind.performTask();
        //Q.N. 8)
        ConvertCase.performTask();
        //Q.N. 9)
        StringArrayLength.performTask();
        //Q.N. 10)
        SortArrayByLength.performTask();
        //Q.N. 11)
        AlphabeticSort.performTask();
        //Q.N. 12)
        OrangeInString.performTask();
        //Q.N. 13)
        FirstAndLastOccurrence.performTask();
        //Q.N. 14)
        DifferentCharacters.performTask();
        //Q.N. 15)
        ConsonantReplacement.performTask();
        //Q.N. 16)
        Epresent.performTask();
        //Q.N. 17)
        LifePresent.performTask();
        //Q.N. 18)
        LastIndex.performTask();
        //Q.N. 20)
        CreateNewString.performTask();
        //Q.N. 22)
        CharAtEven.performTask();
        //Q.N. 23)
        StringContainsAnotherString.performTask();
        //Q.N. 24)
        DigitsOnly.performTask();
        //Q.N. 25)
        RemoveChar.performTask();
        //Q.N. 26)
        StringConcat.performTask();
    }
}
