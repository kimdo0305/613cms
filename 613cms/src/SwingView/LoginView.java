package SwingView;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginView extends JFrame{

	public LoginView(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginView lv = new LoginView();
		lv.setSize(500,400);
		lv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lv.add(new JButton("Hello"));
		lv.setVisible(true);
	}

}
