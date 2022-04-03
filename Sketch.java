import processing.core.PApplet;

public class Sketch extends PApplet {
	/**
  * A program that draws different patterns of squares in 8 sections
  * @author: Ethan Rodrigues
  */
  public void settings() {
    size(1200, 600);
  }

  public void setup() {
    background(45, 150, 207);
  }

  public void draw() {
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }
  
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  // draws the bottom left section (section 1)
  public void draw_section1(){
    int intX = 0;
    int intY = 0;
    // loop for location of squares in section 1
    for(int intRow = 0; intRow < 300; intRow+=10){
      for(int intColumn = 0; intColumn < 300; intColumn+=10){
        intX = 3 + intRow; 
        intY = 300 + 3 + intColumn; 

        // drawing for squares in section 1
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

 /**
 * Use the modulus operator and an if statement to select the color
 * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
 */
 public void draw_section2(){
  // declare variables
  int intX = 0;
  int intY = 0;
  int intColor;

  // loop for location of squares in section 2
  for(int intRow = 0; intRow < 300; intRow += 10){
    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      intX = 300 + intRow + 3;
      intY = 300 + intColumn + 3;

      //  color for squares in section 2
      if((intRow / 2) % 2 == 0){
        intColor = 0;
      }
      else{
        intColor = 255;
      }

      // drawing for squares in section 2
      noStroke();
      fill(intColor);
      rect(intX, intY, 5, 5);
     } 
   }
 }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    // declare variables
    int intX = 0;
    int intY = 0;
    int intColor;

    // loop for location of squares in section 3
    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 600 + 3 + intRow;
        intY = 300 + 3 + intColumn;

        // color for squares in section 3
        if((intColumn / 2) % 2 != 0){
          intColor = 255;
        }
        else{
          intColor = 0;
        }

        // drawing for squares in section 3
        noStroke();
        fill(intColor);
        rect(intX, intY, 5, 5);
      } 
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    // declare variables
    int intX = 0;
    int intY = 0;
    int intColor;

    //  loop for location of squares in section 4
   for(int intRow = 0; intRow < 300; intRow += 10){
    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      intX = 900 + 3 + intRow;
      intY = 300 + 3 + intColumn;

      // color for squares in section 4
      if((intColumn / 2) % 2 != 0 && (intRow / 2) % 2 == 0){
        intColor = 255;
      }
      else{
        intColor = 0;
      }

      // drawing for squares in section 4
      noStroke();
      fill(intColor);
      rect(intX, intY, 5, 5);
      } 
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    // declare variables
    int intX = 0;
    int intY = 0;

    // loop for location of squares in section 5
    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      for(int intRow = 300 - intColumn; intRow < 300; intRow += 10){
        intX = 3 + intRow;
        intY = 3 + intColumn;

        // drawing for squares in section 5
        noStroke();
        fill(255);
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section6(){
    // declare variables
    int intX = 0;
    int intY = 0;

    // loop for location of squares in section 6
    for(int intRow = 290; intRow >= 0; intRow -= 10){
      for(int intColumn = 290; intColumn >= intRow; intColumn -= 10){
        intX = 300 + 3 + intRow;
        intY = 3 + intColumn;

        // drawing for squares in section 6
        noStroke();
        fill(255);
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section7(){
   // declare variables
   int intX = 0;
    int intY = 0;

    // loop for location of squares in section 7
    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      for(int intRow = 290 - intColumn; intRow >= 0; intRow -= 10){
        intX = 600 + 3 + intRow;
        intY = 3 + intColumn;

        // drawing for squares in section 7
        noStroke();
        fill(255);
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  public void draw_section8(){
    // declare variables
    int intX = 0;
    int intY = 0;

    // loop for location of squares in section 8
    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn <= intRow; intColumn += 10){
        intX = 900 + 3 + intRow;
        intY = 3 + intColumn;

        // drawing for squares in section 8
        noStroke();
        fill(255);
        rect(intX, intY, 5, 5);
      }
    }
  }
}
