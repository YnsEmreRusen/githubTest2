package yunusemrerusen.yer.Business.Abstract;

import java.util.List;

import yunusemrerusen.yer.Core.DataResult;
import yunusemrerusen.yer.Core.Result;
import yunusemrerusen.yer.Entity.Core.Category;



public interface CategoriesService {

	Result Add(Category categories);
	DataResult<List<Category>> getAll();
	
}
