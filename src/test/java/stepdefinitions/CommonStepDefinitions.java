package stepdefinitions;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;



import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonStepDefinitions {
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
}
