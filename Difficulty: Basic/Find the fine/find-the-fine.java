class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
long total = 0;

for (int i = 0; i < car.length; i++) {
    if (date % 2 == 0) {
        // Even date: collect fine from odd-numbered cars
        if (car[i] % 2 != 0) {
            total += fine[i];
        }
    } else {
        // Odd date: collect fine from even-numbered cars
        if (car[i] % 2 == 0) {
            total += fine[i];
        }
    }
}

return total;
    }
}