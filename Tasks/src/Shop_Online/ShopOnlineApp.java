package Shop_Online;

public class ShopOnlineApp {

	public static void main(String[] args){
		
		
		Customer cusDet=new Customer(1,"Yashraj",5000,"Kurundwad");
		Item itemDetailItem=new Item(1,"T-Shirt","US polo",1800,true);
		ShoppingWebsite objShoppingWebsite=new ShoppingWebsite();
		
	
		try {
			String out = objShoppingWebsite.purchaseItem(itemDetailItem, cusDet);
			System.out.println(out);
			System.out.println();
			System.out.println();
			System.out.println("Customer Name: "+cusDet.getCustomerName()+"\nCustomer Address:"+cusDet.getCustomerAddress()+"\nWallet Balance= "+cusDet.getCustomerWalletBalance());

		} catch (ItemOutOfStockException e) {
			e.printStackTrace();
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
		
		
				

	}

}


class Customer{
	
	private int cutomerId;
	private String customerName;
	private double customerWalletBalance;
	private String customerAddress;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cutomerId, String customerName, double customerWalletBalance, String customerAddress) {
		super();
		this.cutomerId = cutomerId;
		this.customerName = customerName;
		this.customerWalletBalance = customerWalletBalance;
		this.customerAddress = customerAddress;
	}
	public int getCutomerId() {
		return cutomerId;
	}
	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCustomerWalletBalance() {
		return customerWalletBalance;
	}
	public void setCustomerWalletBalance(double customerWalletBalance) {
		this.customerWalletBalance = customerWalletBalance;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "Customer [cutomerId=" + cutomerId + ", customerName=" + customerName + ", customerWalletBalance="
				+ customerWalletBalance + ", customerAddress=" + customerAddress + "]";
	}
	
	
	
	
	
	
}

class Item{
	private int itemId;
	private String itemName;
	private String itemCompanyName;
	private double itemPrice;
	private boolean itemIsInStock;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int itemId, String itemName, String itemCompanyName, double itemPrice, boolean itemIsInStock) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCompanyName = itemCompanyName;
		this.itemPrice = itemPrice;
		this.itemIsInStock = itemIsInStock;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCompanyName() {
		return itemCompanyName;
	}
	public void setItemCompanyName(String itemCompanyName) {
		this.itemCompanyName = itemCompanyName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public boolean isItemIsInStock() {
		return itemIsInStock;
	}
	public void setItemIsInStock(boolean itemIsInStock) {
		this.itemIsInStock = itemIsInStock;
	}
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", itemCompanyName=" + itemCompanyName
				+ ", itemPrice=" + itemPrice + ", itemIsInStock=" + itemIsInStock + "]";
	}
	
	
	
	
}

class ShoppingWebsite {
	
	
	public String purchaseItem(Item i, Customer c  ) throws ItemOutOfStockException, InsufficientBalanceException{
		System.out.println("Item name: "+i.getItemName()+"\nItem Price: "+i.getItemPrice()+"\nItem Company Name: "+i.getItemCompanyName());

		System.out.println();
		System.out.println();
		
		if (i.getItemPrice()>c.getCustomerWalletBalance()) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		else if (i.isItemIsInStock()==false) {
			throw new ItemOutOfStockException("Out of Stock");
		}
		else {
			c.setCustomerWalletBalance(c.getCustomerWalletBalance()-i.getItemPrice()); 
			return "Order Successful";
		}
		
				
	}
	
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


class ItemOutOfStockException extends Exception {
    public ItemOutOfStockException(String message) {
        super(message);
    }
}