# Java Guessing Game

## Description
Interactive guessing game built with Java using Java Swing, where players choose buttons in any grid size to find the randomly selected winning button in the lowest amount of tries. The game tracks the number of attempts and displays win/loss feedback in real-time.

## How to Run
1. Compile all Java files: `javac *.java`
2. Run the main file: `java HitDetectionTester`
3. A window will open with a 4x4 grid of numbered buttons (Adjustable in MyJPanel.java)
4. Click the buttons to find the winning one (turns green when correct, red when wrong)
5. Click "Play Again" to restart and play again

## Built With
- Java
- Swing (GUI framework)

## What I Built
This project demonstrates object-oriented programming principles by separating concerns into different classes so the code stays generic:
- **HitDetection**: Handles game logic (random number generation and win checking)
- **MyJPanel**: Manages the game board UI and button interactions
- **MyTitleJLabel**: Displays the score/try counter
- **MyPlayAgainButton**: Handles game reset functionality

The architecture is modular and reusable allowing for game logic to be swapped out for different game types while keeping the same UI framework.
