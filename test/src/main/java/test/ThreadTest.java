package test;

public class ThreadTest {

	public static void main(String[] args) {
		String keyword = "\\\\%%_\\%__\\张三%";
		System.out.println(transfer(keyword));
    
	}

	//模糊查询时防止SQL注入，(字符替换)
	public static String transfer(String keyword){
		if(keyword.contains("%") || keyword.contains("_")){
			keyword = keyword.replaceAll("\\\\","\\\\\\\\")
					.replaceAll("\\%","\\\\%")
					.replaceAll("\\_","\\\\_");
		}
		return keyword;
	}
	
}



