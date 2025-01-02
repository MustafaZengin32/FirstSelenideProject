package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.*;


public class TestCenterStepDefinitions {

    TestCenterPage testCenterPage=new TestCenterPage();

    @And("kullanici adini gir")
    public void kullaniciAdiniGir() {

        testCenterPage.kullaniciAdi.setValue("techproed");
    }

    @And("kullanici sifresini gir")
    public void kullaniciSifresiniGir() {

        testCenterPage.kullaniciSifresi.setValue("SuperSecretPassword");
    }

    @And("submit butttonuna tikla")
    public void submitButttonunaTikla() {

        testCenterPage.submitButton.click();
    }

    @Then("giris yapildigini test et")
    public void girisYapildiginiTestEt() {

        testCenterPage.textInput.shouldBe(visible);//fail olursa otomatik ekran goruntusu alir kaydeder

    }

    @And("{string} secili degilse sec")
    public void seciliDegilseSec(String text) {



        if (text.equals("Checkbox 1") && !testCenterPage.checkbox1.isSelected()) {
            testCenterPage.checkbox1.click();
            testCenterPage.checkbox1.shouldBe(checked);
        }

        if (text.equals("Checkbox 2") && !testCenterPage.checkbox2.isSelected()) {
            testCenterPage.checkbox2.click();
            testCenterPage.checkbox2.shouldBe(checked);
        }
    }
}
