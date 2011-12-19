/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Arrays;
/**
 *
 * @author sys60jq
 */
 public class Cube {
        private Side cube[] = new Side[6];
        
        public Cube(){
            for(int i=0;i<6;i++){
                cube[i] = new Side(Global.colours[i]);
            }
        }
        
        public void printAllSides(){
            for(int i=0;i<6;i++){
                System.out.println(Arrays.toString(cube[i].getColourAll()));
            }
        }
        
        public void printPretty(){
            for(int i=0;i<3;i++){
                System.out.println(Arrays.toString(cube[4].getRow(i)));
            }
            for(int i=0;i<3;i++){
                System.out.format("%1$1s %2$18s %3$18s %4$18s \n",Arrays.toString(cube[0].getRow(i)), Arrays.toString(cube[1].getRow(i)), Arrays.toString(cube[2].getRow(i)), Arrays.toString(cube[3].getRow(i)));
            }
            for(int i=0;i<3;i++){
                System.out.println(Arrays.toString(cube[5].getRow(i)));
            }
        }
        /* First arg: 0=Column, 1=Row
         * Second arg: Which direction to move in clockwise/counterclockwise
         * Third arg: Which column/row to move (1,2,3) 
         */
/*        
        public void makeMove(int type, int whichSide, int whichCoRo, int direction){
            String[][] tmp = {{"","",""},{"","",""},{"","",""},{"","",""}};
            if (type){
               for (i=0;i<4;i++){
                   tmp[i] = side[i].getRow(whichCoRo)
               }
               for (i=0;i<4;i++){
                   side[i.serRow(whi)]
               }
                   
            }
        }
*/
         
    }
