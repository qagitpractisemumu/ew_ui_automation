@WO2.1 @PATraining @providerAdmin
Feature: Test Wireless Office application for Provider Admin - Training functionality

  #@CreateTraining-Module
  @paTrainingPositive
  Scenario Outline: Verify Admin can create Training Module in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin clicks on plus icon
    Then Admin enters "<Modulename>" details
    Then Admin enters "<ModuleDescription>" information
    Then Admin click on Documentation subtab and New button
    Then Admin "<uploads>" the Documention file
    Then Admin click on Training image subtab and New button
    Then Admin uploads "<TrainingImage>"
    Then Admin click on Training video subtab and New button
    Then Admin "<uploadvideo>" video in training video
    Then Admin clicks on submitbtn

    Examples: 
      | email                       | Modulename | ModuleDescription | uploads | TrainingImage | uploadvideo |
      | serviceprovider@yopmail.com | Automation | This is Demo      | Demo    | uploadimage   | video       |

  #@Update-TrainingModule
  @paTrainingPositive
  Scenario Outline: Verify  Admin can update Training Module in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin enter "<modulename>" to searchbar
    Then Admin click on edit button
    Then Admin update "<Modulename>" and "<Moduledescription>"
    Then Admin clicks on submitbutton

    Examples: 
      | email                       | modulename | Modulename | Moduledescription |
      | serviceprovider@yopmail.com | Automation | -updating  | -updating         |

  #@createmodulebyentering-Detailssubtab
  @paTrainingPositive
  Scenario Outline: Verify Admin can create Training Module by filling only Details subtab in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin clicks on plus icon
    Then Admin enters "<Modulename>" details
    Then Admin enters "<ModuleDescription>" information
    Then Admin clicks on submitbtn

    Examples: 
      | email                       | Modulename                 | ModuleDescription |
      | serviceprovider@yopmail.com | Automation Training-Module | This is Demo      |

  #@search-TrainingModule
  @PaTrainingPositive
  Scenario Outline: Verify Admin can search TrainingModules in the searchbar in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin enters "<Modulename>" in the searchbar

    Examples: 
      | email                       | Modulename                 |
      | serviceprovider@yopmail.com | Automation Training-Module |

  @search-TrainingModule
  @PaTrainingPositive
  Scenario Outline: Verify Admin can search nonexisting TrainingModules in the searchbar in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin enters non existing "<nonModulename>" in the searchbar

    Examples: 
      | email                       | nonModulename |
      | serviceprovider@yopmail.com | abcxyzU       |

  #@search-TrainingModule-listview
  @paTrainingPositive
  Scenario Outline: Verify Admin can search TrainingModules in the searchbar in list view
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin clicks on listview
    Then Admin enters "<Modulename>" in the searchbar

    Examples: 
      | email                       | Modulename                 |
      | serviceprovider@yopmail.com | Automation Training-Module |

  @paTrainingPdfUpload
  Scenario Outline: Verify Admin can upload pdf to documentation tab
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin clicks on plus icon
    Then Admin enters "<Modulename>" details
    Then Admin enters "<ModuleDescription>" information
    Then Admin click on Documentation subtab and New button
    Then Admin "<uploadspdf>" the Documentation tab
    Then Admin clicks on submitbtn

    Examples: 
      | email                       | Modulename                 | ModuleDescription | uploadspdf |
      | serviceprovider@yopmail.com | Automation Training-Module | This is a Demo    | pdf        |

  @allElemnetsVisible
  Scenario Outline: Verify Admin validates all the elements of training module in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin clicks on plus icon
    Then Admin checks "<validations>" on training module

    Examples: 
      | email                       | validations                |
      | serviceprovider@yopmail.com | All elements are displayed |
      | serviceprovider@yopmail.com | Required field Validations |

  @checkTooltipvideo
  Scenario Outline: Verify Admin validates tooltip of the video in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin clicks on plus icon
    Then Admin click on Training video subtab and New button
    Then Admin checks the tootip of video tab

    Examples: 
      | email                       |
      | serviceprovider@yopmail.com |

  @checkTooltipdocumentation
  Scenario Outline: Verify Admin validates tooltip of the documentation in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin clicks on plus icon
    Then Admin click on Documentation subtab and New button
    Then Admin checks the tootip of documentation tab

    Examples: 
      | email                       |
      | serviceprovider@yopmail.com |

  @uploadHTMLDocumentation
  Scenario Outline: Verify Admin can upload html in documentation Training Module in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin clicks on plus icon
    Then Admin enters "<Modulename>" details
    Then Admin enters "<ModuleDescription>" information
    Then Admin click on Documentation subtab and New button
    Then Admin updates "<uploadshtml>" the Documention subtab
    Then Admin clicks on submitbtn

    Examples: 
      | email                       | Modulename | ModuleDescription | uploadshtml |
      | serviceprovider@yopmail.com | Automation | This is Demo      | Demo        |

  @privacyAndLegallinksFooter
  Scenario: Verify privacy and legal link
    Given Admin launching the Provider Admin Portal
    Then Admin clicks on the footer privacy and legal link

  @paginationCount
  Scenario Outline: Verify Admin can view and click on pagination of Training Module in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin checks the valid page number in the pagination
    Then Admin clicks on next arrow in the pagination
    Then Admin checks the valid page number in the pagination after next arrow
    Then Admin clicks on previous arrow in the pagination
    Then Admin checks the valid page number in the pagination
    Then Admin clicks on show dropup
    Then Admin clicks on 20 entries in the dropup
    Then Admin clicks on show dropup
    Then Admin clicks on 30 entries in the dropup
    Then Admin clicks on show dropup
    Then Admin clicks on 10 entries in the dropup

    Examples: 
      | email                       |
      | serviceprovider@yopmail.com |

  #  *************************negative scenario ***************
  #@Cancelbtn-CreateTrainingmodule
  @paTrainingNegative
  Scenario Outline: Verify Admin validates Cancel button Training Module in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin clicks on plus icon
    Then Admin enters "<Modulename>" details
    Then Admin enters "<ModuleDescription>" information
    Then Admin click on Documentation subtab and New button
    Then Admin "<uploads>" the Documention file
    Then Admin click on Training image subtab and New button
    Then Admin uploads "<TrainingImage>"
    Then Admin click on Training video subtab and New button
    Then Admin "<uploadvideo>" video in training video
    Then Admin clicks on cancel button

    Examples: 
      | email                       | Modulename | ModuleDescription | uploads | TrainingImage | uploadvideo | Modulename |
      | serviceprovider@yopmail.com | Automation | This is Demo      | Demo    | uploadimage   | video       | Demo       |

  #@savebutton-disabled
  @paTrainingNegative
  Scenario Outline: Verify Admin save button is disabled in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin clicks on plus icon
    Then Admin enters "<Modulename>" details
    Then Admin enters "<ModuleDescription>" information
    Then Admin checks submit button is disabled

    Examples: 
      | email                       | Modulename | ModuleDescription |
      | serviceprovider@yopmail.com |            |                   |

  #@TrainingImage-informat
  @paTrainingNegative
  Scenario Outline: Verify Admin can upload incorrect image format in Trainingvideo subtab in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin clicks on plus icon
    Then Admin enters "<Modulename>" details
    Then Admin enters "<ModuleDescription>" information
    Then Admin click on Training image subtab and New button
    Then Admin "<uploads>" incorrect image format in Trainingimage subtab

    Examples: 
      | email                       | Modulename                | ModuleDescription | uploads |
      | serviceprovider@yopmail.com | Automation TestDemo-image | Test              | image   |

  @TrainingVideo-informat @paTrainingNegative
  Scenario Outline: Verify Admin can upload incorrect video format in Trainingvideo subtab in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin clicks on plus icon
    Then Admin enters "<Modulename>" details
    Then Admin enters "<ModuleDescription>" information
    Then Admin click on Training video subtab and New button
    Then Admin "<uploadinformatvideo>" unsupported video in training video field

    Examples: 
      | email                       | Modulename                | ModuleDescription | uploadinformatvideo |
      | serviceprovider@yopmail.com | Automation TestDemo-video | Test              | video               |

  ################### positive ####################
  #@Delete-TrainingModule
  @paTrainingPositive
  Scenario Outline: Verify  Admin can delete Training Module in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin enter "<modulename>" to searchbar
    Then Admin click on delete button

    Examples: 
      | email                       | modulename |
      | serviceprovider@yopmail.com | Automation |

  #@DeleteTrainingModule
  @paTrainingPositive
  Scenario Outline: Verify  Admin can delete Training Module in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    When Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin clicks on Training Menu
    Then Admin enter "<modulename>" to searchbar
    Then Admin click on delete button

    Examples: 
      | email                       | modulename                 |
      | serviceprovider@yopmail.com | Automation Training-Module |
