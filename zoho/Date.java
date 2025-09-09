package zoho;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Date {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalDate future = ld.plusDays(10);
		LocalDate past = ld.minusMonths(2);
		DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		ZonedDateTime zd = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
		ZonedDateTime zdt = zd.withZoneSameInstant(ZoneId.of("Australia/Darwin"));
		String d= dtm.format(future);
		System.out.println(future);
		System.out.println(past);
		System.out.println(d);
		System.out.println(zd);
		System.out.println(zdt);
		TimeZone tz = TimeZone.getTimeZone("Asia/Calcutta");
		System.out.println(tz);
	}

}
