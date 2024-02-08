@Common
Feature: Login Orange WebSite

  Background:
    Given Launch the Browser
    And   Enter the Url
  @001
 Scenario Outline: Login with Valid Credentials
    When  User enters "<Username>" and "<Password>"
    And   Click the Login Button
    Then  Validate the Dashboard Message

    Examples:
      | Username | Password |
      | Admin    | admin123 |
      | fhrubg   | hufbhbnn |
  @002
  Scenario Outline: Login with Invalid Credentials
    When  User enters "<Text1>" and "<Text2>"
    And   Click the Login Button
    Then  Validate the Dashboard Message

    Examples:
      | Text1 | Text2 |
      | Amin     | ad\iin123|
      | hjjj     | hufbkbnn |