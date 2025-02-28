package domain;

public class Exercise {
    public static int countLuckyTickets() {
        int count = 0;
        // Перебір усіх 6-цифрових чисел від 000000 до 999999
        for (int i = 0; i <= 999999; i++) {
            int d1 = (i / 100000) % 10;
            int d2 = (i / 10000) % 10;
            int d3 = (i / 1000) % 10;
            int d4 = (i / 100) % 10;
            int d5 = (i / 10) % 10;
            int d6 = i % 10;
            
            if ((d1 + d2 + d3) == (d4 + d5 + d6)) {
                count++;
            }
        }
        
        return count;
    }
}