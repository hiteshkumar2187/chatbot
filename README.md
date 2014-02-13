Chatbot
=========

AI Chatbot Project for CST 426. This chatbot will chat with people with the objective of learning about the users.

The application will operate with the intent to acquire and recall information about individuals it converses with. These details include but are not limited to:
- Name
- Age
- Gender
- Siblings
- Parents
- Friends
- Occupation
- Foods
- Hobbies

Sentence Format
===
Person
--
Query
- What is [MY || FIRST LAST] [NONE || MOTHER || FATHER || BROTHER || SISTER] [NAME || AGE || OCCUPATION]?
- How many [SIBLINGS || BROTHERS || SISTERS] [DO I] || [DOES FIRST LAST] have?

Response
- [MY || FIRST LAST] [NONE || MOTHER || FATHER || SIBLINGS] [NAME || AGE || OCCUPATION] is [INPUT].

BOT
--
- What is [YOUR || FIRST LAST] [NONE || MOTHERS || FATHERS || SIBLINGS] [NAME || AGE || GENDER || OCCUPATION]?

Sample Script
-------------
```
bot: Hello, What is your name?
user: My name is Dave Bridges.
bot: Nice to meet you Dave Bridges.
bot: Do you have any siblings?
user: Yes, I have 2.
bot: Are they brothers or sisters?
user: I have 1 brother and 1 sister.
bot: What is your brothers name?
user: My brothers name is Jeff Bridges.
bot: What is your sisters name?
bot: My sisters name is Caroline Bridges.
bot: Do you have a favorite food?
user: Yes, I like Pizza.
bot: I've heard Pizza is good.
user: What is my dads name?
bot: I don't know. What is your fathers name?
user: My father is named Charles Bridges.
bot: That is a nice name.
user: How many siblings do I have?
bot: You have 2 siblings.
user: What is my sisters name?
bot: Your sister is named Caroline Bridges.
```