package data;

public class User{
	public String name,age;

	public String getName() {
		return name;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public boolean isExisted(){
		if(name.equals("Kizen"))
			return true;
		return false;
	}
}

