/**
 * Created by Choffe on 2016-09-26.
 */


public class edge {
    int weight;
    neuron n1;
    neuron n2;

    public edge(neuron n1, neuron n2, int weight){
        this.weight = weight;
        this.n1 = n1;
        this.n2 = n2;
    }

    public void propegate(){
        if(n1.fired()){
            n2.input(weight * n1.getValue());
        }
    }



}
