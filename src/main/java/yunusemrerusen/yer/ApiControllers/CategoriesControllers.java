package yunusemrerusen.yer.ApiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yunusemrerusen.yer.Business.Abstract.CategoriesService;
import yunusemrerusen.yer.Core.DataResult;
import yunusemrerusen.yer.Core.Result;
import yunusemrerusen.yer.Entity.Core.Category;


@RestController
@RequestMapping("/api/categories")
public class CategoriesControllers {

	@Autowired
	private CategoriesService categoriesService;
	public CategoriesControllers(CategoriesService categoriesService) {
		super();
		this.categoriesService = categoriesService;
	}
	
	
	@PostMapping("/add")
	public Result Add(Category categories) {
		
		return this.categoriesService.Add(categories);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<Category>> getAll(){
		
		return this.categoriesService.getAll();
		
	}
	
	
}
