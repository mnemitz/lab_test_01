package labtest01;
/**
 * An item in a grocery store: 
 * Jar of peanut butter, package of pasta,
 * whatever.
 */
public class Item implements Comparable<Item>
{
	private final String aName;
	private final int aId;
	private final int aPrice; // In cents: 100 = one dollar
	public static int ID = 0;

	/**
	 * Creates a new item.
	 * @param pName The name of the item. Not necessarily unique.
	 * @param pId A unique id for the item
	 * @param pPrice The price of the item in cents
	 */
	public Item(String pName, int pPrice)
	{
		aName = pName;
		aId = ID+1;
		ID++;
		aPrice = pPrice;
	}
	
	/**
	 * @return The name of the item
	 */
	public String getName()
	{
		return aName;
	}
	
	/**
	 * @return The ID of the item.
	 */
	public int getId()
	{
		return aId;
	}
	
	/**
	 * @return The price of the item in cents
	 */
	public int getPrice()
	{
		return aPrice;
	}

	@Override
	//returns negative if parameter's price is bigger, and positive if smaller, 0 if equal
	public int compareTo(Item o) {
		return this.getPrice() - o.getPrice();
	}
}
