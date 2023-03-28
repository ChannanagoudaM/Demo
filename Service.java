package department;
import java.util.*;
public class Service implements Interfaces
{
	Scanner sc=new Scanner(System.in);
	LinkedHashMap<Integer,Products>l1=new LinkedHashMap<Integer,Products>();
	int count=1;

	public void addProducts() {
		System.out.println("Enter product name");
		String name=sc.next();
		System.out.println("Enter cost of product for single piece");
		int cost=sc.nextInt();
		System.out.println("Enter quantity of product ");
		int quantity=sc.nextInt();
		Products p1=new Products(name,cost,quantity);
		l1.put(count++, p1);
	}

	@Override
	public void displayAllProducts() {
		Set<Integer>s1=l1.keySet();
		for(int i:s1)
		{
			System.out.println(l1.get(i));
		}
		
	}

	public void displayProducts() {
		
	}

	@Override
	public void buyProduct() {
		// TODO Auto-generated method stub
		
	}

}
