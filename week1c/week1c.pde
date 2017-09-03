
void setup() {
  size(800,800);
  fill(255,0,0);
}

float boardsize = 800;
int gridsize = 8;
void draw() {
  for(int i = 1; i<gridsize; i++){ 
  line(i*(boardsize/gridsize), 0, i*(boardsize/gridsize), boardsize);
  line(0, i*(boardsize/gridsize), boardsize, i*(boardsize/gridsize));
  }
}