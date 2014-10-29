package myproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Reader extends JFrame{
JFrame frame=new JFrame("Калькулятор расчета места хранения");
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocationRelativeTo(null);
frame.setResizable(false);
frame.setLayout(new GridBagLayout());

JPanel panel1=new JPanel();
JLabel l=new JLabel("Общая S площадки: ");
text=new JTextField(15);
panel1.add(l);
panel1.add(text);
		
JLabel label1=new JLabel("масса ленты ЛИАМ (кг):               ");
text1=new JTextField(5);
elements1 = new String[] {"рулоны", "паллеты"};
combo1 = new JComboBox(elements1);
combo1.setSelectedIndex(0);
		
JLabel label2=new JLabel("масса материала АРМАС (кг):       ");
text2=new JTextField(5);
elements2 = new String[] {"коробки", "паллеты"};
combo2 = new JComboBox(elements2);
combo2.setSelectedIndex(0);
		
JLabel label3=new JLabel("          масса грунтовки (кг):                   ");
text3=new JTextField(5);
elements3 = new String[] {"бочки (200л)", "канистры (50л)"};
combo3 = new JComboBox(elements3);
combo3.setSelectedIndex(0);
		
JPanel panel2=new JPanel();
panel2.add(label1, new GridLayout(1,1));
panel2.add(text1, new GridLayout(1,1));
panel2.add(combo1, new GridLayout(1,1));
		
JPanel panel3=new JPanel();
panel3.add(label2, new GridLayout(1,1));
panel3.add(text2, new GridLayout(1,1));
panel3.add(combo2, new GridLayout(1,1));
		
JPanel panel4=new JPanel();
panel4.add(label3, FlowLayout.LEFT);
panel4.add(text3, FlowLayout.CENTER);
panel4.add(combo3,FlowLayout.RIGHT);
		
JPanel panel5=new JPanel();
button1=new JButton("Рассчитать");
panel5.add(button1);
		
JPanel panel6=new JPanel();
label=new JLabel("Ответ:");
panel6.add(label);
		
l.setFont(new Font("Times New Roman",1, 14));
label1.setFont(new Font("Times New Roman", 0, 14));
label2.setFont(new Font("Times New Roman", 0, 14));
label3.setFont(new Font("Times New Roman", 0, 14));
combo1.setFont(new Font("Times New Roman", 0, 14));
combo2.setFont(new Font("Times New Roman", 0, 14));
combo3.setFont(new Font("Times New Roman", 0, 14));
button1.setFont(new Font("Times New Roman", 1, 14));
label.setFont(new Font("Times New Roman",1, 14));
		
frame.add(panel1, new GridBagConstraints(0,0,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));
frame.add(panel2, new GridBagConstraints(0,1,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));
frame.add(panel3, new GridBagConstraints(0,2,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));
frame.add(panel4, new GridBagConstraints(0,3,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));
frame.add(panel5, new GridBagConstraints(0,4,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));
frame.add(panel6, new GridBagConstraints(0,5,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));
		
frame.setVisible(true);
frame.pack();
}
