package bitlab.askar.Module2.Lesson2.Lab;

public class Main {
    public static void main(String[] args){

        Connection connection = DatabaseDriverUtil.getConnection("adsf","saf","as","asf");
        System.out.println(connection.getUsersList().toString());

    }

}
