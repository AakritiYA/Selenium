# Selenium Locators Learning Repository

This repository documents my exploration of different locators for finding web elements during my Selenium learning journey. The examples cover various aspects of web application testing, focusing on effective and efficient ways to locate and interact with different types of web elements.

# Additional Learning Highlights

- Dropdown handling with `Select` class
- Counting and printing hyperlinks on a webpage
- Finding and handling broken links
- Counting radio buttons using XPath
- Clicking on image links
- Mouse operations: right-click and double-click
- Handling alert popups
- Addressing synchronization issues
- Working with frames and iframes
- Scrolling web pages

## Basic Locators

- **By ID:** `driver.findElement(By.id("elementId"));`
- **By Name:** `driver.findElement(By.name("elementName"));`
- **By Class Name:** `driver.findElement(By.className("className"));`
- **By Tag Name:** `driver.findElement(By.tagName("tagName"));`
- **By Link Text:** `driver.findElement(By.linkText("linkText"));`
- **By Partial Link Text:** `driver.findElement(By.partialLinkText("partialLinkText"));`

## CSS Selectors

- **By Tag and ID:** `driver.findElement(By.cssSelector("tag#id"));`
- **By Tag and Class:** `driver.findElement(By.cssSelector("tag.className"));`
- **By Tag and Attribute:** `driver.findElement(By.cssSelector("tag[attribute='value']"));`
- **By Tag, Class, and Attribute:** `driver.findElement(By.cssSelector("tag.className[attribute='value']"));`

## XPath

- **Absolute XPath:** `/html/body/div[1]/div[2]/...`;
- **Relative XPath:** `//*[@id='elementId']`; *(Preferable over Absolute XPath)*
- **Single Attribute:** `//*[@attribute='value']`;
- **Multiple Attributes:** `//*[@attribute1='value1' and @attribute2='value2']`;

## XPath with SelectorHub

When using SelectorHub, you can generate enhanced XPaths for more complex scenarios:

- *Install SelectorHub browser extension.*
- *Navigate to the web page.*
- *Inspect the element.*
- *Use SelectorHub to generate XPath.*

## Locators Usage Examples

Explore the examples to understand how to use each locator for finding web elements:

- [Locators]([Examples/BasicLocators.md](https://www.selenium.dev/documentation/webdriver/elements/locators/))
- [Selenium Tutorial - WebDriver Basics](https://toolsqa.com/selenium-webdriver/selenium-tutorial/)

## Getting Started

To explore the details of each locator and its usage, click on the corresponding link above. Each example page contains information and code snippets demonstrating the use of the respective locator.

## Contributing

Feel free to contribute by providing feedback, suggestions, or opening issues/pull requests related to Selenium locators.

