void setup() {
  size(900,900);
  fill(255,0,0);
}

float boardsize = 900;
int gridsize = 9;
void draw() {
  for(int i = 1; i<gridsize; i = i + 2){
    for(int j = 0; j<gridsize; j = j + 2){
      rect(i*(boardsize/gridsize), j*(boardsize/gridsize), boardsize/gridsize, boardsize/gridsize);
    }
  }
  for(int i = 0; i<gridsize; i = i + 2){
    for(int j = 1; j<gridsize; j = j + 2){
      rect(i*(boardsize/gridsize), j*(boardsize/gridsize), boardsize/gridsize, boardsize/gridsize);
    }
  }
}