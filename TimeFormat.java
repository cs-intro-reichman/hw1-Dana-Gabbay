public class TimeFormat 
{
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String format;
		if (hours<12)
			format= "AM";
			else
				format= "PM";
		if (hours>12)
			hours=hours-12;
		if (minutes<10 && hours<10)
			System.out.println("0"+hours+ ":0"+ minutes+ " "+ format);
			else
			if (minutes<10 && hours>10)
				System.out.println(hours+ ":0"+ minutes+ " "+ format);
				else
				if (minutes>10 && hours<10)
				System.out.println("0"+hours+ ":"+ minutes+ " "+ format);
				else
				if (minutes>=10 && hours>=10)
				System.out.println(hours+ ":"+ minutes+ " "+ format);
		}
	}
