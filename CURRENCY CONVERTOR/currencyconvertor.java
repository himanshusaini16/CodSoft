import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.text.DecimalFormat;
public class currencyconvertor implements ItemListener
{
static JFrame f;
static JLabel a, b,l1,l2,l3,title,star;
static JComboBox c;
static JTextField textField1;
public static void main(String[] args) {
 f = new JFrame ("CURRENCY CONVERTOR");
currencyconvertor s=new currencyconvertor();
textField1=new JTextField();
textField1.setBounds(205, 70, 60, 30);
textField1.setBackground(Color.LIGHT_GRAY);

Color co=new Color(10);
f.setBackground(co);

String str[] = {"SELECT","INDIA TO USA", "USA TO INDIA", "USA TO UK", "UK TO USA", "INDIA TO UK","UK TO INDIA","AUS TO INDIA","OMAN TO INDIA","CHINA TO INDIA","NEPAL TO INDIA"};
c = new JComboBox (str);
c.addItemListener (s);
c.setBounds(175, 110, 115, 25);

Font font = new Font("Arial",Font.BOLD,14);
a = new JLabel ("Unit Value:");
a.setFont(font);
a.setForeground(Color.BLUE);
a.setBounds(38, 160, 300, 25);

Border border=BorderFactory.createLineBorder(Color.black,3,true);
Border border1=BorderFactory.createLineBorder(Color.BLACK,3,true);
a.setBorder(border);
b = new JLabel ("");
Font font2 = new Font("Arial",Font.BOLD,13);
Font font3 = new Font("Arial",Font.BOLD,24);
Font font4 = new Font("Arial",Font.BOLD,28);

title=new JLabel(":CURRENCY CONVERTOR:");
title.setFont(font3);
title.setForeground(Color.RED);
l1=new JLabel("ENTER CURRENCY=");
l1.setFont(font2);
l2=new JLabel("CONVERT = ");
l2.setFont(font2);
l3=new JLabel("AFTER CONVERSON:");
l3.setFont(font);
l3.setBorder(border1);
star=new JLabel("* * * * * * * * * * * * * * * * *");
star.setFont(font4);
star.setBounds(5, 300, 325, 30);


b.setFont(font);
b.setBounds(30,150, 250, 25);
l3.setBounds(38,210, 300, 25);
l1.setBounds(70, 70, 150, 30);
l2.setBounds(70, 110, 120, 30);
title.setBounds(30, 10, 315, 50);

f.add(textField1);
f.add(star);
f.add(title);
f.add(l3);
f.add(l2);
f.add(l1);
f.add (a);
f.add (c);
f.add (b);;
f.setSize (400, 400);
f.setVisible(true);
}
public void itemStateChanged (ItemEvent e)
{
double n1=Double.parseDouble(textField1.getText());
double ans;
DecimalFormat d=new DecimalFormat("0.000");
if (c.getSelectedItem().equals("USA TO INDIA")) {
ans=n1*83.04;
a.setText("1 US Dollar = 83.04 IND Rupee");
l3.setText (n1+" USA Dollar = "+d.format(ans)+"IND Rupee");
l3.setForeground(Color.red);
}
else if(c.getSelectedItem().equals("UK TO INDIA"))
{
    ans=n1*101.28;
    a.setText("1 UK POUND = 101.28 IND Rupee");
    l3.setText(n1+" UK Pound = "+ans+" IND Rupee");
    l3.setForeground(Color.GREEN);
}
else if(c.getSelectedItem().equals("INDIA TO USA"))
{
    ans=n1*0.012;
    a.setText("1 IND Rupee = 0.012 USA Dollar");
    l3.setText(n1+" IND Rupee = "+ans+" USA Dollar");
    l3.setForeground(Color.darkGray);

}
else if(c.getSelectedItem().equals("USA TO UK"))
{
    ans=n1*0.82;
    a.setText("1 USA Dollar = 0.82 UK pound");
    l3.setText(n1+" USA Dollar = "+d.format(ans)+" UK Pound");
    l3.setForeground(Color.blue);
}
else if(c.getSelectedItem().equals("UK TO USA"))
{
    ans=n1*1.22;
    a.setText("1 UK Pound = 1.22 USA Dollar");
    l3.setText(n1+" UK Pound = "+ans+" USA Dollar");
    l3.setForeground(Color.magenta);
}
else if(c.getSelectedItem().equals("INDIA TO UK"))
{
    ans=n1*0.0099;
    a.setText("1 IND Rupee = 0.0099 UK Pound");
    l3.setText(n1+" IND Rupee = "+ans+" UK Pound");
    l3.setForeground(Color.red);
}
else if(c.getSelectedItem().equals("AUS TO INDIA"))
{
    ans=n1*53.42;
    a.setText("1 AUS Dollar = 53.42 IND Rupee");
    l3.setText(n1+" AUS Dollar = "+ans+" IND Rupee");
    l3.setForeground(Color.green);
}
else if(c.getSelectedItem().equals("OMAN TO INDIA"))
{
    ans=n1*215.44;
    a.setText("1 OMAN Riyal = 215.44 IND Rupee");
    l3.setText(n1+" OMAN Riyal = "+ans+" IND Rupee");
}
else if(c.getSelectedItem().equals("CHINA TO INDIA"))
{
    ans=n1*11.58;
    a.setText("1 CHINA Yuan = 11.58 IND Rupee");
    l3.setText(n1+" CHINA Yuan = "+ans+" IND Rupee");
    l3.setForeground(Color.red);
}
else if(c.getSelectedItem().equals("NEPAL TO INDIA"))
{
    ans=n1*0.62;
    a.setText("1 NEPAL Rupee = 0.62 IND Rupee");
    l3.setText(n1+" NEPAL Rupee = "+ans+" IND Rupee");
    l3.setForeground(Color.blue);
}
}
}
