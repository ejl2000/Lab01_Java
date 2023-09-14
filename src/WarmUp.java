/**
 * Demonstrates good use of control structures.
 *
 * @author
 * @version
 */
public class WarmUp {

    /**
     * Drives the program.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        int maxBars = 0;
        String maxBarsTime = "";

        for (int hour = 1; hour <= 12; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                int totalBars = countBars(hour % 10) + countBars(minute / 10) + countBars(minute % 10);
                if (totalBars > maxBars) {
                    maxBars = totalBars;
                    maxBarsTime = String.format("%02d:%02d", hour, minute);
                }
            }
        }

        System.out.println("The time with the highest number of bars: " + maxBarsTime);
        System.out.println("The total number of bars: " + maxBars);
    }

    /**
     * Counts the number of bars required to display a digit.
     *
     * @param digit an int
     * @return bars[digit] as an int
     */
    private static int countBars(int digit) {
        int[] bars = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        return bars[digit];
    }
}
