package bitlab.askar.Module2.Lesson2.Lab;

public class DatabaseDriverUtil {

    public static Connection getConnection(String url, String dbName, String userName, String password){

        try {

            if (url.equals( "https://bitlab.kz:3306/") && dbName.equals("maindatabase") && userName.equals("root") && password.equals("bitlab2017")){
                return new Connection();
            }else {
                throw new DatabaseIncorrectException();
            }

        }catch (Exception e){
        }

        return null;
    }
}
