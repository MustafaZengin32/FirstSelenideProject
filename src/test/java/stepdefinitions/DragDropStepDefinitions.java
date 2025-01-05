package stepdefinitions;

import io.cucumber.java.en.And;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

public class DragDropStepDefinitions {

    TestCenterPage testCenterPage=new TestCenterPage();

    @And("kullanici source elementi target elementine surukler")
    public void kullaniciSourceElementiTargetElementineSurukler() throws InterruptedException {


//        actions().dragAndDrop(testCenterPage.dropSource, testCenterPage.dropTarget).perform();

        actions().dragAndDropBy(testCenterPage.dropSource,144,19).perform();


    }

    @And("elementin verilen coordinatlara suruklendigini dogrular")
    public void elementinVerilenCoordinatlaraSuruklendiginiDogrular() {

    testCenterPage.dropSource.shouldHave(attribute("style", "position: relative; left: 144px; top: 19px;"));

    }
}
