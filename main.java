/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acakEnkapsulasi;

import javax.swing.JOptionPane;

/**
 *
 * @author Kelompok 6
 */
public class main {
    public static void main(String[] args) {
        GameTebakAngka p1 = new GameTebakAngka("", 0, 0, 100);
        p1.setPemain(JOptionPane.showInputDialog(null, "PEMAIN:", "NAMA PEMAIN", JOptionPane.INFORMATION_MESSAGE));
        p1.getLevel();
        p1.tampil();
        
    }
    
}
