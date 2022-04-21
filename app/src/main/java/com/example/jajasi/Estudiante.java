package com.example.jajasi;

//Representacion de una clase POJO (Plain Old Java Object)
public class Estudiante {
    //shift f6 y cambias en el codigo sin necesidad de buscar y reemplazar uno por uno
    private  String nombre;
    private  String apellido;
    private  int celular;
    private  boolean estudiante;

    public Estudiante(String nombre, String apellido, int celular, boolean estudiante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.estudiante = estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCelular() {
        return celular;
    }

    public boolean isEstudiante() {
        return estudiante;
    }

    // para escribir overrides escribes to y seleccionas la segunda opcion, te aparecen todas tus variables en un private

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", celular=" + celular +
                ", estudiante=" + estudiante +
                '}';
    }
}
