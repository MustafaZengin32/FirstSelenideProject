package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {
                "pretty", //console renkli yazdirmak icin
                "html:target/default-cucumber-reports.html", //html report için
                "json:target/json-reports/cucumber.json",  //plugin ekledikten sonra bunu cucumber report için ekle
                "junit:test-output/htmlReport/cucumber.xml", //xml report için
                "rerun:TestOutput/failed_scenario.txt"},//bu satirdaki kod, hata veren testleri kaydedip yeniden otomatik kosmak icin
        monochrome = true,
        features ="./src/test/resources/features",//Birden fazla features kosturmak icin {"features1","features2"} seklinde yazariz
        glue = {"stepdefinitions","hooks"},
        /* 1-Bu parametre ile kodlarımızı yazdığımız stepDefinition class'ının packege'ını belirtiriz
           2- Hooks classin yolunu veririz.
        */
        tags ="@iframe",
        dryRun = false
        //console okunakli hale getirir,false scenario adimlarini renkli gosterir,  true renksiz yapar
)

public class Runner {

}
