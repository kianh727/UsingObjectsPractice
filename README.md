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
