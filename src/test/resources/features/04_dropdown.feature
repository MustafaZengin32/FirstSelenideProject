Feature: dropdown
  @dropdown
  Scenario: TC01 select birh year
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=dropdown" adresine gider
    And   3 saniye bekler
    And   kullanici yili 2000 olarak secer
    And   3 saniye bekler
    And   kullanici ayi "June" olarak secer
    And   3 saniye bekler
    And   kullanici gunu "10" olarak secer

