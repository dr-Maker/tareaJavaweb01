package base;

import java.util.ArrayList;
import java.util.List;
import modelos.Alumno;
import modelos.Matricula;
import modelos.Taller;
import tools.Leer;

public class Principal {

    public static void main(String[] args) {
        // ojetos
        Alumno alu = new Alumno();
        Taller tal = new Taller();
        Matricula mat = new Matricula();
   

        // colecciones de objetos
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Taller> talleres = new ArrayList<>();
        ArrayList<Matricula> matriculas = new ArrayList<>();
        ArrayList<Matricula> matriculados = new ArrayList<Matricula>();
        
   Alumno alu_01, alu_02, alu_03, alu_04;
       
   
   // Data
     
        alu = new Alumno(2020001, 2020, 0, 0, 1001, "Ximena", "Perez", "ximena@correo.cl", 123);
        alumnos.add(alu);
        alu = new Alumno(2020002, 2020, 0, 0, 1002, "Juan", "Aguilar", "juan@correo.cl", 456);
        alumnos.add(alu);
        alu = new Alumno(2020003, 2020, 0, 0, 1003, "Javier", "Cornejo", "javier@correo.cl", 789);
        alumnos.add(alu);
        alu_01 = new Alumno(2020004 , 2019, 5, 3, 1004 ,"Jonathan ","Venegas ","jonathan@correo.cl", 91111111);
        alumnos.add(alu_01);
        alu_02 = new Alumno(2020005 , 2019, 3, 10, 1005 ,"Priscila ","Padilla ","priscila@correo.cl", 92222222);
        alumnos.add(alu_02);
        alu_03 = new Alumno(2020006 , 2018, 0, 0, 1006 ,"Johana ","Morales ","johana@correo.cl", 933333333);
        alumnos.add(alu_03);
        alu_04 = new Alumno(2020007 , 2017, 3, 10, 1007 ,"Pablo ","Prieto ","pablo@correo.cl", 94444444);
        alumnos.add(alu_04);
        
        Taller tal_01, tal_02, tal_03, tal_04, tal_05;
        
        // tallerid, nobre, Horas, cantidad , precio
       
        tal_01 = new Taller(7001, "HTML", 24, 15, 25000);
        talleres.add(tal_01);
        tal_02 = new Taller(7002, "CSS", 45, 15, 35000);
        talleres.add(tal_02);
        tal_03 = new Taller(7003, "Javascritp", 100, 15, 40000);
        talleres.add(tal_03);
        tal_04 = new Taller(7004, "JAVA", 150, 15, 50000);
        talleres.add(tal_04);
        tal_05 = new Taller(7005, "Angular", 35, 15, 35000);
        
        talleres.add(tal_05);
       
        
        // matriculaid, codigo, tallerid, alumnoid
        mat = new Matricula(2001, "Jul2020", tal_01, alu_04);
        matriculas.add(mat);
        
        mat = new Matricula(2002, "Jul2020", tal_02, alu_04);
        matriculas.add(mat);
        
        mat = new Matricula(2003, "Jul2020", tal_03, alu_04);
        matriculas.add(mat);
        
        mat = new Matricula(2004, "Jul2020", tal_02, alu_02);
        matriculas.add(mat);
        
        mat = new Matricula(2005, "Jul2020", tal_03, alu_02);
        matriculas.add(mat);
        
        mat = new Matricula(2006, "Jul2020", tal_05, alu_01);
        matriculas.add(mat);
        
        

        int opc;
        do {
            opc = LeerMenu();
            switch (opc) {
                case 1:
                    // tradicional recorrer un index
                    System.out.println("Listar alumnos");
                    for (int i = 0; i < alumnos.size(); i++) {
                        System.out.println((i + 1) + ".- " + alumnos.get(i).toString());
                    }
                    break;
                case 2:
                    // tradicional recorrer un index
                    System.out.println("Listar talleres");
                    for (int i = 0; i < talleres.size(); i++) {
                        System.out.println((i + 1) + ".- " + talleres.get(i).toString());
                    }
                    break;
                case 3:
                    // tradicional recorrer un index
                    System.out.println("Listar matriculas");
                    for (int i = 0; i < matriculas.size(); i++) {
                        System.out.println((i + 1) + ".- " + matriculas.get(i).toString());
                    }
                    break;
                case 4:
                    alu = new Alumno();
                    alu.Nuevo();
                    alumnos.add(alu);
                    break;
                case 5:
                    tal = new Taller();
                    tal.Nuevo();
                    talleres.add(tal);
                    break;
                case 6:
                    boolean std1 = false;
                    boolean std2 = false;
                    mat = new Matricula();
                    mat.Nuevo();
                    for (Taller item : talleres) {
                        if (mat.getTaller().getTallerid() == item.getTallerid()) {
                            mat.setTaller(item);
                            std1 = true;
                        }
                    }
                    for (Alumno item : alumnos) {
                        if (mat.getAlumno().getAlumnoid() == item.getAlumnoid()) {
                            mat.setAlumno(item);
                            std2 = true;
                        }
                    }
                    if (std1 && std2) {
                        matriculas.add(mat);
                    }else{
                        System.out.println("Error taller y/o alumno no existe!");
                    }
                    break;
                    
                    
                case 7:
                        System.out.print("Ingrese Id alumo");
                        int id_alumno  = Leer.datoInt();
                        matriculados.clear();
                       
                        Matricula obj = new Matricula();
                        boolean exite = false;
                        
                    
                        for(Matricula item: matriculas)
                        {
                            
                            if(item.getAlumno().getAlumnoid() ==  id_alumno)
                            {
                               
                               obj = new Matricula();
                               obj.setMatriculaid(item.getMatriculaid());
                               obj.setCodigo(item.getCodigo());
                               obj.setAlumno(item.getAlumno());
                               obj.setTaller(item.getTaller());
                            
                               matriculados.add(obj);
                               exite = true;

                            }
                        }
                            
                            if(exite)
                            {
                            
                                                       
                              mat.Facturacion(matriculados);
                            }
                            else
                            {
                                 
                            // no existe en lita
                            }
  
                    
                    
                    break;
                    
                case 8:
                    
                        System.out.print("Ingrese Id Taller");
                        int id_taller  = Leer.datoInt();
                        matriculados.clear();
                        Matricula obj1 = new Matricula();
                        boolean exitetaller = false;
                        
                    
                        for(Matricula item: matriculas)
                        {
                            
                            if(item.getTaller().getTallerid() ==  id_taller)
                            {
                               
                               obj1 = new Matricula();
                               obj1.setMatriculaid(item.getMatriculaid());
                               obj1.setCodigo(item.getCodigo());
                               obj1.setAlumno(item.getAlumno());
                               obj1.setTaller(item.getTaller());
                            
                               matriculados.add(obj1);
                               exitetaller = true;

                            }
                        }
                            
                            if(exitetaller)
                            {
                            
                               mat.ListAlumno(matriculados);
                           
                            }
                            else
                            {
                                 
                            // no existe en lita
                            }
                    
                    
                    
                    break;
                    
                    
                    
                    
            }
        } while (opc != 9);

    }

    public static int LeerMenu() {
        System.out.println("Menu");
        System.out.println("1. Listar alumnos");
        System.out.println("2. Listar Talleres");
        System.out.println("3. Listar matriculas");
        System.out.println("4. Crear alumno");
        System.out.println("5. Crear taller");
        System.out.println("6. Matricular");
        System.out.println("7. Factura alumno");
        System.out.println("8. Lista alumno");
        System.out.println("9. Salir");
        System.out.print("Ingrese opcion : ");
        return Leer.datoInt();
    }

}
