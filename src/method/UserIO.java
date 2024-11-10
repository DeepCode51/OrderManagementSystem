package method;

import food.News;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserIO {
	public static void OutUser(News u){
		 List<News> ls = InUser();
		ObjectOutputStream obs = null;
		try {
			 obs = new ObjectOutputStream(new FileOutputStream("file/userMessage.txt"));

			ls.add(u);
			obs.writeObject(ls);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(obs!=null){
				try {
					obs.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static List<News> InUser(){
		ObjectInputStream oin = null;
		List ls = null;
		try {
			oin = new ObjectInputStream(new FileInputStream("file/userMessage.txt"));
			try {
				ls = (List) oin.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(oin!=null){
				try {
					oin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return ls;
	}

	public static boolean checkUser(String user,String pwd){
		boolean flag = false;
		 List<News> ls = InUser();
		 if(ls.size()>0){
			 for(int i = 0;i<ls.size();i++){
				 News u = ls.get(i);
				 if(u.getName().equals(user)&&u.getPwd().equals(pwd)){
					 News.currentId=u.getId();
					 System.out.println("登陆ID"+u.getId()+"密码"+u.getPwd());
					 flag = true;
					 break;
				 }
			 }

		 }

		return flag;
	}

	public static News getNews(int id){
		 List<News> ls = InUser();
		 News news = null;
		for(int i=0;i<ls.size();i++){
			News n = ls.get(i);
			if(n.getId()==id){
				System.out.println("位置:"+i);
				news = n;
				break;
			}

		}
		return news;
	}

	public static void setNews(News a){
		 List<News> ls = InUser();
		 System.out.println("ID:"+a.getId());
		 System.out.println("Y"+a.getMoney());
		 System.out.println("News.currentId "+News.currentId);
		ls.set(News.currentId-1, a);
		ObjectOutputStream obs = null;
		try {
			 obs = new ObjectOutputStream(new FileOutputStream("file/userMessage.txt"));


			obs.writeObject(ls);
			System.out.println("集合长度"+ls.size());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(obs!=null){
				try {
					obs.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void OutUser2(){

		ObjectOutputStream obs = null;
		try {
			 obs = new ObjectOutputStream(new FileOutputStream("file/userMessage.txt"));


			obs.writeObject(new ArrayList<News>());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(obs!=null){
				try {
					obs.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
public static void main(String[] args) {
	 OutUser2();
}
}
