package animal;

import java.util.ArrayList;
import java.util.List;

public class InitializeAnimal {
	private List<Animal> chickenAnimal=new ArrayList<Animal>();
	private List<Animal> cowAnimal=new ArrayList<Animal>();
	private List<Animal> fishAnimal=new ArrayList<Animal>();
	
	public InitializeAnimal() {
		for(int i=0;i<10;i++) 
		{
			chickenAnimal.add(new Chicken());
		}
		for(int i=0;i<5;i++) 
		{
			cowAnimal.add(new Cow());
		}
		for(int i=0;i<20;i++) 
		{
			fishAnimal.add(new Fish());
		}
	}
	
	public void showchicken() {
		for(int i=0;i<chickenAnimal.size();i++)
		{
			System.out.println("this is num "+(i+1)+" chicken");
		}
	}
	
	public void showcow() {
		for(int i=0;i<cowAnimal.size();i++)
		{
			System.out.println("this is num "+(i+1)+" cow");
		}
	}
	
	public void showfish() {
		for(int i=0;i<fishAnimal.size();i++)
		{
			System.out.println("this is num "+(i+1)+" fish");
		}
	}
}
