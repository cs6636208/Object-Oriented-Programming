class Test9 {
    public static void main(String[] args) {
        int[] list = { 1, 9, 3, 7, 2 };
        list = dosomething(list);
    }

    public static int[] dosomething(int[] input) {
        int temp;
        int count = 0;
        for (int i = 1; i < input.length; i++) {
            count++;
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println("\nCount: " + count);
        return input;
    }
}