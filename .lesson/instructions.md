# Adversarial Search: Nim (Group Project)

** Please take plenty of time to study the existing code before you begin implementing your own code.** 

## Groupings
- Minimum Group Size: 2
- Maximum Group Size: 5
- Self selected groups

## Summary

Your task is to implement the game of Nim using the Minimax and Alpha/Beta algorithms. Code for Minimax and Alpha/Beta has already been provided for you, you simply need to code the game of Nim. Additionally, to demonstrate an example, Tic-Tac-Toe has been completely implemented.

## Packages

The code is separated into three packages
- `gamealgorithms` contains the algorithms and template code for all the game-playing algorithms, provided by the AIMA textbook
- `tictactoe` contains a full implementation of tic-tac-toe that can be used by the algorithms in the `gamealgorithms` package
- `nim` contains partially completed code that needs to be completed in order for the game of Nim to be simulated by the gaming algorithms

## Object Oriented Programming Approach

Since we are doing these algorithms in Java, we use object oriented programming. There is an interface of type `Game`. To make a game of our creation usable by the algorithms, we must make a class that implements the `Game` interface and all its methods. 

For tic-tac-toe, this is done using `TicTacToeGame.java` with helper classes `TicTacToeState.java` and `XYLocation.java`. 

For Nim, we will have to write a class `NimGame.java` that will implement the `Game` interface. Much like tic-tac-toe, it is also helpful to have an object type that represents the current state of the game, `NimState.java`. I have created these skeleton classes for you.

## Directions

Complete the missing code in the `nim` package. Uncomment the test code in the `Main.java` class to run your code. When the code runs correctly, submit it through REPL.it and also a screenshot to MyMCPS/Canvas. Include all group member names in your submission.

Additionally, answer the following questions and submit it to MyMCPS/Canvas:

- How does changing the number of starting dragons and the legal moves affect the strategy and outcome of the game?
- How could the test code be modified to create a visualization of the game tree instead of just the actual turn-by-turn outcomes?
- What was the relative contribution of each group member to the project? 

## Extension (Optional Points)

Create a new package `connectfour` and create classes `ConnectFourGame.java` and `ConnectFourState.java`. Implement your game of Connect Four so that it runs correctly with Minimax and Alpha/Beta algorithms. 