package vnreal.generators.demands;

import java.util.ArrayList;
import java.util.Random;

import tests.generators.GeneratorParameter;
import vnreal.constraints.demands.CpuDemand;
import vnreal.core.oldFramework.ConversionHelper;
import vnreal.network.NetworkStack;
import vnreal.network.virtual.VirtualNetwork;
import vnreal.network.virtual.VirtualNode;

/**
 * This Resource generator generating {@link CpuDemand} is using a random generator 
 *  
 * @author Fabian Kokot
 *
 */
@GeneratorParameter(
		parameters = { "Networks:Networks", "TR:Min_CPU_Dem", "TR:Max_CPU_Dem"}
		)
public class RandomCpuDemandGenerator extends AbstractDemandGenerator<Integer> {

	@Override
	public Integer generate(ArrayList<Object> parameters) {
		NetworkStack ns = (NetworkStack)parameters.get(0);
		Integer minCPU = ConversionHelper.paramObjectToInteger(parameters.get(1));
		Integer maxCPU = ConversionHelper.paramObjectToInteger(parameters.get(2));
		
		Random random = new Random();
		
		
		for(int u = 1; u < ns.size(); u++) {
			
			VirtualNetwork vNetwork = (VirtualNetwork)ns.getLayer(u);
		
			for(VirtualNode n : vNetwork.getVertices()) {
				CpuDemand cpu = new CpuDemand(n);
				int value = (int) (minCPU + (maxCPU
						- minCPU + 1)
						* random.nextDouble());
				cpu.setDemandedCycles((double) value);
				n.add(cpu);
			}
		}
		
		return 0;
	}

	@Override
	public void reset() {
		
	}

}
