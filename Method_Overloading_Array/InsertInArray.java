public class InsertInArray {
    public int insert(int arr[], int count, int value, boolean x) {
        if (x) {
            for (int i = count; i >= 1; i--) {
                arr[i] = arr[i - 1];

            }
            arr[0] = value;
            count++;
        } else {
            arr[count++] = value;
        }

        return count;
    }
    
    public int insert(int arr[], int count, int value, int pos) {
        for(int i =count;i>=pos+1;i--)
        {
            arr[i] = arr[i - 1];
        }

        arr[pos] = value;
        count++;

        return count;
    }


}
