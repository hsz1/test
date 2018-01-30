package test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
				   
public class GetMdFive { 
	public static String getMd5(String str){
		StringBuffer buffer=new StringBuffer();
		try {
			MessageDigest md=MessageDigest.getInstance("MD5");
			//将需要加密的字符串分解成字节数组
			byte[] preByte=str.getBytes();
			//将生成的字节数组进行哈希码算法
			byte[] newByte=md.digest(preByte);
			//转换成16进制
			for(int i=0;i<newByte.length;i++){
				int n=newByte[i];
				if(n<0){
					n=n+256;
				}
				if(n<16){
					buffer.append(0);
				}
				buffer.append(Integer.toHexString(n));
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buffer.toString();
	}
	
	public static void main(String[] args) {
		String str = GetMdFive.getMd5("123456");
		System.out.println(str);
	}
	
}
