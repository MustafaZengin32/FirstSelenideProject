Feature: checkbox ve radio buttom
  @checkbox
  Scenario: TC01 checkbox
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=checkboxes" adresine gider
    And "Checkbox 1" secili degilse sec
    And "Checkbox 2" secili degilse sec

  @radio
  Scenario: TC01 checkbox
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=radio-buttons" adresine gider
    And   3 saniye bekler
    And   "Red" secili degilse sec

  @football
  Scenario: TC01 checkbox
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=radio-buttons" adresine gider
    And   3 saniye bekler
    And   "Football" secili degilse sec




