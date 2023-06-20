package com.company;

public class Controller {
    private View view;
    private int firstNumber;
    private char operation;

    public void setView(View view) {
        this.view = view;
    }

    /*
    public void handleAddButtonClick() {
        //System.out.println("yay");
        //view.setResult("yay");
        //view.setResult(view.getFirstFieldText());
        //int result = Integer.parseInt(view.getFirstFieldText()) + Integer.parseInt(view.getSecondFieldText());
        //view.setResult(view.getFirstNumber() + view.getSecondNumber());
        firstNumber = view.getNumber();
        operation = '+';
        view.clearField();
    }

    public void handleSubtractButtonClick() {
        //int result = Integer.parseInt(view.getFirstFieldText()) - Integer.parseInt(view.getSecondFieldText());
        //view.setResult(view.getFirstNumber() - view.getSecondNumber());
        firstNumber = view.getNumber();
        operation = '-';
        view.clearField();
    }

    public void handleMultiplyButtonClick() {
        //int result = Integer.parseInt(view.getFirstFieldText()) * Integer.parseInt(view.getSecondFieldText());
        //view.setResult(view.getFirstNumber() * view.getSecondNumber());
        firstNumber = view.getNumber();
        operation = '*';
        view.clearField();
    } */

    public void handleButtonClick(char operation) {
        firstNumber = view.getNumber();
        this.operation = operation;
        view.clearField();
        view.moveCursor();
    }

    public void handleEqualsButtonClick() {
        int secondNumber = view.getNumber();

        /*
        switch (operation) {
            case '+':
                view.setResult(firstNumber + secondNumber);
                break;
            case '-':
                view.setResult(firstNumber - secondNumber);
                break;
            case '*':
                view.setResult(firstNumber * secondNumber);
            default:
                //code
        } */

        switch (operation) {
            case '+' -> view.setResult(firstNumber + secondNumber);
            case '-' -> view.setResult(firstNumber - secondNumber);
            case '*' -> view.setResult(firstNumber * secondNumber);
            //default -> code
        }

        /*
        view.setResult(switch (operation) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> 0;
        }); */

        view.moveCursor();
    }
}
