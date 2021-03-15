package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import ddf.minim.analysis.FFT;
import processing.core.PApplet;

public class Audio2 extends PApplet {

    Minim minim;
    //AudioPlayer ai;
    AudioPlayer ap;
    AudioBuffer ab;
    AudioInput ai;

    FFT fft;
    public void settings() {
        //size(512, 512, P3D);
        size(512, 512);
        //fullScreen(P3D, SPAN); // Try this for full screen multiple monitor support :-) Be careful of exceptions!
    }

    float y = 200;
    float lerpedY = y;

    int which = 0;

    public void setup() {         
        colorMode(HSB);

        minim = new Minim(this);
        //ap = minim.loadFile("heroplanet.mp3", width);
        ap = minim.loadFile("scale.wav", width);
        //ai = minim.getLineIn(Minim.MONO,width, 44100, 16);
        ab = ap.mix;
        //ab = ai.mix;

        fft = new FFT(width,44100);
    }

    public void keyPressed() {
        if (keyCode >= '0' && keyCode <= '5') {
            which = keyCode - '0';
        }
        if (keyCode == ' ') {
            if (ap.isPlaying()) {
                ap.pause();
            } else {
                ap.rewind();
                ap.play();
            }
        }
    }

    float lerpedAverage = 0;

    public void draw() {
        background(0);
        stroke(255);

        float halfHeight = height /2;

        for (int i = 0 ; i < ab.size() ; i++)
        {
            stroke(map(i,0,ab.size(),0,255),255,255);
            line( i, halfHeight - (ab.get(i) * halfHeight), i, halfHeight + (ab.get(i) * halfHeight));
        }

        //fft lines - take a bit of audio to analysis, to chop off end and start
        fft.window(FFT.HAMMING);
        fft.forward(ab);

        int highestBand = 0; //calculate the band with the highest band
        for(int i = 0 ; i < fft.specSize(); i++)
        {
            stroke(map(i,0,fft.specSize(),0,255),255,255);
            line(i, height , i , height - fft.getBand(i) * halfHeight);
            if ( fft.getBand(i) > fft.getBand(highestBand))
            {
                highestBand = i;
            }
        }
        
        float freq = fft.indexToFreq(highestBand);
        textSize(20);
        fill(225);
        text("Frequency: " + freq, 10 ,50);
    }
}