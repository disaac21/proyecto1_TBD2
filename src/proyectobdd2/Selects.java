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

    // 1
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

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Licencia";

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

    }

    // 2
    public static void selectDocencia(JTable jTable3) {
        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        jTable3.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("DNI Profesor");
        model.addColumn("Tipo de Licencia");

        //Regresa Modelo
        jTable3.setModel(model);

        //Llena Datos
        String[] datos = new String[3];

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Docencia";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                datos[0] = rr.getInt("dni_prof") + "";
                datos[1] = rr.getString("tipo_lic");

                model.addRow(datos);
            });

            jTable3.setModel(model);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        
    // 3
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

    }

    // 4
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

    }

    // 5
    public static void selectMatricula(JTable jTable4) {

        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        jTable4.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("No. Matricula");
        model.addColumn("Documentacion Presente");
        model.addColumn("DNI Alumno");
        model.addColumn("DNI Profesor");
        model.addColumn("Tipo Licencia");
        model.addColumn("Coste Matricula");

        //Regresa Modelo
        jTable4.setModel(model);

        //Llena Datos
        String[] datos = new String[6];

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Matricula";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                datos[1] = rr.getInt("n_matricula") + "";
                datos[0] = rr.getBool("doc_presente") + "";
                datos[2] = rr.getInt("dni_al") + "";
                datos[3] = rr.getInt("dni_prof") + "";
                datos[4] = rr.getString("tipo_lic");
                datos[4] = rr.getString("coste_mat");

                model.addRow(datos);
            });

            jTable4.setModel(model);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 6
    public static void selectDocLic(JTable jTable5) {

        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        jTable5.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("Tipo Licencia");
        model.addColumn("Nombre Documentacion");

        //Regresa Modelo
        jTable5.setModel(model);

        //Llena Datos
        String[] datos = new String[2];

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.D_L";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                datos[0] = rr.getString("tipo_lic");
                datos[1] = rr.getString("nombre_doc");

                model.addRow(datos);
            });

            jTable5.setModel(model);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 7
    public static void selectConsumo(JTable jTable6) {

        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        jTable6.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("Matricula");
        model.addColumn("No. Matricula");
        model.addColumn("Fecha Practica");
        model.addColumn("Kilometros");
        model.addColumn("Litros");

        //Regresa Modelo
        jTable6.setModel(model);

        //Llena Datos
        String[] datos = new String[5];

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Consumo";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                datos[0] = rr.getString("matricula");
                datos[1] = rr.getInt("n_matricula") + "";
                datos[2] = rr.getDate("fecha_practica") + "";
                datos[3] = rr.getInt("kilometros") + "";
                datos[4] = rr.getInt("litros") + "";

                model.addRow(datos);
            });

            jTable6.setModel(model);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 9
    public static void selectPago(JTable jTable7) {

        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        jTable7.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("No. Pago");
        model.addColumn("No. Matricula");
        model.addColumn("Importe");

        //Regresa Modelo
        jTable7.setModel(model);

        //Llena Datos
        String[] datos = new String[3];

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Pago";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                datos[0] = rr.getInt("n_pago") + "";
                datos[1] = rr.getInt("n_matricula") + "";
                datos[2] = rr.getInt("importe") + "";

                model.addRow(datos);
            });

            jTable7.setModel(model);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 10
    public static void selectExamen(JTable jTable9) {

        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        jTable9.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("Fecha Examen");
        model.addColumn("No. Matricula");
        model.addColumn("Fecha Tramitacion");
        model.addColumn("Tipo Examen");
        model.addColumn("Duracion");
        model.addColumn("Errores");

        //Regresa Modelo
        jTable9.setModel(model);

        //Llena Datos
        String[] datos = new String[6];

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Examen";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                datos[0] = rr.getDate("fecha_examen") + "";
                datos[1] = rr.getInt("n_matricula") + "";
                datos[2] = rr.getDate("fecha_tramitacion") + "";
                datos[3] = rr.getString("tipo_examen");
                datos[4] = rr.getInt("duracion") + "";
                datos[5] = rr.getInt("errores") + "";

                model.addRow(datos);
            });

            jTable9.setModel(model);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    
    //Show Vehiculos
    public static void selectVehiculosFull(JTable eliminarVehiculo) {

        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        eliminarVehiculo.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("Matricula");
        model.addColumn("Marca");
        model.addColumn("Modelo");
        model.addColumn("Cilindrada");
        model.addColumn("Anio Compra");
        model.addColumn("Tarifa");
        model.addColumn("Tipo Licencia");
        model.addColumn("DNI Profesor");
        model.addColumn("Tipo de Lujo");

        //Regresa Modelo
        eliminarVehiculo.setModel(model);

        //Llena Datos
        String[] datos = new String[9];

        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM autoescuela_keyspace.Vehiculo";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind();
            ResultSet rs = connector.getSession().execute(bsSelect);

            rs.forEach(rr -> {
                datos[0] = rr.getString("matricula");
                datos[1] = rr.getString("marca");
                datos[2] = rr.getString("modelo");
                datos[3] = rr.getInt("cilindrada") + "";
                datos[4] = rr.getDate("anio_compra") + "";
                datos[5] = rr.getInt("tarifa") + "";
                datos[6] = rr.getString("tipo_lic");
                datos[7] = rr.getInt("dni_prof") + "";
                datos[8] = rr.getString("tipo_lujo");

                model.addRow(datos);
            });

            eliminarVehiculo.setModel(model);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
