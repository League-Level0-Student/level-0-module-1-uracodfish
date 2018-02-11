import ddf.minim.*;
Minim minim;    
AudioPlayer sound; 

void draw(){
 if(mousePressed){
   sound.play();
  PImage kitten = loadImage("kitten.gif");
  image(kitten, mouseX, mouseY);
}}
void setup(){
  minim = new Minim(this);   
size(1000, 1000);
 sound = minim.loadFile("creepy.mp3");
int red = 255;
int green = 0;
int blue = 0;
fill(red, green, blue);
ellipse(500, 500, 500, 500);

}