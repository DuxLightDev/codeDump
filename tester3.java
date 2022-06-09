public class tester3 {
    public static void main(String[] args){
        char[][] twoDimensional = new char[9][9];
        for(int x = 0; x < 9; x++){
            for(int y = 0; y < 9; y++){
                twoDimensional[x][y] = '*';
            }
        }
        System.out.println("");
        for(int x = 0; x < 9; x++){
            for(int y = 0; y < 9; y++){
                System.out.print(twoDimensional[x][y]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        while(true){
            
        }
    }
}
