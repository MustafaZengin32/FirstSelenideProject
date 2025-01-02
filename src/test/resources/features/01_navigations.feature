@navigations
Feature: navigations


  Scenario: navigations test

    Given kullanici "https://google.com" adresine gider
    Then  kullanici "https://amazon.com" adresine gider
    And   5 saniye bekler
    Then  onceki sayfaya gider
    And   5 saniye bekler
    Then  sonraki sayfaya gider
    And   5 saniye bekler
    Then  sayfayi yeniler
    And   5 saniye bekler
    Then  sayfayi acik tutar
