package org.acme.eshop.service;

import java.util.List;
import java.util.stream.Collectors;

import org.acme.eshop.model.Category;
import org.acme.eshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service("categoryService")
public class CategoryServiceImpl extends AbstractService<Category> implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public JpaRepository<Category, Long> getRepository() {
		return categoryRepository;
	}

	@Override
	@Cacheable(value = "categories-static-declaration", keyGenerator = "CustomCacheKeyGenerator")
	public List<Category> findAllCacheableCategories() {
		log.debug("Retrieving all categories.");
		simulateSlowService();
		return getRepository().findAll();
	}

	@Override
	@Cacheable(value = "categories-static-declaration", keyGenerator = "CustomCacheKeyGenerator")
	public List<Category> findTopCacheableCategories() {
		log.debug("Retrieving top categories.");
		simulateSlowService();
		return getRepository().findAll().stream().limit(3).collect(Collectors.toList());
	}

	private void simulateSlowService() {
		try {
			Thread.sleep(2000L);
		} catch (final InterruptedException e) {
			e.printStackTrace();
		}
	}
}
