
public  abstract class  Animal implements Comparable<Animal>{
	int legs;
	String name;
	public Animal ( String name,int legs ) {
		this.legs=legs;
		this.name=name;
	}
	public int getLegs() {
		return this.legs;
	}
	
	@Override
	public int compareTo(Animal a) {
		return Integer.valueOf(legs).compareTo(Integer.valueOf(a.legs));
		
	}

}
