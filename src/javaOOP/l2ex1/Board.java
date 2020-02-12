package javaOOP.l2ex1;

public class Board {

    Shape[] cellOfBoard = new Shape[4];

    public void addShapeInCell(int i, Shape shape) {
        if (shape != null && cellOfBoard[i] == null) {
            cellOfBoard[i] = shape;
          }
       
     }







}
