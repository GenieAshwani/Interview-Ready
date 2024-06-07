package LLD.CustomException;

class CustomException extends Exception {
    private static CustomException instance;

    // Private constructor to prevent instantiation
    private CustomException(String s) {
        super(s);
    }

    // Static method to get the singleton instance
    public static CustomException getInstance() {
        if (instance == null) {
            instance = new CustomException("Exception occured...");
        }
        return instance;
    }
}
