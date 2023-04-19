# TicTacToe

### How to build and test (from Terminal):

1. Make sure that you have Apache Ant installed. Run each ant command in the tictactoe folder, which contains the `build.xml` build file.

2. Run `ant document` to generate the javadoc (a hypertext description) for all of the java classes. Generated hypertext description will be in the `jdoc` folder. Open the `index.html` file.

3. Run `ant compile` to compile all of the java classes. Compiled classes will be in the `bin` folder.

4. Run `ant test` to run all unit tests.

### How to run (from Terminal):

1. After building the project (i.e., running `ant`), run the following command in the tictactoe folder:
   `java -cp bin RowGameApp`

### How to clean up (from Terminal):

1. Run `ant clean` to clean the project (i.e., delete all generated files).

### Functionality

1. Opens a Java Swing GUI for a two-player Tic-Tac-Toe game. A player moves by clicking a block, which marks the block with the player's symbol, and makes it the other player's turn. If a player wins with a three-in-a-row, all blocks become unclickable and the game ends.

2. The current game state is displayed at the bottom of the GUI, and cannot be interacted with directly.

3. At any point, the players can reset the game by pressing the **Reset** button

4. Players may undo moves made, unless an end game state is reached, by pressing the **Undo** button.
