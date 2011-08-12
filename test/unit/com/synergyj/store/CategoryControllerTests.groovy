package com.synergyj.store



import org.junit.*
import grails.test.mixin.*
import javax.servlet.http.HttpServletResponse

@TestFor(CategoryController)
@Mock(Category)
class CategoryControllerTests {

    void testIndex() {
        controller.index()
        assert "/category/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.categoryInstanceList.size() == 0
        assert model.categoryInstanceTotal == 0
    }

    void testCreate() {
       def model = controller.create()

       assert model.categoryInstance != null
    }

    void testSave() {
        controller.save()
        assert response.status == HttpServletResponse.SC_METHOD_NOT_ALLOWED

        response.reset()
        request.method = 'POST'
        controller.save()

        assert model.categoryInstance != null
        assert view == '/category/create'

        response.reset()

        // TODO: Populate valid properties

        controller.save()

        assert response.redirectedUrl == '/category/show/1'
        assert controller.flash.message != null
        assert Category.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/category/list'


        def category = new Category()

        // TODO: populate domain properties

        assert category.save() != null

        params.id = category.id

        def model = controller.show()

        assert model.categoryInstance == category
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/category/list'


        def category = new Category()

        // TODO: populate valid domain properties

        assert category.save() != null

        params.id = category.id

        def model = controller.edit()

        assert model.categoryInstance == category
    }

    void testUpdate() {

        controller.update()
        assert response.status == HttpServletResponse.SC_METHOD_NOT_ALLOWED

        response.reset()
        request.method = 'POST'
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/category/list'

        response.reset()


        def category = new Category()

        // TODO: populate valid domain properties

        assert category.save() != null

        // test invalid parameters in update
        params.id = category.id

        controller.update()

        assert view == "/category/edit"
        assert model.categoryInstance != null

        category.clearErrors()

        // TODO: populate valid domain form parameter
        controller.update()

        assert response.redirectedUrl == "/category/show/$category.id"
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert response.status == HttpServletResponse.SC_METHOD_NOT_ALLOWED

        response.reset()
        request.method = 'POST'
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/category/list'

        response.reset()

        def category = new Category()

        // TODO: populate valid domain properties
        assert category.save() != null
        assert Category.count() == 1

        params.id = category.id

        controller.delete()

        assert Category.count() == 0
        assert Category.get(category.id) == null
        assert response.redirectedUrl == '/category/list'
    }
}
