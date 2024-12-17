package yunusemrerusen.yer.ApiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yunusemrerusen.yer.Business.Abstract.OrdersService;
import yunusemrerusen.yer.Core.DataResult;
import yunusemrerusen.yer.Core.Result;
import yunusemrerusen.yer.Entity.Core.Orders;


@RestController
@RequestMapping("/api/orders")
public class OrdersControllers {

	
	private OrdersService ordersService;

	@Autowired
	public OrdersControllers(OrdersService ordersService) {
		super();
		this.ordersService = ordersService;
	}
	
	@PostMapping("/add")
	public Result Add(@RequestBody Orders orders) {
		return this.ordersService.add(orders);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Orders>> getAll(){
		
		return this.ordersService.getAll();
		
	}
	
}
