#Autor: Nataly Mendoza Olivero
@stories
Feature: uTest
  As a user, when entering the Utest page, I must start a registration process.
  @scenario1
  Scenario: start registration
    Given a user who wants to register
    When click the join today button
    Then redirects to log view

  @scenario2
  Scenario: Step1
    Given given that the user completes the personal data form
    When the user writes in the field first name "nataly" last name "Mendoza" email address "mail@gmail.com" month "April" day "04" year "1995" language "English" and clicks on the next button
    Then continue to stepTwo