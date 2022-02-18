package Model;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "WI2_ACU008_PRODUCT")
public class Product {

    @Id
    @Column(name = "P_ID")
    private String productId;

    @Column(name = "P_DESC")
    private String description;

    @Column(name = "P_DIVISION")
    private String division;

    @Column(name = "P_CATEGORY")
    private String category;

    @Column(name = "P_SALESPRICE")
    private double price;

//    public JSONWrappedObject getJSONFormat(){
//        return new JSONWrappedObject()
//    }
}
