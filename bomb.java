import java.util.Random;

public class bomb {
    public static void main(String[] args){
        Random rand = new Random();
        int[][] grid = new int[5][5];

        for(int i = 0; i < 5; i++){
            int x = rand.nextInt(5);
            int y = rand.nextInt(5);

            grid[x][y] = 1;
        }

        for(int i = 0; i < grid.length; i++){
            for(int a = 0; a < grid[i].length; a++){
                System.out.print(grid[i][a] + "\t");
            }
            System.out.println("\n");
        }

    }
}