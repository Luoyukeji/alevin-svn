//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.03 at 09:55:31 AM CEST 
//


package vnreal.io.experiment;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the vnreal.io.experiment package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: vnreal.io.experiment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Experiment }
     * 
     */
    public Experiment createExperiment() {
        return new Experiment();
    }

    /**
     * Create an instance of {@link Experiment.Generators }
     * 
     */
    public Experiment.Generators createExperimentGenerators() {
        return new Experiment.Generators();
    }

    /**
     * Create an instance of {@link AlgorithmType }
     * 
     */
    public AlgorithmType createAlgorithmType() {
        return new AlgorithmType();
    }

    /**
     * Create an instance of {@link Experiment.Evaluation }
     * 
     */
    public Experiment.Evaluation createExperimentEvaluation() {
        return new Experiment.Evaluation();
    }

    /**
     * Create an instance of {@link Experiment.Exporters }
     * 
     */
    public Experiment.Exporters createExperimentExporters() {
        return new Experiment.Exporters();
    }

    /**
     * Create an instance of {@link ExporterType }
     * 
     */
    public ExporterType createExporterType() {
        return new ExporterType();
    }

    /**
     * Create an instance of {@link RNGType }
     * 
     */
    public RNGType createRNGType() {
        return new RNGType();
    }

    /**
     * Create an instance of {@link ParamType }
     * 
     */
    public ParamType createParamType() {
        return new ParamType();
    }

    /**
     * Create an instance of {@link GeneratorElementType }
     * 
     */
    public GeneratorElementType createGeneratorElementType() {
        return new GeneratorElementType();
    }

    /**
     * Create an instance of {@link MetricType }
     * 
     */
    public MetricType createMetricType() {
        return new MetricType();
    }

}