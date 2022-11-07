# Equal Objects Should have Equal Hashcodes

# The better the developer you are the more abstract classes you should have

# Principles
## SOLID Principles



## Private and Static
Means if they are both there it cannot be over written

## Naming Classes
package ca.bcit.comp2601.lesson1.monikaszucs;
class Person {};
This means any class only in the package defined above can access this class

## Private Variables
class Person {
    private final String lastName;
};

This private variable is only accessible in this class. we add final if we dont plan on it having to change.

## Overriding
It is when you replace the parents method. 

## Interface
The children must override those methods in the interface

# Polymorphism is also sometimes called protocalls

# Why would we use a lambda expression?
It does the same code it makes it readable, flexible and short

# Testing (these three features will make your code bomb proof)
1 Unit tests

2 tdd: test-driven development
write a test first
write just enough code to pass that test

3 design by contract
means you will triple check all the values of all the arguments right away. check all the arguments for good and bad values when you start and when you leave

## Types of Testing
https://www.atlassian.com/continuous-delivery/software-testing/types-of-software-testing

## Design sprint - testing and tesitng w/ human beings read this book - Google Ventures uses this. - Human testing
http://www.gv.com/sprint/

# Steps of design
## traditional
design for 4 months
code fro 2 months, unofficially testing along the way
audited by QA, using requiremetns from teh customer show me the errors
i fix repeat

customer tests it next

## TDD and agile
lots of up-front design still

1. interview teh client and record with ipad and cameras
"our app runs on ios 14+ on iphones only, it starts with our icon in the center"

2. transcribe that into written statements and pictures 
3. change teh paragraphs into checklists 
- ios 14
- ios 14+
- iphone
- if no wifi  or cell ???
- icon?? icon2x.png horizontally and vertically, min 2 sec

4. each checlist item becomes a unit test
5. code, pass the tests

## TDD
there is no QA team
you write a test, code to pass the test
repeat
then do end-to-end, integration test...

## Exercises 
Design and app to help pubs and bars get their alchol deliveries faster or cheaper

App to match dogs with dog walkers in north van
listen

lots of people

When you solved the problem it takes off 

## design by contract

## More important than efficiency:
- correct code
- maintainable
- robus
- readable
- modular
- secure
- easy to update
- reusable
- well commented


## Checkout
Hamcrest
file > project structure > libraries > + > search for hamcrest
- helps make testing easier to read

## Avoid using
assertThat

## Tips
dont test loops just test the code directly

## What to test in a single block of test?
### void badWeightThrowsIllegalArg()  (check to make sure they throw illegal argument exception)
0
negative
2000 (way too big)
150.00000000000000001

### void testSetWeight() (do these values result in a valid Person object being creating?)
1
100
1000

## Unit-testing best practices
- keep the tests and code in separate folders
- keep the tests and code in the same package
- avoid assertTrue() and assertFalse() they are too unclear

## If you get errors setting up tests
- file > project structure > dependencies
  - make the JUnit set to Compile in the dropdown
  - also when you setup the junit tests by right clicking the class make sure you search for the junit test you want to add before you really add it.