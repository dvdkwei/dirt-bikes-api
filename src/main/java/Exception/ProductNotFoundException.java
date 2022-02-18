package Exception;

import Model.Product;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class ProductNotFoundException extends Exception{

    public ProductNotFoundException(Product product){
        super("Could not find bike with numer" + product.getProductId());
    }
}
