/**
 * 
 */
package Week8.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Mar 7, 2023
 */
@Entity
public class Menu {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String item;
	private int price;
	
	public Menu() {
		super();
	}
	
	public Menu(String name) {
		this.name = name;
	}
	
	public Menu(String name, String item) {
		this.name=name;
		this.item=item;
	}
	
	public Menu(String name, String item, int price) {
		this.name=name;
		this.item=item;
		this.price=price;
	}
	
	
	
	public Menu(int id, String name, String item, int price) {
		this.id=id;
		this.name=name;
		this.item=item;
		this.price=price;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}
	
	

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", item=" + item + ", price=" + price + "]";
	}
	
	
}
