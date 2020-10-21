class Puzzle {
    public int firstfunction(int N) {

        int staticNum = 5;
        if (N == 0)
            return staticNum * 10;

        int negative = N / Math.abs(N);

        N = Math.abs(N);
        int n = N;

        int maxLimit = 8000;
        int inc = 0;
        int pos = 1;

        while (n > 0) {
            inc++;
            n = n / 10;
        }

        for (int i = 0; i <= inc; i++) {
            int newVal = ((N / pos) * (pos * 10)) + (staticNum * pos) + (N % pos);
            if (newVal * negative > maxLimit) {
                maxLimit = newVal * negative;
            }

            pos = pos * 10;
        }

        return maxLimit;
    }

}
