
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
	
//Changes for Pull request

public class GraphicsExercises extends JFrame implements MouseListener {
	
	JLabel label;
	
	GraphicsExercises() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this); //add listener to this component

		this.add(label);  //add label to the frame
		this.setVisible(true);

	}
	
	public static void main(String[] args) {
		
		new GraphicsExercises();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
		System.out.println("You clicked the mouse");
		label.setBackground(Color.yellow);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		//System.out.println("You pressed the mouse");
		//label.setBackground(Color.yellow);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		//System.out.println("You released the mouse");
		//label.setBackground(Color.green);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		System.out.println("You entered the component");
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component
		System.out.println("You exited the component");
		label.setBackground(Color.red);
	}

	
}


