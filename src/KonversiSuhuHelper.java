public class KonversiSuhuHelper {
    public static double convertTemperature(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static boolean isNumeric(String input) {
        try {
            Double.parseDouble(input); 
            return true; 
        } catch (NumberFormatException e) {
            return false; 
        }
    }
}

