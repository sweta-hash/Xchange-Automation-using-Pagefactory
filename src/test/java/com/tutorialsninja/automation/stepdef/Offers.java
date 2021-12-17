package com.tutorialsninja.automation.stepdef;


import org.openqa.selenium.By;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.TableHeader;
import com.tutorialsninja.automation.pages.loginPage;

import io.cucumber.java.en.Then;

public class Offers {
	
	loginPage loginpage = new loginPage();
	TableHeader tableheader = new TableHeader();
	
	@Then("^I click on Instructions lettings$")
	public void click_on_Instructions_lettings() throws InterruptedException, FindFailed {
		
		Elements.click(TableHeader.instructionlettings);
		Elements.click(TableHeader.areacodeDropdown);
		Elements.click(TableHeader.clearareaCodes);
		Thread.sleep(7000);
	    Base.driver.findElement(By.xpath("//*[@class='rt-tbody']/div[5]/div/div[2]/div/span")).click();
	    String winHandleBefore = Base.driver.getWindowHandle();
		for(String winHandle : Base.driver.getWindowHandles()){
			Thread.sleep(7000);
			if(!winHandleBefore.equals(winHandle))
			{
			Base.driver.switchTo().window(winHandle);
			Elements.click(TableHeader.offersbutton);
			Thread.sleep(4000);
			Elements.TypeText(TableHeader.searchpreviousapplicant, "Amit kumar");
			Thread.sleep(3000);
			Elements.click(TableHeader.applicantname);
			Thread.sleep(5000);
			Elements.click(TableHeader.nextbutton);
			Thread.sleep(5000);
			Elements.TypeText(TableHeader.noofparkingspaces, "123");
			Elements.TypeText(TableHeader.noofpets, "22");
			Elements.TypeText(TableHeader.offeredprice, "1000");
			Elements.TypeText(TableHeader.unitnumber, "232");
			Elements.TypeText(TableHeader.tenancylength, "11");
			Elements.TypeText(TableHeader.specificrequirements, "abc");
			 String filepath = "/Users/swetagautam/Desktop";
		        String inputFilePath = "/Users/swetagautam/Desktop\\";
		        Screen s = new Screen();
		        Pattern fileInputTextBox = new Pattern(filepath + "FileTextBox.PNG");
		        Pattern openButton = new Pattern(filepath + "OpenButton.PNG");


		        // Click on Browse button and handle windows pop up using Sikuli
		        Base.driver.findElement(By.xpath("//span[normalize-space()='Attach File']")).click();
		        s.wait(fileInputTextBox, 20);
		        s.type(fileInputTextBox, inputFilePath + "Test.docx");
		        s.click(openButton);
			
			
			}
		}
		}
	@Then("^I can click fill the offer form")
	public void click_on_offer() throws InterruptedException {
		
		Thread.sleep(5000);
		
		
		
	}
}
