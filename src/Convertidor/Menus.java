package Convertidor;

import java.util.Scanner;
import javax.swing.*;
public class Menus {
    
    Scanner in = new Scanner (System.in);
    int opcion;
    
    public Menus() {
        this.opcion = opcion;
    }
    
    public void menu1(){

        Object seleccion = JOptionPane.showInputDialog(
            null,
            "Seleccione Ok",
            "Convertidor de Voz Activa a Pasiva",
            JOptionPane.QUESTION_MESSAGE,
            null,  // null para icono defecto
            new Object[] {"Pasado Perfecto"},
                         "Deslice");
        
        if(seleccion == null){
            opcion=1;

                }else{
                    if (seleccion.equals("Pasado Perfecto")){//----------------
                        opcion=1;


                                    }
                                }
                            }
                        }


