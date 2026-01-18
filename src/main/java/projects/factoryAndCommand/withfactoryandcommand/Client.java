package projects.factoryAndCommand.withfactoryandcommand;

public class Client {
    public static void main(String[] args) {
        Platform platform = new PlatformFactory().makePlatform();
        platform.outputString("line");
    }
}

