*** Settings ***
Library   SeleniumLibrary

*** Test Cases ***
Search All
  Open search page
  Search
  Should display result 31 products

Search All 2
  Open search page
  Search
  Should display result 31 products


*** Keywords ***
Should display result 31 products
  Capture Page Screenshot
  Wait Until Element Contains   xpath=//div[2]/h1   Shopping Cart


Search
  Click Element   xpath=//nav/a[2]

Open search page
  Open Browser   http://128.199.66.209:8080/index.html  browser=chrome
