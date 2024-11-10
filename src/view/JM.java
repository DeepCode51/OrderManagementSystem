package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JM extends JMenuBar implements ActionListener{//菜单栏
	JMenuBar jm;
	JMenuItem jmi;
	JMenu jms;
	public JM(){
		jm = new JMenuBar();
		jms = new JMenu("选项");
		jmi = new JMenuItem("退出");
		jmi.addActionListener(this);//注册监听
		jms.add(jmi);
		jm.add(jms);
		add(jm);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(null, "菜品便宜优惠，确定不在看看吗？");
		//System.out.println(result);
		if (result == 0)
			System.exit(0);//结束程序
		//if(e.getSource()==jmi){
			//System.exit(0);//结束程序
		//}

	}
}
