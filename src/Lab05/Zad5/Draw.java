package Lab05.Zad5;

public class Draw extends Decorator{

    public Draw(DrawInterface action, int x, int y) {
        super(action, x, y);
    }

    public String History(){
        String pointInfo =  "\nNext point("+this.startX+", "+this.startY+", "+this.endX+", "+this.endY+")";
        if(action.getInk() == 0) {
            return action.History() + ", " +pointInfo +" -> No ink!";
        } else if (action.getInk() < 30){
            return action.History() + ", " +pointInfo +" -> Low ink!";
        } else {
            return action.History() + ", " +pointInfo;
        }
    }

    public int calculateDistance(){
        return (int) Math.sqrt((endX-startX)*(endX-startX) + (endY-startY)*(endY-startY));
    }

    public double getInk(){
        int distance = calculateDistance();
        if(action.getInk() - distance < 0){
            return 0;
        } else {
            return action.getInk() - distance;
        }
    }
}
