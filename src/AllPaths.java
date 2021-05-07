import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class AllPaths {

    //initializing Adjacency Matrix
    public int [][]adjacencyMatrix;
    public int vertices;


    //constructor
    public AllPaths(int vertices) {
        adjacencyMatrix = new int[vertices][vertices];
        this.vertices = vertices;
    }
    //adds edge in matrix
    public void addEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        //it is a DAG so the connection doesn't go both ways
    }
    //prints Adjacency Matrix
    public void printMatrix(){
        for (int i = 0; i < vertices; i++){
            for (int j = 0; j< vertices;j++){
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //attempting to use Depth First Search in order to find the rest of the path
    public void dfs (int source) {
        boolean [] visited = new boolean[vertices];
        dfs(source, visited);
    }

    void dfs(int v, boolean [] visited) {
        int row = 0;
        int col = 0;
        int dRow[] = new int[0];
        int dCol[] = new int[0];

        Stack s = new Stack();

        visited[v] = true;
        s.push(v);

        while(!s.empty()) {
            v = (int) s.pop();
        }
        int[] i = adjacencyMatrix[v];

//        for(int z = 0; z < 4; z++)
//        {
//            int adjx = row + dRow[z];
//            int adjy = col + dCol[z];
//            //s.push(new pair(adjx, adjy));
//        }

    }

    //check row 0: if any true values add 0 and index of true val(x) to [][]totalPaths.
    // then go to x and check if any of are true, if yea, add them...keeo doing this till end of row.

    public int [][]allPaths (int [][] graph){
        //ex: [ [1,2], [3], [3], [] ]

        int [][] totalPaths = new int[4][4];
        //   ideally: { [0,1,3]  [0,2,3] }

        int totalPathsCounter = 0;
        //look for any values that are true, if true add to path

        totalPaths[totalPathsCounter] = new int[graph.length];
        //add 0 to to totalpATH

        for (int rowCounter = 0; rowCounter < adjacencyMatrix.length; rowCounter++){

            for (int columnCounter = rowCounter + 1; columnCounter < adjacencyMatrix.length; columnCounter++) {

                //logic: if it equals 1 then its true so go to the row of that index (recursion??)
                if (adjacencyMatrix[rowCounter][columnCounter] == 1) {
                    dfs(columnCounter); //calling DFS to continue the path but doesn't work as planned
                    totalPaths[rowCounter][columnCounter] = columnCounter;


                }
            }
        }
        return totalPaths;
        //Idea/game plan:
        //1: use Adjacency Matrix to figure out paths and print all the possible ones. By establishing relationship
        // between noodes. This Matrix should show/give all possible paths


    }
    public static void main(String[] args) {

        int [][] input = { {1,2}, {3}, {3}, {} };

        AllPaths function = new AllPaths(input.length);
        //index = 0; //then increment

        //input[index,input[][] ]
        function.addEdge(0,input[0][0]);//adds 1

        function.addEdge(0,input[0][1]);//adds 2

        function.addEdge(1,input[1][0]); //adds 3

        function.addEdge(2,input[2][0]); //adds 3

        function.printMatrix();

        System.out.println(Arrays.deepToString(function.allPaths(input)));
    }


}


