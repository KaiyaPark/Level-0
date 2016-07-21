void setup(){
size(750,750);
setScreen();
}

void draw(){

}
void keyPressed(){
   int d = (int)random(50);
  for(int i = 0; i<d; i++){
   drawBlue(); 
  } 
  int g = (int)random(50);
  for(int i = 0; i<g; i++){
   drawYellow(); 
  } 
  if(keyCode==LEFT){
   if(d>g){
    text("Correct", 375,375); 
    setScreen ();
   }
   else{
    text("Wrong!", 375,375);
   setScreen () ;
   }
  }
  if(keyCode==RIGHT){
   if(d<g){
    text("Correct", 375,375);
   setScreen () ;
   }
   else{
    text("Wrong!", 375,375); 
    setScreen ();
   }
  }
}
void drawBlue (){
  int c = (int)random(375);
  int b = (int)random(750);
  int a = (int)random(50);
  fill(38,177,250);
  ellipse(c,b,10,10);
}

void setScreen (){
 size(750,750);
 background(255, 255, 255);
}

void drawYellow (){
  int c = (int)random(375)+375;
  int b = (int)random(750);
  int a = (int)random(50);
  fill(254,255,46);
  ellipse(c,b,10,10);
}
