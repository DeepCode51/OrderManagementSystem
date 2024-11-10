package food;

import method.CnUpperCaser;
import method.UserIO;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Random;

public class Receipt extends JFrame{
	  static int zje = 0;
	public Receipt(){
		JPanel jp = new JPanel();
		jp.setBackground(Color.white);
		jp.setLayout(null);
		setResizable(false);
		JLabel jl  = new JLabel("点餐小票");
		jl.setFont(new Font("宋体", 1, 25));
		jl.setBounds(45, 20, 400, 40);
		jl.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		JLabel jl2 = new JLabel("日期：");
		jl2.setBounds(45, 60, 230, 40);
		jl2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		JLabel jl3 = new JLabel("   时间：");
		jl3.setBounds(275, 60, 170, 40);
		jl3.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		JLabel jl4 = new JLabel("编号：");
		jl4.setBounds(45, 100, 230, 40);
		jl4.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		JLabel jl5 = new JLabel("   桌号：");
		jl5.setBounds(275, 100, 170, 40);
		jl5.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		JLabel jl6 = new JLabel("餐品名");
		jl6.setBounds(45, 140, 160, 40);
		jl6.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		JLabel jl7 = new JLabel("单价");
		jl7.setBounds(205, 140, 70, 40);
		jl7.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		JLabel jl8 = new JLabel("数量");
		jl8.setBounds(275, 140, 85, 40);
		jl8.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		JLabel jl9 = new JLabel("合计");
		jl9.setBounds(360, 140,85, 40);
		jl9.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		jp.add(jl);
		jp.add(jl2);
		jp.add(jl3);
		jp.add(jl4);
		jp.add(jl5);
		jp.add(jl6);
		jp.add(jl7);
		jp.add(jl8);
		jp.add(jl9);
		 Calendar cal = Calendar.getInstance();
	        int year = cal.get(Calendar.YEAR);//获取年份
	        int month=cal.get(Calendar.MONTH);//获取月份
	        int day=cal.get(Calendar.DATE);//获取日
	        int WeekOfYear = cal.get(Calendar.DAY_OF_WEEK);//一周的第几天

	       jl2.setText("日期："+year+"年"+(month+1)+"月"+day+"日    "+" 星期"+new Test(""+(WeekOfYear-1)).getCnString());
	        int hour=cal.get(Calendar.HOUR);//小时
	        int minute=cal.get(Calendar.MINUTE);//分
	        int second=cal.get(Calendar.SECOND);//秒
	       jl3.setText("            时间："+hour+":"+minute+":"+second);
	        Random r = new Random();
	        int a = r.nextInt(110);
	        jl5.setText("                    第"+a+"桌");
	        int ab = r.nextInt(10000000);
	        jl4.setText("编号:S"+ab);
	        int bs = 140;
	       if(goodspd.b2){
	    	   bs = bs+40;
	        JLabel jl11 = new JLabel(goodsname.ps1);
			jl11.setBounds(45, bs, 160, 40);
			jl11.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	        add(jl11);
	        JLabel jl17 = new JLabel("单价");
			jl17.setBounds(205, bs, 70, 40);
			jl17.setText(""+goods.getPs2());
			jl17.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			JLabel jl18 = new JLabel("数量");
			jl18.setBounds(275, bs, 85, 40);
			jl18.setText(""+Calculate.getLasi());
			jl18.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			JLabel jl19 = new JLabel("合计");
			jl19.setBounds(360, bs,85, 40);
			jl19.setText(""+(goods.getPs2()*Calculate.getLasi()));
			jl19.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			jp.add(jl17);
			jp.add(jl18);
			jp.add(jl19);}

	       if(goodspd.b){
	    	   bs = bs+40;
		        JLabel jl11 = new JLabel(goodsname.ps2);
				jl11.setBounds(45, bs, 160, 40);
				jl11.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		        add(jl11);
		        JLabel jl17 = new JLabel("单价");
				jl17.setBounds(205, bs, 70, 40);
				jl17.setText(""+goods.getPs1());
				jl17.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl18 = new JLabel("数量");
				jl18.setBounds(275, bs, 85, 40);
				jl18.setText(""+Calculate.getShourou());
				jl18.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl19 = new JLabel("合计");
				jl19.setBounds(360, bs,85, 40);
				jl19.setText(""+(goods.getPs1()*Calculate.getShourou()));
				jl19.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				jp.add(jl17);
				jp.add(jl18);
				jp.add(jl19);}
	       if(goodspd.b3){
	    	   bs = bs+40;
		        JLabel jl11 = new JLabel(goodsname.t1);
				jl11.setBounds(45, bs, 160, 40);
				jl11.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		        add(jl11);
		        JLabel jl17 = new JLabel("单价");
				jl17.setBounds(205, bs, 70, 40);
				jl17.setText(""+goods.getT1());
				jl17.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl18 = new JLabel("数量");
				jl18.setBounds(275, bs, 85, 40);
				jl18.setText(""+Calculate.getWei());
				jl18.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl19 = new JLabel("合计");
				jl19.setBounds(360, bs,85, 40);
				jl19.setText(""+(goods.getT1()*Calculate.getWei()));
				jl19.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				jp.add(jl17);
				jp.add(jl18);
				jp.add(jl19);}

	       if(goodspd.b4){
	    	   bs = bs+40;
		        JLabel jl11 = new JLabel(goodsname.t2);
				jl11.setBounds(45, bs, 160, 40);
				jl11.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		        add(jl11);
		        JLabel jl17 = new JLabel("单价");
				jl17.setBounds(205, bs, 70, 40);
				jl17.setText(""+goods.getT2());
				jl17.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl18 = new JLabel("数量");
				jl18.setBounds(275, bs, 85, 40);
				jl18.setText(""+Calculate.getBing());
				jl18.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl19 = new JLabel("合计");
				jl19.setBounds(360, bs,85, 40);
				jl19.setText(""+(goods.getT2()*Calculate.getBing()));
				jl19.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				jp.add(jl17);
				jp.add(jl18);
				jp.add(jl19);}

	       if(goodspd.b5){
	    	   bs = bs+40;
		        JLabel jl11 = new JLabel(goodsname.g1);
				jl11.setBounds(45, bs, 160, 40);
				jl11.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		        add(jl11);
		        JLabel jl17 = new JLabel("单价");
				jl17.setBounds(205, bs, 70, 40);
				jl17.setText(""+goods.getG1());
				jl17.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl18 = new JLabel("数量");
				jl18.setBounds(275, bs, 85, 40);
				jl18.setText(""+Calculate.getXian());
				jl18.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl19 = new JLabel("合计");
				jl19.setBounds(360, bs,85, 40);
				jl19.setText(""+(goods.getG1()*Calculate.getXian()));
				jl19.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				jp.add(jl17);
				jp.add(jl18);
				jp.add(jl19);}

	       if(goodspd.b6){
	    	   bs = bs+40;
		        JLabel jl11 = new JLabel(goodsname.g2);
				jl11.setBounds(45, bs, 160, 40);
				jl11.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		        add(jl11);
		        JLabel jl17 = new JLabel("单价");
				jl17.setBounds(205, bs, 70, 40);
				jl17.setText(""+goods.getG2());
				jl17.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl18 = new JLabel("数量");
				jl18.setBounds(275, bs, 85, 40);
				jl18.setText(""+Calculate.getNingmeng());
				jl18.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl19 = new JLabel("合计");
				jl19.setBounds(360, bs,85, 40);
				jl19.setText(""+(goods.getG2()*Calculate.getNingmeng()));
				jl19.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				jp.add(jl17);
				jp.add(jl18);
				jp.add(jl19);}
	       if(goodspd.b7){
	    	   bs = bs+40;
		        JLabel jl11 = new JLabel("花生小盘");
				jl11.setBounds(45, bs, 160, 40);
				jl11.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		        add(jl11);
		        JLabel jl17 = new JLabel("单价");
				jl17.setBounds(205, bs, 70, 40);
				jl17.setText(""+goods.getX1());
				jl17.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl18 = new JLabel("数量");
				jl18.setBounds(275, bs, 85, 40);
				jl18.setText(""+Calculate.getHua());
				jl18.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl19 = new JLabel("合计");
				jl19.setBounds(360, bs,85, 40);
				jl19.setText(""+(goods.getX1()*Calculate.getHua()));
				jl19.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				jp.add(jl17);
				jp.add(jl18);
				jp.add(jl19);

	       }

	       if(goodspd.b8){
	    	   bs = bs+40;
		        JLabel jl11 = new JLabel("特色小吃");
				jl11.setBounds(45, bs, 160, 40);
				jl11.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		        add(jl11);
		        JLabel jl17 = new JLabel("单价");
				jl17.setBounds(205, bs, 70, 40);
				jl17.setText(""+goods.getX2());
				jl17.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl18 = new JLabel("数量");
				jl18.setBounds(275, bs, 85, 40);
				jl18.setText(""+Calculate.getTe());
				jl18.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				JLabel jl19 = new JLabel("合计");
				jl19.setBounds(360, bs,85, 40);
				jl19.setText(""+(goods.getX2()*Calculate.getTe()));
				jl19.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				jp.add(jl17);
				jp.add(jl18);
				jp.add(jl19);}

	     if(Calculate.getnum()>200){
	    	  bs = bs+40;
	         JLabel jl11 = new JLabel("折扣： 满200-20");
	  				jl11.setBounds(45, bs, 160, 40);
	  				jl11.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	  		        add(jl11);
	  		        JLabel jl17 = new JLabel();
	  				jl17.setBounds(205, bs, 70, 40);
	  				jl17.setText("");
	  				jl17.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	  				JLabel jl18 = new JLabel();
	  				jl18.setBounds(275, bs, 85, 40);
	  				jl18.setText("");
	  				jl18.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	  				JLabel jl19 = new JLabel("合计");
	  				jl19.setBounds(360, bs,85, 40);
	  				jl19.setText(""+-20);
	  				jl19.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	  				jp.add(jl17);
	  				jp.add(jl18);
	  				jp.add(jl19);
	  				bs = bs+40;
	  				 JLabel jl112 = new JLabel("合计");
		  				jl112.setBounds(45, bs, 160, 40);
		  				jl112.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		  		        add(jl112);
		  		        JLabel jl172 = new JLabel();
		  				jl172.setBounds(205, bs, 70, 40);
		  				jl172.setText("");
		  				jl172.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		  				JLabel jl182 = new JLabel();
		  				jl182.setBounds(275, bs, 85, 40);
		  				jl182.setText("");
		  				jl182.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		  				JLabel jl192 = new JLabel("合计");
		  				jl192.setBounds(360, bs,85, 40);
		  				zje = (Calculate.getnum()-20);
		  				jl192.setText(""+(Calculate.getnum()-20));
		  				jl192.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		  				jp.add(jl172);
		  				jp.add(jl182);
		  				jp.add(jl192);
	     }else{
	    	  bs = bs+40;
		         JLabel jl11 = new JLabel("折扣： 满200-20");
		  				jl11.setBounds(45, bs, 160, 40);
		  				jl11.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		  		        add(jl11);
		  		        JLabel jl17 = new JLabel();
		  				jl17.setBounds(205, bs, 70, 40);
		  				jl17.setText("");
		  				jl17.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		  				JLabel jl18 = new JLabel();
		  				jl18.setBounds(275, bs, 85, 40);
		  				jl18.setText("");
		  				jl18.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		  				JLabel jl19 = new JLabel("合计");
		  				jl19.setBounds(360, bs,85, 40);
		  				jl19.setText(""+-0);
		  				jl19.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		  				jp.add(jl17);
		  				jp.add(jl18);
		  				jp.add(jl19);
		  				bs = bs+40;
		  				 JLabel jl112 = new JLabel("合计");
			  				jl112.setBounds(45, bs, 160, 40);
			  				jl112.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			  		        add(jl112);
			  		        JLabel jl172 = new JLabel();
			  				jl172.setBounds(205, bs, 70, 40);
			  				jl172.setText("");
			  				jl172.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			  				JLabel jl182 = new JLabel();
			  				jl182.setBounds(275, bs, 85, 40);
			  				jl182.setText("");
			  				jl182.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			  				JLabel jl192 = new JLabel("合计");
			  				jl192.setBounds(360, bs,85, 40);
			  				zje = Calculate.getnum();
			  				jl192.setText(""+Calculate.getnum());
			  				jl192.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			  				jp.add(jl172);
			  				jp.add(jl182);
			  				jp.add(jl192);
	     }
	     News n = UserIO.getNews(News.currentId);
	       bs = bs+40;
	       JLabel jls = new JLabel("人民币大写:");
	       jls.setBounds(45, bs,400, 40);
	       jls.setText("人民币大写:       "+new CnUpperCaser(""+Calculate.getnum()).getCnString());
	       jls.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	       jp.add(jls);
	       bs =bs+40;
	       JLabel jls2 = new JLabel("支付方式:   餐卡");
	       jls2.setBounds(45, bs,260, 40);
	       jls2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	       jp.add(jls2);
	       JLabel jls3 = new JLabel("卡号：   ");
	       jls3.setBounds(305, bs,140, 40);
	       jls3.setText("卡号：   "+n.getCard());
	       jls3.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	       jp.add(jls3);
	       bs =bs+40;
	       JLabel jlw= new JLabel("当前余额：");
	       jlw.setBounds(45, bs,260, 40);
	       jlw.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	       jp.add(jlw);
	       JLabel jls4 = new JLabel("卡号：   ");
	       jls4.setBounds(305, bs,140, 40);
	       jls4.setText("  "+n.getMoney());
	       jls4.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	       jp.add(jls4);

	       bs =bs+40;
	       JLabel jlw2= new JLabel("支付金额：");
	       jlw2.setBounds(45, bs,260, 40);
	       jlw2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	       jp.add(jlw2);
	       JLabel jls5 = new JLabel("-  ");
	       jls5.setBounds(305, bs,140, 40);
	       jls5.setText("  "+zje);
	       jls5.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	       jp.add(jls5);

	       bs =bs+40;
	       JLabel jlw3= new JLabel("剩余金额：");
	       jlw3.setBounds(45, bs,260, 40);
	       jlw3.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	       jp.add(jlw3);
	       JLabel jls6 = new JLabel(" ");
	       jls6.setBounds(305, bs,140, 40);

	       jls6.setText("  "+(n.getMoney()-zje));
	       n.setMoney(n.getMoney()-zje);
	       jls6.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	       jp.add(jls6);
	       bs =bs+40;
	       JLabel jlws= new JLabel("顾客姓名：");
	       jlws.setBounds(45, bs,260, 40);
	       jlws.setText("顾客姓名：  "+n.getName());
	       jlws.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	       jp.add(jlws);
	       JLabel jls7 = new JLabel(" ");
	       jls7.setBounds(305, bs,140, 40);
	       jls7.setText("电话"+n.getTab());
	       jls7.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	       jp.add(jls7);
	       bs = bs+40;
	       JLabel jlq = new JLabel("支付完成，欢迎下次光临");
	       jlq.setBounds(45, bs, 300, 30);
	       jp.add(jlq);
			add(jp);

		//setBackground(Color.WHITE);
		setSize(550,bs+150);
		setVisible(true);
		UserIO.setNews(n);
	}
//	public static void main(String[] args) {
//		new Receipt();
//	}
}
