import  java.io.*;
  /*
  CSCE 111
  base file by Robert Lightfoot
  Writing file example, in a method.
  Creating ppm File output.ppm
  view at http://web.eecs.utk.edu/~smarz1/pgmview/ or
  other PPM viewers
  Fall 2020
  */
class pic  {
  public static void main(String[] args) {
    //set the size of your square.
    //You can use user input, but validate that it is between 300 and 600.
    int mySize = 300;
    //build 3 parallel arrays. You can rename them if you want.
    int[][] red = new int[mySize][mySize];
    int[][] green = new int[mySize][mySize];
    int[][] blue = new int[mySize][mySize];
    //and idea for createing colors  - Maroon
    int maroonR = 88;
    int maroonG = 0;
    int maroonB = 0;
    // and here is White.
    int whiteR = 255;
    int whiteG = 255;
    int whiteB = 255;
    // by me, burnt orange, since im gonna make it look like the maroon is surrouding the colors of UT or something
    int orgR = 204;
    int orgG = 85;
    int orgB = 0;


    // Fill the arrays using loops, equations,
    // user input for color choices (validate data if you do this)
    // or use methods to do this.
    // Hint, fill with one color, then overwrite certian areas with
    // another color.
    for(int r = 0; r < mySize; ++r) //goes through rows
    {
      for(int c = 0; c < mySize; ++c) //goes through columns
      {//colors all of it white, which is a good base color and one of the colors i'll finish with anyway
        red[r][c] = whiteR;
        green[r][c] = whiteG;
        blue[r][c] = whiteB;
      }
    }
    for(int r = 0; r < mySize; ++r) //goes through rows
    {
      for(int c = 0; c < mySize; ++c) //goes through columns
      {
        if((c < 50) || (c > 250))
        {
          red[r][c] = maroonR;
          green[r][c] = maroonG;
          blue[r][c] = maroonB;
        }
        if((r < 50) || (r > 250))
        {
          red[r][c] = maroonR;
          green[r][c] = maroonG;
          blue[r][c] = maroonB;
        }
        if(((c > 50)&&(c < 250))&&((r > 50)&&(r < 250)))
        {
          if(c%5!=0)
          { //sets up the burnt orange color of UT to be surrounded by Aggie maroon, and they're boxed in
            red[r][c] = orgR;
            green[r][c] = orgG;
            blue[r][c] = orgB;
          }
        }

      }

    }



    // when arrays are filled, send them to writeFile
    writeFile(red, green, blue);
  }//end main


/**
 * Given 3 parallel arrays, Writefile will write an output
 * file in PPM format that can be viewed with a ppm viewer.
 * All 3 arrays must be the same size.
 * @param r 2 dimentional array of integers from 0 - 255
 * @param g 2 dimentional array of integers from 0 - 255
 * @param b 2 dimentional array of integers from 0 - 255
 * you do not need to edit this method
 */
  		public static void writeFile(int[][] r, int[][] g, int[][] b) {
        //the output will be based on the array size sent.
        int size = r.length;
        //pixel will store the color to be output to the file.
        String pixel;
        try {
          //open a file in the current directory. will overwrite
          //previous versions.
          File output = new File("output.ppm");
          FileWriter fw = new FileWriter(output);
          //create the header of PPM files.
          fw.write("P3\n"+ size + " " + size +"\n255\n");
          //write out all pixels from the RGB arrays.
          for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
              pixel = String.format("%d %d %d ",r[i][j], g[i][j], b[i][j]);
              fw.write(pixel);
            }//end for j
          }//end for i
          fw.close();
        } catch(Exception e) {
          System.out.println("Error writing file.");
        }//end try catch

  	} // end writeFile2
  }  // end class
