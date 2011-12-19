/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
/**
 *
 * @author sys60jq
 */
 public class Side {
        private Square side[] = new Square[9];
        
        public Side(String startingColour) {
            for(int i=0; i<9;i++){
                side[i] = new Square(startingColour);
            }
        }
        
        public void setColourAll(String setColour){
            for(int i=0; i<9;i++){
                side[i].setColour(setColour);
            }
        }
        
        public String[] getColourAll(){
            String[] tmp = {"","","","","","","","",""};
            for(int i=0; i<9;i++){
               tmp[i] = side[i].getColour();
            }
            return tmp;
        }
        
        public String[] getColumn(int column){
            String[] tmp = {"","",""};
            for(int i=0; i<3;i++){
               tmp[i] = side[i+3*(column-1)].getColour();
            }
            return tmp;
        }
        
        public String[] getRow(int row){
            String[] tmp = {"","",""};
                for(int i=0; i<3;i++){
                    tmp[i] = side[i*row].getColour();
            }
            return tmp;
        }
        
        public void setColumn(int columnNum, String[] newColumn){
            for(int i=0; i<3;i++){
               side[i+3*(columnNum-1)].setColour(newColumn[i]);
            }
            return;
        }
        
        public void setRow(int rowNum, String[] newRow){
            for(int i=0; i<3;i++){
               side[i*rowNum].setColour(newRow[i]);
            }
            return;
        }
        public void rotate(int direction){
            
        }
    }