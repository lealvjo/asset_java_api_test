package config;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Environment{

    public static String getEnvironment(String environment) throws IOException {
        Properties prop = getProp();
        String env = prop.getProperty("env." + environment.toLowerCase());
        return env;
    }

    private static Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream("src/test/resources/env.properties");
        props.load(file);
        return props;
    }
}
