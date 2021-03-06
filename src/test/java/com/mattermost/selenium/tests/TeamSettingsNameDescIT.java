package com.mattermost.selenium.tests;

import com.mattermost.selenium.DriverBase;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

import java.util.regex.Pattern;

public class TeamSettingsNameDescIT extends DriverBase {

    @Test
    public void testTeamSettingsNameDescIT() throws Exception {        // LOG IN
        driver.get(baseUrl + "/login");
        disableAnimations();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.cssSelector("button.btn.btn-primary"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.name("loginId")).clear();
        driver.findElement(By.name("loginId")).sendKeys("admin@test.com");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("passwd");
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Town Square".equals(driver.findElement(By.linkText("Town Square")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.linkText("Off-Topic"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        // Save team name with no changes
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("UI Automation".equals(driver.findElement(By.cssSelector("div.team-btn__content")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        // Warning: waitForTextPresent may require manual changes
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*@admin[\\s\\S]*UI Automation[\\s\\S]*$")) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("sidebarHeaderDropdownButton"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("sidebarHeaderDropdownButton")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.xpath("//div[@id='sidebar-left']/div/div[2]/ul/li[7]/a/span"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.xpath("//div[@id='sidebar-left']/div/div[2]/ul/li[7]/a/span")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("UI Automation".equals(driver.findElement(By.id("Team_NameDesc")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.navigate().refresh();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("UI Automation".equals(driver.findElement(By.cssSelector("div.team-btn__content")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        // Warning: waitForTextPresent may require manual changes
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*@admin[\\s\\S]*UI Automation[\\s\\S]*$")) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("sidebarHeaderDropdownButton"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("sidebarHeaderDropdownButton")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.xpath("//div[@id='sidebar-left']/div/div[2]/ul/li[7]/a/span"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.xpath("//div[@id='sidebar-left']/div/div[2]/ul/li[7]/a/span")).click();
        // Team name required
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Edit".equals(driver.findElement(By.cssSelector("#Team_NameEdit > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#Team_NameEdit > span")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("teamName"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Set the name of the team as it appears on your sign-in screen and at the top of the left-hand sidebar.".equals(driver.findElement(By.cssSelector("div.setting-list__hint > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("saveSetting"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("saveSetting")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("UI Automation".equals(driver.findElement(By.id("Team_NameDesc")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Edit".equals(driver.findElement(By.cssSelector("#Team_NameEdit > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#Team_NameEdit > span")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("teamName"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Set the name of the team as it appears on your sign-in screen and at the top of the left-hand sidebar.".equals(driver.findElement(By.cssSelector("div.setting-list__hint > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("teamName")).clear();
        driver.findElement(By.id("teamName")).sendKeys("");
        driver.findElement(By.id("teamName")).sendKeys("h" + Keys.BACK_SPACE);
        driver.findElement(By.id("teamName")).clear();
        driver.findElement(By.id("teamName")).sendKeys("");
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("saveSetting"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("saveSetting")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("This field is required".equals(driver.findElement(By.id("clientError")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.cssSelector("#Team_NameCancel > span"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#Team_NameCancel > span")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("UI Automation".equals(driver.findElement(By.id("Team_NameDesc")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        // Cancel out of team name changes
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Edit".equals(driver.findElement(By.cssSelector("#Team_NameEdit > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#Team_NameEdit > span")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("teamName"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Set the name of the team as it appears on your sign-in screen and at the top of the left-hand sidebar.".equals(driver.findElement(By.cssSelector("div.setting-list__hint > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("teamName")).clear();
        driver.findElement(By.id("teamName")).sendKeys("");
        driver.findElement(By.id("teamName")).sendKeys("h" + Keys.BACK_SPACE);
        driver.findElement(By.id("teamName")).clear();
        driver.findElement(By.id("teamName")).sendKeys("");
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.cssSelector("#Team_NameCancel > span"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#Team_NameCancel > span")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("UI Automation".equals(driver.findElement(By.id("Team_NameDesc")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.navigate().refresh();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("UI Automation".equals(driver.findElement(By.cssSelector("div.team-btn__content")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        // Warning: waitForTextPresent may require manual changes
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*@admin[\\s\\S]*UI Automation[\\s\\S]*$")) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("sidebarHeaderDropdownButton"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("sidebarHeaderDropdownButton")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.xpath("//div[@id='sidebar-left']/div/div[2]/ul/li[7]/a/span"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.xpath("//div[@id='sidebar-left']/div/div[2]/ul/li[7]/a/span")).click();
        // Edit Team Name
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Edit".equals(driver.findElement(By.cssSelector("#Team_NameEdit > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#Team_NameEdit > span")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("teamName"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Set the name of the team as it appears on your sign-in screen and at the top of the left-hand sidebar.".equals(driver.findElement(By.cssSelector("div.setting-list__hint > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("teamName")).clear();
        driver.findElement(By.id("teamName")).sendKeys("");
        driver.findElement(By.id("teamName")).sendKeys("Testing Team");
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("saveSetting"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("saveSetting")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Testing Team".equals(driver.findElement(By.id("Team_NameDesc")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.navigate().refresh();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (driver.findElement(By.cssSelector("#sidebar-left > div.team__header.theme")).getText().matches("^@admin\nTesting Team[\\s\\S]*$")) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("sidebarHeaderDropdownButton"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("sidebarHeaderDropdownButton")).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.xpath("//div[@id='sidebar-left']/div/div[2]/ul/li[7]/a/span"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.xpath("//div[@id='sidebar-left']/div/div[2]/ul/li[7]/a/span")).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Edit".equals(driver.findElement(By.cssSelector("#Team_NameEdit > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#Team_NameEdit > span")).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("teamName"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        // Special characters in team name
        driver.findElement(By.id("teamName")).clear();
        driver.findElement(By.id("teamName")).sendKeys("");
        driver.findElement(By.id("teamName")).sendKeys("()_+-={}|[]\\:");
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("saveSetting"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("saveSetting")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("()_+-={}|[]\\:".equals(driver.findElement(By.id("Team_NameDesc")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        Thread.sleep(1000);
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        Thread.sleep(1000);
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("()_+-={}|[]\\:".equals(driver.findElement(By.cssSelector("div.team__name")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("sidebarHeaderDropdownButton"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("sidebarHeaderDropdownButton")).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.xpath("//div[@id='sidebar-left']/div/div[2]/ul/li[7]/a/span"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.xpath("//div[@id='sidebar-left']/div/div[2]/ul/li[7]/a/span")).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        // Team name field max characters prevents typing
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Edit".equals(driver.findElement(By.cssSelector("#Team_NameEdit > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#Team_NameEdit > span")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("teamName"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("teamName")).clear();
        driver.findElement(By.id("teamName")).sendKeys("");
        driver.findElement(By.id("teamName")).sendKeys("h" + Keys.BACK_SPACE);
        driver.findElement(By.id("teamName")).clear();
        driver.findElement(By.id("teamName")).sendKeys("123456789012345%");
        Thread.sleep(1000);
        Thread.sleep(1000);
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("123456789012345".equals(driver.findElement(By.id("teamName")).getAttribute("value"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.cssSelector("#Team_NameCancel > span"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#Team_NameCancel > span")).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        // Set team name back to UI Automation
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Edit".equals(driver.findElement(By.cssSelector("#Team_NameEdit > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#Team_NameEdit > span")).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("teamName"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("teamName")).clear();
        driver.findElement(By.id("teamName")).sendKeys("");
        driver.findElement(By.id("teamName")).sendKeys("UI Automation");
        Thread.sleep(1000);
        Thread.sleep(1000);
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("saveSetting"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("saveSetting")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("UI Automation".equals(driver.findElement(By.id("Team_NameDesc")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.navigate().refresh();
        // Team description
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("sidebarHeaderDropdownButton"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("sidebarHeaderDropdownButton")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.xpath("//div[@id='sidebar-left']/div/div[2]/ul/li[7]/a/span"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.xpath("//div[@id='sidebar-left']/div/div[2]/ul/li[7]/a/span")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Click 'Edit' to add a team description.".equals(driver.findElement(By.cssSelector("#Team_DescriptionDesc > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.cssSelector("#Team_DescriptionEdit > span"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#Team_DescriptionEdit > span")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("teamDescription"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Team description provides additional information to help users select the right team. Maximum of 50 characters.".equals(driver.findElement(By.cssSelector("div.setting-list__hint > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("teamDescription")).clear();
        driver.findElement(By.id("teamDescription")).sendKeys("");
        // Team description max characters prevents typing
        driver.findElement(By.id("teamDescription")).clear();
        driver.findElement(By.id("teamDescription")).sendKeys("This sentence contains 53 characters; I counted them.");
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("This sentence contains 53 characters; I counted th".equals(driver.findElement(By.id("teamDescription")).getAttribute("value"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.cssSelector("#Team_DescriptionCancel > span"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#Team_DescriptionCancel > span")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Click 'Edit' to add a team description.".equals(driver.findElement(By.cssSelector("#Team_DescriptionDesc > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.cssSelector("#Team_DescriptionEdit > span"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#Team_DescriptionEdit > span")).click();
        // Add team description
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("teamDescription"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("teamDescription")).sendKeys("Testing the team description.");
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("saveSetting"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("saveSetting")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Testing the team description.".equals(driver.findElement(By.id("Team_DescriptionDesc")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        // Remove team description
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.cssSelector("#Team_DescriptionEdit > span"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        Thread.sleep(1000);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#Team_DescriptionEdit > span")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("teamDescription"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        Thread.sleep(1000);
        Thread.sleep(1000);
        driver.findElement(By.id("teamDescription")).clear();
        driver.findElement(By.id("teamDescription")).sendKeys("");
        driver.findElement(By.id("teamDescription")).sendKeys("h" + Keys.BACK_SPACE);
        driver.findElement(By.id("teamDescription")).clear();
        driver.findElement(By.id("teamDescription")).sendKeys("");
        Thread.sleep(1000);
        Thread.sleep(1000);
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.id("saveSetting"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.id("saveSetting")).click();
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if ("Click 'Edit' to add a team description.".equals(driver.findElement(By.cssSelector("#Team_DescriptionDesc > span")).getText())) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        // LOG OUT
        driver.navigate().refresh();
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);
        for (int second = 0;; second++) {
        	if (second >= 2) fail("timeout");
        	try { if (isElementPresent(By.cssSelector("a.sidebar-header-dropdown__toggle"))) break; } catch (Exception e) {}
        	Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("a.sidebar-header-dropdown__toggle")).click();
        driver.findElement(By.cssSelector("#logout > span")).click();
    }
}
