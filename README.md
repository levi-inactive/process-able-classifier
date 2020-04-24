# process-able-classifier

An executable .jar file to classify network flows as normal or as attacks using Weka classifiers, to be used in an ONOS application. 

## Usage

**process-able-classifier** receives 41 arguments, all arguments are required.

*  **Argument 1:** *requested_classifier.* The name of 
* **Argument 2:** *classifier_absolute_path.* asdf
* **Argument 3 to 21:** arguments representing the 39 flow features used for classification, in order. All arguments need to be represented as integers. For a quick description of the features required for classification, see [flowtbag](https://github.com/DanielArndt/flowtbag/wiki/features).

*Note:* process-able-classifier is designed to be used programatically, flow features should be extracted via code. The following should be executed by code in a terminal as a single command, in a single line. Arguments are separated in multiple lines for ease of readibility in this documentation.

```bash
java -jar 
process-able-classifier.jar 
    requested_classifier 
    classifier_absolute_path 
    total_fpackets 
    total_fvolume 
    total_bpackets 
    total_bvolume 
    min_fpktl 
    mean_fpktl 
    max_fpktl 
    std_fpktl 
    min_bpktl 
    mean_bpktl 
    max_bpktl 
    std_bpktl 
    min_fiat 
    mean_fiat 
    max_fiat 
    std_fiat 
    min_biat 
    mean_biat 
    max_biat 
    std_biat 
    duration 
    min_active 
    mean_active 
    max_active 
    std_active 
    min_idle 
    mean_idle 
    max_idle 
    std_idle 
    sflow_fpackets 
    sflow_fbytes 
    sflow_bpackets 
    sflow_bbytes 
    fpsh_cnt 
    bpsh_cnt 
    furg_cnt 
    burg_cnt 
    total_fhlen 
    total_bhlen
```

### requested_classifier values

### classifier_absolute_path values

## Usage example

### Request String 

```bash
java -jar process-able-classifier.jar randomtree /models/randomTree.model 29 2478 76 51566 40 85 280 54 40 678 1500 686 0 0 5 0 0 0 5 0 5 5 5 5 0 0 0 0 0 29 2478 76 51566 17 32 0 0 1168 3056
```

## Response



## Error codes

### -1: Error
**process-able-classifier** was not able to load the model of the requested classifier.

### -400: Bad Request
**process-able-classifier** did not receive all 41 required arguments.

    
### -404: Not Found
**process-able-classifier** did not implement the requested classifier, or the *requested_classifier* string is invalid, see the **requested_classifier values** section in this document to see valid string values.

### -500: Internal Error
**process-able-classifier** could not parse the arguments representing the 39 flow features from string to integer values, as one or more of them are not integer-strings.

### -512: Classification Error
**process-able-classifier** failed to classify the flow instance. An exception was thrown by a *weka.classifiers.Classifier.classifyInstance()* method.

### -513: Buid Instance Failed
**process-able-classifier** failed to build an instance. An exception was thrown near a *buildInstance()* method in a *BinClassifier* object.