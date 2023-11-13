package proyectobdd2;

public class CreateKeySpace {

    public static void main(String[] args) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String createmovieKeySpace = "CREATE KEYSPACE IF NOT EXISTS movies_keypsace WITH "
                    + "replication = {'class' : 'SimpleStrategy'.´replication_factor' :3}";

            connector.getSession().execute(createmovieKeySpace);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
