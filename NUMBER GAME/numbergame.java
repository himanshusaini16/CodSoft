import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class numbergame implements ActionListener {
    JTextField textField1,textField2,textField3,textField4,textField5;
    JButton button1,button2,button3;
    int randomnumber=(int) (Math.random()*100+1);
    int guess=0,sc=0,k;
    void check()
    {
        JFrame f=new JFrame("NUMBER GUESS GAME");
    
        JLabel title =new JLabel("GUESS GAME (1-100)");
        title.setBounds(50, 10,350,40);
        title.setForeground(Color.RED);
        Font font = new Font("Arial", Font.BOLD,24);
        title.setFont(font);
        JLabel num=new JLabel("Enter the number:");
        num.setBounds(10,50,150,50);
        JLabel msg=new JLabel("Message:");
        msg.setBounds(10, 80, 150, 50);
        JLabel numofcount=new JLabel("No of guesses");
        numofcount.setBounds(160, 110,150, 50);

        JLabel score=new JLabel("Score:");
        score.setBounds(10, 110, 150, 50);
        textField1=new JTextField();
        textField1.setBounds(120,70, 30, 20);
        textField1.setBackground(Color.lightGray);
        textField2=new JTextField(4);
        textField2.setBounds(120, 95, 250, 20);
        textField2.setBackground(Color.lightGray);
        textField3=new JTextField();
        textField3.setBounds(250,129,30,20);
        textField3.setBackground(Color.lightGray);
        textField4=new JTextField();
        textField4.setBounds(120, 129, 30, 20);
        textField4.setBackground(Color.lightGray);
        textField5=new JTextField();
        textField5.setBounds(10, 170, 50, 30);
        JLabel img=new JLabel("NUMBER GUESS GAME INSTRUCTION:");
        JLabel point1=new JLabel("1.Enter the Number between 1 -100.");
        JLabel point2=new JLabel("2.You have Only 10 chance.");
        JLabel point3=new JLabel("3.For Every Wrong guess -10 from highscore 100.");
            
        img.setBounds(20, 250, 300, 50);
        point1.setBounds(25, 270, 300, 50);
        point2.setBounds(25, 290, 300, 50);
        point3.setBounds(25, 310, 300, 50);

        Font font1 = new Font("Arial", Font.BOLD,14);
        img.setFont(font1);
        button1=new JButton("I> Guess");
        button1.setBounds(140, 170, 100, 40);
        button1.setBackground(Color.green);
        button1.setForeground(Color.BLUE);
        button1.setFont(font1);
        button2=new JButton("Give UP X");
        button2.setBackground(Color.RED);
        button2.setForeground(Color.WHITE);
        button2.setBounds(250, 170,100, 40);
        button3=new JButton("Play Again");
        button3.setBackground(Color.BLUE);
        button3.setForeground(Color.white);
        button3.setBounds(30, 170,100, 40);
        JLabel label=new JLabel();
        label.setBounds(1,1,1,1);
        Border border=BorderFactory.createLineBorder(Color.RED,8,true);
        label.setBorder(border);
        
        textField5.setVisible(false);
        button3.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        f.add(textField5);
        f.add(button3);
        f.add(point1);
        f.add(point2);
        f.add(point3);
        f.add(img);
        f.add(textField4);
        f.add(score);
        f.add(button2);
        f.add(textField3);
        f.add(numofcount);
        f.add(msg);
        f.add(num);
        f.add(textField1);
        f.add(textField2);
        f.add(button1);
        f.add(title);
        f.add(label);
        f.setSize(400,400);
		f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
	{
        int num=Integer.parseInt(textField1.getText());
        randomnumber=k;
        int highscore=100;
        guess++;
        if(e.getSource()==button1){
        if(guess>=11)
        {
        textField1.setText("");
        textField2.setText("The answer is "+randomnumber+" and your chance is over");
        textField3.setText(guess+"");
        textField4.setText(0+"");
        textField3.setEditable(false);
        }
        else{
        if(num==randomnumber && guess<11)
        {
            button1.setEnabled(true);
            button2.setEnabled(true);
            textField2.setText("YOU GESS THE RIGHT NUMBER");
            textField2.setForeground(Color.BLUE);
            textField3.setText(guess+"");
            highscore=highscore-sc;
            textField4.setText(highscore+"");
            textField1.setEnabled(true);
            textField4.setEnabled(true);
        }
        else if(num<randomnumber)
        {
            textField2.setText("Number is greater than the Guess Number");
            textField3.setText(guess+"");
        }
        else if(num>randomnumber){
            textField2.setText("Number is lower than the Guess Number");
            textField3.setText(guess+"");
        }
         textField1.requestFocus();
    }}
    else if(e.getSource()==button2)
    {
        textField1.setText("");
        textField2.setText("The correct answer is  "+randomnumber+"!!");
        textField2.setForeground(Color.RED);
        textField3.setText("");
        textField3.setEditable(false);
        textField4.setText("");
        button2.setEnabled(true);
        button1.setEnabled(true);
    }
    else if(e.getSource()==button3)
    {
        int randomnumber=(int) (Math.random()*100+1);
        textField5.setText(randomnumber+"");
        textField2.setText("");
        textField3.setText(0+"");
        textField1.setText("");
        guess=0;
        sc=0;
        textField4.setText("");
        k=Integer.parseInt(textField5.getText());

    }
    sc=sc+10;

    }

    public static void main(String[] args) {
        numbergame no=new numbergame();
        no.check();
        
    }
    
    
}

