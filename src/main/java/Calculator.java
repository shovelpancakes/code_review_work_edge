public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        return a / b;
    }

    public int times(int a, int b){
        return a * b;
    }

    // Метод для вычисления дискриминанта: D = b^2 - 4ac
    public int solver(int a, int b, int c){
        int bSquared = times(b, b);
        int aTimesC = times(a, c);
        int fourAC = times(4, aTimesC);

        return dif(bSquared, fourAC);
    }
}