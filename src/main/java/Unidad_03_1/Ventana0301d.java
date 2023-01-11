/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_03_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sebas
 */
public class Ventana0301d extends JFrame{
    
    private List<JPanel> jPanelList;
    
    public Ventana0301d() throws HeadlessException {
        
        this.setTitle("Banderas Grupo A");
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        
        
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
        
    }
    
    public void iniciarPaneles(){
        this.jPanelList= new ArrayList<>();
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.get(0).setLayout(new GridLayout(2,2));
        this.jPanelList.get(1).setLayout(new BorderLayout());
        this.jPanelList.get(2).setLayout(new BorderLayout());
        this.jPanelList.get(3).setLayout(new BorderLayout());
        this.jPanelList.get(4).setLayout(new BorderLayout());
        
        this.jPanelList.get(5).setBackground(Color.yellow);
        this.jPanelList.get(6).setBackground(Color.yellow);
        this.jPanelList.get(7).setBackground(Color.blue);
        this.jPanelList.get(8).setBackground(Color.red);
        
        this.jPanelList.get(9).setBackground(Color.white);
        this.jPanelList.get(10).setBackground(Color.red);
        
        this.jPanelList.get(11).setBackground(Color.red);
        this.jPanelList.get(12).setBackground(Color.white);
        this.jPanelList.get(13).setBackground(Color.blue);
        
        this.jPanelList.get(14).setBackground(Color.green);
        this.jPanelList.get(15).setBackground(Color.yellow);
        this.jPanelList.get(16).setBackground(Color.red);
        
        
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));

        this.jPanelList.get(1).add(this.jPanelList.get(5),BorderLayout.NORTH);
        this.jPanelList.get(1).add(this.jPanelList.get(6),BorderLayout.NORTH);
        this.jPanelList.get(1).add(this.jPanelList.get(7),BorderLayout.CENTER);
        this.jPanelList.get(1).add(this.jPanelList.get(8),BorderLayout.SOUTH);
        
        this.jPanelList.get(2).add(this.jPanelList.get(9),BorderLayout.WEST);
        this.jPanelList.get(2).add(this.jPanelList.get(10),BorderLayout.EAST);
        
        this.jPanelList.get(3).add(this.jPanelList.get(11),BorderLayout.NORTH);
        this.jPanelList.get(3).add(this.jPanelList.get(12),BorderLayout.CENTER);
        this.jPanelList.get(3).add(this.jPanelList.get(13),BorderLayout.SOUTH);
        
        
        this.jPanelList.get(4).add(this.jPanelList.get(14),BorderLayout.WEST);
        this.jPanelList.get(4).add(this.jPanelList.get(15),BorderLayout.CENTER);
        this.jPanelList.get(4).add(this.jPanelList.get(16),BorderLayout.EAST);
        
    }
}

