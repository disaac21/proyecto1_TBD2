/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobdd2;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;
/**
 *
 * @author serli
 */
public class DeleteData {

    public static void deleteLicencia(String id) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String deleteQuery = "DELETE FROM autoescuela_keyspace.Licencia WHERE tipo_lic=?";

            PreparedStatement psDelete = connector.getSession().prepare(deleteQuery);
            BoundStatement bsDelete = psDelete.bind(id);
            connector.getSession().execute(bsDelete);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteVehiculo(String matricula) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String deleteQuery = "DELETE FROM autoescuela_keyspace.Vehiculo WHERE matricula=?";

            PreparedStatement psDelete = connector.getSession().prepare(deleteQuery);
            BoundStatement bsDelete = psDelete.bind(matricula);
            connector.getSession().execute(bsDelete);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteProfesor(int dni_prof) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String deleteQuery = "DELETE FROM autoescuela_keyspace.Profesor WHERE dni_prof=?";

            PreparedStatement psDelete = connector.getSession().prepare(deleteQuery);
            BoundStatement bsDelete = psDelete.bind(dni_prof);
            connector.getSession().execute(bsDelete);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteAlumno(int id) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String deleteQuery = "DELETE FROM autoescuela_keyspace.Alumno WHERE dni_al=?";

            PreparedStatement psDelete = connector.getSession().prepare(deleteQuery);
            BoundStatement bsDelete = psDelete.bind(id);
            connector.getSession().execute(bsDelete);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
