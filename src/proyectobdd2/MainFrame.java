/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobdd2;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;


/**
 *
 * @author danie
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainTabbedPane = new javax.swing.JTabbedPane();
        VehiculosTab = new javax.swing.JPanel();
        VehiculoTabbedPane = new javax.swing.JTabbedPane();
        AgregarVehiculo = new javax.swing.JPanel();
        ListarVehiculo = new javax.swing.JPanel();
        EditarVehiculo = new javax.swing.JPanel();
        EliminarVehiculo = new javax.swing.JPanel();
        ProfesoresTab = new javax.swing.JPanel();
        ProfesoresTabbedPane = new javax.swing.JTabbedPane();
        AgregarProfesores = new javax.swing.JPanel();
        ListarProfesores = new javax.swing.JPanel();
        EditarProfesores = new javax.swing.JPanel();
        EliminarProfesores = new javax.swing.JPanel();
        AlumnosTab = new javax.swing.JPanel();
        AlumnosTabbedPane = new javax.swing.JTabbedPane();
        AgregarAlumnos = new javax.swing.JPanel();
        dniAlumno = new javax.swing.JTextField();
        nombreAlumno = new javax.swing.JTextField();
        apellidoAlumno = new javax.swing.JTextField();
        apellidodosAlumno = new javax.swing.JTextField();
        direccionAlumno = new javax.swing.JTextField();
        telefonoAlumno = new javax.swing.JTextField();
        tipoLicencia = new javax.swing.JComboBox<>();
        costoLicencia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        matricularAlumno = new javax.swing.JButton();
        ListarAlumnos = new javax.swing.JPanel();
        EditarAlumnos = new javax.swing.JPanel();
        EliminarAlumnos = new javax.swing.JPanel();
        LicenciaTab = new javax.swing.JPanel();
        LicenciaTabbedPane = new javax.swing.JTabbedPane();
        AgregarLicencia = new javax.swing.JPanel();
        ListarLicencia = new javax.swing.JPanel();
        EditarLicencia = new javax.swing.JPanel();
        EliminarLicencia = new javax.swing.JPanel();
        ClasesTab = new javax.swing.JPanel();
        ClasesTabbedPane = new javax.swing.JTabbedPane();
        AgregarClases = new javax.swing.JPanel();
        ListarClases = new javax.swing.JPanel();
        EditarClases = new javax.swing.JPanel();
        EliminarClases = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout AgregarVehiculoLayout = new javax.swing.GroupLayout(AgregarVehiculo);
        AgregarVehiculo.setLayout(AgregarVehiculoLayout);
        AgregarVehiculoLayout.setHorizontalGroup(
            AgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AgregarVehiculoLayout.setVerticalGroup(
            AgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        VehiculoTabbedPane.addTab("Agregar", AgregarVehiculo);

        javax.swing.GroupLayout ListarVehiculoLayout = new javax.swing.GroupLayout(ListarVehiculo);
        ListarVehiculo.setLayout(ListarVehiculoLayout);
        ListarVehiculoLayout.setHorizontalGroup(
            ListarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ListarVehiculoLayout.setVerticalGroup(
            ListarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        VehiculoTabbedPane.addTab("Listar", ListarVehiculo);

        javax.swing.GroupLayout EditarVehiculoLayout = new javax.swing.GroupLayout(EditarVehiculo);
        EditarVehiculo.setLayout(EditarVehiculoLayout);
        EditarVehiculoLayout.setHorizontalGroup(
            EditarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EditarVehiculoLayout.setVerticalGroup(
            EditarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        VehiculoTabbedPane.addTab("Editar", EditarVehiculo);

        javax.swing.GroupLayout EliminarVehiculoLayout = new javax.swing.GroupLayout(EliminarVehiculo);
        EliminarVehiculo.setLayout(EliminarVehiculoLayout);
        EliminarVehiculoLayout.setHorizontalGroup(
            EliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EliminarVehiculoLayout.setVerticalGroup(
            EliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        VehiculoTabbedPane.addTab("Eliminar", EliminarVehiculo);

        javax.swing.GroupLayout VehiculosTabLayout = new javax.swing.GroupLayout(VehiculosTab);
        VehiculosTab.setLayout(VehiculosTabLayout);
        VehiculosTabLayout.setHorizontalGroup(
            VehiculosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VehiculosTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(VehiculoTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        VehiculosTabLayout.setVerticalGroup(
            VehiculosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VehiculosTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(VehiculoTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MainTabbedPane.addTab("Vehiculo", VehiculosTab);

        javax.swing.GroupLayout AgregarProfesoresLayout = new javax.swing.GroupLayout(AgregarProfesores);
        AgregarProfesores.setLayout(AgregarProfesoresLayout);
        AgregarProfesoresLayout.setHorizontalGroup(
            AgregarProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AgregarProfesoresLayout.setVerticalGroup(
            AgregarProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ProfesoresTabbedPane.addTab("Agregar", AgregarProfesores);

        javax.swing.GroupLayout ListarProfesoresLayout = new javax.swing.GroupLayout(ListarProfesores);
        ListarProfesores.setLayout(ListarProfesoresLayout);
        ListarProfesoresLayout.setHorizontalGroup(
            ListarProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ListarProfesoresLayout.setVerticalGroup(
            ListarProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ProfesoresTabbedPane.addTab("Listar", ListarProfesores);

        javax.swing.GroupLayout EditarProfesoresLayout = new javax.swing.GroupLayout(EditarProfesores);
        EditarProfesores.setLayout(EditarProfesoresLayout);
        EditarProfesoresLayout.setHorizontalGroup(
            EditarProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EditarProfesoresLayout.setVerticalGroup(
            EditarProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ProfesoresTabbedPane.addTab("Editar", EditarProfesores);

        javax.swing.GroupLayout EliminarProfesoresLayout = new javax.swing.GroupLayout(EliminarProfesores);
        EliminarProfesores.setLayout(EliminarProfesoresLayout);
        EliminarProfesoresLayout.setHorizontalGroup(
            EliminarProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EliminarProfesoresLayout.setVerticalGroup(
            EliminarProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ProfesoresTabbedPane.addTab("Eliminar", EliminarProfesores);

        javax.swing.GroupLayout ProfesoresTabLayout = new javax.swing.GroupLayout(ProfesoresTab);
        ProfesoresTab.setLayout(ProfesoresTabLayout);
        ProfesoresTabLayout.setHorizontalGroup(
            ProfesoresTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfesoresTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProfesoresTabbedPane)
                .addContainerGap())
        );
        ProfesoresTabLayout.setVerticalGroup(
            ProfesoresTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfesoresTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProfesoresTabbedPane)
                .addContainerGap())
        );

        MainTabbedPane.addTab("Profesores", ProfesoresTab);

        apellidoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoAlumnoActionPerformed(evt);
            }
        });

        tipoLicencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("DNI");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Dirección");

        jLabel5.setText("Telefono");

        jLabel6.setText("Tipo Licencia");

        jLabel7.setText("Costo");

        matricularAlumno.setText("Matricular Alumno");

        javax.swing.GroupLayout AgregarAlumnosLayout = new javax.swing.GroupLayout(AgregarAlumnos);
        AgregarAlumnos.setLayout(AgregarAlumnosLayout);
        AgregarAlumnosLayout.setHorizontalGroup(
            AgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarAlumnosLayout.createSequentialGroup()
                        .addGroup(AgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(44, 44, 44)
                        .addGroup(AgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AgregarAlumnosLayout.createSequentialGroup()
                                .addComponent(tipoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(costoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AgregarAlumnosLayout.createSequentialGroup()
                                .addGroup(AgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(telefonoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(direccionAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dniAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(apellidodosAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(matricularAlumno))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        AgregarAlumnosLayout.setVerticalGroup(
            AgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarAlumnosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(AgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dniAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidodosAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(AgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(matricularAlumno)
                .addContainerGap())
        );

        AlumnosTabbedPane.addTab("Agregar", AgregarAlumnos);

        javax.swing.GroupLayout ListarAlumnosLayout = new javax.swing.GroupLayout(ListarAlumnos);
        ListarAlumnos.setLayout(ListarAlumnosLayout);
        ListarAlumnosLayout.setHorizontalGroup(
            ListarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ListarAlumnosLayout.setVerticalGroup(
            ListarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        AlumnosTabbedPane.addTab("Listar", ListarAlumnos);

        javax.swing.GroupLayout EditarAlumnosLayout = new javax.swing.GroupLayout(EditarAlumnos);
        EditarAlumnos.setLayout(EditarAlumnosLayout);
        EditarAlumnosLayout.setHorizontalGroup(
            EditarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EditarAlumnosLayout.setVerticalGroup(
            EditarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        AlumnosTabbedPane.addTab("Editar", EditarAlumnos);

        javax.swing.GroupLayout EliminarAlumnosLayout = new javax.swing.GroupLayout(EliminarAlumnos);
        EliminarAlumnos.setLayout(EliminarAlumnosLayout);
        EliminarAlumnosLayout.setHorizontalGroup(
            EliminarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EliminarAlumnosLayout.setVerticalGroup(
            EliminarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        AlumnosTabbedPane.addTab("Eliminar", EliminarAlumnos);

        javax.swing.GroupLayout AlumnosTabLayout = new javax.swing.GroupLayout(AlumnosTab);
        AlumnosTab.setLayout(AlumnosTabLayout);
        AlumnosTabLayout.setHorizontalGroup(
            AlumnosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnosTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AlumnosTabbedPane)
                .addContainerGap())
        );
        AlumnosTabLayout.setVerticalGroup(
            AlumnosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnosTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AlumnosTabbedPane)
                .addContainerGap())
        );

        MainTabbedPane.addTab("Alumnos", AlumnosTab);

        javax.swing.GroupLayout AgregarLicenciaLayout = new javax.swing.GroupLayout(AgregarLicencia);
        AgregarLicencia.setLayout(AgregarLicenciaLayout);
        AgregarLicenciaLayout.setHorizontalGroup(
            AgregarLicenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AgregarLicenciaLayout.setVerticalGroup(
            AgregarLicenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        LicenciaTabbedPane.addTab("Agregar", AgregarLicencia);

        javax.swing.GroupLayout ListarLicenciaLayout = new javax.swing.GroupLayout(ListarLicencia);
        ListarLicencia.setLayout(ListarLicenciaLayout);
        ListarLicenciaLayout.setHorizontalGroup(
            ListarLicenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ListarLicenciaLayout.setVerticalGroup(
            ListarLicenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        LicenciaTabbedPane.addTab("Listar", ListarLicencia);

        javax.swing.GroupLayout EditarLicenciaLayout = new javax.swing.GroupLayout(EditarLicencia);
        EditarLicencia.setLayout(EditarLicenciaLayout);
        EditarLicenciaLayout.setHorizontalGroup(
            EditarLicenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EditarLicenciaLayout.setVerticalGroup(
            EditarLicenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        LicenciaTabbedPane.addTab("Editar", EditarLicencia);

        javax.swing.GroupLayout EliminarLicenciaLayout = new javax.swing.GroupLayout(EliminarLicencia);
        EliminarLicencia.setLayout(EliminarLicenciaLayout);
        EliminarLicenciaLayout.setHorizontalGroup(
            EliminarLicenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EliminarLicenciaLayout.setVerticalGroup(
            EliminarLicenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        LicenciaTabbedPane.addTab("Eliminar", EliminarLicencia);

        javax.swing.GroupLayout LicenciaTabLayout = new javax.swing.GroupLayout(LicenciaTab);
        LicenciaTab.setLayout(LicenciaTabLayout);
        LicenciaTabLayout.setHorizontalGroup(
            LicenciaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LicenciaTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LicenciaTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LicenciaTabLayout.setVerticalGroup(
            LicenciaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LicenciaTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LicenciaTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MainTabbedPane.addTab("Licencia", LicenciaTab);

        javax.swing.GroupLayout AgregarClasesLayout = new javax.swing.GroupLayout(AgregarClases);
        AgregarClases.setLayout(AgregarClasesLayout);
        AgregarClasesLayout.setHorizontalGroup(
            AgregarClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AgregarClasesLayout.setVerticalGroup(
            AgregarClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ClasesTabbedPane.addTab("Agregar", AgregarClases);

        javax.swing.GroupLayout ListarClasesLayout = new javax.swing.GroupLayout(ListarClases);
        ListarClases.setLayout(ListarClasesLayout);
        ListarClasesLayout.setHorizontalGroup(
            ListarClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ListarClasesLayout.setVerticalGroup(
            ListarClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ClasesTabbedPane.addTab("Listar", ListarClases);

        javax.swing.GroupLayout EditarClasesLayout = new javax.swing.GroupLayout(EditarClases);
        EditarClases.setLayout(EditarClasesLayout);
        EditarClasesLayout.setHorizontalGroup(
            EditarClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EditarClasesLayout.setVerticalGroup(
            EditarClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ClasesTabbedPane.addTab("Editar", EditarClases);

        javax.swing.GroupLayout EliminarClasesLayout = new javax.swing.GroupLayout(EliminarClases);
        EliminarClases.setLayout(EliminarClasesLayout);
        EliminarClasesLayout.setHorizontalGroup(
            EliminarClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EliminarClasesLayout.setVerticalGroup(
            EliminarClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ClasesTabbedPane.addTab("Eliminar", EliminarClases);

        javax.swing.GroupLayout ClasesTabLayout = new javax.swing.GroupLayout(ClasesTab);
        ClasesTab.setLayout(ClasesTabLayout);
        ClasesTabLayout.setHorizontalGroup(
            ClasesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClasesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ClasesTabbedPane)
                .addContainerGap())
        );
        ClasesTabLayout.setVerticalGroup(
            ClasesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClasesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ClasesTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );

        MainTabbedPane.addTab("Clases", ClasesTab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );

        MainTabbedPane.addTab("Examen", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainTabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoAlumnoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch (Exception e) {
            System.out.println("failed to initialized");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
//                InsertData.insertar();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarAlumnos;
    private javax.swing.JPanel AgregarClases;
    private javax.swing.JPanel AgregarLicencia;
    private javax.swing.JPanel AgregarProfesores;
    private javax.swing.JPanel AgregarVehiculo;
    private javax.swing.JPanel AlumnosTab;
    private javax.swing.JTabbedPane AlumnosTabbedPane;
    private javax.swing.JPanel ClasesTab;
    private javax.swing.JTabbedPane ClasesTabbedPane;
    private javax.swing.JPanel EditarAlumnos;
    private javax.swing.JPanel EditarClases;
    private javax.swing.JPanel EditarLicencia;
    private javax.swing.JPanel EditarProfesores;
    private javax.swing.JPanel EditarVehiculo;
    private javax.swing.JPanel EliminarAlumnos;
    private javax.swing.JPanel EliminarClases;
    private javax.swing.JPanel EliminarLicencia;
    private javax.swing.JPanel EliminarProfesores;
    private javax.swing.JPanel EliminarVehiculo;
    private javax.swing.JPanel LicenciaTab;
    private javax.swing.JTabbedPane LicenciaTabbedPane;
    private javax.swing.JPanel ListarAlumnos;
    private javax.swing.JPanel ListarClases;
    private javax.swing.JPanel ListarLicencia;
    private javax.swing.JPanel ListarProfesores;
    private javax.swing.JPanel ListarVehiculo;
    private javax.swing.JTabbedPane MainTabbedPane;
    private javax.swing.JPanel ProfesoresTab;
    private javax.swing.JTabbedPane ProfesoresTabbedPane;
    private javax.swing.JTabbedPane VehiculoTabbedPane;
    private javax.swing.JPanel VehiculosTab;
    private javax.swing.JTextField apellidoAlumno;
    private javax.swing.JTextField apellidodosAlumno;
    private javax.swing.JTextField costoLicencia;
    private javax.swing.JTextField direccionAlumno;
    private javax.swing.JTextField dniAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton matricularAlumno;
    private javax.swing.JTextField nombreAlumno;
    private javax.swing.JTextField telefonoAlumno;
    private javax.swing.JComboBox<String> tipoLicencia;
    // End of variables declaration//GEN-END:variables
}
