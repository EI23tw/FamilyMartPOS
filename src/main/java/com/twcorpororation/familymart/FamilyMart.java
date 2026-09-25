/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.twcorpororation.familymart;
import com.twcorpororation.familymart.FrmLogin;

/**
 *
 * @author Luigui
 */
public class FamilyMart {
    public static void main(String[] args) {
        // Asegura que la interfaz gráfica se ejecute en el hilo correcto de Swing
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Instanciar el formulario de login
                FrmLogin ventanaLogin = new FrmLogin();
                
                // Centrar la ventana en la pantalla
                ventanaLogin.setLocationRelativeTo(null);
                
                // Hacer visible la ventana
                ventanaLogin.setVisible(true);
            }
        });
    }
}
