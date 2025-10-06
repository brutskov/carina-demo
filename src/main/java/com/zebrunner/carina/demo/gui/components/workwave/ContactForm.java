package com.zebrunner.carina.demo.gui.components.workwave;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ContactForm extends AbstractPage {

    @FindBy(xpath = "//label[text() = 'First Name']/ancestor::*[.//input][1]//input")
    private ExtendedWebElement firstNameInput;

    @FindBy(xpath = "//label[text() = 'Last Name']/ancestor::*[.//input][1]//input")
    private ExtendedWebElement lastNameInput;

    @FindBy(xpath = "//label[text() = 'Company']/ancestor::*[.//input][1]//input")
    private ExtendedWebElement companyInput;

    @FindBy(xpath = "//label[text() = 'Total Number of Employees']/ancestor::*[.//select][1]//select")
    private ExtendedWebElement totalNumberOfEmployeesSelect;

    @FindBy(xpath = "//label[text() = 'Phone']/ancestor::*[.//input][1]//input")
    private ExtendedWebElement phoneInput;

    @FindBy(xpath = "//label[text() = 'Email']/ancestor::*[.//input][1]//input")
    private ExtendedWebElement emailInput;

    @FindBy(xpath = "//label[text() = 'Country']/ancestor::*[.//select][1]//select")
    private ExtendedWebElement countrySelect;

    @FindBy(xpath = "//label[text() = 'State']/ancestor::*[.//select][1]//select")
    private ExtendedWebElement stateSelect;

    @FindBy(xpath = "//label[text() = 'I am Interested in:']/ancestor::*[.//select][1]//select")
    private ExtendedWebElement interestedInSelect;

    @FindBy(xpath = "//label[contains(text(), 'I agree that WorkWave')]/ancestor::*[.//input][1]//input[@type = 'checkbox']")
    private ExtendedWebElement privacyPolicyCheckbox;

    public ContactForm(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getFirstNameInput() {
        return firstNameInput;
    }

    public ExtendedWebElement getLastNameInput() {
        return lastNameInput;
    }

    public ExtendedWebElement getCompanyInput() {
        return companyInput;
    }

    public ExtendedWebElement getTotalNumberOfEmployeesSelect() {
        return totalNumberOfEmployeesSelect;
    }

    public ExtendedWebElement getPhoneInput() {
        return phoneInput;
    }

    public ExtendedWebElement getEmailInput() {
        return emailInput;
    }

    public ExtendedWebElement getCountrySelect() {
        return countrySelect;
    }

    public ExtendedWebElement getStateSelect() {
        return stateSelect;
    }

    public ExtendedWebElement getInterestedInSelect() {
        return interestedInSelect;
    }

    public ExtendedWebElement getPrivacyPolicyCheckbox() {
        return privacyPolicyCheckbox;
    }
}
