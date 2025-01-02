package stepdefinitions;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import pages.TestCenterPage;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class IframeStepDefinitions {

    TestCenterPage testCenterPage=new TestCenterPage();

    @And("switch to frame {int}")
    public void switchToFrame(int frame) throws InterruptedException {

        switchTo().frame(frame-1);

        System.out.println("Ilk Sayfa  "+url());

        Thread.sleep(3000);

    }

    @And("kullanici back to techproeducation.com linkine tiklar")
    public void kullaniciBackToTechproeducationComLinkineTiklar() throws InterruptedException {

        Selenide.executeJavaScript("arguments[0].scrollIntoView({block: 'center'});", testCenterPage.backToTech);

        Thread.sleep(3000);

        testCenterPage.backToTech.click();



    }

    @And("switch to window {int}")
    public void switchToWindow(int window) {

        switchTo().window(window-1);

        System.out.println("Ikinci Sayfa  "+url());
        //Selenium da biraz daha zor handle etmek lazim
        //Selenide de 0 ilk , 1 sonra acilan window , yani index ile gider

    }
}
