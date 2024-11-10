package food;

import java.io.Serializable;

public class News implements Serializable{//餐卡信息
	 int money;
	 String name;
	 int id;
	 String pwd;
	 String loc;
	 String tab;
	 String card;
	 
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public  static int currentId;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getTab() {
		return tab;
	}
	public void setTab(String tab) {
		this.tab = tab;
	}
	
}
