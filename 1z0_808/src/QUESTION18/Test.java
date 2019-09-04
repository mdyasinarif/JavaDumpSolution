/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION18;

public class Test {

    public static void main(String[] args) {
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";
//        for (int i = 1; i < 2; i++) {
//            for (int j = 1; j < 2; j++) {
//                System.out.println(shirts[i][j]+" :");
//            }
//        }
//result medium

        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.println(shirts[i][j] + " :");
            }
        }

    }
    // red :blue :small :medium :
//    
//      for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println(shirts[i][j] + " :");
//            }
//        }
//
//    }
//            
////      for (int i = 0; i < 2; i++) {
////            for (int j = 0; j < 2; j++) {
////                System.out.println(shirts[i][j] + " :");
////            }
////        }
////
////    }for (String[] c : colors) {
//            for (String s : size) {
//                System.out.println(s+":");
//            }
//        }

//        for (int i = 0; i < 2;) {
//            for (int j = 0; j < 2; ) {
//                System.out.println(shirts[i][j] + " :");
//                j++;
//            }
//            i++;
//        }
//         
//    }

}
