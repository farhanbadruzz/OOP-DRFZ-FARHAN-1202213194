public class Calculation implements Runnable{
    public double radius, side, area, phi=3.14d;

    public void setSquare(){
        if (side >= 1){
            this.area = side*side;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public double getSquare(){
        return this.area;
    }

    public void setCircle(){
        if (side >= 1){
            this.area = this.phi*this.radius*this.radius;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public double getCircle(){
        return this.area;
    }

    public void setTrapezoid(double a, double b, double t){
        if (a>1 || b>1){
            this.area = (a+b)*t;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public double getTrapezoid(){
        return this.area;
    }
    @Override
    public void run(){
        System.out.println("program will start in");
        for (int i = 3; i>0; i--){
            System.out.println(i);
        }
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}