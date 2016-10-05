import java.util.ArrayList;

/**
 * Created by Choffe on 2016-09-26.
 */
public class neuron {
    int threshold = 15;
    int value;

    public neuron(){

    }
    public neuron(int treshold) {
        this.threshold = treshold;
    }

    public int getValue() {
        return this.value;
    }

    public void input(int value){
        this.value = this.value + value;
    }

    public boolean fired(){
        if( value >= threshold){
            this.value = 0;
            return true;
        }else{
            return false;
        }

    }

}

