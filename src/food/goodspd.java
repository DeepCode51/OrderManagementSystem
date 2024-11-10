package food;

public class goodspd {
	static boolean b = false;
	static boolean b2 = false;
	static boolean b3 = false;
	static boolean b4 = false;
	static boolean b5 = false;
	static boolean b6 = false;
	static boolean b7 = false;
	static boolean b8 = false;
	public static void get(){
		set1();
		set2();
		set3();
		set4();
		set5();
		set6();
		set7();
		set8();
	}
	public static void set1(){
		if(Calculate.shourou>0){
			b = true;
		}else{
			b = false;
		}
	}
	public static void set2(){
		if(Calculate.lasi>0){
			b2 = true;
		}else{
			b2 = false;
		}
	}
	public static void set3(){
		if(Calculate.wei>0){
			b3 = true;
		}else{
			b3 = false;
		}
	}
	public static void set4(){
		if(Calculate.bing>0){
			b4 = true;
		}else{
			b4 = false;
		}
	}
	public static void set5(){
		if(Calculate.xian>0){
			b5 = true;
		}else{
			b5 = false;
		}
	}
	public static void set6(){
		if(Calculate.ningmeng>0){
			b6 = true;
		}else{
			b6 = false;
		}
	}
	public static void set7(){
		if(Calculate.hua>0){
			b7 = true;
		}else{
			b7 = false;
		}
	}
	public static void set8(){
		if(Calculate.te>0){
			b8 = true;
		}else{
			b8 = false;
		}
	}
}
