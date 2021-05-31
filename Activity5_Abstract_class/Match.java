abstract class Match
{
	private int currentscore;
	private int currentover;
	private int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public int getCurrentover() {
		return currentover;
	}
	public void setCurrentover(int currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqRunrate,int balls);
	
}
class ODIMatch extends Match
{
	public float calculateRunRate()
	{
		return (getTarget()-getCurrentscore())/(50 -getCurrentover());
	}
	public int calculateBalls()
	{
		return (50-getCurrentover())*6;
	}
	public void display(double d1,int d2)
	{
		System.out.print("Need ");
		System.out.print((int)(d1*d2/6));
		System.out.println(" runs in "+d2+" balls");
		System.out.println("Required Runrate: "+d1);
	}
}
class TestMatch extends Match
{
	public float calculateRunRate()
	{
		return (getTarget()-getCurrentscore())/(90-getCurrentover());
	}
	public int calculateBalls()
	{
		return (90-getCurrentover())*6;
	}
	public void display(double d1,int d2)
	{
		System.out.print("Need ");
		System.out.print((int)(d1*d2/6));
		System.out.println(" runs in "+d2+" balls");
		System.out.println("Required Runrate: "+d1);
	}
	
}
class T20Match extends Match
{
	public float calculateRunRate()
	{
		return (getTarget()-getCurrentscore())/(20-getCurrentover());
	}
	public int calculateBalls()
	{
		return (20-getCurrentover())*6;
	}
	public void display(double d1,int d2)
	{
		System.out.print("Need ");
		System.out.print((int)(d1*d2/6));
		System.out.println(" runs in "+d2+" balls");
		System.out.println("Required Runrate: "+d1);
		
	}
	
}
