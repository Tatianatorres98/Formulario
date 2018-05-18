
package Modelos;


public class Ruta {
    private String dia;
    private int hora;
    private int id;
    private String nombre;
    private String partida;
    private  String llegada;
    private String bus;

    public Ruta() {
    }

    public Ruta(String dia, int hora, String nombre, String partida, String llegada, String bus) {
        this.dia = dia;
        this.hora = hora;
        this.nombre = nombre;
        this.partida = partida;
        this.llegada = llegada;
        this.bus = bus;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }
    
    
    
}
