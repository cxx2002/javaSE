package trds;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;

import javax.swing.*;







public class LoginFrame       extends       JFrame        implements          ActionListener{

    private static final long serialVersionUID = -5136005079573007282L;

    private JLabel welcomelabel;

    private JLabel unamelabel;

    private JLabel passwdlabel;

    private JTextField unamefield;

    private JPasswordField passwdfield;

    private JButton loginbtn;

    private JButton exitbtn;

    private JLabel rightlabel;

 

    public LoginFrame() {

        setUndecorated(false);

        setResizable(false);

        setSize(500, 300);

        setLocationRelativeTo(null);

        setLayout(     null       );//设置为空布局



        welcomelabel = new JLabel("Welcome to Login Frame");

        welcomelabel.setFont(      new Font              (Font.SERIF,Font.BOLD,28));//设置字体

        welcomelabel.setLocation(80, 10);

        welcomelabel.setSize(350, 35);

        JPanel loginpane =      new      JPanel(null);//创建一个面板容器

        loginpane.setBounds(new Rectangle(70, 60, 360, 185));

        loginpane.setBorder(BorderFactory.createEtchedBorder());

        unamelabel = new JLabel("username:");

        unamelabel.setBounds(35, 50, 65, 25);

        unamefield = new JTextField();

        unamefield.setBounds(110, 50, 200, 25);

        passwdlabel = new JLabel("password:");

        passwdlabel.setBounds(35, 85, 65, 25);

        passwdfield = new JPasswordField();

        passwdfield.setBounds(110, 85, 200, 25);

        loginbtn =  new     JButton               ("Login");//实例化登录按钮

        exitbtn =   new JButton                      ("Exit");//实例化退出按钮

        loginbtn.setActionCommand("LOGIN");

        exitbtn.setActionCommand("EXIT");

        loginbtn.setBounds(150, 130, 75, 25);

        exitbtn.setBounds(235, 130, 75, 25);

        loginbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				actionPerformed(e);
			}
		});//绑定监听器

        exitbtn.addActionListener(   new ActionListener () {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				actionPerformed(e);
			}
		}               );//绑定监听器

        loginpane.add(unamelabel);

        loginpane.add(unamefield);

        loginpane.add(passwdlabel);

        loginpane.add(passwdfield);

        loginpane.add(loginbtn);

        loginpane.add(exitbtn); 

        add(welcomelabel);

        add(loginpane);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

    class MainFrame extends JFrame{

		/**
		 * 
		 */
		private static final long serialVersionUID = 8488767905963768040L;

        //...

    }



public void          actionPerformed                  (ActionEvent e) {

    switch(e.getActionCommand()) {

        case "LOGIN"           ://当鼠标点击登录按钮

            String uname =     new String(unamefield.getName())                          ;//获取用户名文本框中的用户名

            String password = new String(passwdfield.getPassword());//获取密码框中的密码

            if(       uname.equals("zhansan")                                              ) {//当用户输入用户名为字符串"zhangsan"，密码为字符串"123"时显示主界面

                SwingUtilities.invokeLater(new Runnable() { 

                    @Override

                    public void run() {

                        MainFrame frame =     new       MainFrame();//创建主界面窗体

                        frame.setVisible(true);

                     }

                });

                this.dispose();

            }else {

            	JOptionPane.showMessageDialog(LoginFrame.this, "用户名或密码输入错误！", "系统提示", JOptionPane.ERROR_MESSAGE);//显示消息对话框

           }

            break;

        case  "EXIT"            ://当鼠标点击退出按钮

            System.exit(0);

            break;

    }

}

 

  


	public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() { 

            @Override

            public void run() {

                LoginFrame loginframe =      new       LoginFrame();//实例化登录窗体

                loginframe.setVisible(true);

            }

        });

    }












}