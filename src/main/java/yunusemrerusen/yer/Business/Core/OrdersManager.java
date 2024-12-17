package yunusemrerusen.yer.Business.Core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yunusemrerusen.yer.Business.Abstract.OrdersService;
import yunusemrerusen.yer.Core.DataResult;
import yunusemrerusen.yer.Core.Result;
import yunusemrerusen.yer.Core.SuccessDataResult;
import yunusemrerusen.yer.Core.SuccessResult;
import yunusemrerusen.yer.DataAccess.Abstract.OrdersDao;
import yunusemrerusen.yer.Entity.Core.Orders;


@Service
public class OrdersManager implements OrdersService {

	
	private OrdersDao ordersDao;
	@Autowired
	public OrdersManager(OrdersDao ordersDao) {
		super();
		this.ordersDao = ordersDao;
	}


	@Override
	public Result add(Orders orders) {
		
		this.ordersDao.save(orders);
		return new SuccessResult("EKLENDİ");
		
		
	}


	@Override
	public DataResult<List<Orders>> getAll() {
		
		return new SuccessDataResult<List<Orders>>(this.ordersDao.findAll(),"Amk datası listelendi");
	}

}
