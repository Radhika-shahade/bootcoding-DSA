package matrix;

public class SearchParticularElement {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][i] == 8) {
                    System.out.println(i +","+j);
                }
            }

        }
    }
}
