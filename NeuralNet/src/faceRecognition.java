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



        Scanner imageScan = new Scanner ( new FileReader(args[0]) );
        Scanner facitScan = new Scanner (new FileReader(args[1]));

        neuralNet net = new neuralNet();
        net.setInputLevel(32);
        net.setOutput(32);

        ArrayList<int> image = new ArrayList<>();
        ArrayList<ArrayList> listOfImages = new ArrayList<>();

        //Makes a array with the training images.
        while(imageScan.hasNext()){
            imageScan.findInLine('Image');
            imageScan.nextLine();
            while(imageScan.hasNextInt()){
                image.add(imageScan.nextInt());
            }
            listOfImages.add(image);
        }
        ArrayList<int> facit = new ArrayList<>();

        //Makes a array with facit.
        int i = 0;
        while(facitScan.hasNext()){
            imageScan.findInLine('image' + i);
            facit.add(imageScan.nextInt());
        }


    }





}
