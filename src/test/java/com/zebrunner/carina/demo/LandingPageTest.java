package com.zebrunner.carina.demo;

import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.registrar.tag.Priority;
import com.zebrunner.carina.core.registrar.tag.TestPriority;
import com.zebrunner.carina.core.registrar.tag.TestTag;
import com.zebrunner.carina.demo.gui.components.workwave.ContactForm;
import com.zebrunner.carina.demo.gui.pages.desktop.LandingPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LandingPageTest extends AbstractTest {

    @Test
    @TestPriority(Priority.P3)
    @TestTag(name = "feature", value = "landing")
    @TestTag(name = "link", value = "https://www.workwave.com")
    @MethodOwner(owner = "brutskov")
    public void verifyContactFormTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();

        ContactForm contactForm = landingPage.getContactForm();
        contactForm.getFirstNameInput().type("John");
        contactForm.getLastNameInput().type("Smith");
        contactForm.getCompanyInput().type("Solvd Inc.");
        contactForm.getTotalNumberOfEmployeesSelect().select("500+");
        contactForm.getPhoneInput().type("+123456789");
        contactForm.getEmailInput().type("jsmith@solvd.com");
        contactForm.getCountrySelect().select("United States");
        contactForm.getStateSelect().select("California");
        contactForm.getInterestedInSelect().select("RealGreen Software");
        contactForm.getPrivacyPolicyCheckbox().check();

        getDriver().navigate().refresh();

        contactForm = landingPage.getContactForm();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(contactForm.getFirstNameInput().getAttribute("value").isEmpty(), "The first name input is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getLastNameInput().getAttribute("value").isEmpty(), "The last name input is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getCompanyInput().getAttribute("value").isEmpty(), "The company input is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getTotalNumberOfEmployeesSelect().getSelectedValue().isEmpty(), "The total number of employees select is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getPhoneInput().getAttribute("value").isEmpty(), "The phone number input is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getEmailInput().getAttribute("value").isEmpty(), "The email input is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getCountrySelect().getSelectedValue().isEmpty(), "The country select is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getStateSelect().getSelectedValue().isEmpty(), "The state select is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getInterestedInSelect().getSelectedValue().isEmpty(), "The interested in select is not empty after reloading the page.");
        softAssert.assertFalse(contactForm.getPrivacyPolicyCheckbox().isChecked(), "The privacy policy checkbox is checked after reloading the page.");

        softAssert.assertAll();
    }

    @Test
    @TestPriority(Priority.P2)
    @TestTag(name = "feature", value = "landing")
    @TestTag(name = "link", value = "https://www.workwave.com")
    @MethodOwner(owner = "brutskov")
    public void verifyContactFormFailureTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();

        ContactForm contactForm = landingPage.getContactForm();
        contactForm.getFirstNameInput().type("John");
        contactForm.getLastNameInput().type("Smith");
        contactForm.getCompanyInput().type("Solvd Inc.");
        contactForm.getTotalNumberOfEmployeesSelect().select("500+");
        contactForm.getPhoneInput().type("+123456789");
        contactForm.getEmailInput().type("jsmith@solvd.com");
        contactForm.getCountrySelect().select("United States");
        contactForm.getStateSelect().select("California");
        contactForm.getInterestedInSelect().select("RealGreen Software");
        contactForm.getPrivacyPolicyCheckbox().check();

        getDriver().navigate().refresh();

        contactForm = landingPage.getContactForm();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertFalse(contactForm.getFirstNameInput().getAttribute("value").isEmpty(), "The first name input is not empty after reloading the page.");
        softAssert.assertFalse(contactForm.getLastNameInput().getAttribute("value").isEmpty(), "The last name input is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getCompanyInput().getAttribute("value").isEmpty(), "The company input is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getTotalNumberOfEmployeesSelect().getSelectedValue().isEmpty(), "The total number of employees select is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getPhoneInput().getAttribute("value").isEmpty(), "The phone number input is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getEmailInput().getAttribute("value").isEmpty(), "The email input is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getCountrySelect().getSelectedValue().isEmpty(), "The country select is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getStateSelect().getSelectedValue().isEmpty(), "The state select is not empty after reloading the page.");
        softAssert.assertTrue(contactForm.getInterestedInSelect().getSelectedValue().isEmpty(), "The interested in select is not empty after reloading the page.");
        softAssert.assertFalse(contactForm.getPrivacyPolicyCheckbox().isChecked(), "The privacy policy checkbox is checked after reloading the page.");

        softAssert.assertAll();
    }
}
