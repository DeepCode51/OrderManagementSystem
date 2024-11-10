package method;
public class NumberDemo {
	//正则表达式（格式）："^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$" 数字类型格式
	public static boolean isNum(String str){
		if(!"".equals(str)){
			boolean b = str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");	
			return b;
		}else{
			return false;
		}
		
	}

}
