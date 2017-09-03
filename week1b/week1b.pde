void setup() {
  size(600,600);
  fill(255,0,0);
}

int x = 15;
int y = 15;
void draw() {
  background(0,0,255);
  ellipse(x,y,30,30);
  if (x <= 585 && y == 15) {
    x++;
  }
  if (x == 585 && y >= 15) {
    y++;
  }
  if (y == 585 && x >= 15) {
    x--;
  }
  if (x == 15 && y >= 15) {
    y--;
  }
}