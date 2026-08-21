package HomeWork17.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    String nome;
    String email;
    String password;
    String administrador;
}

