class Main {
    public static void main(String args[]) {
        int x = 5;
        int multiples[] = {1,2,3};

        for (int n: multiples) {
            System.out.println((int)Math.pow(x, n));
        }
    }
}