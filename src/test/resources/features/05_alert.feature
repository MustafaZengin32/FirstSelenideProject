Feature: alert
  @alert
  Scenario: TC01 alert
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=javascript-alerts" adresine gider
    And   3 saniye bekler
    And   alert prompt butonuna tiklar
    And   3 saniye bekler
    And   kullanici alerte "Hello" metnini yazar ve OK a tiklar
    And   3 saniye bekler
    And   kullanici sonucun "Hello" icerdigini dogrular

