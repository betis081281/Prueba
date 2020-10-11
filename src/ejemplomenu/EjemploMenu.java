/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomenu;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Ismael Ruiz
 */
public class EjemploMenu {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        try {
            Carga carga = new Carga(); //declaracion e instancia de un tipo de dato objeto
            carga.setLocationRelativeTo(null);
            carga.setVisible(true);
            Thread.sleep(5000);
            Login ingreso = new Login(); //instanciamos un nuevo objeto de la clase Login
            ingreso.setLocationRelativeTo(null); //definir la ubicacion en pixeles del objeto instanciado
            ingreso.setVisible(true); //establece el estado de visible para el usuario
            carga.setVisible(false);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Se produjo un error");
            error.printStackTrace();
        } finally {

        }
    }

}
