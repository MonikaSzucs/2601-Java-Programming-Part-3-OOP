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

# Testing
1 Unit tests

2 tdd: test-driven development
write a test
write just enough code to pass that text

3 design by contract

https://www.atlassian.com/continuous-delivery/software-testing/types-of-software-testing

## Design sprint
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
