package com.devco.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/com.devco.test/test_devco.feature",
        glue="com.devco.test.stepdefinitions",
        snippets= SnippetType.CAMELCASE
)

public class TestDevcoRunner {
}
