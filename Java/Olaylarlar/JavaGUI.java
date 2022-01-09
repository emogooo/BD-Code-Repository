/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olaylarlar;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class JavaGUI  {
    JFrame frame;
    JLabel baslik;
    JLabel status;
    JPanel controlpanel;
    public static void main(String[] args) {
         JavaGUI j = new JavaGUI();
         j.initGUI();
         j.demoYap();
    }
    
    void initGUI(){
        frame = new JFrame("ilk GUI uygulamam...");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new GridLayout(3,1));
        
        baslik = new JLabel(" İLK UYGULAMAMIZ ", JLabel.CENTER);
        status = new JLabel(" NE DESEM Kİ", JLabel.CENTER);
        status.setSize(350,100);
        
        
        controlpanel = new JPanel();
        controlpanel.setLayout(new FlowLayout());
        frame.add(baslik);
        frame.add(status);
        frame.add(controlpanel);
        
        frame.setVisible(true);
        
        
    }
    
    void demoYap(){
        
        baslik.setText("ilk çalışmamız hayırlı olsun...");
        
        JButton b1 = new JButton("TAMAM");
        JButton b2 = new JButton("Listele");
        JButton b3 = new JButton("İptal");
        
        b1.addActionListener(new ButtonDinleyici());
        b2.addActionListener(new ButtonDinleyici());
        b3.addActionListener(new ButtonDinleyici());
        
        controlpanel.add(b1);
        controlpanel.add(b2);
        controlpanel.add(b3);
        
        frame.setVisible(true);
    }
    
    private class ButtonDinleyici implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String komut = e.getActionCommand();
            if(komut.equalsIgnoreCase("TAMAM")){
                status.setText("TAMAM Butonuna tıklandı...");
            }else if(komut.equalsIgnoreCase("Listele")){
                status.setText("Listeleeee...");
                
            }else{
                status.setText("Butona tıklandı...");
            }
            
        }
        
    }
}
