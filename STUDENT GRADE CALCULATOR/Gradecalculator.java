import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gradecalculator implements ActionListener {
    JTextField textField1, textField2,textField3,textField4,textField5,perTextField,sumTextField;
    JTextField textField6,textField7,textField8,textField9,textField10,textField11,textField12,textField13;
    JLabel l8,l7,l6;
    JButton button1;
    float sum=0;
    String str="";
    float percentage;
    void frame()
    {
        JFrame f=new JFrame("GRADE CALCULATOR");

        JLabel l1=new JLabel("Student Name:");
        JLabel l2=new JLabel("Roll no:");
        JLabel l3=new JLabel("Class:");
        JLabel l5=new JLabel("SUBJECT NAME:");
        JLabel l4=new JLabel("MARKS");
        l6=new JLabel("GRADE: ");
        l7=new JLabel("PERCENTAGE: ");
        JLabel l9=new JLabel("");
        l8=new JLabel("TOTAL MARKS: ");

        button1=new JButton("CALCULATE GRADE");
        button1.setBounds(230, 310, 250, 40);
        
        l1.setBounds(10, 10, 90, 30);
        l2.setBounds(10, 30, 80, 30);
        l3.setBounds(10, 50, 80, 30);
        l4.setBounds(250, 120, 80, 30);
        l5.setBounds(35, 120, 100, 30);
        l8.setBounds(20, 300, 150, 30);
        l7.setBounds(20, 320, 150, 30);
        l6.setBounds(20, 340, 100, 30);
        l9.setBounds(20, 300, 100, 30);

        textField1 =new JTextField();
        textField2=new JTextField();
        textField3=new JTextField();
        textField4=new JTextField();
        textField5=new JTextField();
        textField6=new JTextField();
        textField7=new JTextField();
        textField8=new JTextField();
        textField9=new JTextField();
        textField10=new JTextField();
        textField11=new JTextField();
        textField12=new JTextField();
        textField13=new JTextField();

        
        textField1.setBounds(100, 15, 100, 20);
        textField2.setBounds(100, 35, 30, 20);
        textField3.setBounds(100, 55, 100, 20);
        textField4.setBounds(35, 150, 100, 20);
        textField5.setBounds(35, 170, 100, 20);
        textField6.setBounds(35, 190, 100, 20);
        textField7.setBounds(35, 210, 100, 20);
        textField8.setBounds(35, 230, 100, 20);
        textField9.setBounds(250, 150, 100, 20);
        textField10.setBounds(250, 170, 100, 20);
        textField11.setBounds(250, 190, 100, 20);
        textField12.setBounds(250, 210, 100, 20);
        textField13.setBounds(250, 230, 100, 20);

        button1.addActionListener(this);
        
        f.add(button1);
        f.add(l1);
        f.add(textField1);
        f.add(textField3);
        f.add(textField4);
        f.add(textField5);
        f.add(textField6);
        f.add(textField7);
        f.add(textField8);
        f.add(textField9);
        f.add(textField10);
        f.add(textField11);
        f.add(textField12);
        f.add(textField13);
        f.add(l2);
        f.add(textField2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.setSize(500, 500);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    { 
        Float n1=Float.parseFloat(textField9.getText());
        Float n2=Float.parseFloat(textField10.getText());
        Float n3=Float.parseFloat(textField11.getText());
        Float n4=Float.parseFloat(textField12.getText());
        Float n5=Float.parseFloat(textField13.getText());
        float sum=0;
        float percentage;
        if(e.getSource()==button1)
        {
            sum+=n1+n2+n3+n4+n5;
            l8.setText("TOTAL MARKS: "+sum);
            percentage=(float)((sum/500)*100);
            l7.setText("PERCENTAGE: "+percentage+"%");
            if(percentage>=95)
            {
                str+="A+";
                l6.setText("GRADE: "+str);
            }
            else if(percentage>=90 && percentage<95)
            {
                char c='A';
                l6.setText("GRADE: "+c);
            }
            else if(percentage>=85 && percentage<90)
            {
                String c="B+";
                l6.setText("GRADE: "+c);
            }
            else if(percentage>=80 && percentage<85)
            {
                char c='B';
                l6.setText("GRADE: "+c);
            }
            else if(percentage>=75 && percentage<80)
            {
                String c="C+";
                l6.setText("GRADE: "+c);
            }
            else if(percentage>=70 && percentage<75)
            {
                char c='C';
                l6.setText("GRADE: "+c);
            }
            else if(percentage>=65 && percentage<70)
            {
                String c="D+";
                l6.setText("GRADE: "+c);
            }
            else if(percentage>=60 && percentage<65)
            {
                char c='D';
                l6.setText("GRADE: "+c);
            }
            else if(percentage>=40 && percentage<60)
            {
                char c='E';
                l6.setText("GRADE: "+c);
            }
            else if(percentage<40)
            {
                char c='F';
                l6.setText("GRADE: "+c);
            }
        }


    }
    public static void main(String[] args) {
        Gradecalculator g=new Gradecalculator();
        g.frame();
    }
    
}
