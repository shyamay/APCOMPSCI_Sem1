public class Car
{
	private String paint, interior, engine, tires;
	public Car()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	public Car(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public void setCustom(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public void setpaint(String p)
	{
		paint = p;
	}
	
	public void setinterior(String i)
	{
		interior = i;
	}
	
	public void setengine(String e)
	{
		engine = e;
	}
	
	public void settires(String t)
	{
		tires = t;
	}
	
	public String getpaint()
	{
		return paint;
	}
	
	public String getinterior()
	{
		return interior;
	}
	
	public String getengine()
	{
		return engine;
	}
	
	public String gettires()
	{
		return tires;
	}
}