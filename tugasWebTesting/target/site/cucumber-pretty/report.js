$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CheckOut.feature");
formatter.feature({
  "line": 2,
  "name": "CheckOut",
  "description": "As a user i want to checkout item",
  "id": "checkout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CheckOut"
    }
  ]
});
formatter.before({
  "duration": 4867295000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Add to Cart",
  "description": "",
  "id": "checkout;add-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User already in landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User sort product list by name z to a",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User pick item Sauce Labs Onesie",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User pick item Test.allTheThings T-Shirt Red",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verify item is added",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User remove item Test.allTheThings T-Shirt Red",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User click Checkout button on Cart Page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User input \"Kamisato\" as firstName and input \"Ayato\" as lastName and input \"333999\" as zipCode",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "System showing summary of payment",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User click finish button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "System showing messages \"THANK YOU FOR YOUR ORDER\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyDisplay()"
});
formatter.result({
  "duration": 213639800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 209137800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 2041739500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.selectProductContainer()"
});
formatter.result({
  "duration": 2107413800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItemBasket1()"
});
formatter.result({
  "duration": 2060207400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItemBasket2()"
});
formatter.result({
  "duration": 2049420800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickCart()"
});
formatter.result({
  "duration": 2070130900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyCartPage()"
});
formatter.result({
  "duration": 2112142800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.removeItem()"
});
formatter.result({
  "duration": 5041283700,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.buttonCheckOut()"
});
formatter.result({
  "duration": 5050059900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kamisato",
      "offset": 12
    },
    {
      "val": "Ayato",
      "offset": 46
    },
    {
      "val": "333999",
      "offset": 76
    }
  ],
  "location": "PurchaseSteps.inputAddress(String,String,String)"
});
formatter.result({
  "duration": 318433100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.checkoutOverview()"
});
formatter.result({
  "duration": 2050198400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickFinish()"
});
formatter.result({
  "duration": 2068994500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 25
    }
  ],
  "location": "PurchaseSteps.errorText(String)"
});
formatter.result({
  "duration": 2042594100,
  "status": "passed"
});
formatter.after({
  "duration": 703562600,
  "status": "passed"
});
});