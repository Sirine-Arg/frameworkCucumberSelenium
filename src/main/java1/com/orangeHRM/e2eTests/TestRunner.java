package com.orangeHRM.e2eTests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/specs/features"},
		//glue = {"src/main/java1/com/orangeHRM/e2eTests/stepDefinition"},
		plugin= {"pretty", "html:target/cucumber-html-report"},
		snippets = SnippetType.CAMELCASE,
		tags = {("@connexion")},
		monochrome = true
		)
public class TestRunner {

}