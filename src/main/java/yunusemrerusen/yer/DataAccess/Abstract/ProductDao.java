package yunusemrerusen.yer.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import yunusemrerusen.yer.Entity.Core.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
	
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_CategoryId(String productName,int categoryId);
	
	
	


	

}
 