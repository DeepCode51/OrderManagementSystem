package order;

import food.News;
import method.UserIO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanel$6 extends JPanel implements ActionListener{
	private JTextField textField;
	private JTextField textField_1;
	News n;
	JLabel label_2;
	JButton button;

	/**
	 * Create the panel.
	 */
	public JPanel$6() {
		 n = UserIO.getNews(News.currentId);
		setLayout(null);

		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u5145\u503C\u91D1\u989D:");
		label.setBounds(107, 110, 119, 40);
		add(label);

		textField = new JTextField();
		textField.setBounds(217, 115, 150, 30);
		add(textField);

		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u60A8\u7684\u5BC6\u7801:");
		label_1.setBounds(107, 178, 119, 40);
		add(label_1);

		textField_1 = new JTextField();
		textField_1.setBounds(217, 183, 150, 30);
		add(textField_1);

		 label_2 = new JLabel("\u60A8\u7684\u4F59\u989D\u4E3A:"+n.getMoney());
		label_2.setBounds(107, 59, 245, 40);
		add(label_2);

		button = new JButton("\u786E\u8BA4\u5145\u503C");
		button.setBounds(313, 261, 148, 48);
		button.addActionListener(this);
		add(button);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button){


		n.setMoney(n.getMoney()+Integer.parseInt(textField.getText()));
		UserIO.setNews(n);
		JOptionPane.showMessageDialog(null, "充值成功");
		label_2.setText("\u60A8\u7684\u4F59\u989D\u4E3A:"+n.getMoney()+"");
	}


	}

}
