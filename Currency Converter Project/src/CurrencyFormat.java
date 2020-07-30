import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {
	
	static String out;
	static Locale e=new Locale("en","IN");
	
	public static String CurrencyFormatter(int index, double input)
	{
		Locale[] locale=new Locale[] { e, Locale.US, Locale.FRENCH, Locale.JAPAN, Locale.SIMPLIFIED_CHINESE, Locale.UK, Locale.GERMAN };
		
		NumberFormat formatter=NumberFormat.getCurrencyInstance(locale[index]);
		
		String s = formatter.format(input).toString();
		
		return s;
	}
}
