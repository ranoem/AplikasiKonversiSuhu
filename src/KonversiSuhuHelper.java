public class KonversiSuhuHelper {
    public static double convertTemperature(double value, String fromScale, String toScale) {
        if (fromScale.equals(toScale)) {
            return value;
        }

        double celsius;
        switch (fromScale) {
            case "Fahrenheit":
                celsius = (value - 32) * 5 / 9;
                break;
            case "Reamur":
                celsius = value * 5 / 4;
                break;
            case "Kelvin":
                celsius = value - 273.15;
                break;
            default:
                celsius = value;
        }

        switch (toScale) {
            case "Fahrenheit":
                return celsius * 9 / 5 + 32;
            case "Reamur":
                return celsius * 4 / 5;
            case "Kelvin":
                return celsius + 273.15;
            default:
                return celsius;
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

