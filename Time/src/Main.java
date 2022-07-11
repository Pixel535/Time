import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int InputSeconds = scanner.nextInt();
		int Hours;
		int Minutes;
		int Seconds;
		
		if(InputSeconds < 1 || InputSeconds > 1000000)
		{
			System.out.println("Number of seconds must be >= 1 and <= 1 000 000");
		}
		else
		{
			Hours = InputSeconds/3600;
			Minutes = (InputSeconds - Hours*3600)/60;
			Seconds = InputSeconds - Hours*3600 - Minutes*60;
			System.out.println(Hours + "g" + Minutes + "m" + Seconds + "s");
		}

	}

}
