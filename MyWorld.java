import mayflower.*;


public class MyWorld extends World {

	private Cat cat;
	//private Dog dog;
	//private Jack jack;
	//private Ninja ninja;
	private Block block;
    public MyWorld() 
    {
    	setBackground("img/BG/BG.png");
    	
    	cat = new Cat();
    	addObject(cat, 400, 100);
    	block = new Block();
    	addObject(block, 400,500);
    	block = new Block();
    	addObject(block, 528,372);
    	Mayflower.showBounds(true);
    	//dog = new Dog();
    	//addObject(dog, 200,200);
    	//jack = new Jack();
    	//addObject(jack, 50,50);
    	//ninja = new Ninja();
    	//addObject(ninja, 10,10);
    }
    
    public void act()
    {
    }
    
}