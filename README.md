Erin van den Brink
48813109

assign3
=======


![alt tag](https://raw.github.com/yarko3/assignment2/master/drunkbot/Logo_small.png)


 We have decided to implement a chatbot who is somewhat intoxicated but coherent and able to learn from user interaction. This bot will interact with the user based on pre-programmed sentence structures as dynamically generated responses based on user input through the use of natural language processing.

SDLC: Agile with Scrum
-----------------------------
![alt tag](https://raw.github.com/yarko3/assignment2/master/drunkbot/SCRUM-Final-small.png)


 Management is not required. Because the bot is not a large project there is no need to elect someone to a manager type position. Additionally, there are many trivial features that can be quickly implemented by individual team members. This means that there is not a dependence on complex testing. As a result, a simple backlog can be created and members can draw new tasks from it as they complete their current objectives. Work in groups is unnecessary due to the size of team and project, and communication outside of the programming process is all that is necessary.

Phases of SDLC
--------------
* Construct feature set
  * Chatbot with drunk words
  * Take in user input
     * Find suitable library for retrieval verb and noun extractions
     * Use the extracted words to formulate a response
  * Provide a drunken response

* Discuss and agree on coding and design standards
  * Discuss coding and syntactical standards 
  * Agree on standard image sizes and resolution
  * Decide on user interface

* Divide features among programmers
  * Discuss the strengths of each member of the team
  * Assign tasks to team members
  * Discuss and share features implemented with team members

* Test each implemented feature thoroughly
  *  Run multiple tests to see if features work together

* Test complete bot
  * Run program
  * Record/document a conversation of 30 tries for submission 

WBS
---


Adam
* Logo
 * Time Expected: 1 hour
 * Time Actual: 45 minutes
* Documentation
 * Time Expected: 1 hours
 * Time Actual: 1 hours
* Bottle of SCRUM
 * Time Expected: 2 hour
 * Time Actual: 3 hours


Erin
* Gantt Chart
 * Time Expected: 30 minutes
 * Time Actual: 2 hours (confusing)
* Documentation
 * Time Expected: 1 hour
 * Time Actual: 1.5 hours


Ethan
* Organize project, manage source code
   * Time Expected: 2 hours
   * Actual Time: 2 hours
* Create chat environment
   * Construct sentences based OpenNLP output
   * Adapt to missing parts of speech
      * Answers based on missing verbs or nouns
   * Choosing best sentence structure to use
   * Time expected: 3 hours
   * Actual Time: 4 hours
* Add to key:value dictionary

Shayne
* Documentation
 * Time Expected: 30 min
 * Actual Time : 1 hour
* Coding possible extra features for the bot
 * Time Expected: 2 hours
 * Actual Time: 2.5 hours

Yarko
* Implement data pulling from input
* Get natural language parser (OpenNLP)
   * Time Expected: 3 hours
   * Time Actual: 4 hours (need to install using Maven, took more time)
* Get noun and verb from input
   * Time Expected: 30 min
   * Time Actual: 1 hour (needed to work out Eclipse kinks)
* Create base dictionary of fixed input and answer pairs

* All team members were involved in the testing and expansion of the functional bot

Gantt Chart
-----------

![alt tag](https://raw.github.com/yarko3/assignment2/master/drunkbot/ganttchart.png)

The above chart summarizes the tasks completed over the course of the project time frame. It is nted that the sub groups show the dependences of related tasks.

Limitations
-----------
* Cannot develop context-aware responses
* Cannot register colloquialisms
 * User> I am != not a computer
 * Bot> I also like to am computer when I drink.
* Cannot identify if real words are used
 * Bot> Heyyy, how you doin'?
 * User> ARSTARDARDHQWDH#
 * Bot> I loooooove ARSTARDARDHQWDH.
    
* Sometimes does not detect valid sentences
 * User> That much I have gathered but could you give me the particulars of the beverages you are ingesting.
 * Bot> I... what? What do you mean by ingesting and beverages? 

Feature List
-------------
* Natural language processing
* Initial phrase-response dictionary
* Implement learned dictionary based on user input
* Decide appropriate sentence structure for responses

Additions for Assignment 3
--------------------------
* Added extra topic to agent's repertoire where the Drunkbot will give recipes for drinks depending on the type of alcohol you have
	* This expands the chat agent's topic of conversation and helps the user interact further with the chatbot. I did this by adding to
	the dictonary.txt file and also adding to the if else clauses in the main.java where the randomly generated response was weight dependent.
* Added to list of responses if the chat goes off topic
	* I modified and added to the off topic responses to help move the conversation to topics which the drunkbot is designed for.
	I tried to give more responses so the randomly generated response would have a greater chance of not being duplicated. I also did this 
	by adding to the dictionary.txt file and by modifying the if else clauses in the main.java class where the responses were randomly generated
	dependent on weight.
* Implemented a GUI
	* By implementing the GUI the drunkbot is easier to interact with. The easy popup window gives a clean and consice view of the
	conversation. This part of the project was in a separate class of the main. It currently isn't working with the original main.java 
	but will be fixed in the future. It is currently working at generating random responses using the math
	imported package and is not connected with the dictionary.text file.
	
Java class: Chat Client (class with GUI implemented)
-----------
--->User:	hey
--->Drunk Bot:	I'm drunk
--->User:	you always are Drunkbot
--->Drunk Bot:	I'm drunk
--->User:	Yes you just said that
--->Drunk Bot:	I'm drunk
--->User:	You sound like a broken record
--->Drunk Bot:	huh?
--->User:	a broken record
--->Drunk Bot:	I'm drunk
--->User:	Ya we've established that
--->Drunk Bot:	buy me another drink
--->User:	I don't think you need any more
--->Drunk Bot:	huh?
--->User:	Stick to water perhaps
--->Drunk Bot:	call a taxi
--->User:	Okay time to go home.
--->Drunk Bot:	I'm drunk

Main Class:
-----------

Heyyy, how you doin'?
good, you?
good. wanna drink?

yes
me too.

What should I drink?
what do you haveeeee?

vodka
you should make a caesar!

how do I make a caesar?
1 1/2 oz vodka, fill with clamato juice, 3 dashes tabasco® sauce, 3 dashes worcestershire sauce

This is tasty
i could soooooo goooo for some poutinneeee mmmm

What are you drinking?
whatever's in this glass.

Are you okay to drive?
i'm not even okay to walk, so what do you think?

Fine
that's cool.

I like summer
I don't understand you...

Do you like summer?
Whaaa, what? You talking to me?

Yes
me too.

What are you doing?
Of course I am into that.

You're too drunk bud
I don't understand you...

I think its time for you to go home
I... what? What do you mean by go and home?

Get some rest
I... what? What do you mean by Get and rest?

You need some
What are we talking about, you?

whatever
I... what? What do you mean by that?


	
Future Ideas
------------	
* Implementing a mapping API plugin for locating bars/liquor stores
	* This would use your location to find a bar or liquor store closest to you
* Implemented the use of sockets to build conversations with another agent

30 turns: this dialog shows how the new features are implemented and also shows
some limitations where grammar and spelling are not checked
--------

Heyyy, how you doin'?
good, you?
good. wanna drink?

yes please
We are talking about liquor //tries to direct back to conversation

What should I drink?
what do you haveeeee?

water
no good story started with a glass of water //asking what to drink new topic of conversation

true
Huh? What do you mean by that?

well I don't have anything
go out! 

where do you wanna go?
i like that place micro. the bartenders, amy and jay, know me well.

give me your keys
how about another drink?

beer
mmmmm beeerrr, pass me one will yaaaa

i like your pants
I don't understand you... //off topic comment

i'm getting a bit off topic aren't I
I... what? What do you mean by getting and arent?

You're getting confused aren't you
We are talking about liquor

right sorry
You aren't making any sense, and I have nooooooo idea what you are saying.

wine
you fancy huh

i like wine
I don't understand you...

why
You aren't making any sense, and I have nooooooo idea what you are saying.

why?
why not?

are you a computer?
i'm not not a computer, if that is what you mean. but maybe i'm not not not a computer.

you are a peacock?
no, you are a peacock


You aren't making any sense, and I have nooooooo idea what you are saying.

great
that's cool.

how do I make a caesar? //new feature implemented gives a recipe 
1 1/2 oz vodka, fill with clamato juice, 3 dashes tabasco® sauce, 3 dashes worcestershire sauce

this is tasty
i could soooooo goooo for some poutinneeee mmmm

oooohhh ya me too
I don't understand you...

i dont understand you
Oh how interestingggggg //off topic default answer

Drunkbot what should I drink
What liquor do you have?
nothing
you should go out!

water
no good story started with a glass of water

this is true
I think it is time for me to go.

okay goodbye
Goodbye.
*Falls off chair*

Code Extraction:
---------------
* I wasn't able to get many of the features implemented but other students could use my
ideas of implementing a simple gui if not yet implemented
* They can use my ideas of implementing a mapping API 
* The use the OpenNLP for pos tagging could be extracted for other students code
