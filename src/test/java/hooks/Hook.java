package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void init(Scenario scenario) {
        System.out.println(String.format("TESTE INICIADO: %s", scenario.getName()));
    }

    @After
    public void end(Scenario scenario) {
        System.out.println(String.format("TESTE FINALIZADO: %s", scenario.getName()));
        System.out.println(String.format("TESTE STATUS: %s", scenario.getStatus()));
    }
}









