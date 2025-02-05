public class Triangolo extends Thread{
    double base;
    double altezza;
    double perimetro;
    double area;
    int id;

    // Creo il costruttore
    public Triangolo(int x, double y, double z){
        this.id = x;
        this.base = y;
        this.altezza = z;
        this.area = (base*altezza)/2;
        this.perimetro = base*3;
    }

    public void run(){
        System.out.println(id + " * " + area + " * "+ perimetro);
    }

    public static void main(String[] args) {
        Triangolo triangolo1 = new Triangolo(1, 5, 7);
        Triangolo triangolo2 = new Triangolo(2, 6, 8);
        Triangolo triangolo3 = new Triangolo(3, 7, 9);
        triangolo1.start();
        triangolo2.start();
        triangolo3.start();

        if (triangolo1.area>triangolo2.area){
            if (triangolo1.area>triangolo3.area){
                System.out.println("L'area maggiore è del triangolo: "+triangolo1.id);
            }
            else{
                System.out.println("L'area maggiore è del triangolo: "+triangolo3.id);
            }
        }else{
            if(triangolo2.area>triangolo3.area){
                System.out.println("L'area maggiore è del triangolo: "+triangolo2.id);
            }
            else{
                System.out.println("L'area maggiore è del triangolo: "+triangolo3.id);
            }
        }
    }

}
