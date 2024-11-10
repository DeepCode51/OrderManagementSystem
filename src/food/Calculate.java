package food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Calculate {
	static int num = 0;
	public static void setnum(int a){
		num = num+a;
	}
	public static void setnum2(int a){
		num = num-a;
	}
	public static int getnum(){
		int a = num;
		return a;
	}
	static List<String> lst = new ArrayList<String>();
	public static void setList(String str){
		lst.add(str);

	}
	public static void del(String str){
		lst.remove(str);
	}
	public static int getList(String str){
		Iterator<String> it = lst.iterator();
		int a = 0;
		while(it.hasNext()){
			if(it.next().equals(str)){
				a++;
			}
		}
		return a;
	}
	static int shourou = 0;
	static int lasi = 0;
	static int wei = 0;
	static int bing = 0;
	static int xian = 0;
	static int ningmeng = 0;
	static int hua = 0;
	static int te = 0;
	public static void setsqk(){
		shourou = 0;
		 lasi = 0;
		wei = 0;
		bing = 0;
		xian = 0;
		ningmeng = 0;
		hua = 0;
		te = 0;
	}
	public static void setsl(){
		getsl();
		getsl2();
		getsl3();
		getsl4();
		getsl5();
		getsl6();
		getsl7();
		getsl8();
	}
	public static int getShourou() {
		return shourou;
	}
	public static int getLasi() {
		return lasi;
	}
	public static int getWei() {
		return wei;
	}
	public static int getBing() {
		return bing;
	}
	public static int getXian() {
		return xian;
	}
	public static int getNingmeng() {
		return ningmeng;
	}
	public static int getHua() {
		return hua;
	}
	public static int getTe() {
		return te;
	}
	public static void getsl(){
		Iterator<String> it = lst.iterator();
		for(int a = 0;a<=lst.size();a++){
			if(it.hasNext()){
			if(it.next().equals(goodsname.getPs1())){
				shourou++;
			}
		}
	}
}
	public static void getsl2(){
		Iterator<String> it = lst.iterator();
		for(int a = 0;a<=lst.size();a++){
			if(it.hasNext()){
			if(it.next().equals(goodsname.getPs2())){
				lasi++;
			}
		}}}
	public static void getsl3(){
		Iterator<String> it = lst.iterator();
		for(int a =0;a<=lst.size();a++){
			if(it.hasNext()){
			if(it.next().equals(goodsname.getT1())){
				wei++;
			}}
		}}
	public static void getsl4(){
			Iterator<String> it = lst.iterator();
		for(int a = 0;a<=lst.size();a++){
			if(it.hasNext()){
			if(it.next().equals(goodsname.getT2())){
				bing++;
			}}
		}}
	public static void getsl5(){
		Iterator<String> it = lst.iterator();
		for(int a =0;a<=lst.size();a++){
			if(it.hasNext()){
			if(it.next().equals(goodsname.getG1())){
				xian++;
			}}
		}}
	public static void getsl6(){
		Iterator<String> it = lst.iterator();
		for(int a = 0;a<=lst.size();a++){
			if(it.hasNext()){
			if(it.next().equals(goodsname.getG2())){
				ningmeng++;
			}}
		}}
	public static void getsl7(){
		Iterator<String> it = lst.iterator();
		for(int a = 0;a<=lst.size();a++){
			if(it.hasNext()){
			if(it.next().equals(goodsname.getX1())){
				hua++;
			}}
		}}
	public static void getsl8(){
		Iterator<String> it = lst.iterator();
		for(int a = 0;a<=lst.size();a++){
			if(it.hasNext()){
			if(it.next().equals(goodsname.getX2())){
				te++;
			}}
		}
	}
	static int lisesize;
public static void getlist(){
	for(int i=0;i<lst.size();i++)
			{
		lisesize++;
			}
	}
public static void getlsize(){
	HashMap<String, Integer> hs = new HashMap<String, Integer>();
	for (String string : lst) {
		Integer count = 1;
		if(hs.get(string) != null) {
			count = hs.get(string) + 1;
		}
		hs.put(string, count);
	}
	}
}
