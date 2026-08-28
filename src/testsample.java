public class testsample {
    public static void main (String[] args) {
        String name = getName(args);
        System.out.println(buildGreeting(name));
        System.out.println(buildWelcomeMessage(name));
        printDivider();
        System.out.println("Name length: " + countCharacters(name));
    }

    private static String getName(String[] args) {
        if (args.length == 0 || args[0].isBlank()) {
            return "java";
        }

        return capitalize(args[0]);
    }

    private static String buildGreeting(String name) {
        return "hello " + name;
    }

    private static String buildWelcomeMessage(String name) {
        return "Welcome, " + name + "!";
    }

    private static int countCharacters(String value) {
        return value.length();
    }

    private static String capitalize(String value) {
        return value.substring(0, 1).toUpperCase() + value.substring(1);
    }

    private static void printDivider() {
        System.out.println("----------------");
    }
}
