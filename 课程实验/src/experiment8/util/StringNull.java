package experiment8.util;
/**
 * �ж��ַ����Ƿ�Ϊ��
 * @author admin
 *
 */
public class StringNull {
	/**
	 * �ж��Ƿ�Ϊ��
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str)  {
		if(str==null||"".equals(str.trim())) {
			return true;//1��
		}else {
			return false;//0��
		}
	}
	/**
	 * �ж��Ƿ�Ϊ��
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		if(str!=null&&!"".equals(str.trim())) {
			return true;
		}else {
			return false;
		}
	}
}
