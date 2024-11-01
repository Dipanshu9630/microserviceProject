package dp.project.practice.productcateloge.models;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
public class Category extends BaseModel{
    private String name;
    private String description;

    private List<Product> productList;
}
