////public class ZeroMatrix {
////
////    public static void main(String[] args) {
//////        int[][] matrix = {{0,1,2},{3,0,4},{5,6,0}};
////        int[][] matrix = {{1,2,3}, {4,0,6}, {7,8,9}};
////        boolean[][] zeroMatrix = new boolean[matrix.length][matrix.length];
////        makeZerosMatrix(matrix);
////        System.out.println("Zero Matrix ");
////        for (int i[]: matrix
////        ) {
////            System.out.println();
////            for(int j : i)
////                System.out.print(j + " ");
////        }
////
////    }
////
////    static void makeZerosMatrix(int[][] matrix) {
////
////        for(int i = 0; i < matrix.length; i++){
////            for (int j = 0; j < matrix.length ; j++) {
////                if(matrix[i][j] == 0) {
////                    makeZeros(matrix, i, j);
////                    break;
////                }
////            }
////        }
////
////    }
////
////    static void makeZeros(int[][] matrix, int row, int column) {
////        for(int i = 0 ; i < matrix.length ; i++){
////            matrix[row][i] = 0;
////            matrix[i][column] = 0;
////        }
////    }
////
////}
//
//
//
//public  class  ZeroMatrix {
//    public static void main(String[] args) {
//
//    }
//    static  void  setZeros(int[][] matrix) {
//        boolean rowHasZero = false;
//        boolean colHasZero = false;
//
//
//        for(int j = 0; j < matrix[0].length; j++) {
//            if(matrix[0][j] == 0){
//                rowHasZero = true;
//                break;;
//            }
//        }
//
//        for(int j = 0; j < matrix.length; j++) {
//            if(matrix[j][0] == 0){
//                colHasZero = true;
//                break;;
//            }
//        }
//
//        for(int i = 1; i< matrix.length; i++) {
//            for(int j = 1; j<matrix[0].length; j++) {
//                if(matrix[i][j] == 0){
//                    matrix[i][0] = 0;
//                    matrix[0][j] = 0;
//                }
//            }
//        }
//
//
//    }
//}