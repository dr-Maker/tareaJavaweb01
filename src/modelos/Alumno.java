package modelos;

import tools.Leer;

public class Alumno extends Persona {

    private int alumnoid;
    private int ingreso; // año
    private int beca;
    private int convenio;

    public Alumno() {
    }

    public Alumno(int alumnoid, int ingreso, int beca, int convenio) {
        this.alumnoid = alumnoid;
        this.ingreso = ingreso;
        this.beca = beca;
        this.convenio = convenio;
    }

    public Alumno(int alumnoid, int ingreso, int beca, int convenio, int personaid, String nombres, String apellidos, String email, int telefono) {
        super(personaid, nombres, apellidos, email, telefono);
        this.alumnoid = alumnoid;
        this.ingreso = ingreso;
        this.beca = beca;
        this.convenio = convenio;
    }


    public int getAlumnoid() {
        return alumnoid;
    }

    public void setAlumnoid(int alumnoid) {
        this.alumnoid = alumnoid;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getBeca() {
        return beca;
    }

    public void setBeca(int beca) {
        this.beca = beca;
    }

    public int getConvenio() {
        return convenio;
    }

    public void setConvenio(int convenio) {
        this.convenio = convenio;
    }
    
      
    @Override
    public String toString(){
        return "("+this.alumnoid+") "+this.getNombres()+" "+this.getApellidos();
    }
    
    public void Nuevo(){
        System.out.println("Nuevo alumno");
        System.out.print("Persona Id : "); this.setPersonaid(Leer.datoInt());
        System.out.print("Nombres    : "); this.setNombres(Leer.dato());
        System.out.print("Apellidos  : "); this.setApellidos(Leer.dato());
        System.out.print("Email      : "); this.setEmail(Leer.dato());
        System.out.print("Telefono   : "); this.setTelefono(Leer.datoInt());
        System.out.print("Alumno Id  : "); this.setAlumnoid(Leer.datoInt());
        System.out.print("Ingreso    : "); this.setIngreso(Leer.datoInt());
        System.out.print("Beca      : "); this.setBeca(Leer.datoInt());
        System.out.print("Convenio   : "); this.setConvenio(Leer.datoInt());
    }

    public void Mostrar() {
        System.out.println("Persona Id     : " + this.getPersonaid());
        System.out.println("Nombres        : " + this.getNombres());
        System.out.println("Apellidos      : " + this.getApellidos());
        System.out.println("Email          : " + this.getEmail());
        System.out.println("Telefono       : " + this.getTelefono());
        System.out.println("Alumno Id      : " + this.getAlumnoid());
        System.out.println("Año de ingreso : " + this.getIngreso());
        System.out.println("% Beca         : " + this.getBeca());
        System.out.println("% Convenio     : " + this.getConvenio());
        System.out.println("--------------------------");
    }

}
