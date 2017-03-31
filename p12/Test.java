import java.awt.*;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Test{
	static JTextField date1 = new JTextField(10);
	static JTextField date2 = new JTextField(10);
	public static void main(String[] args){
		
		/* Fields */
		MijnMuis x = new MijnMuis();
		
		JButton calc = new JButton("Calculate");
		//JTextField date1 = new JTextField(10);
		//JTextField date2 = new JTextField(10);
		
		JFrame frame = new JFrame("Time Calculator");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.setLayout(new FlowLayout());
		frame.add(date1);
		frame.add(date2);
		frame.add(calc);
		
		calc.addMouseListener(x);
	}
	
	private static class MijnMuis extends MouseListener{
		public void mouseClicked(MouseEvent e){
			String dateBoven = date1.getText();
			System.out.println(dateBoven);
		}
	}
}