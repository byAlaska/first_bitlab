package bitlab.askar.Module2.Lesson8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {

    private Connection connection;

    public void connect() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bitlab_bd2?useUnicode=true&serverTimezone=UTC","root", ""
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addCar(Car car){
        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO cars (name, weight) " +
                    "VALUES (?, ?)"
            );
            statement.setString(1, car.getName());
            statement.setInt(2, car.getWeight());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Car> getAllCars(){
        ArrayList<Car> carList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM cars");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int weight = resultSet.getInt("weight");
                carList.add(new Car(id, name, weight));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return carList;
    }
    public void deleteCar(int id){
        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "DELETE FROM cars WHERE id = ?"
            );
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
