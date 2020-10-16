package net.akshoppingbacken.daoimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.akshoppingbacken.dao.CategoryDAO;
import net.akshoppingbacken.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImp implements CategoryDAO {

	private static List<Category> categories =new ArrayList <>();
	
	static {
		Category category = new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is same description for televison ");
		category.setImageURL("CAT_1.png");
		//category.setActive(active);
		categories.add(category);
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is same description for televison ");
		category.setImageURL("CAT_1.png");
		//category.setActive(active);
		categories.add(category);
		// Second Category added
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is same description for Mobile ");
		category.setImageURL("CAT_2.png");
		//category.setActive(active);
		categories.add(category);
		// added third category 
		category = new Category();
		category.setId(3);
		category.setName("Television");
		category.setDescription("This is same description for Laptop ");
		category.setImageURL("CAT_1.png");
		//category.setActive(active);
		categories.add(category);
		
	}
	
	@Override
	public List <Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
