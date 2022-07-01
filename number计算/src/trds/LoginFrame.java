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

        setLayout(     null       );//����Ϊ�ղ���



        welcomelabel = new JLabel("Welcome to Login Frame");

        welcomelabel.setFont(      new Font              (Font.SERIF,Font.BOLD,28));//��������

        welcomelabel.setLocation(80, 10);

        welcomelabel.setSize(350, 35);

        JPanel loginpane =      new      JPanel(null);//����һ���������

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

        loginbtn =  new     JButton               ("Login");//ʵ������¼��ť

        exitbtn =   new JButton                      ("Exit");//ʵ�����˳���ť

        loginbtn.setActionCommand("LOGIN");

        exitbtn.setActionCommand("EXIT");

        loginbtn.setBounds(150, 130, 75, 25);

        exitbtn.setBounds(235, 130, 75, 25);

        loginbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				actionPerformed(e);
			}
		});//�󶨼�����

        exitbtn.addActionListener(   new ActionListener () {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				actionPerformed(e);
			}
		}               );//�󶨼�����

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

        case "LOGIN"           ://���������¼��ť

            String uname =     new String(unamefield.getName())                          ;//��ȡ�û����ı����е��û���

            String password = new String(passwdfield.getPassword());//��ȡ������е�����

            if(       uname.equals("zhansan")                                              ) {//���û������û���Ϊ�ַ���"zhangsan"������Ϊ�ַ���"123"ʱ��ʾ������

                SwingUtilities.invokeLater(new Runnable() { 

                    @Override

                    public void run() {

                        MainFrame frame =     new       MainFrame();//���������洰��

                        frame.setVisible(true);

                     }

                });

                this.dispose();

            }else {

            	JOptionPane.showMessageDialog(LoginFrame.this, "�û����������������", "ϵͳ��ʾ", JOptionPane.ERROR_MESSAGE);//��ʾ��Ϣ�Ի���

           }

            break;

        case  "EXIT"            ://��������˳���ť

            System.exit(0);

            break;

    }

}

 

  


	public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() { 

            @Override

            public void run() {

                LoginFrame loginframe =      new       LoginFrame();//ʵ������¼����

                loginframe.setVisible(true);

            }

        });

    }












}