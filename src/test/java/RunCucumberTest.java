import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"de.monochromata.cucumber.report.PrettyReports:target/cucumber"},
        stepNotifications = true,
        tags = "@PasswordValidation",

        features = "src/test/resources/FirstFuture.feature",
        glue = {"com.itstep.automationpractice.steps",
                "com.itstep.automationpractice.hooks"})

public class RunCucumberTest {


}
