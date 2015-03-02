# quizdroid3
Homework requirement:

An application that will allow users to take multiple-choice quizzes
now we will refactor to use a domain model and an Application object

note that a future version of this codebase will require permissions to be set; this can be done now or later, as you wish


Stories:

As a developer, create a class called QuizApp extending android.app.Application and make sure it is referenced from the app manifest; override the onCreate() method to emit a message to the diagnostic log to ensure it is being loaded and run

As a developer, use the "Repository" pattern to create a TopicRepository interface; create one implementation that simply stores elements in memory from a hard-coded list initialized on startup. Create domain objects for Topic and Quiz, where a Quiz is question text, four answers, and an integer saying which of the four answers is correct, and Topic is a title, short description, long description, and a collection of Question objects.

As a developer, make the QuizApp object a singleton, and provide a method for accessing the TopicRepository.

As a developer, refactor the activities in the application to use the TopicRepository. On the topic list page, the title and 
the short description should come from the similar fields in the Topic object. On the topic overview page, the title and long description should come from the similar fields in the Topic object. The Question object should be similarly easy to match up to the UI.
 
Homework Grading:

All your code should be in a GitHub repo under your account
repo should be called 'quizdroid'
repo should contain all necessary build artifacts
include a directory called "screenshots", including:
screenshot of app running on emulator
pic or screenshot or movie of app running on a device
We will clone and build it from the GH repo
5 points, one for each satisfied story
