public class AllPaths {

    //initializing Adjacency Matrix
    public class Graph <T> {

        private boolean [][]adjacencyMatrix;

        public Graph (int vertices) {
            adjacencyMatrix = new boolean[vertices][vertices];
        }

    }
    public int [][]allPaths (int [][]graph){
        //ex: [ [1,2], [3], [3], [] ]

        //graph[index][data] =

        //thinking: initialize all slots in matrix to 0? or -1 then when I use the in put those with a connection will
        // turn into 1






            //Idea/game plan:
            //1: use Adjacency Matrix to figure out paths and print all the possible ones. By establishing relationship
            // between noodes. This Matrix should show/give all possible paths

            //      --> note: if I do this one I need a better understanding of whats gonna print out from
            //          the matrix + how to access the connections or paths(maybe start at beginning and add
            //          the next "connected" element to a new array matrix that I will return that will contain
            //          all the paths)





            //returns a two-dimensional  array with all possible paths from vertex 0 to vertex n-1.
            return graph;
    }


}


//Ask about github not updating repo:
//
// this is what was said in my terminal:
// git@github.com: Permission denied (publickey).
//fatal: Could not read from remote repository.
//
//Please make sure you have the correct access rights
//and the repository exists.


//2: the long way of adding the index to the front of a new array with the o.g array elements
//      -->Based on a pattern I'm seeing with the nodes/paths
//      --> Don't know if its really showing my knowledge of graphs tho...

