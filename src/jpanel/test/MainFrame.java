/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.test;

/**
 *
 * @author jacob
 */

import javax.swing.JFrame;

public class MainFrame extends JFrame {
    MainFrame() {
        super("A simple paint program");
        MainPanel mPanel = new MainPanel();
        getContentPane().add(mPanel);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
