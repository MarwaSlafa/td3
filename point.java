public class point {
	private double abscisse;
	private double ordon�e;
	
	public point(){
		this.abscisse=0;
		this.ordon�e=0;}
	public point(double x){
		this.abscisse=x;
		this.ordon�e=x;
	}
	public point (double x, double y){
		this.abscisse=x;
		this.ordon�e=y;
	}
	public double getAbscisse(){
		return this.abscisse;
	}
	public double getOrdon�e(){
		return this.ordon�e;
	}
	public String toString(){
		return "(" + abscisse+ ","+ ordon�e +")";
	}
	public point Symetrie(){
		return new point(-abscisse,ordon�e);
	}