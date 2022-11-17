package Convertidor;

import javax.swing.JOptionPane;

public class Iteradores {
    Menus m1 = new Menus();
    String sujeto, VtoB, objeto , verbo,complemento;
    String oracion;
    int x;
    public void seleccion(){
        String[] options = {"Singular","Plural"};
        
        x = JOptionPane.showOptionDialog(null, "What group does your object belong to?",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
    }
    public void pedirDatos(){
        sujeto = JOptionPane.showInputDialog("Subject");
        objeto = JOptionPane.showInputDialog("Object");
        seleccion();
                if(x==1){
                    VtoB= "were";
                }else{
                    VtoB= "was";
                }
        verbo = JOptionPane.showInputDialog("Verb");
        complemento = JOptionPane.showInputDialog("Complement");
    }
    
    public void iterador1(){
        m1.menu1();
        switch(m1.opcion){


        case 1:
                pedirDatos();
                oracion = objeto +" had been"+ verbo + " "+complemento;
                JOptionPane.showMessageDialog(null, oracion);
        break;

            case 9:
                System.out.println("Exit...");
                break;

        default:
        String error = "El numero ingresado no esta en la lista";
        JOptionPane.showMessageDialog(null, error);
        break;
        }
    }
}