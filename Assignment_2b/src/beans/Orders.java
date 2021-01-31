package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped 
public class Orders {
	
	public List<Order> orders = new ArrayList<Order>();
	
	
	
	public Orders() {
		orders.add(new Order("100" , "This is product: 1", (float) (Math.random() * 100.0),1));
		//for (int i = 0; i < 0; i++) {
		//	orders.add(new Order("100" + i , "This is product: " + i, (float) (Math.random() * 100.0),i));
		//}
	}

	
	
	public List<Order> getOrder() {
		return orders;
	}

	public void setOrder(List<Order> order) {
		this.orders = order;
	}

	
}
