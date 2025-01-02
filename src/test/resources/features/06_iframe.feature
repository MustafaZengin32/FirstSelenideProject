Feature: iframe
  @iframe
  Scenario: TC01 iframe
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=iframe" adresine gider
    And   3 saniye bekler
    And  switch to frame 1
    And   3 saniye bekler
    And   kullanici back to techproeducation.com linkine tiklar
    And   3 saniye bekler
    And   switch to window 2

