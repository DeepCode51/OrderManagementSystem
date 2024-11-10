package view;

import method.UserIO;
import order.OrderFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderLanding extends JFrame implements ActionListener{//用户登录界面
	JButton JButton_1,JButton_2;
	JTextField JTextField_1;
	JPasswordField JPasswordField_1;
	static final String USERNAME = "admin";//设置常量作为登陆验证数据
	static final String USERPASSWORD = "12345";
	private JButton button;
	OrderLanding(){
		JPanel jp = new JPanel();
		JTextField_1 = new JTextField();//文本框
		JPasswordField_1 = new JPasswordField();//密码框
		JButton_1 = new JButton("进入");
		JButton_2 = new JButton("退出");
		JLabel JLabel_1 = new JLabel("账号:");
		JLabel JLabel_2 = new JLabel("密码:");
		JLabel_1.setBounds(150, 70, 100, 30);//设置坐标
		JTextField_1.setBounds(200, 70, 200, 30);
		jp.add(JLabel_1);
		jp.add(JTextField_1);
		JLabel_2.setBounds(150, 120, 100, 30);
		JPasswordField_1.setBounds(200, 120, 200, 30);
		jp.add(JLabel_2);
		jp.add(JPasswordField_1);
		JButton_1.setBounds(242, 240, 80, 40);
		JButton_1.addActionListener(this);//注册监听
		jp.add(JButton_1);
		JButton_2.setBounds(84, 240, 80, 40);
		JButton_2.addActionListener(this);
		jp.add(JButton_2);
		jp.setLayout(null);
		getContentPane().add(jp);

		button = new JButton("\u6CE8\u518C");
		button.addActionListener(this);
		button.setBounds(390, 240, 80, 40);
		jp.add(button);
		setTitle("欢迎进入点餐系统 ");
		setResizable(false);
		setSize(600,380);
		setVisible(true);
	}
	public static void main(String[] args) {//程序入口主方法
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			// TODO Auto-generated catch blockadm
			e.printStackTrace();
		}
		new OrderLanding();
	}
	@Override
	public void actionPerformed(ActionEvent e) {//动作监听
		// TODO Auto-generated method stub
		if(e.getSource()==JButton_2){
			System.exit(0);//结束程序
		}else if(e.getSource()==JButton_1){

			if(UserIO.checkUser(JTextField_1.getText(), JPasswordField_1.getText())){//登陆验证
				this.dispose();
				new OrderFrame();
			}else{
				JOptionPane.showMessageDialog(null, "登陆失败");
			}
		}else if(e.getSource()==button){
			this.dispose();
			new Repeat();
		}
	}
}
