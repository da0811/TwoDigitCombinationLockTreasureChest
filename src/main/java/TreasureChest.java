package main;

import java.util.Random;

public class TreasureChest {
    private int passcode;
    private int userInput;
    private int timeLimit;
    private int guessLimit;
    private String chestColor;

    private final String[] colors = {"Gold Treasure Chest", "Blue Treasure Chest", "Rainbow Treasure Chest"};

    public TreasureChest() { // Default and only constructor; nature of game is chests aren't controlled by user.
        passcode = getPasscode();
        chestColor = getChestColor();
        timeLimit = getTimeLimit();
        guessLimit = getGuessLimit();
    }

    public String getChestColor() { // is this right? Yes, the color is printing differently with enough testing.
        setChestColor();
        return chestColor;
    }

    public void setChestColor() { // chest color should be random. no argument parameter
        Random colorGen = new Random();
        chestColor = colors[colorGen.nextInt(colors.length)]; // jumbled code?
        this.chestColor = chestColor;
    }

    private int getPasscode() {
        Random passcodeGen = new Random();
        passcode = passcodeGen.nextInt(100);
        return passcode;
    }

    public void setPassCode(int passCode) {
        this.passcode = passCode;
    }

    public int getUserInput() {
        return userInput;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getGuessLimit() {
        return guessLimit;
    }

    public void setGuessLimit(int guessLimit) {
        this.guessLimit = guessLimit;
    }

    @Override
    public String toString() {
        return String.format("You have found a %s", chestColor); // will this return a respective chest's color,
                                                                // or the most recent chest's color?
    }
}
