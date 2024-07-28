import java.util.HashSet;

class HashSetExample {
     String name;
     int roll;
     String dept;
     
	public HashSetExample(String name, int roll, String dept) {
		super();
		this.name = name;
		this.roll = roll;
		this.dept = dept;
	}

	@Override
	public int hashCode() {
		
		return roll;
	}

	@Override
	public boolean equals(Object obj) {
		
		HashSetExample hse = (HashSetExample) obj;
		
		return (roll == hse.roll);
	}

	@Override
	public String toString() {
		return "HashSetExample [name=" + name + ", roll=" + roll + ", dept=" + dept + "]";
	}  
}

public class HashSetExampleMain{
	public static void main(String[] args) {
		
		HashSet<HashSetExample> set = new HashSet<>();
		
		set.add(new HashSetExample("sri", 101, "civil"));
		set.add(new HashSetExample("ram", 102, "it"));
		set.add(new HashSetExample("rai", 101, "it"));
		set.add(new HashSetExample("raja", 102, "civil"));
		
		System.out.println(set);
	}
	
}
   















