package hexlet.code;

class Cli {
    public static void greetsThePlayer() {
        System.out.println("May I have your name?");
        String userName = App.ENGINE.getScanner().next();
        App.ENGINE.setUserName(userName);
        System.out.println("Hello, " + userName + "!");
    }

    public static void printGreets() {
        System.out.println("Hello, " + App.ENGINE.getUserName() + "!");
    }
}
