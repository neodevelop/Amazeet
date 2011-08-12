package com.synergyj.store



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainUnitTestMixin} for usage instructions
 */
@TestFor(Category)
class CategoryTests {

    void testSaveCategory() {
      mockDomain(Category)
      // mockDomain(Class, [])
      def category = new Category(name:"Category name",description:"This is the description of the category")
      assert category.save()
      assert category.id > 0
    }
    
    void testSaveInvalidCategory() {
      mockDomain(Category)
      // mockDomain(Class, [])
      def category = new Category(name:"Category name",description:"This is the description")
      assert !category.save()
      assert !category.id
    }
}
