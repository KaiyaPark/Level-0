void setup(){
  size(500, 500);
  background(170, 255, 255); 

}

void draw(){
  for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(50),getWormY(50),10,10); 
}
makeMagical();
  for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(51),getWormY(51),10,10); 
}
makeMagical();  
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(52),getWormY(52),10,10); 
}
makeMagical();  
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(53),getWormY(53),10,10); 
}
makeMagical();  
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(54),getWormY(54),10,10); 
}
makeMagical();
 for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(55),getWormY(55),10,10); 
}
makeMagical(); 
  for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(56),getWormY(56),10,10); 
}
makeMagical();  
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(57),getWormY(57),10,10); 
}
makeMagical();  
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(58),getWormY(58),10,10); 
}
makeMagical();  
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(59),getWormY(59),10,10); 
}
makeMagical();  
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(60),getWormY(60),10,10); 
}
makeMagical();  
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(61),getWormY(61),10,10); 
}
makeMagical();  
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(62),getWormY(62),10,10); 
}
makeMagical();  
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(63),getWormY(63),10,10); 
}
makeMagical();
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(64),getWormY(64),10,10); 
}
makeMagical(); 
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(65),getWormY(65),10,10); 
}
makeMagical();  
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(66),getWormY(66),10,10); 
}
makeMagical(); 
for(int i = 0; i<50; i++){
  fill(i*3, i*6, i*6);
  ellipse(getWormX(67),getWormY(67),10,10); 
}
makeMagical();
}

float frequency = .001;
float noiseInterval = PI; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}



