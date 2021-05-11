import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ders016Date {
	public static void main(String[] args) {
		// if we want to give general using date
		// tr= language code, TR = country code
		Locale turkeyLocal = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy hh:mm:ss zzzz", turkeyLocal);
		// Date
		Date date = new Date();
		System.out.println(date);

		Calendar dateLocal = Calendar.getInstance();
		String dateWithFormat = simpleDateFormat.format(dateLocal.getTime());
		System.out.println(dateWithFormat);
		/*
		 * Date dateLocal = new Date(); String dateWithFormat =
		 * simpleDateFormat.format(dateLocal); System.out.println(dateWithFormat); long
		 * timeLong = System.currentTimeMillis(); System.out.println(timeLong);
		 */
	}
}
