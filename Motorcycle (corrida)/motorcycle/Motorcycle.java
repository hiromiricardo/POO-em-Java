package motorcycle;

public class Motorcycle {

    private int speed;
    private int gear;
    private int id;
    private float distancia;
    private static int numberOfMotorcycles = 1000;
    public String posicao;
    
    public Motorcycle(){
        this.speed = 0;
        this.gear = 0;
        this.distancia = 0;
        id = ++numberOfMotorcycles;
    }
        
    public Motorcycle(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
        id = ++numberOfMotorcycles;
    }
    
    public int getID(){
        return id;
    }
    
    public int getSpeed(){
        return speed;
    }

    public int getGear(){
        return gear;
    }
    
    public float getDist() {
    	return distancia;
    }
    
    public void SpeedUp(int aceleracao){
    	if(speed + aceleracao > 299){
        	speed = 299;
        	System.out.println("Velocidade maxima atingida!\n");
        }else {
        	speed += aceleracao;
        }
        gearUp(speed);
        Distancia(speed);
    }
    
    public void gearUp(int quantidade_a_aumentar){
        gear = (speed/50)+1;
    }
    
    public void Distancia(int quantidade_a_aumentar){
    	distancia += (speed * (1/3.6) *2);
    }
    
    public void applyBreaks(){
        speed--;
    }
    
}
