package yunusemrerusen.yer.Business.Core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yunusemrerusen.yer.Business.Abstract.ProductService;
import yunusemrerusen.yer.Core.DataResult;
import yunusemrerusen.yer.Core.Result;
import yunusemrerusen.yer.Core.SuccessDataResult;
import yunusemrerusen.yer.Core.SuccessResult;
import yunusemrerusen.yer.DataAccess.Abstract.ProductDao;
import yunusemrerusen.yer.Entity.Core.Product;

@Service
public class ProductManeger implements ProductService {

	
	private ProductDao productDao;
	@Autowired
	public ProductManeger(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Product Listelendi");
		
		
	}
	
	
	
	

	@Override
	public Result Add(Product product) {
		
		
		this.productDao.save(product);
		return  new SuccessResult("Product Eklendi");
		
		
	}

	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>(this.productDao.getByProductName(productName),"Product Listelendi");

	}

	@Override
	public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategory_CategoryId(productName, categoryId)," geldi ");
	}




	

}
