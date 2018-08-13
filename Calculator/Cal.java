import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="Cal" width="300" height="300"></applet> */

public class Cal extends Applet implements ActionListener{

  //declare variables
  String msg = "";
  int v1, v2, result;
  TextField t1;
  Button b[] = new Button[10];
  Button add, sub, clear, div, mod, mult, equals;
  char OP;

  //init method
  public void init(){

    //create background
    Color k=new Color(120,89,90);
    setBackground(k);
		t1=new TextField(10);
		GridLayout gl=new GridLayout(4,5);
		setLayout(gl);

    //init buttons
    for(int i=0;i<10;i++)
		{
			b[i]=new Button(""+i);
		  }
    add=new Button("add");
		sub=new Button("sub");
		mult=new Button("mult");
		div=new Button("div");
		mod=new Button("mod");
		clear=new Button("clear");
		equals=new Button("equals");

    //add to the applet window
    t1.addActionListener(this);
		add(t1);
    for(int i=0;i<10;i++)
		{
			add(b[i]);
		}
    add(add);
		add(sub);
		add(mult);
		add(div);
		add(mod);
		add(clear);
		add(equals);

    //add actionListeners
    for(int i=0;i<10;i++)
		{
			b[i].addActionListener(this);
		}
		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		equals.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		char ch=str.charAt(0);
		if ( Character.isDigit(ch))
		t1.setText(t1.getText()+str);
		else
		if(str.equals("add"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='+';
			t1.setText("");
		}
		else if(str.equals("sub"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='-';
			t1.setText("");
		}
		else if(str.equals("mult"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='*';
			t1.setText("");
		}
		else if(str.equals("div"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='/';
			t1.setText("");
		}
		else if(str.equals("mod"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='%';
			t1.setText("");
		}
		if(str.equals("equals"))
		{
			v2=Integer.parseInt(t1.getText());
			if(OP=='+')
				result=v1+v2;
			else if(OP=='-')
				result=v1-v2;
			else if(OP=='*')
				result=v1*v2;
			else if(OP=='/')
				result=v1/v2;
			else if(OP=='%')
				result=v1%v2;
			t1.setText(""+result);
		}
		if(str.equals("clear"))
		{
			t1.setText("");
		}
  }
}
