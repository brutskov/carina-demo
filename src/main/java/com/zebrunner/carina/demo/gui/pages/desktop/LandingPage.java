package com.zebrunner.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.demo.gui.components.workwave.ContactForm;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

public class LandingPage extends AbstractPage {

    @FindBy(xpath = "//iframe[@title = 'Contact Form']")
    private List<ExtendedWebElement> contactFormIframes;

    public LandingPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.workwave.com");
    }

    public ContactForm getContactForm() {
        ExtendedWebElement contactFormIframe = contactFormIframes.stream()
                .filter(iframe -> iframe.isElementPresent(Duration.ofMillis(50)))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Unable to find a visible iframe"));

        getDriver().switchTo().frame(contactFormIframe.getElement());

        return new ContactForm(getDriver());
    }

}
