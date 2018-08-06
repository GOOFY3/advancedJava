import java.applet.*;
import java.awt.*;

public class Shapes extends Applet{
	public void paint(Graphics g){
		g.drawLine(30, 300, 200, 10);
		g.drawOval(250, 250, 100, 100);
		g.drawRect(400, 50, 200, 10);
	}
}