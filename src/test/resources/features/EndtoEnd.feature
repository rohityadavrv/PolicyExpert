Feature: To verify user is able to submit home enquiry form to compare home insurance quotes

  Background:
    Given user is on the Details Policy Expert Page

  @PolicyExpertDetailsPage
  Scenario Outline: Verify the customer is able to submit his details on the details page of Home Insurance
    When user selects "<Title>" from dropdown
    And user enters "<FirstName>" in "Firstname"
    And user enters "<LastName>" in "Lastname"
    And user selects "<Day>" from dropdown
    And user selects "<Month>" from dropdown
    And user selects "<Year>" from dropdown
    And user selects "<MaritalStatus>" from dropdown
    And user enters "<Occupation>" in "Occupation"
    And user clicks on "<SmokingStatus>" of "SmokingStatus" button
    And user enters "<MainTelephoneNumber>" in "MainTelephoneNumber"
    And user enters "<Email>" in "Email"
    And user clicks on "<StatementsAboutYou>" of "StatementsAboutYou" button
    And user enters "<PropertyAddress>" in "PropertyAddress"
    And user clicks on "<IsCorrespondenceAddress>" of "IsCorrespondenceAddress" button
    And user selects "<PropertyType>" from dropdown
    And user enters "<YearOfbuilt>" in "YearOfbuilt"
    And user selects "<NoOfBedrooms>" from dropdown
    And user selects "<PropertyOwnership>" from dropdown
    And user selects "<OccupierType>" from dropdown
    And user selects "<OccupyingTime>" from dropdown
    And user clicks on "<TreeStatus>" of "TreeStatus" button
    And user clicks on "<RoofType>" of "RoofType" button
    And user selects "<FlatRoofPercentage>" from dropdown
    And user clicks on "<StatementsAboutYourProperty>" of "StatementsAboutYourProperty" button
    And user clicks on "<WindowLockStatus>" of "WindowLockStatus" button
    And user clicks on "<FrontlockStatus>" of "FrontlockStatus" button
    And user clicks on "<LockType>" of "LockType" button


    Examples:

      | Title | FirstName | LastName | Day | Month   | Year | MaritalStatus | Occupation        | SmokingStatus | MainTelephoneNumber | Email                   | StatementsAboutYou | PropertyAddress           | IsCorrespondenceAddress | PropertyType | YearOfbuilt | NoOfBedrooms | PropertyOwnership     | OccupierType         | OccupyingTime    | TreeStatus | RoofType | FlatRoofPercentage | StatementsAboutYourProperty | WindowLockStatus | FrontlockStatus | LockType                               |
      | Mrs   | Surbhi    | Yadav    | 09  | January | 1992 | Married       | Software Engineer | No            | 447424361375        | vketipisz@qmetric.co.uk | I agree            | EC2N 4AY, 110 Bishopsgate | Yes                     | House        | 1990        | 7 or more    | Yes - mortgaged       | You as sole occupier | During the night | Yes        | Yes      | Less than 20%      | I agree                     | Yes              | Yes             | Key operated multipoint locking system |
      | Dr    | Rohit     | Yadav    | 27  | January | 1992 | Single        | Software Engineer | Yes           | 447886575645        | vketipisz@qmetric.co.uk | I agree            | EC2N 4AY, 110 Bishopsgate | Yes                     | Bungalow     | 1990        | 7 or more    | No - rented furnished | You and your family  | During the day   | No         | No       |                    | I agree                     | Yes              | Yes             | Key operated multipoint locking system |
