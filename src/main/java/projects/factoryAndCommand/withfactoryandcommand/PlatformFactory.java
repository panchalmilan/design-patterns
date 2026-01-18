package projects.factoryAndCommand.withfactoryandcommand;

import java.util.HashMap;

public class PlatformFactory {

    private HashMap<String, IPlatformFactoryCommand> platformMap = new HashMap<>();

    // Command
    private static interface IPlatformFactoryCommand {
        public Platform execute();
    }

    // ConcreteCommandA
    private static class PlatformFactoryAndroidCommand implements IPlatformFactoryCommand{
        @Override
        public Platform execute() {
            return new AndroidPlatform("", "", "");
        }
    }

    // ConcreteCommandB
    private static class PlatformFactoryCommandlineCommand implements IPlatformFactoryCommand{
        @Override
        public Platform execute() {
            return new CommandLinePlatform("", "");
        }
    }

    // Constructor
    public PlatformFactory() {
        platformMap.put("The Android Project", new PlatformFactoryAndroidCommand());
        platformMap.put("Sun Microsystems Inc.", new PlatformFactoryCommandlineCommand());
    }


    public Platform makePlatform() {
        String name = System.getProperty("java.specification.vendor");
        return this.platformMap.get(name).execute();
    }
}
