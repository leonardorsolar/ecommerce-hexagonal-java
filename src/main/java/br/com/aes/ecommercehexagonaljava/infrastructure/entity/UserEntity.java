package br.com.aes.ecommercehexagonaljava.infrastructure.entity;

import java.time.LocalDateTime;

import br.com.aes.ecommercehexagonaljava.domain.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String username;
  private String firstName;
  private String lastName;
  private String email;
  private String address;
  private String cellphone;
  private String password;
  @Enumerated(EnumType.STRING)
  private UserType userType;
  private LocalDateTime dateCreated;

}
