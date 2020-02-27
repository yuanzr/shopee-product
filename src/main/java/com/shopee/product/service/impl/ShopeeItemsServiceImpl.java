package com.shopee.product.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.shopee.product.mapper.ShopeeItemsMapper;
import com.shopee.product.mapper.ShopeeItemsMapperExpand;
import com.shopee.product.model.ShopeeItems;
import com.shopee.product.model.ShopeeItemsExample;
import com.shopee.product.param.ShopeeCatParam;
import com.shopee.product.param.ShopeeItemsParam;
import com.shopee.product.service.JsonReadService;
import com.shopee.product.service.ShopeeItemsService;
import com.shopee.product.utils.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ShopeeItemsServiceImpl implements ShopeeItemsService {


    private static final String IMG_BASE_URL = "https://cf.shopee.co.th/file/";
    private static final String OFFICICAL_BASE_URL = "https://shopee.co.th/";

    @Autowired
    private ShopeeItemsMapper shopeeItemsMapper;

    @Autowired
    private ShopeeItemsMapperExpand shopeeItemsMapperExpand;

    @Autowired
    private JsonReadService jsonReadService;


    @Override
    public void insertList() {

        Integer version = 20200223;
        Date now = new Date();
        //一页的商品数
        JsonReadService jsonReadService = new JsonReadService();
        for (int i = 1; i < 17; i++) {
            String jsonText = jsonReadService.getDatafromFile("shopee-items-sales-"+i);
            ShopeeItemsParam shopeeCatParam = JSONObject.parseObject(jsonText, ShopeeItemsParam.class);
            List<ShopeeItemsParam.ItemsBean> items = shopeeCatParam.getItems();
            List<ShopeeItems> list = new ArrayList<>();
            for (ShopeeItemsParam.ItemsBean item : items) {
                ShopeeItems shopeeItems = new ShopeeItems();
                shopeeItems.setVersion(version);
                shopeeItems.setItemId(item.getItemid());
                shopeeItems.setShopId(Long.parseLong(item.getShopid() + ""));
                shopeeItems.setCatId(Long.parseLong(item.getCatid() + ""));
                shopeeItems.setShopLocation(item.getShop_location());
                shopeeItems.setName(item.getName());
                shopeeItems.setImage(item.getImage());
                shopeeItems.setImageUrl(IMG_BASE_URL + item.getImage());
                shopeeItems.setPrice(new BigDecimal(item.getPrice() / 100000));
                shopeeItems.setPriceMin(new BigDecimal(item.getPrice_max() / 100000));
                shopeeItems.setPriceMax(new BigDecimal(item.getPrice_max() / 100000));
                shopeeItems.setPriceBeforeDiscount(new BigDecimal(item.getPrice_before_discount() / 100000));
                shopeeItems.setPriceMinBeforeDiscount(new BigDecimal(item.getPrice_min_before_discount() / 100000));
                shopeeItems.setPriceMaxBeforeDiscount(new BigDecimal(item.getPrice_max_before_discount() / 100000));
                shopeeItems.setDiscount(item.getShow_discount());
                shopeeItems.setLikedCount(item.getLiked_count());

                shopeeItems.setSold(item.getSold());//当月销量

                shopeeItems.setHistoricalSold(item.getHistorical_sold());
                shopeeItems.setStock(item.getStock());
                shopeeItems.setBrand(item.getBrand());
                shopeeItems.setItemRatingStar(item.getItem_rating().getRating_star());
                shopeeItems.setCurrency(item.getCurrency());
                shopeeItems.setItemDetailUrl(OFFICICAL_BASE_URL + item.getName() + "-i." + item.getShopid() + "." + item.getItemid());

                shopeeItems.setUploadTime(new Date(new Long(item.getCtime() * 1000)));
                shopeeItems.setCreateTime(now);
                shopeeItems.setUpdateTime(now);

                shopeeItems.setWholesaleTierList(JSONObject.toJSONString(item.getWholesale_tier_list()));
                list.add(shopeeItems);
            }
            shopeeItemsMapperExpand.insertList(list);
        }

    }

    @Override
    public List<ShopeeItems> list(ShopeeItems entity, Integer pageNum, Integer pageSize) {


        return null;
    }

    @Override
    public void updateItemCat() {
        ShopeeItemsExample example = new ShopeeItemsExample();
        example.createCriteria().andPriceGreaterThan(new BigDecimal(50)).andCatIdEqualTo(new Long(2083));
        List<ShopeeItems> shopeeItems = shopeeItemsMapper.selectByExample(example);

        for (ShopeeItems shopeeItem : shopeeItems) {
            String baseUrl = "https://shopee.co.th/api/v2/item/get?itemid="+shopeeItem.getItemId() +"&shopid=" + shopeeItem.getShopId();
            try {

                JSONObject jsonObject = JSONObject.parseObject(HttpUtils.executeGet(baseUrl));
                JSONObject item = jsonObject.getJSONObject("item");
                JSONArray categories = item.getJSONArray("categories");
                if (!CollectionUtils.isEmpty(categories)){
                    JSONObject catObject = categories.getJSONObject(categories.size() - 1);
                    String catid = catObject.get("catid").toString();
                    shopeeItem.setCatId(Long.valueOf(catid));
                    shopeeItemsMapper.updateByPrimaryKey(shopeeItem);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        ShopeeItemsServiceImpl shopeeItemsService = new ShopeeItemsServiceImpl();
        shopeeItemsService.insertList();


    }

}
