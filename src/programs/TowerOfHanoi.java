package programs;

public class TowerOfHanoi {

    public static void main(String[] args) {
        int t = 3; // Number of towers
        int n = 2; // Number of disks
        int s = 1; // Source tower where all disks are present
        int d = 3; // Destination tower where all disks can end

        int[][] result = solve(t, n, s, d);

        System.out.println("Moves:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " -> " + result[i][1]);
        }
    }

    public static int[][] solve(int t, int n, int s, int d) {
        int numMoves = (int) Math.pow(2, n) - 1;
        int[][] moves = new int[numMoves][2];
        int[] index = {0}; // Using an array to act as a reference variable

        moveDisks(n, s, d, t, moves, index);

        return moves;
    }

    private static void moveDisks(int n, int source, int destination, int towers, int[][] moves, int[] index) {
        if (n == 1) {
            moves[index[0]][0] = source;
            moves[index[0]][1] = destination;
            index[0]++;
            return;
        }

        int auxiliary = 0;
        for (int i = 1; i <= towers; i++) {
            if (i != source && i != destination) {
                auxiliary = i;
                break;
            }
        }

        moveDisks(n - 1, source, auxiliary, towers, moves, index);
        moves[index[0]][0] = source;
        moves[index[0]][1] = destination;
        index[0]++;
        moveDisks(n - 1, auxiliary, destination, towers, moves, index);
    }
}

