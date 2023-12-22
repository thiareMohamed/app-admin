package sn.isi.adminapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private Long id;
    @NotNull
    private String ref;
    private String name;
    private int quantity;
}
