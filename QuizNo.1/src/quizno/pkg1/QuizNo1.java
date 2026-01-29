/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizno.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */

public class QuizNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   //Solicito el nombre del artículo, el código de categoría y el valor CIF del paquete
   String articulo="";
   articulo=JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
   String codigo="";
   codigo=JOptionPane.showInputDialog("Ingrese el codigo del producto: ");
   String precio;
   int costo;
   precio=JOptionPane.showInputDialog("Ingrese el costo del producto: ");
   costo=Integer.parseInt(precio);
   
   //Calculo total con IVA agregado
   double total;
   double IVA=0.13;
   total=(Integer.parseInt(precio))*IVA;
   
   //Arancel Selectivo (Según Categoría)
   
   
   //Mostrar daatos ingresdos y totales 
   JOptionPane.showMessageDialog(null, "Articulo: "+(articulo.toUpperCase()));
   JOptionPane.showMessageDialog(null,precio+ "* 0.13 ="+total);
   
    }
    
}
