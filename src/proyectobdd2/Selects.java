/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobdd2;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;

/**
 *
 * @author serli
 */
public class Selects {
    public static void selectVehiculos(){
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM movies_keyspace.Vehiculos";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind("Fast Five", 2012);
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                System.out.println("matricula : " + rr.getString("matricula"));
                System.out.println("marca : " + rr.getString("marca"));
                System.out.println("modelo : " + rr.getString("modelo"));
                System.out.println("cilindrada : " + rr.getString("cilindrada"));
                System.out.println("anio_compra : " + rr.getString("anio_compra"));
                System.out.println("tipo_lic : " + rr.getString("tipo_lic"));
                System.out.println("dni_prof : " + rr.getString("dni_prof"));
                System.out.println("tipo_lujo : " + rr.getString("tipo_lujo"));
                System.out.println("licencia_necesaria : " + rr.getString("licencia_necesaria"));
            });

            connector.close();
            
//            matricula text PRIMARY KEY,
//            marca text,
//            modelo text,
//            cilindrada int,
//            anio_compra date,
//            tarifa int,
//            tipo_lic text,
//            dni_prof int,
//            tipo_lujo text,
//            licencia_necesaria text

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void selectProfesor(){
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM movies_keyspace.Vehiculos";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind("Fast Five", 2012);
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                System.out.println("matricula : " + rr.getString("matricula"));
                System.out.println("marca : " + rr.getString("marca"));
                System.out.println("modelo : " + rr.getString("modelo"));
                System.out.println("cilindrada : " + rr.getString("cilindrada"));
                System.out.println("anio_compra : " + rr.getString("anio_compra"));
                System.out.println("tipo_lic : " + rr.getString("tipo_lic"));
                System.out.println("dni_prof : " + rr.getString("dni_prof"));
                System.out.println("tipo_lujo : " + rr.getString("tipo_lujo"));
                System.out.println("licencia_necesaria : " + rr.getString("licencia_necesaria"));
            });

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
