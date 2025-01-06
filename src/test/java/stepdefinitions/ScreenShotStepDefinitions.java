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

    @And("tum ekran goruntusunu alir")
    public void tumEkranGoruntusunuAlir() {

        try {
            $(By.id("L2AGLb")).click();
        } catch (Exception e) {
            System.out.println("Akzeptiren Cikmadi Sorun Yok");
        }

        sleep(10000);

        Date date = new Date();

        screenshot(String.valueOf(date));


    }


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
