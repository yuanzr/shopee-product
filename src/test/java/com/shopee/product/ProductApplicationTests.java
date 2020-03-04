package com.shopee.product;

import com.shopee.product.service.ShopeeCatService;
import com.shopee.product.service.ShopeeCatStatService;
import com.shopee.product.service.ShopeeItemsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    private ShopeeCatService shopeeCatService;

    @Autowired
    private ShopeeItemsService shopeeItemsService;

    @Autowired
    private ShopeeCatStatService shopeeCatStatService;

    @Test
    void contextLoads() {
        shopeeCatService.insertList();
    }


    @Test
    void insertShopeeItems() {
        shopeeItemsService.insertList();
    }


    @Test
    void updateItemCat() {
        shopeeItemsService.updateItemCat();
    }



    @Test
    void genCatStatData() {
        shopeeCatStatService.genCatStatData(2083L);
    }




    @Test
    void importJsonData() {
        Integer parentId = 63;
        Integer regionNo = 886;
        shopeeCatStatService.importJsonData(parentId.longValue(),regionNo);
    }

}
