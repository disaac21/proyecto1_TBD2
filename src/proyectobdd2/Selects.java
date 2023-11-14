/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobdd2;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author serli
 */
public class Selects {

    public static void selectProfesores(JTable listarProfesores) {

        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        listarProfesores.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("DNI Profesor");
        model.addColumn("Nombre");
        model.addColumn("Apellido 1");
        model.addColumn("Apellido 2");
        model.addColumn("Direccion");
        model.addColumn("Telefono");

        //Regresa Modelo
        listarProfesores.setModel(model);

        //Llena Datos
        String[] datos = new String[6];

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Profesor";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                datos[0] = rr.getInt("dni_prof") + "";
                datos[1] = rr.getString("nombre");
                datos[2] = rr.getString("apellido_1");
                datos[3] = rr.getString("apellido_2");
                datos[4] = rr.getString("direccion");
                datos[5] = rr.getLong("telefono") + "";

                model.addRow(datos);
            });

            listarProfesores.setModel(model);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

//        try {
//            DBConnector connector = new DBConnector();
//            connector.connectdb("localhost", 9042);
//
//            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Profesor";
//
//            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
//            BoundStatement bsSelect = psSelect.bind();
//            ResultSet rs = connector.getSession().execute(bsSelect);
//
//            rs.forEach(rr -> {
//                System.out.println("------ Profesor ------");
//                System.out.println("dni_prof : " + rr.getInt("dni_prof"));
//                System.out.println("nombre : " + rr.getString("nombre"));
//                System.out.println("apellido_1 : " + rr.getString("apellido_1"));
//                System.out.println("apellido_2 : " + rr.getString("apellido_2"));
//                System.out.println("direccion : " + rr.getString("direccion"));
//                System.out.println("telefono : " + rr.getLong("telefono"));
//                System.out.println("");
//            });
//
//            connector.close();
//
////            dni_prof int PRIMARY KEY,
////            nombre text,
////            apellido_1 text,
////            apellido_2 text,
////            direccion text,
////            telefono bigint
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public static void selectDocencia() {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Docencia";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                System.out.println("------ Docencia ------");
                System.out.println("dni_prof : " + rr.getInt("dni_prof"));
                System.out.println("tipo_lic : " + rr.getString("tipo_lic"));
                System.out.println("matricula : " + rr.getString("matricula"));
                System.out.println("");
            });

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectMatricula() {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Matricula";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                System.out.println("------ Matricula ------");
                System.out.println("n_matricula : " + rr.getInt("n_matricula"));
                System.out.println("doc_presente : " + rr.getString("doc_presente"));
                System.out.println("dni_al : " + rr.getInt("dni_al"));
                System.out.println("dni_prof : " + rr.getInt("dni_prof"));
                System.out.println("tipo_lic : " + rr.getString("tipo_lic"));
                System.out.println("coste_mat : " + rr.getString("coste_mat"));

                System.out.println("");
            });

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ejercicio2() {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.VehiculoByTipoLicTarifa;";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                System.out.println("------ Ejercicio 2 ------");
                System.out.println("tipo_lic : " + rr.getString("tipo_lic"));
                System.out.println("tarifa : " + rr.getInt("tarifa"));
                System.out.println("matricula : " + rr.getString("matricula"));
                System.out.println("anio_compra : " + rr.getDate("anio_compra"));
                System.out.println("cilindrada : " + rr.getInt("cilindrada"));
                System.out.println("dni_prof : " + rr.getInt("dni_prof"));
                System.out.println("licencia_necesaria : " + rr.getString("licencia_necesaria"));
                System.out.println("marca : " + rr.getString("marca"));
                System.out.println("modelo : " + rr.getString("modelo"));
                System.out.println("tipo_lujo : " + rr.getString("tipo_lujo"));
                System.out.println("");
            });

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectVehiculosTarifa(JTable jTable10) {

        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        jTable10.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("Tipo Licencia");
        model.addColumn("Tarifa");
        model.addColumn("Matricula");
        model.addColumn("Marca");
        model.addColumn("Modelo");
        model.addColumn("Tipo de Lujo");

        //Regresa Modelo
        jTable10.setModel(model);

        //Llena Datos
        String[] datos = new String[6];

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.VehiculoByTipoLicTarifa";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                datos[0] = rr.getString("tipo_lic");
                datos[1] = rr.getInt("tarifa") + "";
                datos[2] = rr.getString("matricula");
                datos[3] = rr.getString("marca");
                datos[4] = rr.getString("modelo");
                datos[5] = rr.getString("tipo_lujo");

                model.addRow(datos);
            });

            jTable10.setModel(model);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

//        try {
//            DBConnector connector = new DBConnector();
//            connector.connectdb("localhost", 9042);
//
//            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Vehiculo";
//
//            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
//            BoundStatement bsSelect = psSelect.bind();
//            ResultSet rs = connector.getSession().execute(bsSelect);
//
//            rs.forEach(rr -> {
//                System.out.println("------ Vehiculo ------");
//                System.out.println("matricula : " + rr.getString("matricula"));
//                System.out.println("marca : " + rr.getString("marca"));
//                System.out.println("modelo : " + rr.getString("modelo"));
//                System.out.println("cilindrada : " + rr.getInt("cilindrada"));
//                System.out.println("anio_compra : " + rr.getDate("anio_compra"));
//                System.out.println("tarifa : " + rr.getInt("tarifa"));
//                System.out.println("tipo_lic : " + rr.getString("tipo_lic"));
//                System.out.println("dni_prof : " + rr.getInt("dni_prof"));
//                System.out.println("tipo_lujo : " + rr.getString("tipo_lujo"));
//                System.out.println("licencia_necesaria : " + rr.getString("licencia_necesaria"));
//                System.out.println("");
//            });
//
//            connector.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public static void selectVehiculosProfesor(JTable jTable11) {

        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        jTable11.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("Tipo Licencia");
        model.addColumn("DNI Profesor");
        model.addColumn("Matricula");
        model.addColumn("Marca");
        model.addColumn("Modelo");
        model.addColumn("Tipo de Lujo");

        //Regresa Modelo
        jTable11.setModel(model);

        //Llena Datos
        String[] datos = new String[6];

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.VehiculoByTipoLicTarifa";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                datos[0] = rr.getString("tipo_lic");
                datos[1] = rr.getInt("dni_prof") + "";
                datos[2] = rr.getString("matricula");
                datos[3] = rr.getString("marca");
                datos[4] = rr.getString("modelo");
                datos[5] = rr.getString("tipo_lujo");

                model.addRow(datos);
            });

            jTable11.setModel(model);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

//        try {
//            DBConnector connector = new DBConnector();
//            connector.connectdb("localhost", 9042);
//
//            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Vehiculo";
//
//            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
//            BoundStatement bsSelect = psSelect.bind();
//            ResultSet rs = connector.getSession().execute(bsSelect);
//
//            rs.forEach(rr -> {
//                System.out.println("------ Vehiculo ------");
//                System.out.println("matricula : " + rr.getString("matricula"));
//                System.out.println("marca : " + rr.getString("marca"));
//                System.out.println("modelo : " + rr.getString("modelo"));
//                System.out.println("cilindrada : " + rr.getInt("cilindrada"));
//                System.out.println("anio_compra : " + rr.getDate("anio_compra"));
//                System.out.println("tarifa : " + rr.getInt("tarifa"));
//                System.out.println("tipo_lic : " + rr.getString("tipo_lic"));
//                System.out.println("dni_prof : " + rr.getInt("dni_prof"));
//                System.out.println("tipo_lujo : " + rr.getString("tipo_lujo"));
//                System.out.println("licencia_necesaria : " + rr.getString("licencia_necesaria"));
//                System.out.println("");
//            });
//
//            connector.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
    
    public static void selectAlumnos(JTable jTable1) {
        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        jTable1.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("DNI Alumno");
        model.addColumn("Nombre");
        model.addColumn("Apellido 1");
        model.addColumn("Apellido 2");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Tipo de Licencia");
        model.addColumn("Coste ET");

        //Regresa Modelo
        jTable1.setModel(model);

        //Llena Datos
        String[] datos = new String[8];

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Alumno";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                datos[0] = rr.getInt("dni_al") + "";
                datos[1] = rr.getString("nombre");
                datos[2] = rr.getString("apellido_1");
                datos[3] = rr.getString("apellido_2");
                datos[4] = rr.getString("direccion");
                datos[5] = rr.getLong("telefono") + "";
                datos[6] = rr.getString("tipo_lic");
                datos[7] = rr.getString("coste_et");

                model.addRow(datos);
            });

            jTable1.setModel(model);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
//        try {
//            DBConnector connector = new DBConnector();
//            connector.connectdb("localhost", 9042);
//
//            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Alumno";
//
//            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
//            BoundStatement bsSelect = psSelect.bind();
//            ResultSet rs = connector.getSession().execute(bsSelect);
//
//            rs.forEach(rr -> {
//                System.out.println("------ Alumno ------");
//                System.out.println("dni_al : " + rr.getInt("dni_al"));
//                System.out.println("nombre : " + rr.getString("nombre"));
//                System.out.println("apellido_1 : " + rr.getString("apellido_1"));
//                System.out.println("apellido_2 : " + rr.getString("apellido_2"));
//                System.out.println("direccion : " + rr.getString("direccion"));
//                System.out.println("telefono : " + rr.getLong("telefono"));
//                System.out.println("tipo_lic : " + rr.getString("tipo_lic"));
//                System.out.println("coste_et : " + rr.getString("coste_et"));
//                System.out.println("");
//            });
//
//            connector.close();
//
////            dni_al int PRIMARY KEY,
////            nombre text,
////            apellido_1 text,
////            apellido_2 text,
////            direccion text,
////            telefono bigint,
////            tipo_lic text,
////            coste_et text
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public static void selectLicencias(JTable jTable8) {
        
        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        jTable8.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("Tipo de Licencia");

        //Regresa Modelo
        jTable8.setModel(model);

        //Llena Datos
        String[] datos = new String[1];

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Alumno";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                datos[0] = rr.getString("tipo_lic");

                model.addRow(datos);
            });

            jTable8.setModel(model);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
//        try {
//            DBConnector connector = new DBConnector();
//            connector.connectdb("localhost", 9042);
//
//            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Licencia";
//
//            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
//            BoundStatement bsSelect = psSelect.bind();
//            ResultSet rs = connector.getSession().execute(bsSelect);
//
//            rs.forEach(rr -> {
//                System.out.println("------ Licencia ------");
//                System.out.println("tipo_lic : " + rr.getString("tipo_lic"));
//                System.out.println("");
//            });
//
//            connector.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
