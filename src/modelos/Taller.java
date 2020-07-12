package modelos;

import tools.Leer;
import tools.Rutinas;

public class Taller {

    private int tallerid;
    private String nombre;
    private int horas;
    private int cupos;
    private int costo;

    public Taller() {
    }

    public Taller(int tallerid, String nombre, int horas, int cupos, int costo) {
        this.tallerid = tallerid;
        this.nombre = nombre;
        this.horas = horas;
        this.cupos = cupos;
        this.costo = costo;
    }

    public int getTallerid() {
        return tallerid;
    }

    public void setTallerid(int tallerid) {
        this.tallerid = tallerid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    @Override
    public String toString(){
        return "("+this.getTallerid()+") " + this.getNombre()+" - $"+Rutinas.formatoMonto(this.getCosto());
    }

    public void Nuevo() {
        System.out.println("Nuevo taller");
        System.out.print("Taller ID : "); this.setTallerid(Leer.datoInt());
        System.out.print("Nombre    : "); this.setNombre(Leer.dato());
        System.out.print("Horas     : "); this.setHoras(Leer.datoInt());
        System.out.print("Cupos     : "); this.setCupos(Leer.datoInt());
        System.out.print("Costo     : "); this.setCosto(Leer.datoInt());
    }

    public void Mostrar() {
        System.out.println("Taller Id : " + this.getTallerid());
        System.out.println("Nombre    : " + this.getNombre());
        System.out.println("Horas     : " + this.getHoras());
        System.out.println("Cupos     : " + this.getCupos());
        System.out.println("Costo     : " + this.getCosto());
        System.out.println("-------------------");
    }

}
