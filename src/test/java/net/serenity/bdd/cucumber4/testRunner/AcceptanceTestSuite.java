package net.serenity.bdd.cucumber4.testRunner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features", glue="net.serenity.bdd.cucumber4")
public class AcceptanceTestSuite {}
