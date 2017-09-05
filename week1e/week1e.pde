void setup() {
  size(800,800);
  fill(255,0,0);
}

void draw() {
  int times = 20;
  int x = width/2;
  int y = height/2;
  strokeWeight(2);
  for (int i = 1,j = 2; i < times; i = i + 2,j = j + 2){
    line(x, y, x + i*(width/times), y);
    x = x + i*(width/times);
    line(x, y, x, y + i*(height/times));
    y = y + i*(height/times);
    line(x, y, x - j*(width/times), y);
    x = x - j*(width/times);
    line(x, y, x, y-j*(height/times));
    y = y - j*(height/times);   
  }
}