import java.time.LocalDate;
import java.util.Scanner;

public class MenstrualCycleApp{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

        System.out.println("Enter first day of last period (yyyy-mm-dd): ");
	String dateInput = input.nextLine();
	LocalDate lastPeriod = LocalDate.parse(dateInput);   

	System.out.print("Enter your average cycle length (in days)");
	int cycleLength = input.nextInt();

	System.out.println("Enter your period duration (in days): ");
	int periodLength = input.nextInt();

	LocalDate nextPeriod = lastPeriod.plusDays(cycleLength);
	LocalDate ovulationDate = nextPeriod.minusDays(14);
	LocalDate fertileStart = ovulationDate.minusDays(5);
	LocalDate fertileEnd = ovulationDate.plusDays(1);
	LocalDate safeStart1 = lastPeriod.plusDays(periodLength);
	LocalDate safeEnd1 = fertileStart.minusDays(1);
	LocalDate safeStart2 = fertileEnd.plusDays(1);
	LocalDate safeEnd2 = nextPeriod.minusDays(1);

	System.out.println("\n---- Menstrual Cycle Details ----");
	System.out.println("Next period Starts: " + nextPeriod);
	System.out.println("Ovulation Day: " + ovulationDate);
	System.out.println("Fertile Window: " + fertileStart + " to " + fertileEnd);
	System.out.println("Safe Periods:");
	System.out.println("- Before Ovulation: " + safeStart1 + " to " + safeEnd1);
	System.out.println(" - After Ovulation: " + safeStart2 + " to " + safeEnd2);


}


}