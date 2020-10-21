public class MatrixRoatate {

    public static void main(String[] args) {
        int[][] matrix =  {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
//        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
//        int[][] matrix = {{1,2,3}, {4,5,6}};
        System.out.println("Before Rotate Matrix" + matrix.length);


        for (int i[]: matrix
        ) {
            System.out.println();
            for(int j : i)
                System.out.print(j + " ");
        }
        roatateMatrix(matrix);
        System.out.println("Rotate Matrix "+ roatateMatrix(matrix));
        for (int i[]: matrix
             ) {
            System.out.println();
            for(int j : i)
                System.out.print(j + " ");
        }

    }

    static  boolean roatateMatrix(int[][] matrix) {
        if(matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer ++) {
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];

                matrix[first][i] = matrix[last - offset][first];

                matrix[last - offset][first] = matrix[last][last - offset];

                matrix[last][last - offset] = matrix[i][last];

                matrix[i][last] = top;
            }
        }
        return true;
    }
}
