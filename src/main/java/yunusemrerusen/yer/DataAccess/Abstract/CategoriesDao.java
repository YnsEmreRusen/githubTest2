package yunusemrerusen.yer.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import yunusemrerusen.yer.Entity.Core.Category;


public interface CategoriesDao extends JpaRepository<Category, Integer>{

}
