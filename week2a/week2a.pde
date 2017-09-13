PShape earth;
PShape moon;
void setup() {
  size(1000,1000, P3D);
  noStroke();
  earth = createShape(SPHERE, 100);
  moon = createShape(SPHERE,50);
  PImage img = loadImage("earthmap1k.jpg");
  PImage img2 = loadImage("moon.jpg");
  earth.setTexture(img);
  moon.setTexture(img2);
}

float ang = 0;
float ang2 = 0;
float ang3 = 0;
float earthrotationspeed = 0.1;
float moonrevolutionspeed = earthrotationspeed/28.5;
float moonrotationspeed = moonrevolutionspeed;
void draw() {
  background(0);
  translate(width/2,height/2,-400);
  
  pushMatrix();
  rotateZ(23.5*PI/180);
  rotateY(ang);
  shape(earth);
  ang += earthrotationspeed;
  popMatrix();
  
  pushMatrix();
  rotateZ(-5.14*PI/180);
  rotateY(ang2);
  translate(400,0,0);
  rotateY(-ang2);//unrotate 
  rotateZ(5.14*PI/180);//unrotate 
  rotateZ(6.68*PI/180);
  rotateY(ang3);
  shape(moon);
  ang2 += moonrevolutionspeed;
  ang3 += moonrotationspeed;
  popMatrix();
  


  // to place body anywhere...
  
  // 1. rotate to angle in orbit
  // 2. translate on x
  // 3. unrotate by same angle (leaves the body with original orientation)
   // you may leave off step 3 for moon 
  
}