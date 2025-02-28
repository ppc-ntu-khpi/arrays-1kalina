package test;

import domain.Exercise;

public class TestResult {
    
    public static void main(String[] args) {
    
        int luckyCount = Exercise.countLuckyTickets();
        System.out.println("Кількість щасливих квитків: " + luckyCount);
    
    }
}