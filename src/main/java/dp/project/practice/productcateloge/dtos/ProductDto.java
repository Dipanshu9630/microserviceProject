package dp.project.practice.productcateloge.dtos;

import dp.project.practice.productcateloge.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private String name;
    private String imageUrl;

    private String description;
    private Double price;

    private Category category;


}
