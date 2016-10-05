/**
 * Created by Choffe on 2016-10-02.
 */
import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class faceRecognition{
    /* 1: Happy, 2: Sad, 3: Mischievous, 4: Mad. */

    public static void main(String[] args) throws IOException{



        Scanner training = new Scanner ( new FileReader(args[0]) );
        Scanner facit = new Scanner (new FileReader(args[1]));

        neuralNet net = new neuralNet();
        net.setInputLevel(32);
        net.setOutput(32);

        ArrayList<int> image = new ArrayList<>();
        ArrayList<ArrayList> listOfImages = new ArrayList<>();

        training.findInLine("Image1");
        while(training.hasNextInt()){
            image.add(training.nextInt());
        }
    }
}
