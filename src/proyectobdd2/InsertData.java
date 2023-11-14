package proyectobdd2;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;

public class InsertData {

    public static void insertarLicencia(String licencia) {

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            String insertarQuery = "INSERT INTO autoescuela_keyspace.Licencia (tipo_lic) VALUES (?);";
            PreparedStatement psInsert = connector.getSession().prepare(insertarQuery);
            BoundStatement bsInsert = psInsert.bind(licencia);

            connector.getSession().execute(bsInsert);

            connector.close();

//            System.out.println("SE PUDOOOOOOO!!!!!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("algo malo paso a la hora de intentar insertar");
        }

    }

    public static void insertarVehiculo(String matricula, String marca, String modelo, int cilindrada, 
            String anio_compra, int tarifa, String tipo_lic,
            int dni_prof, String tipo_lujo, String licencia_necesaria) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            String insertarQuery = "INSERT INTO autoescuela_keyspace.Vehiculo (matricula, marca, modelo, cilindrada, anio_compra, tarifa, tipo_lic, dni_prof, tipo_lujo, licencia_necesaria) VALUES (?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement psInsert = connector.getSession().prepare(insertarQuery);
            BoundStatement bsInsert = psInsert.bind(matricula, marca, modelo, cilindrada, anio_compra, tarifa, tipo_lic,
            dni_prof, tipo_lujo, licencia_necesaria);

            connector.getSession().execute(bsInsert);

            connector.close();

//            System.out.println("SE PUDOOOOOOO!!!!!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("algo malo paso a la hora de intentar insertar");
        }
    }
}
