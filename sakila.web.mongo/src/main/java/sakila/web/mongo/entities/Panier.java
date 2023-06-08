package sakila.web.mongo.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document(value = "panier")
@Getter @Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Panier {
    @Id
    private Integer id;
    private String userId;
    private List<Produit> produits;
    private double totalAmount;
    private PanierStatus status;

}

enum PanierStatus {
    EN_COURS,
    REGLE,
    ABANDONNE
}
