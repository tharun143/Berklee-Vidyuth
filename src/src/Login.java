import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel JPanel;
	private JTextField usern;
	private JPasswordField password;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel = new JPanel();
		JPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(JPanel);
		
		JLabel lblLogIn = new JLabel("LOG IN");
		
		JLabel lblUsername = new JLabel("Username");
		
		JLabel label = new JLabel(":");
		
		JLabel lblPassword = new JLabel("Password");
		
		JLabel label_1 = new JLabel(":");
		
		usern = new JTextField();
		usern.setColumns(10);
		
		JLabel popup = new JLabel("For the recomended Staff  members only!!!!");
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String u = usern.getText().toString();
				String p = password.getText().toString();
				if(u.isEmpty()|| p.isEmpty()) {
			       popup.setText("Enter all the creditionals");
		        }    	
			    else {
			    //	LogInData l = new LogInData();
			    //	String c = l.compare(u);
			    //	if(p.equals(c)) {
				//    Home h = new Home();
//			        h.setVisible(true);
//			        dispose();
//			        }else {
//			        	popup.setText("Invalid username/password");
//			        }
			    }
			}
		});
		
		JButton btnSinup = new JButton("SignIn");
		btnSinup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			   Signup s = new Signup();
			   s.setVisible(true);
			   dispose();
			}
		});
		
		password = new JPasswordField();
		
		
		GroupLayout gl_JPanel = new GroupLayout(JPanel);
		gl_JPanel.setHorizontalGroup(
			gl_JPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_JPanel.createSequentialGroup()
					.addGap(120)
					.addGroup(gl_JPanel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_JPanel.createSequentialGroup()
							.addComponent(lblPassword)
							.addGap(18)
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(password))
						.addGroup(gl_JPanel.createSequentialGroup()
							.addComponent(lblUsername)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_JPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLogIn)
								.addGroup(gl_JPanel.createSequentialGroup()
									.addComponent(label)
									.addGap(18)
									.addComponent(usern, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(92, Short.MAX_VALUE))
				.addGroup(gl_JPanel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_JPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_JPanel.createSequentialGroup()
							.addComponent(popup)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnSinup)
							.addGap(24))
						.addComponent(btnLogin))
					.addGap(27))
		);
		gl_JPanel.setVerticalGroup(
			gl_JPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLogIn)
					.addGap(58)
					.addGroup(gl_JPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(label)
						.addComponent(usern, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_JPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(label_1)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnLogin)
					.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
					.addGroup(gl_JPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(popup)
						.addComponent(btnSinup))
					.addContainerGap())
		);
		JPanel.setLayout(gl_JPanel);
	}
}