public static void rotate(int arr[], int n, int d){
//enter your code he
    d=d%n;
    int temp[] = new int[n];
    int k = 0;
    for (int i = d; i < n; i++) {
        temp[k] = arr[i];
        k++;
    }
    for (int i = 0; i < d; i++) {
        temp[k] = arr[i];
        k++;
    }
    for (int i = 0; i < n; i++) {
        arr[i] = temp[i];
    }
}
