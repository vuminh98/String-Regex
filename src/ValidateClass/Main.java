package ValidateClass;

public class Main {
    private static ClassExample classExample;

    public static final String[] validClass = new String[] {"C0318G"};
    public static final String[] invalidClass = new String[] {"M0318G", "P0323A"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String classes : validClass) {
            boolean isValid = classExample.validate(classes);
            System.out.println("Class is " + classes + " is valid: " + isValid);
        }
        for (String classes : invalidClass) {
            boolean isValid = classExample.validate(classes);
            System.out.println("Class is " + classes + " is valid: " + isValid);
        }
    }
}
