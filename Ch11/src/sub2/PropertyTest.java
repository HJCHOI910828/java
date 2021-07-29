package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * ��¥ : 2021/05/27
 * �̸� : ��ö��
 * ���� : �ڹ� ������Ƽ ���� ����� �ǽ� 
 */
public class PropertyTest {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\bigdata.DESKTOP-61ML0B4\\Desktop\\city.properties";
		
		Properties props = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			// ������Ƽ ��ü�� ������ ����
			props.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("101�� ���� : "+props.getProperty("101"));
		System.out.println("102�� ���� : "+props.getProperty("102"));
	}
}






