/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import gravatar.ExibeImagem;
import java.awt.FlowLayout;
import java.awt.MediaTracker;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Christian
 */
public class Gravatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());

        } catch (Exception e) {
            System.out.println("Erro ao carregar um layout.");
            JOptionPane.showMessageDialog(null, "Erro ao carregar um layout.");
        }
        ExibeImagem  tela = new ExibeImagem();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}
