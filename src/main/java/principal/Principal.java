/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import vista.FrmIMC;
;

/**
 *
 * @author Alma Reyes
 */
public class Principal {
    public static void main(String[] args) {
        
                /*
         * Se utiliza EventQueue para iniciar correctamente
         * la interfaz gráfica de Swing.
         */

        java.awt.EventQueue.invokeLater(() -> {

            new FrmIMC().setVisible(true);

        });
    }

    
}
