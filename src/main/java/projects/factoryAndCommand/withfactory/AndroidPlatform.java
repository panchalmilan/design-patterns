package projects.factoryAndCommand.withfactory;

public class AndroidPlatform implements Platform {

    public AndroidPlatform(String a, String b, String c) {
        // do something
    }


    @Override
    public String outputString(String line) {
        return "android-platform--output-string";
    }
}
