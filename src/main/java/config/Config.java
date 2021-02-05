package config;

import java.io.IOException;

public class Config extends Environment{

    private String configuration = System.getProperty("ENVIRONMENT");

    public String getUrlEnvironment() throws IOException {
        String environment = getEnvironment(configuration);
        return environment;
    }

}
