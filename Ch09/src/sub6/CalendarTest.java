package sub6;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DATE);
		int h = cal.get(Calendar.HOUR);
		int mn = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d\n" ,y,m,d);
		System.out.printf("%d-%d-%d\n" ,h,mn,s);
		
	}
}
