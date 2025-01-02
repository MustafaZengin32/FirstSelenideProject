package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestCenterPage {

    public SelenideElement kullaniciAdi=$(By.id("exampleInputEmail1"));

    public SelenideElement kullaniciSifresi=$("#exampleInputPassword1");

    public SelenideElement submitButton=$(By.xpath("//button[@type='submit']"));

    public SelenideElement textInput=$(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));

    //Checkbox

    public SelenideElement checkbox1=$(By.id("box1"));

    public SelenideElement checkbox2=$(By.id("box2"));

}
