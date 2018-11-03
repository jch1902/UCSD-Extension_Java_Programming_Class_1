import java.util.ArrayList;

public class ArrayListCollection {
	private static void display(ArrayList <String> items, String title) {
		System.out.println(title);
		if(items.size() == 0) {
			System.out.println("ArrayList is empty"); return;
		}
		System.out.printf("ArrayList.size(): %d%n", items.size());
		for(String s : items)System.out.print(s + " ");
		System.out.println();
	}
	

	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();
		display(items, "Initial ArrayList");
		items.add("green"); display(items, "Added 1 item");
		items.add("blue"); display(items, "Added another");
		items.add(0, "red"); display(items, "Added red");
		items.remove(0); display(items, "removed red");
		boolean b = items.contains("green");
		System.out.println("b: " + b);
		int index = items.indexOf("green");
		System.out.println("index: " + index);
		String color = items.get(0);
		System.out.println("color: " + color);
		b = items.isEmpty();
		System.out.println("isEmpty(): " + b);
		String[] array = new String[items.size()];
		items.toArray(array);
		for(String s : array) System.out.println(s);
		items.clear(); display(items, "Cleared all itemns");

	}

}
