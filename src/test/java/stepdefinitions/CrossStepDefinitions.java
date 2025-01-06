package stepdefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;

public class CrossStepDefinitions {
    @Given("kullanici browser tipini {string} olarak secer")
    public void kullaniciBrowserTipiniOlarakSecer(String browser) {

        switch (browser){
            case "headless":
                Configuration.headless=true;
                break;

            case "firefox":
                Configuration.browser="firefox";
                break;

            case "safari":
                Configuration.browser ="safari";
                break;

            case "opera":
                Configuration.browser ="opera";
                break;

            case "edge":
                Configuration.browser ="edge";
                break;

            default:
                Configuration.browser="chrome";
                break;

        }


    }
}
