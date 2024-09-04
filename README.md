# Using Objects Practice

## Rectangles

Start by reading through the `Rectangle.java` code. 
1)    What does a rectangle object know?
2)    How many different ways are there to create rectangle objects?
3)    What can a rectangle object do?

Next start working through the `// TODO tasks` on `RectangleTester.java` with your partner. Discuss what is going on as well as what changes you are making. 


## Circle
With your partner, start thinking about how you might write a Circle class. Then add the appropriate fields, constructors and methods to `Circle.java`. You should use `Rectangle.java` as a guide. Include getter and setter methods for all instance data. Also create methods that would calculate the circumference and area of a circle. 


Once you have the Circle class written, you need to create a CircleTester class. This will be a separate file with a main method and you will create a few Circle objects and print information about them using the methods that you wrote.

Make 3 different circle objects `c1`, `c2` and `c3`. Give each one different dimensions.

Then print information about each one.

Next set `c2 = c1;`

Finally use the setter methods to individually set the values of `c3` to be the same as the values of `c1`.  Do not do `c3 = c1`, rather do `c3.setRadius(c1.getRadius());` or something similar depending on what you named the getters and setters.

Print all 3 Circle objects again to confirm they are the same.

Finally add the code: `System.out.println(c1 == c2);` and `System.out.println(c1 == c3);`

Discuss the results with your partner.


## State Class

Write a class to represent a State object.  Every State needs to have a name, a year established and a two letter abbbreviation.

* Create appropriate fields or instance data for the State class.
* Create appropriate constructors for the State class.
  * Discuss why you can not create the following two construtors:
    *  `public State(String name, int year)` 
    *  `public State(String abbrev, int year)`
* Create appropriate getters and setters for the State class.
* Create a method that takes an integer parameter (`speciedYear`) that calculates and returns the age (in years) of the state in the `specifiedYear`. 

* Create a toString() method that returns a formatted String similar to:
    > `name` - (`abbreviation`) admitted in `yearEstablished`, `numberOfYears` ago.

    > California - (CA) admitted in 1847, 173 years ago.


## NameGame Lyrics Generator

Your task is to create a program that generates the lyrics of the Name Game when given a name. 
Create a class with a main method that asks the user for their name, then based on that name generates the appropriate lyrics to follow the rules outlined in the song.  The rules for generating the lyrics are outlined in this video: [Shirley Ellis - The Name Game](https://youtu.be/5MJLi5_dyn0)

Be sure to use appropriate style and comment your code well so that other users can understand your intentions.

Test your program with inputs given in the song to ensure that your program works properly.

User Name | Lyrics
----- | -----
Shelly | Shelly Shelly bo Bhelly bannana fana fo fhelly fee fi mo Mhelly, Shelly
Lincoln | Lincoln Lincoln bo Bincoln bannana fana fo fincoln fee fi mo Mincoln, Lincoln


