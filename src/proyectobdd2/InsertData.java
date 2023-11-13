package proyectobdd2;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;

public class InsertData {

    public static void insertar() {

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            String insertarQuery = "INSERT INTO autoescuela_keyspace.Licencia (tipo_lic) VALUES (?);";
            PreparedStatement psInsert = connector.getSession().prepare(insertarQuery);
            BoundStatement bsInsert = psInsert.bind("B");
            
            connector.getSession().execute(bsInsert);

            connector.close();

            System.out.println("SE PUDOOOOOOO!!!!!");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("algo malo paso a la hora de intentar insertar");
        }

    }
}
