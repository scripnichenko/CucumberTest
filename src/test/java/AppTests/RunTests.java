package AppTests;

/**
 * Created by ansk0413 on 05.10.15.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources")
public class RunTests {
}