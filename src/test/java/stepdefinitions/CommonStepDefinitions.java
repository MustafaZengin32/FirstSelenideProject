package stepdefinitions;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;



import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.TestCenterPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonStepDefinitions {

    TestCenterPage testCenterPage=new TestCenterPage();

    @Given("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String string) {

        open(string);

    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int int1) {
        //selenide default olarak 4 sn bekler
        //daha fazla beklemek icin sleep() methodu kullanilir

        sleep(int1*1000);

    }

    @Then("onceki sayfaya gider")
    public void oncekiSayfayaGider() {

        back();
    }

    @Then("sonraki sayfaya gider")
    public void sonrakiSayfayaGider() {
        forward();
    }

    @Then("sayfayi yeniler")
    public void sayfayiYeniler() {
    refresh();
    }

    @Then("sayfayi acik tutar")
    public void sayfayiAcikTutar() {
        holdBrowserOpen = true;

    }

    @And("tum ekran goruntusunu alir")
    public void tumEkranGoruntusunuAlir() {

        try {
            $(By.id("L2AGLb")).click();
        } catch (Exception e) {
            System.out.println("Akzeptiren Cikmadi Sorun Yok");
        }
    
        sleep(10000);
    
        testCenterPage.googleFull.screenshot();
    }
}
