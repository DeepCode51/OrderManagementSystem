package view;

import food.News;
import method.NumberDemo;
import method.UserIO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Repeat extends JFrame implements ActionListener{//餐卡充值界面
	JTextField JTextField_1,JTextField_2,JTextField_3,JTextField_4,JTextField_5;//文本框
	JPasswordField pwd,pwd2;//密码框
	JButton JButton_1,JButton_2;//按钮
	Repeat(){
		JPanel jp = new JPanel();
		JLabel  JLabel_1= new JLabel("充值金额:");
		JLabel  JLabel_2= new JLabel("姓名:");//标签提示
		JLabel  JLabel_3= new JLabel("卡号:");
		JLabel  JLabel_4= new JLabel("密码:");
		JLabel  JLabel_5= new JLabel("请确认密码:");
		JLabel  JLabel_6= new JLabel("地址:");
		JLabel  JLabel_7= new JLabel("电话:");
		JLabel JLabel_8 = new JLabel("\u8BF7\u8F93\u5165\u6CE8\u518C\u4FE1\u606F!");
		JLabel_8.setFont(new Font("宋体", 1, 20));//设置字体
		JLabel_8.setBounds(40, 140, 280, 40);
		JLabel JLabel_9 = new JLabel(new ImageIcon("img/1.png"));//创建一个带有图片的标签
		JLabel_9.setBounds(10,10 , 330, 120);
		jp.add(JLabel_9);
		jp.add(JLabel_8);
		JTextField_1 = new JTextField();//文本框
		JTextField_2 = new JTextField();
		JTextField_3 = new JTextField();
		JTextField_4 = new JTextField();
		JTextField_5 = new JTextField();
		pwd = new JPasswordField();
		pwd2 = new JPasswordField();
		jp.setLayout(null);//清空布局
		JLabel_1.setBounds(30, 190, 119, 40);//指定坐标
		JLabel_2.setBounds(30, 230, 130, 40);
		JLabel_3.setBounds(30, 270, 119, 40);
		JLabel_4.setBounds(30, 310, 119, 40);
		JLabel_5.setBounds(30, 350, 119, 40);
		JLabel_6.setBounds(30, 390, 119, 40);
		JLabel_7.setBounds(30, 430, 119, 40);
		jp.add(JLabel_1);//添加进容器
		jp.add(JLabel_2);
		jp.add(JLabel_3);
		jp.add(JLabel_4);
		jp.add(JLabel_5);
		jp.add(JLabel_6);
		jp.add(JLabel_7);
		JTextField_1.setBounds(140, 190, 150, 30);
		JTextField_2.setBounds(140, 230, 150, 30);
		JTextField_3.setBounds(140, 270, 150, 30);
		pwd.setBounds(140, 310, 150, 30);
		pwd2.setBounds(140, 350, 150, 30);
		JTextField_4.setBounds(140, 390, 150, 30);
		JTextField_5.setBounds(140, 430, 150, 30);
		jp.add(JTextField_1);
		jp.add(JTextField_2);
		jp.add(JTextField_3);
		jp.	add(pwd);
		jp.	add(pwd2);
		jp.	add(JTextField_4);
		jp.	add(JTextField_5);
		JButton_1 = new JButton("\u786E\u5B9A\u6CE8\u518C");
		JButton_2 = new JButton("\u8FD4\u56DE\u4E3B\u754C\u9762");
		JButton_1.addActionListener(this);
		JButton_2.addActionListener(this);
		JButton_1.setBounds(80, 500, 99, 40);
		jp.	add(JButton_1);
		JButton_2.setBounds(210, 500, 130, 40);
		jp.	add(JButton_2);
		getContentPane().add(jp);//将JPanel丢进JFrame
		setResizable(false);
		setTitle("\u8BF7\u8F93\u5165\u6CE8\u518C\u4FE1\u606F");
		setSize(500,650);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {//监听
		if(e.getSource()==JButton_1){
			News n = new News();
			n.setName(JTextField_2.getText());
			n.setId(UserIO.InUser().size()+1);
			News.currentId=UserIO.InUser().size()+1;
			n.setLoc(JTextField_4.getText());
			n.setTab(JTextField_5.getText());
			n.setCard(JTextField_3.getText());
			if(NumberDemo.isNum(JTextField_1.getText())){
				int num = Integer.parseInt(JTextField_1.getText());
					n.setMoney(num);
					if(pwd.getText().equals(pwd2.getText())){
						n.setPwd(pwd.getText());
						UserIO.OutUser(n);
					int i = 	JOptionPane.showConfirmDialog(null, "注册成功！！！是否返回登陆界面？");
					if(i==0){
						this.dispose();
						new OrderLanding();
					}


						//new OrderFrame();
					}else{
						JOptionPane.showMessageDialog(null, "两个密码不一致");
					}
			}else{
				JOptionPane.showMessageDialog(null, "请输入有效数字");
			}


		}else if(e.getSource()==JButton_2){
			this.dispose();
			new OrderLanding();
		}

	}
}
