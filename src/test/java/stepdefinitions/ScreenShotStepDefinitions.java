package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import pages.TestCenterPage;

import java.util.Date;

import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ScreenShotStepDefinitions {

    TestCenterPage testCenterPage=new TestCenterPage();



    @And("google image goruntusunu al")
    public void googleImageGoruntusunuAl() {

        try{

            $(By.id("L2AGLb")).click();

        } catch (Exception e) {
            System.out.println("Akzeptiren Cikmadi Sorun Yok");
        }

        sleep(5000);

        testCenterPage.googlePicture.screenshot();

    }
}
