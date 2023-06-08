package sakila.web.mongo.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "produits")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Produit {

    @Id
    private Integer id;
    private String name;
    private Double prix;
    private String description;
    private byte[] photo;
}
