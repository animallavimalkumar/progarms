import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*</applet code ="Cal" width=300 height=300></applet>
*/> */
public class Cal extends Applet implements ActionListener{
TextField t;
Button b[]=new Button[10];
Button b1=new Button[6];
String op2[]={"+","-","*","%","=","C"};
int p=0,q=0;
String oper;
public Cal(){
setLayout(new GridLayout(5,4));
t=new TextField(20);
setBackground(Color.red);
setFont(new Font("Arial",Font.BOLD,20));
int k=0;
t.setEditable(false);
t.setBackground(Color.white);
t.setText("0");
for(int i=0;i<10;i++){
b[i]=new Button(""+k);
add(b[i]);
k++;
b[i].setBackground(Color.red);
b[i].addActionListener(this);
}
for(int i=0;i<6;i++){
b1[i]=new Button(""+op2[i]);
add(b1[i]);
b1[i].setBackground(Color.red);
b1[i].addActionListener(this);
}
add(t);
setVisible(true);
setSize(300,200);
}
public void actionPerformed(ActionEvent ae){
String str=ae.getActionCommand();
if(str.equals("+"))
p=Integer.parseInt(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("-")){
p=Integer.parseInt(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("*")){
p=Integer.parseInt(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("%")){
p=Integer.parseInt(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("=")){
str1="";
if(oper.equals("+"))
q=Integer.parseInt(t.getText());
t.setText(String.valueOf((p+q)));
else if(oper.equals("-"))
q=Integer.parseInt(t.getText());
t.setText(String.valueOf((p-q)));
if(oper.equals("*"))
q=Integer.parseInt(t.getText());
t.setText(String.valueOf((p*q)));
if(oper.equals("%"))
q=Integer.parseInt(t.getText());
t.setText(String.valueOf((p%q)));
else if(str.equals("C"))
p=0,q=0;
t.setText("");
str1="";
t.setText("0");
else if{
t.setText(str1.concat(str));
str1=t.getText();
}
}
}