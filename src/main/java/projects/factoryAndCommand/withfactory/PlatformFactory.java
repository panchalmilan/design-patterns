package projects.factoryAndCommand.withfactory;

public class PlatformFactory {
    public Platform makePlatform() {
        String name = System.getProperty("java.specification.vendor");
        if(name.equals("The Android Project")) {
            return new AndroidPlatform("", "", "");
        }
        else if (name.equals("Sun Microsystems Inc.")) {
            return new CommandLinePlatform("", "");
        }
        else {
            return new CommandLinePlatform("", "");
        }
    }
}
