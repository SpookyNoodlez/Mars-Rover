public class Rover {

    private int x, y;

    public final int N = 0, E = 1, S = 2, W = 3;
    private int facing;

    Rover(int initialDirection, int initialX, int initialY){
        facing = initialDirection;
        x = initialX;
        y = initialY;
    }

    public void move(String command){
        for (int i=0;i<command.length();i++){
            char currentCommand = command.charAt(i);
            switch (currentCommand){
                //Go forward
                case 'f':
                    if (facing == N){
                        if (y != 5){
                            y++;
                        }
                        else{
                            y=1;
                        }
                    }
                    else if (facing == S){
                        if (y != 1){
                            y--;
                        }
                        else{
                            y=5;
                        }
                    }
                    else if (facing == E){
                        if (x != 5){
                            x++;
                        }
                        else{
                            x=1;
                        }
                    }
                    else{
                        if (x != 1){
                            x--;
                        }
                        else{
                            x=5;
                        }
                    }
                    break;
                //Go backwards
                case 'b':
                    if (facing == S){
                        if (y != 5){
                            y++;
                        }
                        else{
                            y=1;
                        }
                    }
                    else if (facing == N){
                        if (y != 1){
                            y--;
                        }
                        else{
                            y=5;
                        }
                    }
                    else if (facing == W){
                        if (x != 5){
                            x++;
                        }
                        else{
                            x=1;
                        }
                    }
                    else{
                        if (x != 1){
                            x--;
                        }
                        else{
                            x=5;
                        }
                    }
                    break;
                //Turn left
                case 'l':
                    if (facing == 0){
                        facing = 3;
                    }
                    else{
                        facing--;
                    }
                    break;
                //Turn left
                case 'r':
                    if (facing == 3){
                        facing = 0;
                    }
                    else{
                        facing++;
                    }
                    break;
                default:
                    try {
                        throw new Exception("Rover orientation broken");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        }

    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getFacing(){
        return facing;
    }
}
