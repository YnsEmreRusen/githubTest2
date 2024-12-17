package yunusemrerusen.yer.ApiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import yunusemrerusen.yer.Business.Abstract.ProductService;
import yunusemrerusen.yer.Core.DataResult;
import yunusemrerusen.yer.Core.Result;
import yunusemrerusen.yer.Entity.Core.Product;

@RestController
@RequestMapping("/api/product")
public class ProductControllers {

	private ProductService productService;
	@Autowired
	public ProductControllers(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		
		return this.productService.getAll();
		
	}
	
	
	
	@PostMapping("/add")
	public Result Add(@RequestBody Product product) {
		
		return this.productService.Add(product);
		
	}
	
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName){
		
		return this.productService.getByProductName(productName);
		
	}
	
	@GetMapping("/getByProductNameAndCategory")
	public DataResult<Product> getByProductNameAndCategory(@RequestParam("productName") String productName,@RequestParam("categoryId") int categoryId){
		
		return this.productService.getByProductNameAndCategory(productName, categoryId);
		
	}
	
	
	
	
	
}
