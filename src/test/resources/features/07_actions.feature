Feature: actions
  @draganddrop
  Scenario: TC01 drag and drop
    Given kullanici "https://jqueryui.com/droppable/" adresine gider
    And   switch to frame 1
    And   kullanici source elementi target elementine surukler
    And   3 saniye bekler
    And   elementin verilen coordinatlara suruklendigini dogrular
    Then  sayfayi acik tutar