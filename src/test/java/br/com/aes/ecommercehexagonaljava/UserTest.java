package br.com.aes.ecommercehexagonaljava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.aes.ecommercehexagonaljava.domain.User;

@SpringBootTest
class UserTest {

  @Test
  public void testUserCreation() {
    // Criação de um usuário de exemplo
    User user = new User();
    user.setId(1);
    // user.setUsername("john.doe");

    // Verificação dos valores definidos
    // Assertions.assertEquals(1, user.getId().intValue());
    Assertions.assertEquals(1, user.getId());

  }

}
