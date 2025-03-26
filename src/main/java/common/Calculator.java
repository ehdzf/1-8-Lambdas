package common;

import common.functionalinterfaces.Operation;

public class Calculator {
    public Operation sum = (a, b) -> a + b;
    public Operation subtract = (a, b) -> a - b;
    public Operation multiply = (a, b) -> a * b;
    public Operation divide = (a, b) -> a / b;

}
