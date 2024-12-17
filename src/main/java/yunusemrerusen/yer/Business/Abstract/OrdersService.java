package yunusemrerusen.yer.Business.Abstract;

import java.util.List;

import yunusemrerusen.yer.Core.DataResult;
import yunusemrerusen.yer.Core.Result;
import yunusemrerusen.yer.Entity.Core.Orders;

public interface OrdersService {

	
	Result add(Orders orders);
	DataResult<List<Orders>> getAll();
	
}
