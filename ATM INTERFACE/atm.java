import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class atm implements ActionListener {
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    Container c;
    JPanel p1,p2,p3,p4,p5,p6;
    JButton l1,l2;
    int pin=12345;
    JLabel l3,l4,l5,l6,l7,l8,l9,l10,l11;
    int totalamount=10000;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;

    void Atm()
    {
    f=new JFrame("ATM INTERFACE");
    JLabel label=new JLabel("!! ATM INTERFACE !!");
    label.setFont(new Font("Arial",Font.BOLD, 23));
    label.setForeground(Color.RED);
    label.setBounds(110, 5,250, 50);

     ImageIcon i=new ImageIcon("atm.png");
     f.setIconImage(i.getImage());

     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     c=f.getContentPane();
     c.add(label);
     c.setLayout(null);
     f.setSize(490, 550);
     c.setVisible(true);
     f.setVisible(true);
     f.setLayout(null);

     c.setBackground(Color.LIGHT_GRAY);

     b1=new JButton("Insert Card");
     b1.setBounds(280, 455,150, 40);
     b1.setBackground(Color.green);
     b1.addActionListener(this);

     b2=new JButton("Close");
     b2.setBounds(30, 455,100, 40);
     b2.setBackground(Color.red);
     b2.addActionListener(this);

     p1=new JPanel();
     p1.setBounds(30, 50, 400, 400);
     p1.setBackground(Color.BLUE);
     p1.setLayout(null);

     Font font=new Font("Arial",Font.BOLD,18);
    
     l3=new JLabel("Select Your Language:");
     l3.setBounds(110, 10, 300, 40);
     l3.setForeground(Color.WHITE);
     l3.setFont(font);

     l1=new JButton("ENGLISH");
     l1.setBounds(150, 100, 100, 40);
     l2=new JButton("HINDI");
     l2.setBounds(150, 250, 100, 40);

     b3=new JButton("Check Balance");
     b4=new JButton("Withdraw");
     b5=new JButton("Deposit");
     b6=new JButton("Change Pin");

     b3.setBounds(125,70 ,150, 30);
     b4.setBounds(125,130 ,150, 30);
     b5.setBounds(125,190 ,150, 30);
     b6.setBounds(125,250 ,150, 30);

     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     b6.addActionListener(this);

     p1.add(l1);
     p1.add(l2);
     p1.add(l3);
     p1.setVisible(false);

     l1.addActionListener(this);
     l2.addActionListener(this);

     p2=new JPanel();
     p2.setBounds(30, 50, 400, 400);
     p2.setVisible(false);
     p2.setBackground(Color.BLUE);
     p2.setLayout(null);
     p2.add(b3);
     p2.add(b4);
     p2.add(b5);
     p2.add(b6);

     p3=new JPanel();
     p3.setBounds(30, 50, 400, 400);
     p3.setBackground(Color.BLUE);
     p3.setLayout(null);
     
     l3=new JLabel("Enter Your Pin:");
     l3.setFont(font);
     l3.setForeground(Color.white);
     l3.setBounds(10,50, 150, 30);
     tf1=new JTextField();
     tf1.setBounds(150, 55,40, 20);
     l3.setVisible(false);
     tf1.setVisible(false);
     p3.add(l3);
     p3.add(tf1);

     l4=new JLabel("");
     l5=new JLabel("");
     l4.setBounds(10,100,250,50);
     l5.setBounds(30, 140, 250,80);
     l4.setFont(new Font("Arial",Font.BOLD, 15));
     l5.setFont(new Font("Arial",Font.BOLD,36));
     l4.setForeground(Color.WHITE);
     l5.setForeground(Color.YELLOW);
     l4.setVisible(false);
     l5.setVisible(false);
     p3.add(l4);
     p3.add(l5);

     b7=new JButton("Press Enter");
     b7.setBounds(195, 55,110, 20);
     b7.setBackground(Color.GREEN);
     b7.setVisible(false);
     p3.add(b7);
     b7.addActionListener(this);
     
     p4=new JPanel();
     p4.setBounds(30, 50, 400, 400);
     p4.setBackground(Color.BLUE);
     p4.setLayout(null);

     l6=new JLabel("Enter The amount :");
     l6.setFont(new Font("Arial", Font.BOLD,16));
     l6.setForeground(Color.white);
     l6.setBounds(10, 30,150, 40);
     tf2=new JTextField();
     tf2.setBounds(163,42,55,20);
     tf2.setVisible(false);

     l7=new JLabel("Enter The Pin: ");
     l7.setFont(new Font("Arial", Font.BOLD,17));
     l7.setBounds(10,70, 150, 40);
     l7.setForeground(Color.white);
     tf3=new JTextField();
     tf3.setVisible(false);
     tf3.setBounds(130, 80, 45, 20);
     
     b8=new JButton("Press Enter");
     b8.setBounds(195, 80,110, 20);
     b8.setBackground(Color.GREEN);
     b8.setVisible(false);
     p4.add(b8);
     b8.addActionListener(this);

     p4.add(tf3);
     p4.add(l7);
     p4.add(tf2);
     p4.add(l6);
     p4.add(l4);
     p4.add(l5);

     p5=new JPanel();
     p5.setBounds(30, 50, 400, 400);
     p5.setBackground(Color.BLUE);
     p5.setLayout(null);

     l8=new JLabel("Enter The amount :");
     l8.setFont(new Font("Arial", Font.BOLD,16));
     l8.setForeground(Color.white);
     l8.setBounds(10, 30,150, 40);
     tf2=new JTextField();
     tf2.setBounds(163,42,55,20);
     tf2.setVisible(false);

     l9=new JLabel("Enter The Pin: ");
     l9.setFont(new Font("Arial", Font.BOLD,17));
     l9.setBounds(10,70, 150, 40);
     l9.setForeground(Color.white);
     tf3=new JTextField();
     tf3.setVisible(false);
     tf3.setBounds(130, 80, 45, 20);

     b9=new JButton("Press Enter");
     b9.setBounds(195, 80,110, 20);
     b9.setBackground(Color.GREEN);
     b9.setVisible(false);
     b9.addActionListener(this);

     p5.add(l8);
     p5.add(tf2);
     p5.add(tf3);
     p5.add(l9);
     p5.add(b9);
     p5.add(l4);
     p5.add(l5);

     p6=new JPanel();
     p6.setBounds(30, 50, 400, 400);
     p6.setBackground(Color.BLUE);
     p6.setLayout(null);

     l10=new JLabel("Enter New Pin :");
     l10.setFont(new Font("Arial", Font.BOLD,16));
     l10.setForeground(Color.white);
     l10.setBounds(10, 30,150, 40);
     tf2=new JTextField();
     tf2.setBounds(163,42,55,20);
     tf2.setVisible(false);

     l11=new JLabel("Enter Old Pin: ");
     l11.setFont(new Font("Arial", Font.BOLD,17));
     l11.setBounds(10,70, 150, 40);
     l11.setForeground(Color.white);
     tf3=new JTextField();
     tf3.setVisible(false);
     tf3.setBounds(130, 80, 45, 20);

     b10=new JButton("Press Enter");
     b10.setBounds(195, 80,110, 20);
     b10.setBackground(Color.GREEN);
     b10.setVisible(false);
     b10.addActionListener(this);

     p6.add(l10);
     p6.add(tf2);
     p6.add(tf3);
     p6.add(l11);
     p6.add(b10);
     p6.add(l4);
     p6.add(l5);



     c.add(b1);
     c.add(b2);
     c.add(p1);
     c.add(p2);
     c.add(p3);
     c.add(p4);
     c.add(p5);
     c.add(p6);
     

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            b2.setEnabled(true);
            b2.setVisible(true);
            p1.setVisible(true);
            b1.setEnabled(false);
        }
        else if(e.getSource()==l1)
        {
            p1.setVisible(false);
            b8.setVisible(false);
            p2.setVisible(true);
            tf1.setVisible(false);
            b3.setVisible(true);
            b4.setVisible(true);
            b5.setVisible(true);
            b6.setVisible(true);
            b7.setVisible(false);
            b8.setVisible(false);
            b9.setVisible(false);
            b10.setVisible(false);
        }
        else if(e.getSource()==b3)
        {
            b7.setVisible(true);
            p2.setVisible(false);
            p3.setVisible(true);
            tf1.setVisible(true);
            tf2.setVisible(false);
            tf3.setVisible(false);
            b8.setVisible(false);
            b9.setVisible(false);
            b10.setVisible(false);
            l3.setVisible(true);
            b2.setVisible(true);
            b2.setEnabled(true);
        }
        else if(e.getSource()==b7)
        {
            int num=Integer.parseInt(tf1.getText());
            if(num==pin)
            {
                l4.setVisible(true);
                l5.setVisible(true);
                l4.setText("Your Current Account Balance: ");
                l4.setFont(new Font("Arial",Font.BOLD,16));
                l5.setText(""+totalamount);
            }
            else{
                l4.setVisible(true);
                l5.setVisible(true);
                l4.setText("Wrong Pin ,Please Enter");
                l4.setFont(new Font("Arial",Font.BOLD,20));
                l5.setFont(new Font("Arial",Font.BOLD,30));
                l5.setForeground(Color.red);
                l5.setText("Right Pin");
            }
        }
        else if(e.getSource()==b4)
        {
            p4.setVisible(true);
            b8.setVisible(true);
            tf2.setVisible(true);
            tf3.setVisible(true);
            tf1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(false);
            b7.setVisible(false);
            b10.setVisible(false);
            b9.setVisible(false);
            b2.setVisible(true);
            b2.setEnabled(true);
            
        }
        else if(e.getSource()==b8)
        {
            int num=Integer.parseInt(tf2.getText());
            int pin1=Integer.parseInt(tf3.getText());
            int num1=totalamount;
            if(pin==pin1 && num<=totalamount)
            {
                l4.setVisible(true);
                l5.setVisible(true);
                l4.setText("Withdrawal Successfull !!");
                l4.setBounds(30,150,290, 30);
                l4.setFont(new Font("Arial",Font.BOLD, 24));
                l4.setForeground(Color.GREEN);
                l5.setForeground(Color.yellow);
                l5.setText(""+num);
                l5.setBounds(30, 180,100,50);
                totalamount=totalamount-num;
            }
            else if(pin!=pin1)
            {
                l4.setVisible(true);
                l5.setVisible(true);
                l4.setText("Wrong Pin ,Please Enter");
                l4.setBounds(30,150,290, 30);
                l4.setFont(new Font("Arial",Font.BOLD,24));
                l5.setFont(new Font("Arial",Font.BOLD,30));
                l5.setForeground(Color.RED);
                 l5.setBounds(30, 180,250,50);
                l5.setText("Right Pin");
            }
            else if(num>totalamount && pin==pin1)
            {
                l4.setVisible(true);
                l5.setVisible(true);
                l4.setText("Insufficient Balance !!");
                l4.setForeground(Color.red);
                l4.setBounds(30,150,290, 30);
                l4.setFont(new Font("Arial",Font.BOLD,24));
                l5.setFont(new Font("Arial",Font.BOLD,26));
                l5.setForeground(Color.GREEN);
                 l5.setBounds(30, 180,290,50);
                l5.setText("Enter valid Amount");
            }
        }
        else if(e.getSource()==b5)
        {
            p2.setVisible(false);
            p5.setVisible(true);
            b9.setVisible(true);
            tf1.setVisible(false);
            tf2.setVisible(true);
            tf3.setVisible(true);
            p3.setVisible(false);
            p4.setVisible(false);
            b7.setVisible(false);
            b8.setVisible(false);
            b10.setVisible(false);
            b2.setVisible(true);
            b2.setEnabled(true);
            
        }
        else if(e.getSource()==b9)
        {
            int num=Integer.parseInt(tf2.getText());
            int pin1=Integer.parseInt(tf3.getText());
            if(pin==pin1)
            {
                l4.setVisible(true);
                l5.setVisible(true);
                l4.setText("Deposit Successfull!!");
                l4.setBounds(30,150,290, 30);
                l4.setFont(new Font("Arial",Font.BOLD, 24));
                l4.setForeground(Color.GREEN);
                l5.setForeground(Color.yellow);
                l5.setText(""+num);
                l5.setBounds(30, 180,100,50);
                totalamount=totalamount+num;
            }
            else if(pin!=pin1)
            {
                l4.setVisible(true);
                l5.setVisible(true);
                l4.setText("Wrong Pin ,Please Enter");
                l4.setBounds(30,150,290, 30);
                l4.setFont(new Font("Arial",Font.BOLD,24));
                l5.setFont(new Font("Arial",Font.BOLD,30));
                l5.setForeground(Color.RED);
                 l5.setBounds(30, 180,250,50);
                l5.setText("Right Pin");
            }
        }
        else if(e.getSource()==b6)
        {
            p2.setVisible(false);
            p6.setVisible(true);
            p2.setVisible(false);
            b10.setVisible(true);
            tf1.setVisible(false);
            tf2.setVisible(true);
            tf3.setVisible(true);
            p3.setVisible(false);
            p4.setVisible(false);
            p5.setVisible(false);
            b7.setVisible(false);
            b8.setVisible(false);
            b9.setVisible(false);
            b2.setVisible(true);
            b2.setEnabled(true);
        }
        else if(e.getSource()==b10)
        {
            int newpin=Integer.parseInt(tf2.getText());
            int oldpin=Integer.parseInt(tf3.getText());
            if(oldpin==pin)
            {
                pin=newpin;
                l4.setVisible(true);
                l4.setText("Pin Change Successfully !!");
                l4.setBounds(30,150,290, 30);
                l4.setFont(new Font("Arial",Font.BOLD,24));
                l4.setForeground(Color.green);
                l5.setText("");
            } 
            else if(pin!=oldpin)
            {
                l4.setVisible(true);
                l5.setVisible(true);
                l4.setText("Wrong Pin ,Please Enter");
                l4.setBounds(30,150,290, 30);
                l4.setFont(new Font("Arial",Font.BOLD,24));
                l5.setFont(new Font("Arial",Font.BOLD,30));
                l5.setForeground(Color.RED);
                l5.setBounds(30, 180,250,50);
                l5.setText("Right Pin");
            }
        }
        else if(e.getSource()==b2)
        {
            p1.setVisible(true);
            b1.setEnabled(true);
            b2.setEnabled(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            b6.setVisible(false);
        }

    }
    public static void main(String[] args) {
        atm a=new atm();
        a.Atm();
    }
    
}
