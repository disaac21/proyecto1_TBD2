package proyectobdd2;

import com.datastax.driver.core.PreparedStatement;

public class InsertData {

    public static void insertar() {
     
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);
            
            String insertar = "INSERT INTO Licencia (tipo_lic) VALUES ('B');";

//            final String createmovieKeySpace = "CREATE KEYSPACE IF NOT EXISTS movies_keypsace WITH "
//                    + "replication = {'class' : 'SimpleStrategy'.´replication_factor' :3}";
//
            PreparedStatement psInsert = connector.getSession().prepare(insertar);
    
//            connector.getSession().execute(insertar);
            connector.close();
            
            
            System.out.println("SE PUDOOOOOOO!!!!!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("algo malo paso a la hora de intentar insertar");
        }
        
    }
}
