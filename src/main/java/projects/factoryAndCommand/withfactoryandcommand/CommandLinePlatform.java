package projects.factoryAndCommand.withfactoryandcommand;

public class CommandLinePlatform implements Platform {

    public CommandLinePlatform(String a, String b) {
        // do something
    }

    @Override
    public String outputString(String line) {
        return "command-line-platform--output-string";
    }
}
