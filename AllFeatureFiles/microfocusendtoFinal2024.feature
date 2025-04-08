Feature: Test MicroFocus Application

  Scenario: Validate the Create Account Page Functionality  ##Parameters Concept
    Given user opens "edge" browser
    When user enters valid "Sonali"  and "Khalate"
    Then user enters "Director" and "Duetsche Bank"

  Scenario Outline: Validate the user Address##datadriven concept
    Given user enters valid "<city>" , "<postalCode>" and "<country>"

    Examples: 
      | city          | postalCode | country |
      | Pune          |     123456 | India   |
      | Ooty          |     222222 | India   |
      | Mahabaleshwar |     666666 | India   |

  Scenario: Validate the Language and other details
    Given user enters valid state , language, telephone and emailadd
      | Maharashtra (India) | Hindi (India) | 9090909090 | khalatesonali@gmail.com |
