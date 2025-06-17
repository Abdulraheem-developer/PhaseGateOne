import java.time.LocalDate;
import java.util.Scanner;

public class MenstrualCycleApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalDate lastPeriod = null;
        int cycleLength = 0;
        int periodLength = 0;

        
        boolean dateIsValid = false;

        while (!dateIsValid) {
            try {
                System.out.println("Enter first day of last period (yyyy-mm-dd): ");
                String dateInput = input.nextLine();
                lastPeriod = LocalDate.parse(dateInput);

                if (lastPeriod.isAfter(LocalDate.now())) {
                    System.out.println("Date cannot be in the future. Try again.");
                } else {
                    dateIsValid = true;  
                }

            } catch (Exception e) {
                System.out.println("Invalid date. Please use the yyyy-mm-dd format (e.g., 2025-06-01).");
            }
        }

       
        boolean cycleIsValid = false;

        while (!cycleIsValid) {
            try {
                System.out.print("Enter your average cycle length (in days): ");
                cycleLength = Integer.parseInt(input.nextLine());

                if (cycleLength < 21 || cycleLength > 35) {
                    System.out.println("Cycle length should be between 15 and 60 days. Try again.");
                } else {
                    cycleIsValid = true;  
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid whole number.");
            }
        }

       
        boolean periodIsValid = false;

        while (!periodIsValid) {
            try {
                System.out.println("Enter your period duration (in days): ");
                periodLength = Integer.parseInt(input.nextLine());

                if (periodLength < 1 || periodLength > 15) {
                    System.out.println("Period duration should be between 1 and 15 days. Try again.");
                } else {
                    periodIsValid = true;  
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid whole number.");
            }
        }

        
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
        System.out.println("- After Ovulation: " + safeStart2 + " to " + safeEnd2);
    }
}
