package model;

public class Integrante {
    int id;
    String nombre;
    int idEquipo;

    public Integrante(String nombre, int idEquipo){
        this.nombre = nombre;
        this.idEquipo = idEquipo;
    }
    public Integrante(){
    }
    
    // SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
    // GETTERS
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getIdEquipo() {
        return idEquipo;
    }
}
