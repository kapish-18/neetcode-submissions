class Solution {
    public boolean isValidSudoku(char[][] board) {       
        for(int i = 0 ; i<9 ; i++){
            HashSet<Character> rows = new HashSet<>();
            for(int j = 0 ; j<9 ; j++){
                if(board[i][j]=='.'){
                    continue;
                }
               if(rows.contains(board[i][j])){
                return false;
               } 
               rows.add(board[i][j]);
            }           
        }
        for(int i = 0 ; i<9 ; i++){
            HashSet<Character> cols = new HashSet<>();
            for(int j = 0 ; j<9 ; j++){
                if(board[j][i]=='.'){continue;}
                if(cols.contains(board[j][i])){return false;}
                cols.add(board[j][i]);
            }
        }
        // (row,i) i/3 = cube column
        // (i,col) i/3 = cube row
        // given (row,col) , row/3 = cube ka konsa row (0,1,2) , col/3 = cube ka konsa column (0,1,2).
        // (cube ka row * 3) + cube ka column = konsa cube (0,1,2,3,4,5,6,7,8)
        HashSet<Character>[] cube = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            cube[i] = new HashSet<>();
        }

        for(int i = 0 ; i<9 ; i++){
            for(int j = 0 ; j<9 ; j++){
                if(board[i][j]=='.'){
                    continue;
                }
                int cubeIndex = ((i/3)*3)+(j/3);
                if(cube[cubeIndex].contains(board[i][j])){
                    return false;
                }
                cube[cubeIndex].add(board[i][j]);
            }
        }
        return true;
    }
}
