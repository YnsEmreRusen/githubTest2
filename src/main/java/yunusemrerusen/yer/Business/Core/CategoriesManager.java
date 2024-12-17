package yunusemrerusen.yer.Business.Core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yunusemrerusen.yer.Business.Abstract.CategoriesService;
import yunusemrerusen.yer.Core.DataResult;
import yunusemrerusen.yer.Core.Result;
import yunusemrerusen.yer.Core.SuccessDataResult;
import yunusemrerusen.yer.Core.SuccessResult;
import yunusemrerusen.yer.DataAccess.Abstract.CategoriesDao;
import yunusemrerusen.yer.Entity.Core.Category;


@Service
public class CategoriesManager implements CategoriesService {

	
	@Autowired
	private CategoriesDao categoriesDao;
	public CategoriesManager(CategoriesDao categoriesDao) {
		super();
		this.categoriesDao = categoriesDao;
	}

	@Override
	public Result Add(Category categories) {
		
		this.categoriesDao.save(categories);
		return new SuccessResult("Categories eklendi");
	}

	@Override
	public DataResult<List<Category>> getAll() {
		
		return new SuccessDataResult<List<Category>>
		(this.categoriesDao.findAll(),"categories listelendi");
		
	}



}
