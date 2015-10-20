# GUI-Graphing-Project
A graphing application that uses turtle graphics as a base.

**Project requirements:**

Using the turtle panel as an example, you will construct a class called "GraphPanel" which graphs a function. You will use this to build a robust graph browsing application. At a minimum, the application should allow the user to do the following:

Select between one of 3 pre-determined functions. These can be anything you like, but I recommend functions with different shapes. For example, in my own I did the following functions:

*sin(x)*

*x^{2}+2*

*x^{3}-5*

Your interface should use radio buttons to select which graph is displayed. You should have a way for the user to enter their min and max coordinates for x and y. These values will specify how the pixels are mapped on the screen. The far left hand corner of your panelwill be the user specified "X-Min" and the far right hand side will be the user specified "X-Max". Likewise the bottom of your panel will be "Y-Min" and the top will be your "Y-Max". Use appropriate controls and labels to make this look nice. Add mouse events to the GraphPanel. When the mouse moves over the window, draw a dot on the function line for that x position and display the calculated coordinates in the upper right hand corner. Allow the user to zoom into a portion of the graph by drawing a box around the region.


**Some Hints**

I suggest the following the order of the requirements in development. Start with a nicely formatted window, then add appropriate components to generate a nice layout for your application.
Create an interface for a graphable function. Use objects of this interface type to represent your various functions and pass those into your graph panel for drawing. Good object oriented design is half the battle with this one!
You will be making heavy use of the mouse adapter. You will need to add an internal mouse adapter class to GraphPanel in order to handle the clicking.
Think about how you will translate Cartesian Points into Screen Points. HINT HINT Turtles move in Cartesian planes!
You can find the Cartesian x component of the mouse's position by converting the x coordinate of the mouse event into Cartesian coordinates.
The y component of the mouse's position is computed by pasdsing the converted x coordinate into the plotable function. It has nothing to do with mouse y.
Use the drag event to find the bound boxes of a region. You don't have to make a box appear on the screen, but if you do I will give you extra credit. You will have to store the starting and ending position of the mouse's drag event.

**Extra Credit Opportunities**

* I will award extra credit for the following:

* Particularly nice user interfaces.

* Expression parsing which allows a user to enter their own expressions. I was originally going to give you a class which did this, but I thought I would give this as an opportunity to you. The more elaborate your parser and grammer, the more points you will get!

* Add the ability to pan the plot window. How you do this is up to you. Perhaps some mouse gesture or buttons.

* The ability to save the graph to an image file (like .jpg or .png). This one is probably the easiest extra credit option. Look up jave and image creation and you'll see what I mean. For this one, you probably want to add a menu and use the file dialog.

* Anything else that shows me that you really had a good time and learned a lot while building this program. (but it does have to be related to graphing)
