package modelos;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.util.ArrayList;
import java.util.List;
import tools.Leer;
import static tools.Rutinas.formatoMonto;

public class Matricula {

    private int matriculaid;
    private String codigo;
    
    private Taller taller;
    private Alumno alumno;

    public Matricula() {
    }

    public Matricula(int matriculaid, String codigo, Taller taller, Alumno alumno) {
        this.matriculaid = matriculaid;
        this.codigo = codigo;
        this.taller = taller;
        this.alumno = alumno;
    }

    public int getMatriculaid() {
        return matriculaid;
    }

    public void setMatriculaid(int matriculaid) {
        this.matriculaid = matriculaid;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Taller getTaller() {
        return taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    @Override
    public String toString(){
        return "("+this.getMatriculaid()+") " + this.getCodigo()+" - "+ this.getTaller().toString()+" - "+ this.getAlumno().toString();
    }
    
    public void Nuevo(){
        System.out.println("Nueva matricula");
        System.out.print("Matricula ID : ");this.setMatriculaid(Leer.datoInt());
        System.out.print("Codigo       : ");this.setCodigo(Leer.dato());
        // vamos a tener sólo los ID
        this.taller = new Taller(); // si no lo instanciamos no se puede usar
        System.out.print("Taller ID    : ");this.taller.setTallerid(Leer.datoInt());
        this.alumno = new Alumno();
        System.out.print("Alumno ID    : ");this.getAlumno().setAlumnoid(Leer.datoInt());
    }

    public void Mostrar() {
        System.out.println("Matricula ID : " + this.getMatriculaid());
        System.out.println("Codigo       : " + this.getCodigo());
        System.out.println("Taller       : " + this.taller.toString());
        System.out.println("Alumno       : " + this.alumno.toString());
    }
    
    public void Facturacion(ArrayList<Matricula> matriculados)
    {
        int contar_costo;
        int total = 0;
        
        System.out.println("Facturacion:");
        System.out.println("---------------------");
        System.out.print("Almuno :" + matriculados.get(0).alumno.toString() );
        System.out.println("---------------------");
        for(Matricula item: matriculados)
        {
            System.out.println("("+item.matriculaid +") "+item.taller.toString()); 
            
            contar_costo = item.getTaller().getCosto();
            total = total + contar_costo;
        }
        
        System.out.println("total  " + total);
        System.out.println("---------------------");
        int beca = matriculados.get(0).alumno.getBeca();
        System.out.println("% Beca " + matriculados.get(0).alumno.getBeca());
        int convenio = matriculados.get(0).alumno.getConvenio();
        System.out.println("% Convenio " + matriculados.get(0).alumno.getConvenio());
        
        System.out.println("total a pagar : " + formatoMonto(sumaTotal(total, beca, convenio))) ;
       

        }
   
        
    
    public static int sumaTotal(int total, int beca, int convenio)
    {
        int tl = 0;
        
        tl = (int)(total - (total*(beca*0.010)) - (total*(convenio*0.010)));
        
        return tl;
    
    }
    
    
    public void ListAlumno(ArrayList<Matricula> matriculados)
    {
        
        
        System.out.println("--------------------------");
        System.out.println("Taller " + matriculados.get(0).taller.getNombre());
        System.out.println("--------------------------");
        for(Matricula item: matriculados)
                {
                    
                    System.out.println(item.alumno.toString());
                    
                }


    }

}
