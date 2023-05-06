package Orange.DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultDataBase {

    private ConectionDataBase conectionDataBase;

    public ConsultDataBase() {
        this.conectionDataBase = new ConectionDataBase();
    }

    public static void consultUsers() throws SQLException {
        Connection testCon = ConectionDataBase.getConnection();
        if (testCon != null) {
            System.out.println("Conecto");
            Statement stm = testCon.createStatement();
            ResultSet rst = stm.executeQuery("Select * From [Users]");
            while (rst.next()){
                System.out.println("User:" +rst.getString(1) +rst.getString(2));
            }
        }else{
            System.out.println("No Conecto");
        }
    }
}
