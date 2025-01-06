package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.TestCenterPage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ExplicitStepDefinitions {

    TestCenterPage testCenterPage=new TestCenterPage();

    @And("start butonuna tiklar")
    public void startButonunaTiklar() {

        testCenterPage.startButton.click();


    }

    @Then("kullanici {string} metnini dogrular")
    public void kullaniciMetniniDogrular(String string1) {

        testCenterPage.helloWorld.should(visible, Duration.ofSeconds(10));

        testCenterPage.helloWorld.shouldHave(text(string1));

    }
}
