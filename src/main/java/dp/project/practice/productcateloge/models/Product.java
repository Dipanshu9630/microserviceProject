package dp.project.practice.productcateloge.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{

    private String name;
    private String imageUrl;

    private String description;
    private Double price;

    private Category category;

}