INSERT INTO Licencia (tipo_lic) VALUES ('A');

INSERT INTO Licencia (tipo_lic) VALUES ('B');

-- Insert into Licencia
INSERT INTO Licencia (tipo_lic) VALUES ('C');

-- Insert into Documentacion
INSERT INTO Documentacion (nombre_doc) VALUES ('DNI');
INSERT INTO Documentacion (nombre_doc) VALUES ('CERT MEDICO');
INSERT INTO Documentacion (nombre_doc) VALUES ('CERT PSICOL');
INSERT INTO Documentacion (nombre_doc) VALUES ('LICENCIA A');
INSERT INTO Documentacion (nombre_doc) VALUES ('LICENCIA B');
INSERT INTO Documentacion (nombre_doc) VALUES ('LICENCIA C');
INSERT INTO Documentacion (nombre_doc) VALUES ('CERT DGT');

-- Insert into Profesor
INSERT INTO Profesor (dni_prof, nombre, apellido_1, apellido_2, direccion, telefono)
VALUES (1, 'Rafael', 'Andino', 'Pozo', 'Onieva 3', 1);
INSERT INTO Profesor (dni_prof, nombre, apellido_1, apellido_2, direccion, telefono)
VALUES (2, 'Ana', 'Ruiz', 'Romero', 'Garberas 16', 2);
INSERT INTO Profesor (dni_prof, nombre, apellido_1, apellido_2, direccion, telefono)
VALUES (3, 'Carolina', 'Arredondo', 'Ruiz', 'Liberacion 3', 3);
INSERT INTO Profesor (dni_prof, nombre, apellido_1, apellido_2, direccion, telefono)
VALUES (4, 'Nestor', 'Arredondo', 'Martinez', 'Liberacion 3', 4);

-- Insert into Docencia
INSERT INTO Docencia (dni_prof, tipo_lic, matricula) VALUES (1, 'A', '000005');
INSERT INTO Docencia (dni_prof, tipo_lic, matricula) VALUES (2, 'A', '000006');
INSERT INTO Docencia (dni_prof, tipo_lic, matricula) VALUES (2, 'B', '000001');
INSERT INTO Docencia (dni_prof, tipo_lic, matricula) VALUES (3, 'B', '000002');
INSERT INTO Docencia (dni_prof, tipo_lic, matricula) VALUES (3, 'C', '000003');
INSERT INTO Docencia (dni_prof, tipo_lic, matricula) VALUES (4, 'C', '000004');

-- Insert into Coste_Ensenianza_Teorica
INSERT INTO Coste_Ensenianza_Teorica (coste_et, importe) VALUES ('coste_e_t', 4500);

-- Insert into Coste_Matriculacion
INSERT INTO Coste_Matriculacion (coste_mat, importe) VALUES ('coste_mat', 3000);

-- Insert into Coste_Tramitacion
INSERT INTO Coste_Tramitacion (coste_tram, importe) VALUES ('coste_tram', 3000);

-- Insert into Lujo
INSERT INTO Lujo (tipo_lujo, tarifa_adicional) VALUES ('normal', 500);
INSERT INTO Lujo (tipo_lujo, tarifa_adicional) VALUES ('extra', 1000);
INSERT INTO Lujo (tipo_lujo, tarifa_adicional) VALUES ('ejecutivo', 2000);
INSERT INTO Lujo (tipo_lujo, tarifa_adicional) VALUES ('exclusivo', 5000);

-- Insert into Vehiculo
INSERT INTO Vehiculo (
    matricula, marca, modelo, cilindrada, anio_compra, tarifa, tipo_lic,
    dni_prof, tipo_lujo, licencia_necesaria
) VALUES (
    '000001', 'Ford', 'Escort', 2000, '1999-03-21', 1000, 'B', 2, 'normal', 'B'
);

INSERT INTO Vehiculo (
    matricula, marca, modelo, cilindrada, anio_compra, tarifa, tipo_lic,
    dni_prof, tipo_lujo, licencia_necesaria
) VALUES (
    '000002', 'Wolkswagen', 'Golf TDI', 1900, '1995-03-31', 1000, 'B', 3, 'extra', 'B'
);

INSERT INTO Vehiculo (
    matricula, marca, modelo, cilindrada, anio_compra, tarifa, tipo_lic,
    dni_prof, tipo_lujo, licencia_necesaria
) VALUES (
    '000003', 'Scania', 'Globe', 4500, '1997-07-07', 3000, 'C', 3, 'normal', 'C'
);

INSERT INTO Vehiculo (
    matricula, marca, modelo, cilindrada, anio_compra, tarifa, tipo_lic,
    dni_prof, tipo_lujo, licencia_necesaria
) VALUES (
    '000004', 'Scania', 'RoadRun', 6000, '1999-06-01', 3000, 'C', 4, 'ejecutivo', 'C'
);

INSERT INTO Vehiculo (
    matricula, marca, modelo, cilindrada, anio_compra, tarifa, tipo_lic,
    dni_prof, tipo_lujo, licencia_necesaria
) VALUES (
    '000005', 'Suzuki', 'MRZ', 500, '1998-08-27', 700, 'A', 1, 'exclusivo', 'A'
);

INSERT INTO Vehiculo (
    matricula, marca, modelo, cilindrada, anio_compra, tarifa, tipo_lic,
    dni_prof, tipo_lujo, licencia_necesaria
) VALUES (
    '000006', 'Honda', 'MRV', 500, '1995-02-05', 700, 'A', 2, 'normal', 'A'
);

-- Insert into Alumno
INSERT INTO Alumno (
    dni_al, nombre, apellido_1, apellido_2, direccion, telefono, tipo_lic, coste_et
) VALUES (
    1, 'Jose', 'Garcia', 'Perez', 'Liberacion 4', 1, 'A', null
);

INSERT INTO Alumno (
    dni_al, nombre, apellido_1, apellido_2, direccion, telefono, tipo_lic, coste_et
) VALUES (
    2, 'Ana', 'Belen', 'Ruiz', 'Plaza 1', 2, 'B', null
);

INSERT INTO Alumno (
    dni_al, nombre, apellido_1, apellido_2, direccion, telefono, tipo_lic, coste_et
) VALUES (
    3, 'Elisa', 'Roca', 'Perez', 'Plaza 3', 3, null, 'coste_e_t'
);

INSERT INTO Alumno (
    dni_al, nombre, apellido_1, apellido_2, direccion, telefono, tipo_lic, coste_et
) VALUES (
    4, 'Petra', 'Garcia', 'Obregon', 'Orgullo 1', 4, 'B', null
);

-- Insert into Alumno
INSERT INTO Alumno (dni_al, nombre, apellido_1, apellido_2, direccion, telefono, tipo_lic, coste_et)
VALUES (5, 'Pepa', 'Martos', 'Garcia', 'Canto 1', 5, 'A', null);

INSERT INTO Alumno (dni_al, nombre, apellido_1, apellido_2, direccion, telefono, tipo_lic, coste_et)
VALUES (6, 'Antonio', 'Molina', 'Mora', 'Campillo 7', 6, 'B', null);

INSERT INTO Alumno (dni_al, nombre, apellido_1, apellido_2, direccion, telefono, tipo_lic, coste_et)
VALUES (7, 'Elisabeth', 'Ruiz', 'Romero', 'Garberas 1', 7, null, 'coste_e_t');

INSERT INTO Alumno (dni_al, nombre, apellido_1, apellido_2, direccion, telefono, tipo_lic, coste_et)
VALUES (8, 'Juan', 'Martinez', 'Fontiveros', 'Amador 1', 8, null, 'coste_e_t');

INSERT INTO Alumno (dni_al, nombre, apellido_1, apellido_2, direccion, telefono, tipo_lic, coste_et)
VALUES (9, 'Susana', 'Ruiz', 'Pozo', 'Amador 2', 9, null, 'coste_e_t');

INSERT INTO Alumno (dni_al, nombre, apellido_1, apellido_2, direccion, telefono, tipo_lic, coste_et)
VALUES (10, 'Pepe', 'Barba', 'Martinez', 'Prado 9', 10, 'B', null);

-- Insert into Matricula
INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (0, 0, 1, 2, 'B', 'coste_mat');

INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (1, 0, 2, 3, 'C', 'coste_mat');

INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (2, 0, 3, 1, 'A', 'coste_mat');

INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (3, 0, 4, 4, 'C', 'coste_mat');

INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (4, 0, 5, 2, 'B', 'coste_mat');

INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (5, 0, 5, 4, 'C', 'coste_mat');

INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (6, 0, 6, 4, 'C', 'coste_mat');

-- Insert into Matricula
INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (7, 0, 7, 1, 'A', 'coste_mat');

INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (8, 0, 8, 2, 'A', 'coste_mat');

INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (9, 0, 8, 3, 'B', 'coste_mat');

INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (10, 0, 8, 4, 'C', 'coste_mat');

INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (11, 0, 9, 2, 'A', 'coste_mat');

INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (12, 0, 9, 2, 'B', 'coste_mat');

INSERT INTO Matricula (n_matricula, doc_presente, dni_al, dni_prof, tipo_lic, coste_mat)
VALUES (13, 0, 10, 4, 'C', 'coste_mat');

-- Insert into Prueba_Teorica
INSERT INTO Prueba_Teorica (fecha_prueba, n_matricula, n_test, errores)
VALUES ('1999-02-01', 1, 1, 4);

INSERT INTO Prueba_Teorica (fecha_prueba, n_matricula, n_test, errores)
VALUES ('1998-04-03', 1, 2, 3);

INSERT INTO Prueba_Teorica (fecha_prueba, n_matricula, n_test, errores)
VALUES ('1999-04-02', 3, 4, 1);

INSERT INTO Prueba_Teorica (fecha_prueba, n_matricula, n_test, errores)
VALUES ('1998-04-03', 5, 1, 3);

INSERT INTO Prueba_Teorica (fecha_prueba, n_matricula, n_test, errores)
VALUES ('1998-05-05', 7, 5, 2);

INSERT INTO Prueba_Teorica (fecha_prueba, n_matricula, n_test, errores)
VALUES ('1998-03-13', 1, 5, 6);

-- Insert into Prueba_Teorica
INSERT INTO Prueba_Teorica (fecha_prueba, n_matricula, n_test, errores)
VALUES ('1998-04-04', 9, 9, 6);

INSERT INTO Prueba_Teorica (fecha_prueba, n_matricula, n_test, errores)
VALUES ('1998-03-02', 6, 7, 8);

INSERT INTO Prueba_Teorica (fecha_prueba, n_matricula, n_test, errores)
VALUES ('1997-07-05', 3, 4, 5);

INSERT INTO Prueba_Teorica (fecha_prueba, n_matricula, n_test, errores)
VALUES ('1998-06-03', 3, 5, 6);

INSERT INTO Prueba_Teorica (fecha_prueba, n_matricula, n_test, errores)
VALUES ('1998-06-25', 7, 2, 1);

-- Insert into Pago
INSERT INTO Pago (N_pago, N_matricula, importe)
VALUES (1, 1, 1000);

INSERT INTO Pago (N_pago, N_matricula, importe)
VALUES (2, 1, 20000);

INSERT INTO Pago (N_pago, N_matricula, importe)
VALUES (1, 3, 10000);

INSERT INTO Pago (N_pago, N_matricula, importe)
VALUES (1, 4, 10000);

INSERT INTO Pago (N_pago, N_matricula, importe)
VALUES (2, 4, 5000);

INSERT INTO Pago (N_pago, N_matricula, importe)
VALUES (1, 5, 1000);

INSERT INTO Pago (N_pago, N_matricula, importe)
VALUES (1, 6, 1000);

-- Insert into Clase_Practica
INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1999-02-02', 1, 2, 'rampas', 'mejorar');

-- Insert into Consumo
INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000003', 1, '1999-02-02', 10, 1);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000005', 2, '1999-02-02', 5, 1);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000003', 1, '1999-02-01', 25, 3);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000005', 2, '1999-03-03', 15, 3);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000005', 2, '1998-12-04', 20, 4);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000004', 3, '1998-12-05', 30, 10);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000001', 4, '1998-11-05', 40, 10);

-- Insert into Clase_Practica
INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1999-02-02', 2, 1, 'reduccion marchas', 'mejorar');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1999-03-03', 2, 3, 'rampas', 'mejorar');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1998-12-04', 2, 2, 'aparcar', 'bien');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1998-12-05', 3, 1, 'reduccion', 'bien');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1998-11-05', 4, 1, 'aparcar', 'mejorar');

-- Insert into Clase_Practica
INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1998-12-06', 4, 1, 'espejos', 'bien');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1998-12-06', 5, 2, 'giros', 'bien');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1999-07-07', 6, 1, 'rampas', 'bien');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1999-07-07', 7, 1, 'señales', 'mejorar');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1999-12-10', 8, 1, 'señanles', 'mejorar');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1999-12-11', 8, 2, 'señanles', 'mejorar');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1999-01-10', 9, 1, 'señanles', 'mejorar');

-- Insert into Consumo
INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000001', 4, '1998-12-06', 30, 8);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000004', 5, '1998-12-06', 15, 2);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000004', 6, '1999-07-07', 6, 1);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000005', 7, '1999-07-07', 7, 1);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000006', 8, '1999-12-10', 8, 1);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000006', 8, '1999-12-11', 14, 2);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000006', 9, '2000-01-10', 1, 1);

-- Insert into Consumo
INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000002', 9, '1999-01-10', 9, 1);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000004', 10, '1999-02-10', 10, 3);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000004', 10, '1999-02-11', 20, 2);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000006', 11, '1999-12-10', 11, 1);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000001', 12, '1999-12-10', 12, 2);

INSERT INTO Consumo (matricula, N_matricula, fecha_practica, kilometros, litros)
VALUES ('000004', 13, '1999-12-10', 13, 3);

-- Insert into Clase_Practica
INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1999-02-10', 10, 3, 'señanles', 'mejorar');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1999-02-11', 10, 2, 'señanles', 'mejorar');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1999-12-10', 11, 1, 'señanles', 'mejorar');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1999-12-10', 12, 2, 'señanles', 'mejorar');

INSERT INTO Clase_Practica (fecha_practica, N_matricula, duracion, objetivos, resultados)
VALUES ('1999-12-10', 13, 3, 'señanles', 'mejorar');

-- Insert into Tramitacion_Documentos
INSERT INTO Tramitacion_Documentos (fecha_tramitacion, N_matricula, coste_tram)
VALUES ('1999-02-02', 2, 'coste_tram');


-- Insert into Examen
INSERT INTO Examen (fecha_examen, N_matricula, fecha_tramitacion, tipo_examen, duracion, errores)
VALUES ('1999-05-12', 2, '1999-02-02', 'T', NULL, 6);

INSERT INTO Examen (fecha_examen, N_matricula, fecha_tramitacion, tipo_examen, duracion, errores)
VALUES ('1999-05-17', 2, '1999-02-02', 'T', NULL, 9);

INSERT INTO Examen (fecha_examen, N_matricula, fecha_tramitacion, tipo_examen, duracion, errores)
VALUES ('1999-06-01', 1, '1999-10-11', 'T', NULL, 0);

INSERT INTO Examen (fecha_examen, N_matricula, fecha_tramitacion, tipo_examen, duracion, errores)
VALUES ('1999-06-03', 1, '1999-10-11', 'P', 1, NULL);

INSERT INTO Examen (fecha_examen, N_matricula, fecha_tramitacion, tipo_examen, duracion, errores)
VALUES ('1999-05-27', 6, '1999-05-19', 'T', NULL, 1);

-- Insert into Tramitacion_Documentos
INSERT INTO Tramitacion_Documentos (fecha_tramitacion, N_matricula, coste_tram)
VALUES ('1999-10-11', 1, 'coste_tram');

INSERT INTO Tramitacion_Documentos (fecha_tramitacion, N_matricula, coste_tram)
VALUES ('1999-05-19', 6, 'coste_tram');

-- Insert into D_L
INSERT INTO D_L (tipo_lic, nombre_doc)
VALUES ('A', 'DNI');

INSERT INTO D_L (tipo_lic, nombre_doc)
VALUES ('A', 'CERT MEDICO');

INSERT INTO D_L (tipo_lic, nombre_doc)
VALUES ('B', 'LICENCIA A');

INSERT INTO D_L (tipo_lic, nombre_doc)
VALUES ('B', 'DNI');

-- Insert into D_L
INSERT INTO D_L (tipo_lic, nombre_doc)
VALUES ('B', 'CERT MEDICO');

INSERT INTO D_L (tipo_lic, nombre_doc)
VALUES ('C', 'LICENCIA B');

INSERT INTO D_L (tipo_lic, nombre_doc)
VALUES ('C', 'DNI');

INSERT INTO D_L (tipo_lic, nombre_doc)
VALUES ('C', 'CERT MEDICO');

INSERT INTO D_L (tipo_lic, nombre_doc)
VALUES ('C', 'CERT PSICOL');
