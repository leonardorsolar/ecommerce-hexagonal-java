package br.com.aes.ecommercehexagonaljava.aplication.repository;

import br.com.aes.ecommercehexagonaljava.domain.Product;
import br.com.aes.ecommercehexagonaljava.domain.User;

public interface ProductRepository {
  Iterable<Product> getProducts();

  Iterable<Product> getProductsByUser(User user);

  Product getProductById(Integer id);

  Product saveProduct(Product product);

  void deleteProductById(Integer id);
}
