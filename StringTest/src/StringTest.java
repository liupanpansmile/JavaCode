import java.util.Arrays;


public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String str = new String() ;
		
		
		String s = "AA" ;
		char[] chs = {'A','A'} ;
		
		/*test(s,chs) ;
		System.out.println(s); ;
		System.out.println(chs);*/
		
		TestStringAndStringBuilder() ;
		
		System.out.println('0'+0);
		
		
	}
	
	public static void test(String str,char [] chs)
	{
		str = "BC" ;
		chs[0] = 'S' ;
		chs = str.toCharArray() ;
		
	}
	
	public static void TestStringAndStringBuilder()
	{
		StringBuilder sb = new StringBuilder() ;
		
		sb.append('中') ;
		sb.append('国') ;
		sb.append('我') ;
		sb.append('爱') ;
		sb.insert(4, '你')  ;
		
		StringBuilder sb2 = sb.replace(0,1,"北京") ;
		
		System.out.println(sb);
		System.out.println(sb2);
		
		
		
	}
}
