import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class myexception extends Exception{
    myexception(){
        System.out.println("exceptionnnn");
    }
}

public class sample implements  ActionListener {
    JFrame f = new JFrame();
    JButton b1 = new JButton("press");
    JButton b2 = new JButton("excep");
    JTextField l1 = new JTextField();

    sample(){
        l1.setBounds(100,10,100,20);
        b1.setBounds(100,50,100,30);
        b1.addActionListener(this);
        b2.setBounds(200,50,100,30);
        b2.addActionListener(this);
        f.add(b2);
        f.add(b1);
        f.add(l1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {    
        if (e.getSource() == b1){    
            String s = l1.getText();  
            StringBuffer sb = new StringBuffer(s);
            sb = sb.reverse();
            String str = sb.toString();
            l1.setText(str);
        }  
        else if (e.getSource() == b2){
            try {
                throw new myexception();
            }
            catch (myexception ex){
            
            }
        }
    }  
    public static void main(String[] args) {
        new sample();
    }
}
