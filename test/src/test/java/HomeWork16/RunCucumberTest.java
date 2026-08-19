package HomeWork16;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import io.cucumber.junit.platform.engine.Constants;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("feature")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "HomeWork16")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "not @negative")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "pretty, html:build/cucumber-report/report.html")
public class RunCucumberTest {
}
