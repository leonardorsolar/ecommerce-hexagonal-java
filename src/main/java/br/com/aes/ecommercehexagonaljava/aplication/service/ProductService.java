package br.com.aes.ecommercehexagonaljava.aplication.service;

import br.com.aes.ecommercehexagonaljava.aplication.repository.ProductRepository;
import br.com.aes.ecommercehexagonaljava.domain.Product;
import br.com.aes.ecommercehexagonaljava.domain.User;

public class ProductService {

  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public Iterable<Product> getProducts() {
    return productRepository.getProducts();
  }

  public Iterable<Product> getProductsByUser(User user) {
    return productRepository.getProductsByUser(user);
  }

  public Product getProductById(Integer id) {
    return productRepository.getProductById(id);
  }

  public Product saveProduct(Product product) {
    return productRepository.saveProduct(product);
  }

  public void deleteProductById(Integer id) {
    productRepository.deleteProductById(id);
  }

}
