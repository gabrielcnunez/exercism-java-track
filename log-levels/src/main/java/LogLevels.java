public class LogLevels {
    
    public static String message(String logLine) {
        String[] parts = logLine.split(": ", 2);
        return parts[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] parts = logLine.split("]", 2);
        String levelOnly = parts[0].substring(1);
        return levelOnly.toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String logLevel = logLevel(logLine);
        return message + " (" + logLevel + ")";
    }
}
