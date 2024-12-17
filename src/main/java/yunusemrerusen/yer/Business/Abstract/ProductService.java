package yunusemrerusen.yer.Business.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import yunusemrerusen.yer.Core.DataResult;
import yunusemrerusen.yer.Core.Result;
import yunusemrerusen.yer.Entity.Core.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll();
	Result Add(Product product);
	
	
	
	DataResult<Product> getByProductName(String productName);
	

	DataResult<Product>  getByProductNameAndCategory(String productName,int categoryId);
	
	
	

}
 