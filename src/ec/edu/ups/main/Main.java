
package ec.edu.ups.main;

import ec.edu.ups.clases.Cliente;
import ec.edu.ups.clases.Empleado;
import ec.edu.ups.clases.Empresa;
import ec.edu.ups.clases.Habitacion;
import ec.edu.ups.clases.Persona;
import ec.edu.ups.clases.Restaurante;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Domenika Delgado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
        //Fechas
        GregorianCalendar fechaJuanLopez = new GregorianCalendar(2018, 06, 29);
        GregorianCalendar fechaApertuC = new GregorianCalendar(2005, 10, 25);
        GregorianCalendar fechaDeApe = new GregorianCalendar(1997, 10, 11);
        GregorianCalendar fechaIngreso = new GregorianCalendar(2019, 04, 6);
        GregorianCalendar fechaSalida = new GregorianCalendar(2019, 04, 16);
        
        
        //Implementacion
        Empleado JuanLopez = new Empleado(43, "Vendedor", 367.9, fechaJuanLopez.getTime(), "0105295789", "Juan", "Lopez", 35, "Luiz", "Coral", "0995783648", fechaApertuC.getTime());
        System.out.println(JuanLopez.toString());
        System.out.println(JuanLopez.informacion());
        System.out.println(JuanLopez.ubicacion());
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("");
        
        Cliente LuisTobar = new Cliente(474, "General Torres", "tobar@gmail.com", "0997563821", "0107567832", "Luis", "Tobar", 38, "Valdez", "SuperMaxi", "2957863", fechaDeApe.getTime());
        System.out.println(LuisTobar.toString());
        System.out.println(LuisTobar.informacion());
        System.out.println(LuisTobar.ubicacion());
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("");
        
        Habitacion hab1 = new Habitacion(54, 4, fechaIngreso.getTime(), fechaSalida.getTime(), 2, 5, "Luis Calle", "Manuel Tenorio", "Juan Perez", "Coral", "09967846372", fechaApertuC.getTime());
        System.out.println(hab1.toString());
        System.out.println(hab1.informacion());
        System.out.println(hab1.ubicacion());
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("");

        Restaurante res1= new Restaurante(20, 100, "Alitas a Domicilio y para servirce", 5, 54, 5, "Juan Cardenas", "Paseo de los Canaris", "Manuel Lopez", "SuperMaxi", "2984021", fechaApertuC.getTime());
        System.out.println(res1.toString());  
        System.out.println(res1.informacion());
        System.out.println(res1.ubicacion());
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("");
        
        //DownCasting
        List <Empresa> lista = new ArrayList<>();
        lista.add(JuanLopez);
        lista.add(LuisTobar);
        lista.add(hab1);
        lista.add(res1);
        
        for(Empresa emp : lista){
            if(emp instanceof Cliente){
                Cliente temp = (Cliente) emp;
                System.out.println(temp);
            }
            else if(emp instanceof Empleado){
                Empleado temp = (Empleado) emp;
                System.out.println(temp);
            }
            else if(emp instanceof Habitacion){
                Habitacion temp = (Habitacion) emp;
                System.out.println(temp);
            }
            else if(emp instanceof Restaurante){
                Restaurante temp = (Restaurante) emp;
                System.out.println(temp);
            }
        }
        
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("");
        
        
        //Clase Anonima
        Persona empleadoAnonimo = new Persona("010746371", "Juana", "Maldonado", 21) {
            @Override
            public boolean VerificarPersona() {
                System.out.println("Datos correctos" + getNombre());
                return true;
            }
        };

        System.out.println(empleadoAnonimo);
    }
    
}
