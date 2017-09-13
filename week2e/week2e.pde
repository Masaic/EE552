void setup() {
  size(800,800);
}

float x = 0, y = 0, dx = 2.1, dy = 3.2;
void draw() {
  translate(width/2, height/2);
  scale(width/2, -height/2);
  strokeWeight(0);
  float lastT = -2*PI, lastX = cos(13*lastT), lastY = cos(15*lastT);
  for (float t = lastT; t < 2*PI; t += .01) {
    float x = cos(13*t);
    float y = cos(15*t);
    line(lastX, lastY, x, y);
    lastT = t;
    lastX = x;
    lastY = y;
  }
}