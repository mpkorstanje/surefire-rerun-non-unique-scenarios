package io.cucumber.skeleton;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class StepDefinitions {
    @Given("this scenario is aborted")
    public void thisScenarioIsSkipped() {
        Assumptions.assumeTrue(false);
    }

    @Given("this scenario fails")
    public void thisScenarioFails() {
        Assertions.assertTrue(false);
    }

    @Given("this scenario passes")
    public void thisScenarioPasses() {
    }
}