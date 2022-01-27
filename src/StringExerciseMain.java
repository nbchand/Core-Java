import com.infodev.string_exercise.CheckEqual;
import com.infodev.string_exercise.LastChar;

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
    }
}
