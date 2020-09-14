package com.code.cuc_maven;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/cal.feature",
        format={"pretty","html:target/Reports"}
        )
public class AppTest {
}