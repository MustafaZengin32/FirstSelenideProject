package stepdefinitions;

import io.cucumber.java.en.And;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class AlertStepDefinitions {

    TestCenterPage testCenterPage=new TestCenterPage();

    @And("alert prompt butonuna tiklar")
    public void alertPromptButonunaTiklar() {

        testCenterPage.alertPrompt.click();

    }

    @And("kullanici alerte {string} metnini yazar ve OK a tiklar")
    public void kullaniciAlerteMetniniYazarVeOKATiklar(String string1) throws InterruptedException {

        switchTo().alert().sendKeys(string1);

        Thread.sleep(3000);

        //Selenide deki sleep dinamik , yani ihtiyac yoksa beklemez , bu sebeple Thread yaptik

        switchTo().alert().accept();

    }

    @And("kullanici sonucun {string} icerdigini dogrular")
    public void kullaniciSonucunIcerdiginiDogrular(String string2) {

        testCenterPage.alertresult.shouldHave(text(string2));

    }
}
