package model;

public class Equipos{

    public Equipos(String nombre_equipo){
        this.nombre_equipo = nombre_equipo;
    }
    public Equipos(){
        
    }
	private int id;
	private String nombre_equipo;
	private int voto_equipo;
	private int numero_participantes;
	
    // SETTERS
	public void setNumero_participantes(int numero_participantes) {
        this.numero_participantes = numero_participantes;
    }
    public void setVoto_equipo(int voto_equipo) {
        this.voto_equipo = voto_equipo;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombreEquipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }
    // GETTERS
    public int getNumero_participantes() {
        return numero_participantes;
    }
    public int getId() {
        return id;
    }
    public String getNombreEquipo() {
        return nombre_equipo;
    }
    public int getVoto_equipo() {
        return voto_equipo;
    }
}