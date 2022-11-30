/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Solucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero_empleados;
        String nombre;
        int cedula;
        int horas_matutinas;
        int horas_nocturnas;
        int valor_matutina = 10;
        int valor_nocturna = 15;
        int contador = 0;
        String ciudad;
        boolean bandera = true;
        double sueldo_m;
        double sueldo_n;
        double sueldo_subtotal;
        double sueldo_total;
        double adicional;
        double seguro;
        String cadena = "Nómina de Trabajadores\n\n";
        String opcion;
        
        while (bandera) {
            System.out.println("Ingrese el nombre del empleado");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la ciudad del empleado");
            ciudad = entrada.nextLine();
            System.out.println("Ingrese la cedula del empleado");
            cedula = entrada.nextInt();
            System.out.println("Ingrese las horas matutinas del empleado");
            horas_matutinas = entrada.nextInt();
            System.out.println("Ingrese las horas nocturnas del empleado");
            horas_nocturnas = entrada.nextInt();
            
            sueldo_m = horas_matutinas * valor_matutina ;
            sueldo_n = horas_nocturnas * valor_nocturna ;
            
            if (horas_nocturnas >= 10 ){
                
                adicional = (horas_nocturnas * 10)/100 ;
                sueldo_n = sueldo_n + adicional;
            }
            
            sueldo_subtotal = sueldo_m + sueldo_n;
            seguro = (sueldo_subtotal * 18)/100;
            sueldo_total = sueldo_subtotal - seguro;
            
            contador = contador + 1;
            
            cadena = cadena + "Rol del trabajador de nombre " + nombre + 
                    " y cédula " + cedula + ".\n\tHoras matutina trabajadas: "
                    + horas_matutinas + ".\n\tHoras nocturnas trabajadas: "
                    + horas_nocturnas + ".\n\tSubtotal $" + sueldo_subtotal +
                    "\n\tSeguro Social $" + seguro + "\n\tTotal a cancelar $" +
                    sueldo_total + "\n\n";
            
            entrada.nextLine();
            
            System.out.println("Si desea no ingresar mas emplados, escriba S");
            opcion = entrada.nextLine();
            
            if (opcion.equals("S")){
                bandera = false;
                }
                
            }
        
        System.out.println(cadena);
        System.out.println("Numero de empleados: " + contador);
        }
       
   
    }
    

