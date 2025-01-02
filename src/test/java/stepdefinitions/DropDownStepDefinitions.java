package stepdefinitions;

import io.cucumber.java.en.And;
import pages.TestCenterPage;

public class DropDownStepDefinitions {

    TestCenterPage testCenterPage=new TestCenterPage();

    @And("kullanici yili {int} olarak secer")
    public void kullaniciYiliOlarakSecer(int int1) {

        testCenterPage.year.selectOptionByValue(String.valueOf(int1));

    }

    @And("kullanici ayi {string} olarak secer")
    public void kullaniciAyiOlarakSecer(String string1) {

        testCenterPage.month.selectOptionContainingText(string1);
    }

    @And("kullanici gunu {string} olarak secer")
    public void kullaniciGunuOlarakSecer(String string2) {

        testCenterPage.day.selectOption(9);



    }
}
