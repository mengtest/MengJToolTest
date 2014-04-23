package meng.base.mstring;


/**
 * 字符串测试类
 * @author Administrator
 *
 */
public class TestString {

	/**
	 * 参照网址：
	 * http://blog.163.com/hn_myj@126/blog/static/50555635200861133942947/
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "abc12345678910";
		
		//1 、length() 字符串的长度
		System.out.println("字符串的长度length()：" + str.length());
		
		//2、截取一个字符charAt()
		System.out.println("截取一个字符charAt()：" + str.charAt(1));
		
		/**
		 * 3、getChars() 截取多个字符sourceStart指定了子串开始字符的下标，
		 * sourceEnd指定了子串结束后的下一个字符的下标。
		 * 因此，子串包含从sourceStart到sourceEnd-1的字符。接收字符的数组由target指定，target中开始复制子串的下标值是targetStart。
		 */
		char buf[] = new char[5];
		str.getChars(1, 3, buf, 2);
		System.out.println("截取一个字符charAt()：" + buf.toString());
		
		//getBytes()
		char temchar[] = {'a', 'b', 'c'};
		
		//toCharArray()
		
		//equals()和equalsIgnoreCase() 比较两个字符串
		
		//regionMatches() 用于比较一个字符串中特定区域与另一特定区域，它有一个重载的形式允许在比较中忽略大小写
	}
	
	/**
	 * 初始化
	 * @String 程序中不会被改变长度
	 * @StringBuffer 程序中会被改变长度
	 */
	public static void doInit()
	{
		String str = new String("This is a String");
		String str2 = "This is a String";
	}
}
