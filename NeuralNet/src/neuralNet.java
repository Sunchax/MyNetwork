import java.util.ArrayList;
import java.util.Scanner;
import java.lang.System;

/**
 * Created by Choffe on 2016-09-26.
 */
public class neuralNet {
    ArrayList<neuron> input = new ArrayList<>();
    ArrayList<neuron> hidden = new ArrayList<>();
    ArrayList<neuron> output = new ArrayList<>();
    ArrayList<edge> leftEdges = new ArrayList<>();
    ArrayList<edge> rightEdges = new ArrayList<>();
    int weight = 1;

    public neuralNet() {
    }

    public neuralNet(){
    }
    public void setInputLevel(int nrOfNeurons) {
        for (int i = 0; i < nrOfNeurons; i++) {
            neuron n = new neuron();
            input.add(n);
        }
    }

    public void setHiddenLevel(int nrOfNeurons) {
        for (int i = 0; i < nrOfNeurons; i++) {
            neuron n = new neuron();
            hidden.add(n);
        }
    }

    public void setOutput(int nrOfNeurons) {
        for (int i = 0; i < nrOfNeurons; i++) {
            neuron n = new neuron();
            output.add(n);
        }
    }

    public void setUpNetwork() {
        for (neuron n : input) {
            for (neuron n2 : hidden) {
                edge e = new edge(n, n2, this.weight);
                leftEdges.add(e);

            }
        }

        for (neuron n3 : hidden) {
            for (neuron n4 : output) {
                edge e2 = new edge(n3, n4, this.weight);
                rightEdges.add(e2);
            }
        }
    }

    public void setUpNoHidNet(){
        for(neuron n : input) {
            for( neuron n2 : output){
                edge e = new edge(n, n2, this.weight);
                leftEdges.add(e);
            }
        }
    }


    public void propegateFirst(){
        for(edge e: leftEdges){
            e.propegate();
        }
    /*    for(edge e2: rightEdges){
            e2.propegate();
        }*/
    }

    public int getResult(){
        int value = 0;
        int i = 1;
        int j = 0;
        for(neuron e: output){
            if(value < e.getValue()){
                j = i;
            }
            i++;
        }
        return j;
    }

}



