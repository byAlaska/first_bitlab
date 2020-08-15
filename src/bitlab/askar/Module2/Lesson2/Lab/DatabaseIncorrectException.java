package bitlab.askar.Module2.Lesson2.Lab;

public class DatabaseIncorrectException extends Exception {

    @Override
    public String getMessage() {
        return "Java Connection Exception at DatabaseDriver caused by incorrect data…";
    }
}
