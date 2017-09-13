void setup() {
  size(900,900);
}

float boardsize = 900;
int gridsize = 9;
float diameter = boardsize/gridsize;
void draw() {
    background(255);
    for(int i = 0; i<gridsize; i = i + 2){
    for(int j = 1; j<gridsize; j = j + 2){
      rect(i*(diameter), j*(diameter), diameter, diameter);
      rect(j*(diameter), i*(diameter), diameter, diameter);
      fill(255,0,0);
    } //<>//
  }

}
void mousePressed() {
  fill(0,0,0); 
  float x = diameter;
  float y = diameter;
  while (mouseX - x > 0){
    x = x + diameter;
  }
  while (mouseY - y > 0){
    y = y + diameter;
  }
  ellipse(x - diameter/2, y-diameter/2, diameter, diameter);
  
  /*for(int n = 1; n<gridsize; n++)
  for(int m = 1; n<gridsize; m++)
  if (mouseX - (n*diameter) <= 0 && mouseY - (m*diameter) <= 0){
  if ((n-1)*diameter < mouseX && mouseX < n*diameter && (m-1)*diameter < mouseY && mouseY < m*diameter ){
  ellipse(diameter/2 + (n-1)*diameter, (diameter/2 + (m-1)*diameter), diameter, diameter);
  }*/
  
}