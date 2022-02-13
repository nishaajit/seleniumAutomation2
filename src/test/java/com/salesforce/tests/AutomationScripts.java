package com.salesforce.tests;

import java.util.Set;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.salesforce.base.BasePage;

public class AutomationScripts extends BasePage {
	public static void login (String userName, String password) throws InterruptedException {
		  WebElement username = driver.findElement(By.id("username"));
	       username.sendKeys(userName);
	        WebElement password1 = driver .findElement(By.id("password"));
	        password1.sendKeys(password);
	        Thread.sleep(5000);
	        WebElement checkbox= driver.findElement(By.xpath("//label[@for='rememberUn']"));
			checkbox.click();
	        WebElement login = driver.findElement(By.id("Login"));
	        login.click();
	        
			}
	
	
	public static void loginTosalesforceTest_2() throws InterruptedException {
		
		launchApp("https://login.salesforce.com/");
		login("nisha@tekarch.com","athipillil26");
		String actual = driver.getTitle();
		System.out.println("actual"+ actual);
		
		Thread.sleep(5000);
		System.out.println("testcase passed");
		driver.close();

	}
	public static void clearPasswordtest_1() throws InterruptedException {

		launchApp("https://login.salesforce.com/");
		login("nisha@tekarch.com","");
		Thread.sleep(1000);
		
		System.out.println("testcase passed");
		driver.close();
		
	}
	public static void checkBoxtest_3() throws InterruptedException {

		launchApp("https://login.salesforce.com/");
		login("nisha@tekarch.com","athipillil26");
	   WebElement usermenu = driver.findElement(By.id("userNavLabel"));
		usermenu.click();
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.moveToElement(usermenu).build().perform();
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
	   logout.click();
	System.out.println("testcase passed");
		
		}
	public static void forgotPasswordtest_4A () throws InterruptedException {

		launchApp("https://login.salesforce.com/");
		WebElement fgtPassword = driver.findElement(By.xpath(" //a[@id='forgot_password_link']"));
		fgtPassword.click();
		login("nisha@tekarch.com","");
		System.out.println("testcase passed");
		
	}
	public static void usernamepasswordtest_4B() throws InterruptedException {
		launchApp("https://login.salesforce.com/");
		login("123","22131");
		System.out.println("testcase passed");
		driver.close();
		}

	public static void usermenutest_5 () throws InterruptedException {
		launchApp("https://login.salesforce.com/");
		login("nisha@tekarch.com","athipillil26");
		WebElement usermenu = driver.findElement(By.id("userNavLabel"));
		usermenu.click();
		System.out.println("testcase passed");
		driver.close();
		
		}
	
	public static void selectMyProfiletest_6 () throws InterruptedException{
		launchApp("https://login.salesforce.com/");
		login("nisha@tekarch.com","athipillil26");
		WebElement usermenu = driver.findElement(By.id("userNavLabel"));
		usermenu.click();
		WebElement myprofile = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
		myprofile.click();
		Thread.sleep(5000);
		 Actions actions = new Actions(driver);
		 WebElement editbutton = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']"));
		 actions.moveToElement(editbutton).perform();
		 editbutton.click();
		
	        WebElement editProfile = driver.findElement(By.xpath(" //h2[@id='contactInfoTitle']"));
	        WebDriverWait waits= new WebDriverWait (driver,30);
	         waits.until(ExpectedConditions.visibilityOf(editProfile));
	         Actions action = new Actions(driver);
	         action.moveToElement(editProfile).build().perform();
	         
}
	public static void mySettingstest_7 () throws InterruptedException {
		launchApp("https://login.salesforce.com/");
		login("nisha@tekarch.com","athipillil26");
		WebElement usermenu = driver.findElement(By.id("userNavLabel"));
		usermenu.click();
		WebElement Settings = driver.findElement(By.xpath(" //a[normalize-space()='My Settings']"));
		Settings.click();
		Thread.sleep(5000);
		 Actions actions = new Actions(driver);
		 WebElement personal  = driver.findElement(By.xpath(" //a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('PersonalInfo');\"]"));
		 actions.moveToElement( personal).perform();
		 personal.click();
		WebElement loginhistory =driver.findElement(By.xpath(" //a[@id='LoginHistory_font']"));
		loginhistory.click();
		WebElement download =driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		actions.moveToElement(download).perform();
		download.click();
		System.out.println("login history is displayed and data downloaded in csv format");
		
		driver.close();
	}
		
		public static void displaytest_7 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement usermenu = driver.findElement(By.id("userNavLabel"));
			usermenu.click();
			WebElement Settings = driver.findElement(By.xpath(" //a[normalize-space()='My Settings']"));
			Settings.click();
			Thread.sleep(5000);
			 Actions actions = new Actions(driver);
			WebElement display =driver.findElement(By.xpath("//*[@id=\"DisplayAndLayout\"]/a"));
		  actions.moveToElement(display).perform();
		  display.click();
		  driver.findElement(By.id("CustomizeTabs_font")).click();
		  Thread.sleep(4000);
		WebElement contentEle=   driver.findElement(By.xpath("//select[@id='p4']"));
		Select Content =new Select(contentEle);
		Content.selectByVisibleText("Salesforce Chatter");
		WebElement availabletabs = driver.findElement(By.xpath(" //select[@id='duel_select_0']"));
		Select tabs = new Select (availabletabs);
		tabs.selectByVisibleText("Reports");
		driver.findElement(By.xpath("//img[@title='Add']")).click();
		System.out.println("report tab is added ,test case is passed");
		
		driver.close();
		
	}
		public static void emailTest_7 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement usermenu = driver.findElement(By.id("userNavLabel"));
			usermenu.click();
			WebElement Settings = driver.findElement(By.xpath(" //a[normalize-space()='My Settings']"));
			Settings.click();
			Thread.sleep(5000);
			 Actions actions = new Actions(driver);
			WebElement email =driver.findElement(By.xpath("//span[@id='EmailSetup_font']"));
		  actions.moveToElement(email).perform();
		  email.click();
		  driver.findElement(By.xpath(" //a[@id='EmailSettings_font']")).click();
		  Thread.sleep(5000);
		 WebElement emailname = driver.findElement(By.id("sender_name"));
		 emailname.clear();
		 emailname.sendKeys("nisha A");
		 WebElement emailadd = driver.findElement(By.id("sender_email"));
		 emailadd.clear();
		 emailadd.sendKeys("nishaajith26@gmail.com");
		 boolean radiobutton1= driver.findElement(By.xpath("//input[@id='auto_bcc1']")).isSelected();
         System.out.println("is radio button selected ?=" +radiobutton1);
       WebElement radiobutton2 =driver.findElement(By.xpath(" //input[@id='auto_bcc0']"));
      radiobutton2.click();
     System.out.println(radiobutton2.isSelected());
     driver.findElement(By.xpath("//input[@title='Save']")).click();
     System.out.println("test passed");
     
    driver.close();
		}
		
		public static void calenderTest_7 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement usermenu = driver.findElement(By.id("userNavLabel"));
			usermenu.click();
			WebElement Settings = driver.findElement(By.xpath(" //a[normalize-space()='My Settings']"));
			Settings.click();
			Thread.sleep(5000);
			 Actions actions = new Actions(driver);
			WebElement calender =driver.findElement(By.xpath(" //span[@id='CalendarAndReminders_font']"));
		  actions.moveToElement(calender).perform();
		  calender.click();
		  driver.findElement(By.xpath(" //span[@id='Reminders_font']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(" //input[@id='testbtn']")).click();
		  System.out.println("the test is passed");
		  driver.close();		
		  }
		
		public static void DeveloperconsoleTest_8 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement usermenu = driver.findElement(By.id("userNavLabel"));
			usermenu.click();
			WebElement developerconsole = driver.findElement(By.xpath(" //a[normalize-space()='Developer Console']"));
			 developerconsole.click();
			 System.out.println("test is passed");
			Thread.sleep(5000);
		}
		public static void logoutTest_9 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement usermenu = driver.findElement(By.id("userNavLabel"));
			usermenu.click();
			driver.findElement(By.xpath(" //a[normalize-space()='Logout']")).click();
			System.out.println("test is passed");
		}
		public static void AccountTest_10 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement Accounts = driver.findElement(By.xpath("//a[normalize-space()='Accounts']"));
			Accounts.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
             lightdialogue.click();
             driver.findElement(By.xpath(" //input[@title='New']")).click();
             WebElement acname = driver.findElement(By.id("acc2"));
             acname.sendKeys("seleniumtest");
             driver.findElement(By.xpath(" //td[@id='topButtonRow']//input[@title='Save']")).click();
             System.out.println("New account page is displayed  with account details");
           
             driver.close();
		}
		public static void createNewviewTest_11 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement Accounts = driver.findElement(By.xpath("//a[normalize-space()='Accounts']"));
			Accounts.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
			driver.findElement(By.xpath("//a[normalize-space()='Create New View']")).click();
			  WebElement viewname = driver.findElement(By.id("fname"));
	          viewname.sendKeys("N ajith");
	          WebElement uniquename = driver.findElement(By.xpath(" //input[@id='devname']"));
	          uniquename.clear();
	          uniquename.sendKeys("NA");
	          driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")).click();
	          System.out.println("test case passed");
	          
	          driver.close();
	}
				
		public static void EditViewTest_12 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement Accounts = driver.findElement(By.xpath("//a[normalize-space()='Accounts']"));
			Accounts.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
            WebElement viewname=   driver.findElement(By.xpath(" //select[@id='fcf']"));
    		Select view =new Select(viewname);
    		view.selectByVisibleText("N ajith");
    		driver.findElement(By.xpath(" //a[normalize-space()='Edit']")).click();
    		WebElement editview = driver.findElement(By.id("fname"));
    		editview.clear();
    		editview.sendKeys("nish");
    		Thread.sleep(5000);
    	 driver.findElement(By.xpath("//table[@class='declarativeFilterTable']//tbody/tr[1]/td[1]")).click();
    		 WebElement field  =driver.findElement(By.xpath("//select[@title='Search By 1']"));
    		 Select field1 = new Select(field);
    		 field1.selectByValue("Account Name");
    		 Thread.sleep(3000);
    		 driver.findElement(By.xpath("//table[@class='declarativeFilterTable']//tr[1]/td[2]")).click();
    		 WebElement report1  =driver.findElement(By.xpath("//select[@title='Search By 1']"));
    		 Select report = new Select(report1);
    		 report.selectByValue("contains");
    		 Thread.sleep(3000);
    		WebElement value  =driver.findElement(By.xpath("//table[@class='declarativeFilterTable']//tr[1]/td[3]"));
    		 value.clear();
    		 value.sendKeys("oil");
    		 driver.close();
    		 System.out.println("test case failed");
    		 
    		 
  }
		public static void MergeTest_13 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement Accounts = driver.findElement(By.xpath("//a[normalize-space()='Accounts']"));
			Accounts.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
       	 Actions actions = new Actions(driver);
			WebElement merge =driver.findElement(By.xpath(" //a[normalize-space()='Merge Accounts']"));
		  actions.moveToElement(merge).perform();
		  merge.click();
		  driver.findElement(By.id("srch")).sendKeys("se");
		  driver.findElement(By.xpath(" //div[@class='pbWizardBody']//input[2]")).click();
          System.out.println("merge link tab opened");
         // driver.close();
        }
		
		public static void  AccountReporTest_14 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement Accounts = driver.findElement(By.xpath("//a[normalize-space()='Accounts']"));
			Accounts.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
            Actions actions = new Actions(driver);
			WebElement activity =driver.findElement(By.xpath("//a[normalize-space()='Accounts with last activity > 30 days']"));
      	  actions.moveToElement(activity).perform();
		  activity.click();
		  Thread.sleep(5000);
		 WebElement button = driver.findElement(By.xpath(" //img[@id='ext-gen148']"));
		 actions.moveToElement(button).perform();
		  button.click();
		  Thread.sleep(5000);
		  WebElement find = driver.findElement(By.xpath("//*[@id='ext-gen266']/div[3]")); 
		  find.click();
		  WebElement datafield = driver.findElement(By.xpath("//*[@id=\"ext-gen20\"]")); 
		  datafield.click();
		 // WebElement createData = driver.findElement(By.xpath()")); 
		  //createData.click();
		  
		}
		
		
		public static void OpportunitiesTest_15 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement opportunities = driver.findElement(By.xpath(" //a[@title='Opportunities Tab']"));
			opportunities.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
           WebElement opportab = driver.findElement(By.xpath("//select[@id='fcf']"));
           opportab.click();          
           System.out.println("opportunities link is selected and dropdown is present");
           
          }	
		
		public static void newoptyTest_16 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement opportunities = driver.findElement(By.xpath(" //a[@title='Opportunities Tab']"));
			opportunities.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
            driver.findElement(By.xpath(" //input[@title='New']")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("opp3")).sendKeys("developer");
            driver.findElement(By.id("opp4")).sendKeys("ABCD");
           WebElement tab = driver.findElement(By.id("opp9"));
           tab.click();
          WebElement date = driver.findElement(By.xpath("//a[@class='calToday']"));
           date.click();
           Actions a = new Actions(driver);
          WebElement body= driver.findElement(By.xpath(" //body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[5]/table[1]/tbody[1]/tr[2]/td[2]"));
          body.click();
           WebElement stage = driver.findElement(By.xpath("//select[@id='opp11']"));
           stage.click();
           System.out.println("new opportunities page is displayed with opportunites details");
           driver.close();
		}
		public static void pipelineLinkTest_17 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement opportunities = driver.findElement(By.xpath(" //a[@title='Opportunities Tab']"));
			opportunities.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
            driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a")).click();
		     System.out.println("report page with opportunites displayed");
            driver.close();
		}
		public static void StuckOpportunitiesTest_18 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement opportunities = driver.findElement(By.xpath(" //a[@title='Opportunities Tab']"));
			opportunities.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
          driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a")).click();
		System.out.println("stuck opportunities page is displayed");
		driver.close();
		}
		public static void quaterlySummaryTest_19 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement opportunities = driver.findElement(By.xpath(" //a[@title='Opportunities Tab']"));
			opportunities.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();	
            WebElement interval = driver.findElement(By.id("quarter_q"));
            Select value = new Select(interval);
            value.selectByVisibleText("Current and Next FQ");
            WebElement include = driver.findElement(By.id("open"));
         
            Select text = new Select(include);
            text.selectByVisibleText("All Opportunities");
            Thread.sleep(5000);
            //Actions a = new Actions(driver);
            WebElement report = driver.findElement(By.xpath( "//input[@title='Run Report']"));
            report.click();
            System.out.println("test case passed");
            driver.close();
           }  
		public static void leadsTest_20 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
			leads.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();	
            System.out.println("test is passed");
            driver.close();
            
          }
		public static void leadsTest_21 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
			leads.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();	
            driver.findElement(By.id("fcf")).click();
            System.out.println("test case passed");
            Thread.sleep(4000);
            
            driver.close();
			
		}
		public static void leadsTest_22 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
			leads.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();	
         WebElement leads1=   driver.findElement(By.id("fcf"));
          Select lead =new Select(leads1);
          lead.selectByVisibleText("Today's Leads");
         // Actions a = new Actions(driver);
         
          Thread.sleep(4000);
          WebElement usermenu = driver.findElement(By.id("userNavLabel"));
  		usermenu.click();
  		WebElement logout = driver.findElement(By.xpath(" //a[@title='Logout']"));
		logout.click();
		Thread.sleep(4000);
		WebElement pass =driver.findElement(By.id("password"));
		pass.sendKeys("athipillil26");
		WebElement login = driver.findElement(By.id("Login"));
        login.click();
		WebElement leads2 = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leads2.click();
		WebElement go = driver.findElement(By.xpath( "//*[@id=\"filter_element\"]/div/span/span[1]/input"));
         go.click();
         System.out.println("view page displayed when teh go button is clicked");
         
         driver.close();
         }
		public static void leadsTest_23 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
			leads.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
            WebElement leads1=   driver.findElement(By.id("fcf"));
            Select lead =new Select(leads1);
            lead.selectByVisibleText("Today's Leads");
            System.out.println("todays leads page displayed");
		}
		public static void leadsTest_24 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			WebElement leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
			leads.click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
            driver.findElement(By.xpath(" //input[@title='New']")).click();
            WebElement lastname = driver.findElement(By.id("name_lastlea2"));
            lastname.sendKeys("ABCD");
            WebElement company = driver.findElement(By.id("lea3"));
            company.sendKeys("xyz");
            driver.findElement(By.xpath(" //td[@id='topButtonRow']//input[@title='Save']")).click();
            System.out.println("newely created lead view page displayed");
            driver.close();
            }
		
		public static void contactsTest_25 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
			driver.findElement(By.xpath("//input[@title='New']")).click();
			driver.findElement(By.id("name_lastcon2")).sendKeys("aji");
			driver.findElement(By.xpath(" //td[@id='topButtonRow']//input[@title='Save']")).click();
			System.out.println("new contact is created");
		
			Thread.sleep(6000);
			driver.close();
		}
			
		public static void contactsTest_26 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
            driver.findElement(By.xpath("//div[@class='filterOverview']//a[2]")).click();
			driver.findElement(By.id("fname")).sendKeys("Indian");
			driver.findElement(By.id("devname")).sendKeys("Global Media");
			driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")).click();
			System.out.println("test is passed");
			Thread.sleep(10000);
			
			driver.close();
			
			}
		public static void contactsTest_27 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click(); 
            WebElement tab = driver.findElement(By.id("hotlist_mode"));
            Select tab1 = new Select(tab);
            tab1.selectByValue("2");
            System.out.println("recently created contact displayed");
            Thread.sleep(5000);
            driver.close();
            }
		public static void contactsTest_28 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click(); 
            WebElement view = driver.findElement(By.id("fcf"));
            Select mycontact = new Select(view);
            mycontact.selectByVisibleText("My Contacts");
            System.out.println("my contacts view dispalyed");
            Thread.sleep(8000);
            driver.close();
            }
		public static void contactsTest_29 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[3]/th/a")).click();
            System.out.println("contact page related to contact name displayed");
		}
		public static void contactsTest_30 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
   driver.findElement(By.xpath("//div[@class='filterOverview']//a[2]")).click();
   driver.findElement(By.id("fname")).sendKeys("");
   driver.findElement(By.id("devname")).sendKeys("EFGH");
   driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")).click();
   System.out.println("error message appeared,test passed");
   Thread.sleep(5000);
   driver.close();
   }
		public static void contactsTest_31 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
            driver.findElement(By.xpath("//div[@class='filterOverview']//a[2]")).click();
            driver.findElement(By.id("fname")).sendKeys("ABCD");
            driver.findElement(By.id("devname")).sendKeys("EFGH");
            driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[2]")).click();
            System.out.println("contacts home page is displayed View ABCD not created ,test passed");
            driver.close();
            }
		public static void contactsTest_32 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();	
            driver.findElement(By.xpath("//input[@title='New']")).click();
            driver.findElement(By.id("name_lastcon2")).sendKeys("Indian");
            driver.findElement(By.id("con4")).sendKeys("Global Media");
            driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save & New']")).click();
            System.out.println("error message came saying Invaid data,test failed");
            Thread.sleep(8000);
            driver.close();
            
            
		}
		public static void randomtest_33 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();	
            driver.findElement(By.xpath("//a[@title='Home Tab']")).click();
            driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a")).click();
            System.out.println("user Firstname Lastname page is displayed");
            
            driver.close();
            }
		public static void randomtest_34 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();	
            driver.findElement(By.xpath("//a[@title='Home Tab']")).click();
            driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a")).click();
             WebElement edit = driver.findElement( By.cssSelector("a[class='contactInfoLaunch editLink'] img[title='Edit Profile']"));
             edit.click();
             Thread.sleep(3000);
             driver.switchTo().frame("contactInfoContentId");
             driver.findElement(By.xpath("//a[normalize-space()='About']")).click();
             Thread.sleep(4000);
            		
   }
		public static void randomtest_35 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();
            driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]/a/img")).click();
             driver.findElement(By.xpath(" //input[@title='Customize My Tabs']")).click(); 
            WebElement selectedtabs = driver.findElement(By.id("duel_select_1"));
            Select tabs = new Select (selectedtabs);
		   tabs.selectByVisibleText("Subscriptions");
		driver.findElement(By.xpath(" //img[@title='Remove']")).click();
		driver.findElement(By.xpath(" //input[@title='Save']")).click();
		WebElement usermenu = driver.findElement(By.id("userNavLabel"));
		usermenu.click();
		driver.findElement(By.xpath(" //a[normalize-space()='Logout']")).click();
		Thread.sleep(5000);
		launchApp("https://login.salesforce.com/");
		login("nisha@tekarch.com","athipillil26");
		System.out.println("the tab removed is not displayed in the tab bar,test passed");
		
	driver.close();
		}
		public static void randomtest_36 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a")).click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();	
            driver.findElement(By.xpath("//span[@class='pageDescription']//a")).click();
            driver.findElement(By.xpath("//div[@id='p:f:j_id25:j_id61:28:j_id64']//a")).click();
            driver .findElement(By.xpath(" //img[@title='Subject Combo (New Window)']")).click();
            
            driver.findElement(By.xpath("/html/body/div[1]/div/h1")).click();
            String mainWindowHandle = driver.getWindowHandle();
            Set<String> allWindowHandles = driver.getWindowHandles();
           Iterator<String> iterator = allWindowHandles.iterator();
           while (iterator.hasNext()) {
                String ChildWindow = iterator.next();
                    if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) 
                    driver.switchTo().window(ChildWindow);
                   
           Actions a = new Actions(driver);
            WebElement text = driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]"));
            a.moveToElement(text).perform();
           }
           System.out.println("pop up window displayed but unable get the expected ouput,test not passed");
           driver.close();
		}
		public static void randomtest_37 () throws InterruptedException {
			launchApp("https://login.salesforce.com/");
			login("nisha@tekarch.com","athipillil26");
			driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a")).click();
			Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
            lightdialogue.click();	
            driver.findElement(By.xpath("//span[@class='pageDescription']//a")).click();
            driver.findElement(By.xpath(" //div[@id='p:f:j_id25:j_id61:20:j_id64']//a")).click();
            driver.findElement(By.xpath(" //img[@title='Subject Combo (New Window)']")).click();
            System.out.println("test case failed");
            driver.close();
          		}
		
}
	
	
	
	
	
	
	
	
	

	

		
