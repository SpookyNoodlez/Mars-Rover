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

                        }
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
