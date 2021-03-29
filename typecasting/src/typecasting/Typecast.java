package typecasting;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Typecast {

	public static void main(String[] args) {
		
				int a= 10;  // Integer to String
				String st1 = String.valueOf(a);
				String st2 = Integer.toString(a);

				System.out.println("Integer to String: " + st1);
				System.out.println("Integer to String: " + st2);
	
				String s = "234"; // String to Integer
				int i1 = Integer.parseInt(s);
				int i2 = Integer.valueOf(s);
				System.out.println("String to Integer : " + i1);
				System.out.println("String to Integer : " + i2);

				String sdate = "29/03/2021 10:15:45";// String to Date
				Date date1= null;
				
					try {
						 date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sdate);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				System.out.println(date1);

			}


	}


