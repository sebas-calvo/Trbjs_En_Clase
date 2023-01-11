/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_03_6.vista;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author sebas
 */
public class PanelPaint extends JPanel {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(90, 90, 10, 400);
        
        g.setColor(Color.CYAN);
        g.fillRect(100, 100, 300, 100);
        
        g.setColor(Color.WHITE);
        g.fillRect(100, 150, 300, 100);
        
        g.setColor(Color.cyan);
        g.fillRect(100, 200, 300, 50);
        
        g.setColor(Color.YELLOW);
        g.fillOval(220, 150, 50, 50);
        
        
        g.drawLine(245, 175, 300, 200);
        g.drawLine(245, 175, 300, 225);
        g.drawLine(245, 175, 300, 125);
        g.drawLine(245, 175, 300, 100);
        
        g.drawLine(245, 175, 200, 200);
        g.drawLine(245, 175, 200, 225);
        g.drawLine(245, 175, 200, 125);
        g.drawLine(245, 175, 200, 100);
        
        g.drawLine(245, 175, 175, 175);
        g.drawLine(245, 175, 325, 175);
        
        g.setColor(Color.orange);
        g.fillOval(230, 163, 7, 7);
        g.fillOval(252, 163, 7, 7);
        g.drawArc(227, 150, 35, 45, 0, -180);
        
        g.setColor(Color.cyan);
        g.fillRect(200, 200, 500, 50);
        
         
        
       
        

    }

}
