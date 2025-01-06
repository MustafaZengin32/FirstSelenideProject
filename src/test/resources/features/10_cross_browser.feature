@crossbrowser
Feature: cross browser
  @headless
  Scenario: TC01 headless
    Given kullanici browser tipini "headless" olarak secer
    Given kullanici "https://www.amazon.com/" adresine gider


  @firefox
  Scenario: TC02 firefox
    Given kullanici browser tipini "firefox" olarak secer
    Given kullanici "https://www.amazon.com/" adresine gider


  @safari
  Scenario: TC03 safari - windowsda fail
    Given kullanici browser tipini "safari" olarak secer
    Given kullanici "https://www.amazon.com/" adresine gider


  @edge
  Scenario: TC04 edge - macde fail
    Given kullanici browser tipini "edge" olarak secer
    Given kullanici "https://www.amazon.com/" adresine gider

