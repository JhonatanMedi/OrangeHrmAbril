package Orange.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDataBase {

    private ConectionDataBase conectionDataBase;

    public InsertDataBase() {
        this.conectionDataBase = new ConectionDataBase();
    }

    public static void insertEmployee(String firstName, String middleName, String lastName) {
        Connection testCon = ConectionDataBase.getConnection();
        String insertSql = "INSERT INTO newEmployees(firstName,middleName,lastName) VALUES" +
                "('" + firstName + " ','" + middleName + " ','" + lastName + "')";

        ResultSet rst = null;

        try(Connection connection = ConectionDataBase.getConnection();
            PreparedStatement prepsInsert = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);){

            prepsInsert.execute();
        }catch (Exception e){
           e.printStackTrace();
        }
    }
}
