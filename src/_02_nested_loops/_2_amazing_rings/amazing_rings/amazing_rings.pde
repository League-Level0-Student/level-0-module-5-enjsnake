
  /*** Go to the recipe to run the demonstration before starting this program ***/
 int x=250;
  int speed=1;
  int rightX=550;
  int rightSpeed=-1;
void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(800,800);
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();
}

void draw() {
  background(150,150,150);
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          
        for(int i=0; i<500; i=i+10){
        ellipse(x,250,i,i);

        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
        }
        x=x+speed;
        
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
        if(x> 800){
          
          speed=-speed;
        }
        /*When the rings reach the left side of the sketch, reverse the direction again */
        if(x<0){
          speed=-speed;
        }
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        for(int j=0; j<500; j=j+10){
        ellipse(rightX,250,j,j);
        }
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        rightX=rightX+rightSpeed;
        
        
        if(rightX<0){
          rightSpeed=-rightSpeed;
        }
        if(rightX>800){
          rightSpeed=-rightSpeed;
        }
        delay(50);
}
