package vnreal.generators.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import tests.generators.GeneratorParameter;
import vnreal.constraints.resources.BandwidthResource;
import vnreal.core.oldFramework.ConversionHelper;
import vnreal.network.NetworkStack;
import vnreal.network.substrate.SubstrateLink;
import vnreal.network.substrate.SubstrateNetwork;

/**
 * This generator generates {@link BandwidthResource} based on a random generator with a given seed
 * 
 * @author Fabian Kokot
 *
 */
@GeneratorParameter(
		parameters = { "Networks:Networks", "TR:Min_BW_Res", "TR:Max_BW_Res", "Seed:Seed" }
		)
public class FixedBandwidthResourceGenerator extends AbstractResourceGenerator<List<BandwidthResource>> {

	@Override
	public List<BandwidthResource> generate(ArrayList<Object> parameters) {
		ArrayList<BandwidthResource> resList = new ArrayList<BandwidthResource>();
		
		NetworkStack ns = (NetworkStack)parameters.get(0);
		Integer minBW = ConversionHelper.paramObjectToInteger(parameters.get(1));
		Integer maxBW = ConversionHelper.paramObjectToInteger(parameters.get(2));
		Long seed = ConversionHelper.paramObjectToLong(parameters.get(3)); 
		
		Random random = new Random();
		random.setSeed(seed);
		
		SubstrateNetwork sNet = ns.getSubstrate();
		
		for (SubstrateLink l : sNet.getEdges()) {
			BandwidthResource bw = new BandwidthResource(l);
                        int value = (int) (minBW + random.nextInt(maxBW - minBW + 1));
			bw.setBandwidth((double) value);
			l.add(bw);
			resList.add(bw);
		}
		
		return resList;
	}

	@Override
	public void reset() {
	}

}
