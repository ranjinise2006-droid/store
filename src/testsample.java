public class testsample {
    public static void main (String[] args) {
        String name = args.length > 0 ? args[0] : "java";
        System.out.println(buildGreeting(name));
    }

    private static String buildGreeting(String name) {
        return "hello " + name;
    }
}
