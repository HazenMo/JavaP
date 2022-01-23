# Overview


I created this program to learn the Java language. I also wanted to experiment with OOP used for a more corporate style program. Up to this point most of what I have ever done with it was games. I enjoyed those but wanted to create a program that would be closer to something I might run into in a future job. 
As a result I created a program that would read from a file customer information for an electric company. Next it would read from a file the information from each electric meter, automatically generating billing messages. Currently it can only send those messages to the screen, but eventually I want to make it send actual emails.
I learned a lot writing this software. I learned about how to not only write Java code and syntax, but also about Java specific data types, like ArrayLists and HashMaps. I also learned about "classpaths" and how to implement external libraries as I did research on the email functionality of my program.

{Provide a link to your YouTube demonstration.  It should be a 4-5 minute demo of the software running and a walkthrough of the code.  Focus should be on sharing what you learned about the language syntax.}

[Software Demo Video](http://youtube.link.goes.here)

# Development Environment

{Describe the tools that you used to develop the software}
I developed in both VS Code and Visual Studio in prepration for this assignment. I used Visual Studio so I could do some coding challenges published by Exercism, a website that I used to practice the basic syntax of Java. They require code to be compiled using gradle, so Visual Studio worked better for my needs. I downloaded OpenJDK to develop in Java in VS Code.
{Describe the programming language that you used and any libraries.}
Java is an Object Oriented Programming language. It's syntax is fairly similar to C# which I have learned previously. I used the io library to interact with files and the util library to access ArrayLists and HashMaps.

# Useful Websites

* [W3Schools](https://www.w3schools.com/java/default.asp)
* [Tutorials Point](https://www.tutorialspoint.com/java/java_sending_email.htm)
* [Geeks for Geeks](https://www.geeksforgeeks.org/java-tutorial/?ref=lbp)
* [Exercism](https://exercism.org/dashboard)


# Future Work

{Make a list of things that you need to fix, improve, and add in the future.}
* I want to make this program send emails automatically.
* I want to hook this program up to a database rather than files, so it would be more useful in a real world application.
* I would like to make the calculateCost function be a lot more useful, not only calculating a flat rate, but also be able to handle all the different pricings that electric companies offer their customers, like when the electricity is cheaper at night, but more expensive during the day, that kind of stuff.