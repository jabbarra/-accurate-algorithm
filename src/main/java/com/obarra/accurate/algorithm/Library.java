/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.obarra.accurate.algorithm;

public class Library {

    public Long getMinorAddedPath() {
        int [][] matrix = {{1, 2, 9},{2, 10, 3},{1, 1, 1}};
        for (int i = 0 ;i < 3; i++){
            for (int j = 0 ;j < 3; j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        int [] directionY = {-1, 0, 1};
        int [] valuesPath = {-1, -1, -1};
        long minorAdded = 0;

        for (int j = 0 ;j < 3; j++){
            int firstPosition = 0;
            for (int f = 0; f < 3; f++){
                int firstMovement = j + directionY[f];
                if (firstMovement < 0 || firstMovement > 2)
                    continue;
                for (int s = 0; s < 3; s++){
                    int secondMovement = j + directionY[f] +directionY[s];
                    if (secondMovement < 0 || secondMovement > 2)
                        continue;
                    long result = matrix[j][firstPosition] +
                            matrix[firstMovement][firstPosition + 1] +
                            matrix[secondMovement][firstPosition + 2];
                    if(minorAdded == 0 || minorAdded > result) {
                        minorAdded = result;
                        valuesPath[0] = matrix[j][firstPosition];
                        valuesPath[1] = matrix[firstMovement][firstPosition + 1];
                        valuesPath[2] = matrix[secondMovement][firstPosition + 2];
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(valuesPath[i]);
        }
        return minorAdded;
    }
}