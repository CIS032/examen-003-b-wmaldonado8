/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaprofesores;

import javax.swing.JOptionPane;

/**
 *
 * @author OrixStranger
 */
public class Ejecutor {

    public static void main(String[] args) {
        ListaProfesores lp = new ListaProfesores();
        boolean continuar = true;
        boolean a =true;
        do {
            int aleatorio = (int) (Math.random() * 3 + 1);
            lp.menu(aleatorio);
            switch (aleatorio) {
                case 1:
                    
                    String cedula1 = JOptionPane.showInputDialog("Ingrese numero de cedula");
                    String nombre1 = JOptionPane.showInputDialog("Ingrese nombre");
                    String apellido1 = JOptionPane.showInputDialog("Ingrese apellido");
                    
                    int horasClase1 = 0;
                    while (a) {
                        horasClase1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trabajadas"));
                        if (horasClase1 <3 || horasClase1>16) {
                            JOptionPane.showMessageDialog(null, "Su rango debe ser de 3 a 16 horas", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }else{    
                            a=false;
                        }
                    }
                    String carrera1 = JOptionPane.showInputDialog("Ingrese nombre de carrera");
                    ProfesorTiempoCompleto ptc = new ProfesorTiempoCompleto(cedula1, nombre1, apellido1, horasClase1, carrera1);
                    lp.agregar(ptc);
                    lp.grabar();
                    int dato = Integer.parseInt(JOptionPane.showInputDialog("1-- salir\n 2 continuar"));
                    if (dato == 1) {
                        continuar = false;
                    }
                    break;
                case 2:
                    
                    String cedula2 = JOptionPane.showInputDialog("Ingrese numero de cedula");
                    String nombre2 = JOptionPane.showInputDialog("Ingrese nombre");
                    String apellido2 = JOptionPane.showInputDialog("Ingrese apellido");
                    int horasClase2 = 0;
                    while (a) {
                        horasClase2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trabajadas"));
                        if (horasClase2 != 10) {
                            JOptionPane.showMessageDialog(null, "Su rango debe ser de 10 horas", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }else{    
                            a=false;
                        }
                    }
                    String carrera2 = JOptionPane.showInputDialog("Ingrese nombre de carrera");
                    ProfesorMedioTiempo pmt = new ProfesorMedioTiempo(cedula2, nombre2, apellido2, horasClase2, carrera2);

                    lp.agregar(pmt);
                    lp.grabar();
                    int dato2 = Integer.parseInt(JOptionPane.showInputDialog("1-- salir\n 2 continuar"));
                    if (dato2 == 1) {
                        continuar = false;
                    }
                    break;
                case 3:
                    String cedula3 = JOptionPane.showInputDialog("Ingrese numero de cedula");
                    String nombre3 = JOptionPane.showInputDialog("Ingrese nombre");
                    String apellido3 = JOptionPane.showInputDialog("Ingrese apellido");
                    int horasClase3 = 0;
                    while (a) {
                        horasClase3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trabajadas"));
                        if (horasClase3 < 2 || horasClase3>9) {
                            JOptionPane.showMessageDialog(null, "Su rango debe ser de 2 a 9 horas", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }else{    
                            a=false;
                        }
                    }
                    String carrera3 = JOptionPane.showInputDialog("Ingrese nombre de carrera");
                    ProfesorTiempoParcial ptp = new ProfesorTiempoParcial(cedula3, nombre3, apellido3, horasClase3, carrera3);
                    lp.agregar(ptp);
                    lp.grabar();
                    int dato3 = Integer.parseInt(JOptionPane.showInputDialog("1-- salir\n 2 continuar"));
                    if (dato3 == 1) {
                        continuar = false;
                    }
                    break;
            }

        } while (continuar);
    }
}
