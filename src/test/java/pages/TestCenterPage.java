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

    //Radio Button

    public SelenideElement red=$(By.id("red"));

    public SelenideElement football=$(By.id("football"));

    //Dropdown

    public SelenideElement year=$(By.id("year"));

    public SelenideElement month=$(By.id("month"));

    public SelenideElement day=$(By.id("day"));

    //Alert

    public SelenideElement alertPrompt=$(By.xpath("//button[@onclick='jsPrompt()']"));

    public SelenideElement alertresult=$(By.id("result"));

    //Iframe

    public SelenideElement backToTech=$("a[type='button']");

    //Drop and Drop

    public SelenideElement dropSource=$("#draggable");

    public SelenideElement dropTarget=$("#droppable");

    //Exp Wait

    public SelenideElement startButton=$(By.tagName("button"));

    public  SelenideElement helloWorld=$(By.id("finish"));

    //Screen Shot

    public SelenideElement googleFull=$(By.xpath("//body[@jsmodel='hspDDf']"));

    public SelenideElement googlePicture=$(By.cssSelector(".lnXdpd"));









}
