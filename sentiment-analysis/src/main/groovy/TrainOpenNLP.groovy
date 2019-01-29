#!/usr/bin/env groovy

@Grab('org.apache.opennlp:opennlp-tools:1.9.1')
import opennlp.tools.doccat.DoccatModel;
import opennlp.tools.doccat.DocumentCategorizerME;
import opennlp.tools.doccat.DocumentSampleStream;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.PlainTextByLineStream;

// Which folder to process?
File folder = new File("processed_acl")
if (args.length > 0) folder = new File(args[0])
if (! folder.exists()) {
   println "Error - training data not found in ${folder}"
   println "Please download and unpack"
   println "  http://www.cs.jhu.edu/~mdredze/datasets/sentiment/processed_acl.tar.gz"
}
println "Building training data from ${folder}"

// TODO
