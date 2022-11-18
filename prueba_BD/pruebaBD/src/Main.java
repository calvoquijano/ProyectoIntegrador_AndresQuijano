import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        Connection connection = DriverManager.getConnection("jdbc:h2:~/h2-database-dentist-consult","sa","sa");
        Statement stTest = connection.createStatement();
        String SQL_TABLE_PATIENT = "DROP TABLE IF EXISTS " +
                "PATIENT; CREATE TABLE PATIENT (FIRSTNAME VARCHAR(120) NOT NULL,"+
                "LASTNAME VARCHAR(120) NOT NULL,"+
                "EMAIL VARCHAR(300) NOT NULL," +
                "PASSWORD VARCHAR(20) NOT NULL," +
                "ROLE_ADMIN VARCHAR(5) NOT NULL," +
                "ID INT NOT NULL PRIMARY KEY," +
                "ADDRESS_ID INT NOT NULL," +
                "DISCHARGE_DATE VARCHAR(30) NOT NULL" +
                ")";
        stTest.execute(SQL_TABLE_PATIENT);
        String TABLE_INSERT = "INSERT INTO PATIENT (FIRSTNAME,LASTNAME,EMAIL,PASSWORD,ROLE_ADMIN,ID,ADDRESS_ID,DISCHARGE_DATE) VALUES ('Andres','Quijano','calvo@calvoquijano','123456789','False',80794136,'1','2022-11-11')";
        stTest.execute(TABLE_INSERT);

    }
}