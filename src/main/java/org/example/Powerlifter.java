package org.example;

public class Powerlifter {
    //Atributos
    private String nombre;
    private int edad;
    private double peso;
    private double marcaPressBanca;
    private double marcaSentadilla;
    private double marcaPesoMuerto;
    //Constructor
    public Powerlifter(String nombre, int edad, double peso, double marcaPressBanca, double marcaSentadilla, double marcaPesoMuerto){
    this.nombre = nombre;
    this.edad = edad;
    this.peso = peso;
    this.marcaPressBanca = marcaPressBanca;
    this.marcaSentadilla = marcaSentadilla;
    this.marcaPesoMuerto = marcaPesoMuerto;
    }
    //Metodos
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getMarcaPressBanca(){
        return marcaPressBanca;
    }
    public void setMarcaPressBanca(double marcaPressBanca){
        this.marcaPressBanca = marcaPressBanca;
    }
    public double getMarcaSentadilla(){
        return marcaSentadilla;
    }
    public void setMarcaSentadilla(double marcaSentadilla){
        this.marcaSentadilla = marcaSentadilla;
    }
    public double getMarcaPesoMuerto(){
        return marcaPesoMuerto;
    }
    public void setPesoMuerto(double marcaPesoMuerto){
        this.marcaPesoMuerto = marcaPesoMuerto;
    }
}
