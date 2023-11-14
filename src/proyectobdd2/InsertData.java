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
    
    public static void insertarProfesor(int dni_prof, String nombre, String apellido_1, String apellido_2, String direccion, int telefono) {

//        INSERT INTO Profesor (dni_prof, nombre, apellido_1, apellido_2, direccion, telefono)
//        VALUES (1, 'Rafael', 'Andino', 'Pozo', 'Onieva 3', 1);
        
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            String insertarQuery = "INSERT INTO autoescuela_keyspace.Profesor (dni_prof, nombre, apellido_1, apellido_2, direccion, telefono) VALUES (?,?,?,?,?,?);";
            PreparedStatement psInsert = connector.getSession().prepare(insertarQuery);
            BoundStatement bsInsert = psInsert.bind(dni_prof, nombre, apellido_1, apellido_2, direccion, telefono);

            connector.getSession().execute(bsInsert);

            connector.close();

//            System.out.println("SE PUDOOOOOOO!!!!!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("algo malo paso a la hora de intentar insertar");
        }

    }
    
    public static void insertarAlumno(int dni_al, String nombre, String apellido_1, String apellido_2, String direccion, int telefono, String tipo_lic, String coste_et) {

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            String insertarQuery = "INSERT INTO autoescuela_keyspace.Alumno (dni_al, nombre, apellido_1, apellido_2, direccion, telefono, tipo_lic, coste_et) VALUES (?,?,?,?,?,?,?,?);";
            PreparedStatement psInsert = connector.getSession().prepare(insertarQuery);
            BoundStatement bsInsert = psInsert.bind(dni_al, nombre, apellido_1, apellido_2, direccion, telefono, tipo_lic, coste_et);

            connector.getSession().execute(bsInsert);

            connector.close();

//            System.out.println("SE PUDOOOOOOO!!!!!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("algo malo paso a la hora de intentar insertar");
        }

    }



}
