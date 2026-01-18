package projects.factoryAndCommand.without;

public class Client {
    public static void main(String[] args) {

        Platform platform = null;

        String name = System.getProperty("java.specification.vendor");
        if(name.equals("The Android Project")) {
            platform = new AndroidPlatform("", "", "");
        }
        else if (name.equals("Sun Microsystems Inc.")) {
            platform = new CommandLinePlatform("", "");
        }
        else {
            platform = new CommandLinePlatform("", "");
        }

        platform.outputString("line");
    }
}

