package vnreal.generators.topologies.transitstub.generators;

import java.util.Random;

import vnreal.generators.topologies.transitstub.graph.Edge;
import vnreal.generators.topologies.transitstub.graph.Graph;
import vnreal.generators.topologies.transitstub.graph.Vertex;


public class DebugGenerator extends AGenerator {

	@Override
	public Graph generate(int numVertices, Random random) {
		double[] xs = {0, 1, 1, 0};
		double[] ys = {0, 0, 1, 1};

		Graph result = new Graph();
		Vertex[] vertices = new Vertex[numVertices];

		for (int i = 0; i < numVertices; i++) {
			Vertex v = new Vertex();
			v.setXpos(xs[i % xs.length]);
			v.setYpos(ys[i % ys.length]);
			vertices[i] = v;
			result.addVertex(v);
			if (i > 0) {
				result.addEdge(new Edge(), v, vertices[i-1]);
			}
		}

		return result;
	}

}
