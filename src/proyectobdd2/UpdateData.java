/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobdd2;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.LocalDate;
import com.datastax.driver.core.PreparedStatement;

/**
 *
 * @author serli
 */
public class UpdateData {

    public static void updateLicencia(String vieja, String nueva) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String updateQuery = "UPDATE autoescuela_keyspace.Licencia SET tipo_lic= ? WHERE "
                    + "tipo_lic= ?;";

            PreparedStatement psUpdate = connector.getSession().prepare(updateQuery);
            BoundStatement bsUpdate = psUpdate.bind(vieja, nueva);
            connector.getSession().execute(bsUpdate);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateVehiculo(String matricula, String marca, String modelo, int cilindrada,
            String dateString, int tarifa, String tipo_lic,
            int dni_prof, String tipo_lujo, String licencia_necesaria) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            int year = Integer.parseInt(dateString.substring(0, 4));
            int month = Integer.parseInt(dateString.substring(5, 7));
            int day = Integer.parseInt(dateString.substring(8, 10));

            LocalDate currentDate = LocalDate.fromYearMonthDay(year, month, day);

            final String updateQuery = "UPDATE autoescuela_keyspace.Vehiculo SET marca= ?, modelo= ?, cilindrada= ?, anio_compra= ?, tarifa= ?, tipo_lic= ?, dni_prof= ?, tipo_lujo= ?, licencia_necesaria= ? WHERE "
                    + "matricula= ?;";

            PreparedStatement psUpdate = connector.getSession().prepare(updateQuery);
            BoundStatement bsUpdate = psUpdate.bind(marca, modelo, cilindrada, currentDate, tarifa, tipo_lic,
                    dni_prof, tipo_lujo, licencia_necesaria, matricula);
            connector.getSession().execute(bsUpdate);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void updateAlumno(int dni_al, String nombre, String apellido_1, String apellido_2, String direccion, long telefono, String tipo_lic, String coste_et) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String updateQuery = "UPDATE autoescuela_keyspace.Alumno SET nombre= ?, apellido_1= ?, apellido_2= ?, direccion= ?, telefono= ?, tipo_lic= ?, coste_et= ? WHERE "
                    + "dni_al= ?;";

            PreparedStatement psUpdate = connector.getSession().prepare(updateQuery);
            BoundStatement bsUpdate = psUpdate.bind(nombre, apellido_1, apellido_2, direccion, telefono, tipo_lic, coste_et, dni_al);
            connector.getSession().execute(bsUpdate);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void updateProfesor(int dni_prof, String nombre, String apellido_1, String apellido_2, String direccion, long telefono) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String updateQuery = "UPDATE autoescuela_keyspace.Profesor SET nombre= ?, apellido_1= ?, apellido_2= ?, direccion= ?, telefono= ? WHERE "
                    + "dni_prof= ?;";

            PreparedStatement psUpdate = connector.getSession().prepare(updateQuery);
            BoundStatement bsUpdate = psUpdate.bind(   nombre,  apellido_1,  apellido_2,  direccion, telefono, dni_prof);
            connector.getSession().execute(bsUpdate);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
