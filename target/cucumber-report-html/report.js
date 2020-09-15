$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FirstFuture.feature");
formatter.feature({
  "name": "login validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PasswordValidation"
    }
  ]
});
formatter.background({
  "name": "home page is displayed",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes on  \u0027Home Page\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "com.itstep.automationpractice.steps.MyStepdefs.userGoesOnHomePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Sign In\u0027 button is displayed on the \u0027Home Page\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.itstep.automationpractice.steps.MyStepdefs.signInButtonIsDisplayedOnTheHomePage(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks \u0027Sign In\u0027 button on \u0027Home Page\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.itstep.automationpractice.steps.MyStepdefs.userClicksSignInButtonOnHomePage(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Authentication\u0027 page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.itstep.automationpractice.steps.MyStepdefs.authenticationPageIsDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds valid input in \u0027Mail\u0027 field",
  "keyword": "And "
});
formatter.match({
  "location": "com.itstep.automationpractice.steps.MyStepdefs.userAddsValidInputInMailField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login with valid data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@PasswordValidation"
    },
    {
      "name": "@ValidPassword"
    }
  ]
});
formatter.step({
  "name": "user adds \u0027Valid Input\u0027 in \u0027Password\u0027 field",
  "keyword": "When "
});
formatter.match({
  "location": "com.itstep.automationpractice.steps.MyStepdefs.userAddsInputInPasswordField(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks \u0027Sign In\u0027 button on \u0027Home Page\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.itstep.automationpractice.steps.MyStepdefs.userClicksSignInButtonOnHomePage(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Authentication\u0027 page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.itstep.automationpractice.steps.MyStepdefs.authenticationPageIsDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});