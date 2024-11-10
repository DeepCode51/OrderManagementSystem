package order;

import food.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanel$4 extends JPanel implements ActionListener{//卡片布局第一个面板
	JButton JButton_1,JButton_2,JButton_3,JButton_4,JButton_5,JButton_6;
	JTextField JTextField_1,JTextField_2;
	JButton jb,jb2;//声明准备带图片的按钮
	String str = null;
	static int i = 0;
	JPanel$4(){
		JButton_1 = new JButton("-");
		JButton_1.setBounds(520, 20, 40, 40);
		JButton_2 = new JButton("+");
		JButton_2.setBounds(650, 20, 40, 40);
		JButton_1.addActionListener(this);
		JButton_2.addActionListener(this);
		JButton_3 = new JButton("结算");
		JButton_3.addActionListener(this);
		JButton_3.setBounds(630, 300, 100, 40);
		JTextField_1 = new JTextField("0");
		JTextField_1.setEditable(false);
		JTextField_1.setBounds(575, 20, 60, 40);
		JLabel JLabel_1  = new JLabel("花生小盘");
		JLabel_1.setFont(new Font("宋体", 2, 30));//设置字体

		JLabel_1.setBounds(100, 20, 300, 50);
		JButton_4 = new JButton("特色小吃");
		JButton_4.setBounds(900, 440, 100, 40);
		JButton_4.addActionListener(this);
	//	add(JButton_4);
		add(JButton_1);
		add(JTextField_1);
		add(JButton_2);
		add(JButton_3);//
		add(JLabel_1);
		jb = new JButton(new ImageIcon("img/x1.png"));
		jb.addActionListener(this);
		jb.setBounds(300, 30,200, 100);
		add(jb);

		JButton_5 = new JButton("-");
		JButton_5.setBounds(520, 180, 40, 40);
		JButton_6 = new JButton("+");
		JButton_6.setBounds(650, 180, 40, 40);
		JButton_5.addActionListener(this);
		JButton_6.addActionListener(this);
		JTextField_2 = new JTextField("0");
		JTextField_2.setEditable(false);
		JTextField_2.setBounds(575, 180, 60, 40);
		JLabel JLabel_2  = new JLabel("拉丝披萨 ");
		JLabel_2.setFont(new Font("宋体", 2, 30));//设置字体

		JLabel_2.setBounds(100, 180, 300, 50);
		add(JLabel_2);
		add(JButton_5);
		add(JButton_6);
		add(JTextField_2);
		jb2 = new JButton(new ImageIcon("img/x2.png"));
		jb2.addActionListener(this);
		jb2.setBounds(300, 180,200, 100);
		add(jb2);
		setLayout(null);
		setSize(900,600);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==JButton_1){
			int s = Integer.parseInt(JTextField_1.getText());
			if(s>0){
				goodspd.get();
			Calculate.del(goodsname.getX1());
			Calculate.setnum2(goods.getX1());
			JTextField_1.setText(""+Calculate.getList(goodsname.getX1()));

			}else{
				JOptionPane.showMessageDialog(null, "以为0不能减了");
			}

		}else if(e.getSource()==JButton_2){
			Calculate.setList(goodsname.getX1());
			Calculate.setnum(goods.getX1());
			JTextField_1.setText(""+Calculate.getList(goodsname.getX1()));
		}else if(e.getSource()==JButton_3){
			Calculate.setsl();

			goodspd.get();
			new Receipt();
			Calculate.setsqk();
		}else if(e.getSource()==JButton_4){

		}else if(e.getSource()==JButton_5){
			int s = Integer.parseInt(JTextField_2.getText());
			if(s>0){
				goodspd.get();
				Calculate.del(goodsname.getX2());
				Calculate.setnum2(goods.getX2());
				JTextField_2.setText(""+Calculate.getList(goodsname.getX2()));

			}else{
				JOptionPane.showMessageDialog(null, "以为0不能减了");
			}

		}else if(e.getSource()==JButton_6){
			Calculate.setList(goodsname.getX2());
			Calculate.setnum(goods.getX2());
			JTextField_2.setText(""+Calculate.getList(goodsname.getX2()));
		}


	}
}
