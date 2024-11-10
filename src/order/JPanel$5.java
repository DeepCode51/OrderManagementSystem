package order;

import food.News;
import method.UserIO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanel$5 extends JPanel implements ActionListener{
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JPasswordField passwordField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	JButton button ;
	News n;
	/**
	 * Create the panel.
	 */
	public JPanel$5() {
	     n = UserIO.getNews(News.currentId);
		setLayout(null);

		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u65B0\u7684\u59D3\u540D:");
		label_1.setBounds(67, 117, 130, 40);
		add(label_1);

		JLabel label_2 = new JLabel("\u8BF7\u8F93\u5165\u65B0\u7684\u5361\u53F7:");
		label_2.setBounds(67, 157, 119, 40);
		add(label_2);

		JLabel label_3 = new JLabel("\u8BF7\u8F93\u5165\u65B0\u7684\u5BC6\u7801:");
		label_3.setBounds(67, 197, 119, 40);
		add(label_3);

		JLabel label_5 = new JLabel("\u8BF7\u8F93\u5165\u65B0\u7684\u5730\u5740:");
		label_5.setBounds(67, 240, 119, 40);
		add(label_5);

		JLabel label_6 = new JLabel("\u8BF7\u8F93\u5165\u65B0\u7684\u7535\u8BDD:");
		label_6.setBounds(67, 293, 119, 40);
		add(label_6);

		textField_8 = new JTextField(n.getTab());
		textField_8.setBounds(177, 298, 150, 30);
		add(textField_8);

		textField_7 = new JTextField(n.getLoc());
		textField_7.setBounds(177, 245, 150, 30);
		add(textField_7);

		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(177, 197, 150, 30);
		add(passwordField_3);

		textField_6 = new JTextField(n.getCard());
		textField_6.setBounds(177, 157, 150, 30);
		add(textField_6);

		textField_5 = new JTextField(n.getName());
		textField_5.setBounds(177, 117, 150, 30);
		add(textField_5);

		JLabel label = new JLabel("\u4FEE\u6539\u7528\u6237\u4FE1\u606F\u754C\u9762");
		label.setFont(new Font("幼圆", Font.PLAIN, 33));
		label.setBounds(124, 13, 271, 48);
		add(label);

		 button = new JButton("\u786E\u8BA4\u4FEE\u6539");
		button.setBounds(421, 280, 148, 48);
		button.addActionListener(this);
		add(button);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button){
			n.setName(textField_5.getText());
			n.setCard(textField_6.getText());
			n.setPwd(passwordField_3.getText());
			n.setLoc(textField_7.getText());
			n.setTab(textField_8.getText());
			UserIO.setNews(n);
			JOptionPane.showMessageDialog(null, "修改成功");
		}

	}

}
