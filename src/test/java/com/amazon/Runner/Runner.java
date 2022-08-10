package com.amazon.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue="com.amazon.stepDef",features="feature",
		plugin= {"html:target/index.html",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})

public class Runner extends CucumberTests{

}
