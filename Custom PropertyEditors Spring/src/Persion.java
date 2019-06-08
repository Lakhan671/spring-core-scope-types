
public class Persion {
private String name;

private PersionType type;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public PersionType getType() {
	return type;
}

public void setType(PersionType type) {
	this.type = type;
}

@Override
public String toString() {
	return "Persion [name=" + name + ", type=" + type + "]";
}

	
	
}
