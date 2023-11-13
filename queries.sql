CREATE TABLE Licencia (
    tipo_lic text PRIMARY KEY
);

CREATE TABLE Documentacion (
    nombre_doc text PRIMARY KEY
);

CREATE TABLE Coste_Ensenianza_Teorica (
    coste_et text PRIMARY KEY,
    importe int
);

CREATE TABLE Coste_Matriculacion (
    coste_mat text PRIMARY KEY,
    importe int
);

CREATE TABLE Lujo (
    tipo_lujo text PRIMARY KEY,
    tarifa_adicional int
);

CREATE TABLE Coste_Tramitacion (
    coste_tram text PRIMARY KEY,
    importe int
);

CREATE TABLE Profesor (
    dni_prof int PRIMARY KEY,
    nombre text,
    apellido_1 text,
    apellido_2 text,
    direccion text,
    telefono bigint
);

CREATE TABLE Alumno (
    dni_al int PRIMARY KEY,
    nombre text,
    apellido_1 text,
    apellido_2 text,
    direccion text,
    telefono bigint,
    tipo_lic text,
    coste_et text
);

CREATE TABLE Docencia (
    dni_prof int,
    tipo_lic text,
    matricula text,
    PRIMARY KEY ((dni_prof, tipo_lic))
);

CREATE INDEX ON Docencia (matricula);

CREATE TABLE Matricula (
    n_matricula int PRIMARY KEY,
    doc_presente boolean,
    dni_al int,
    dni_prof int,
    tipo_lic text,
    coste_mat text
);

CREATE INDEX ON Matricula (dni_al);
CREATE INDEX ON Matricula (tipo_lic, dni_prof);

CREATE CUSTOM INDEX matricula_custom_index
ON autoescuela_keyspace.Matricula (tipo_lic, dni_prof)
USING 'org.apache.cassandra.index.sasi.SASIIndex';


CREATE TABLE Prueba_Teorica (
    fecha_prueba date,
    n_matricula int,
    n_test int,
    errores int,
    PRIMARY KEY (fecha_prueba, n_matricula, n_test)
);

CREATE TABLE Pago (
    n_pago int,
    n_matricula int,
    importe int,
    PRIMARY KEY (n_pago, n_matricula)
);

CREATE INDEX ON Pago (n_matricula);


CREATE TABLE Clase_Practica (
    fecha_practica date,
    n_matricula int,
    duracion int,
    objetivos text,
    resultados text,
    PRIMARY KEY (fecha_practica, n_matricula)
);

CREATE INDEX ON Clase_Practica (n_matricula);

CREATE TABLE Tramitacion_Documentos (
    fecha_tramitacion date,
    n_matricula int,
    coste_tram text,
    PRIMARY KEY (fecha_tramitacion, n_matricula)
);

CREATE INDEX ON Tramitacion_Documentos (n_matricula);

CREATE TABLE Examen (
    fecha_examen date,
    n_matricula int,
    fecha_tramitacion date,
    tipo_examen text,
    duracion int,
    errores int,
    PRIMARY KEY ((fecha_examen, n_matricula, fecha_tramitacion))
);

CREATE INDEX ON Examen (n_matricula);


CREATE TABLE Vehiculo (
    matricula text PRIMARY KEY,
    marca text,
    modelo text,
    cilindrada int,
    anio_compra date,
    tarifa int,
    tipo_lic text,
    dni_prof int,
    tipo_lujo text,
    licencia_necesaria text
);

CREATE TABLE Consumo (
    matricula text,
    n_matricula int,
    fecha_practica date,
    kilometros int,
    litros int,
    PRIMARY KEY ((matricula, n_matricula, fecha_practica))
);

CREATE INDEX ON Consumo (fecha_practica, n_matricula);


CREATE TABLE D_L (
    tipo_lic text,
    nombre_doc text,
    PRIMARY KEY (tipo_lic, nombre_doc)
);

CREATE INDEX ON D_L (tipo_lic);
CREATE INDEX ON D_L (nombre_doc);
