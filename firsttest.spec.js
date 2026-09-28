var {test} = require('@playwright/test');

test("validate the login function", async function({page}){

   await page.goto("https://testautomationpractice.blogspot.com//");

  await page.locator("//input[@id='datepicker']").click();

  while(true){

  var year = await page.locator("//span[@class='ui-datepicker-year']").innerText();
   var month = await page.locator("//span[@class='ui-datepicker-month']").innerText();

if(year =="2027" && month =="October"){
    break;
}else{

   await page.locator("//span[text()='Next']").click();
}
}
   await page.locator("//a[text()='23']").click();

   await page.pause();
})