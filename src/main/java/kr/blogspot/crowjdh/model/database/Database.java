package kr.blogspot.crowjdh.model.database;

public class Database {
    private String mName;

	public void save(String name) {
		System.out.println("saving: " + name);
		mName = name;
		somePrivateMethod();
	}

	public String load() {
		System.out.println("Loading...");
		somePrivateMethod();
		return mName;
	}
	
	private void somePrivateMethod() {
		System.out.println("This method is not wrapped by it's own transaction.");
	}
}
