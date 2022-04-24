#Autor: Nataly Mendoza Olivero
@stories
Feature: uTest
  As a user, when entering the Utest page, I must start a registration process.
  @scenario1
  Scenario: start registration
    Given a user who wants to register
    When click the join today button
    Then redirects to log view