package game;

public class Position {
    int row;
    int column;
    public Position(int row, int column){
         this.row=row;
         this.column=column;
    }
    protected int getRow(){
        return this.row;
    }

    protected int getColumn(){
        return this.column;
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}
