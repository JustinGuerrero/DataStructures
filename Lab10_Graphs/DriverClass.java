package Lab10_Graphs;

import java.io.File;

public class DriverClass {


    public static void main(String[] args) {
        File tinyG = new File((args[0]));
        In in = new In();
        In tinyReader = new In(tinyG);
        Graph graph = new Graph(tinyReader);
        System.out.println(graph.toString());
        Bipartite biPirate = new Bipartite(graph);
        System.out.println(biPirate.isBipartite());

        System.out.println("-------------------------------------------------");

        File mediumG = new File(args[1]);
        In mediumReader = new In(mediumG);
        Graph grap2 = new Graph(mediumReader);
        System.out.println(grap2.toString());
        Bipartite pirate = new Bipartite(grap2);
        System.out.println(biPirate.isBipartite());

    }

}
