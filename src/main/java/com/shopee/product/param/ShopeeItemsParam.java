package com.shopee.product.param;

import java.util.List;

public class ShopeeItemsParam {

    private String version;
    private Integer total_count;
    private List<ItemsBean> items;


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }



    public static class ItemsBean {

        private long itemid;                //商品ID
        private int shopid;                 //店铺ID
        private String shop_location;       //店铺位置
        private String name;                //商品标题
        private String image;               //商品主图
        private int catid;                  //分类ID
        private int price_min;              //最小价格
        private int price_max;              //最大价格
        private int price;                  //当前价格
        private List<WholeSaleTierBean> wholesale_tier_list;//批发价
        private int view_count;             //商品浏览量
        private int show_discount;          //当前折扣数字
        private String discount;            //当前折扣+%
        private int liked_count;            //点赞数量
        private Long ctime;                 //上架时间
        private Integer sold;               //当月销量
        private int historical_sold;        //历史销量
        private int stock;                  //库存数量
        private String brand;               //品牌名称
        private int price_before_discount;  //之前的折扣价格
        private int price_min_before_discount;//之前的最小折扣价格
        private int price_max_before_discount;//之前最大的折扣价格
        private ItemRatingBean item_rating;//商品好评率
        private int cmt_count;
        private String reference_item_id;
        private String currency;            //当前货币类型
        private List<TierVariationsBean> tier_variations;//商品SKU信息
        private List<String> images;
        private List<Integer> label_ids;    //标签ID

        public int getPrice_min() {
            return price_min;
        }

        public void setPrice_min(int price_min) {
            this.price_min = price_min;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public List<WholeSaleTierBean> getWholesale_tier_list() {
            return wholesale_tier_list;
        }

        public void setWholesale_tier_list(List<WholeSaleTierBean> wholesale_tier_list) {
            this.wholesale_tier_list = wholesale_tier_list;
        }

        public Long getCtime() {
            return ctime;
        }

        public void setCtime(Long ctime) {
            this.ctime = ctime;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getPrice_min_before_discount() {
            return price_min_before_discount;
        }

        public void setPrice_min_before_discount(int price_min_before_discount) {
            this.price_min_before_discount = price_min_before_discount;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getPrice_before_discount() {
            return price_before_discount;
        }

        public void setPrice_before_discount(int price_before_discount) {
            this.price_before_discount = price_before_discount;
        }

        public int getPrice_max_before_discount() {
            return price_max_before_discount;
        }

        public void setPrice_max_before_discount(int price_max_before_discount) {
            this.price_max_before_discount = price_max_before_discount;
        }

        public ItemRatingBean getItem_rating() {
            return item_rating;
        }

        public void setItem_rating(ItemRatingBean item_rating) {
            this.item_rating = item_rating;
        }

        public int getCmt_count() {
            return cmt_count;
        }

        public void setCmt_count(int cmt_count) {
            this.cmt_count = cmt_count;
        }

        public String getReference_item_id() {
            return reference_item_id;
        }

        public void setReference_item_id(String reference_item_id) {
            this.reference_item_id = reference_item_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getShopid() {
            return shopid;
        }

        public void setShopid(int shopid) {
            this.shopid = shopid;
        }

        public int getPrice_max() {
            return price_max;
        }

        public void setPrice_max(int price_max) {
            this.price_max = price_max;
        }

        public int getShow_discount() {
            return show_discount;
        }

        public void setShow_discount(int show_discount) {
            this.show_discount = show_discount;
        }

        public int getLiked_count() {
            return liked_count;
        }

        public void setLiked_count(int liked_count) {
            this.liked_count = liked_count;
        }

        public long getItemid() {
            return itemid;
        }

        public void setItemid(long itemid) {
            this.itemid = itemid;
        }

        public int getCatid() {
            return catid;
        }

        public void setCatid(int catid) {
            this.catid = catid;
        }

        public String getShop_location() {
            return shop_location;
        }

        public void setShop_location(String shop_location) {
            this.shop_location = shop_location;
        }

        public int getHistorical_sold() {
            return historical_sold;
        }

        public void setHistorical_sold(int historical_sold) {
            this.historical_sold = historical_sold;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public Integer getSold() {
            return sold;
        }

        public void setSold(Integer sold) {
            this.sold = sold;
        }

        public int getView_count() {
            return view_count;
        }

        public void setView_count(int view_count) {
            this.view_count = view_count;
        }

        public String getDiscount() {
            return discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        public List<TierVariationsBean> getTier_variations() {
            return tier_variations;
        }

        public void setTier_variations(List<TierVariationsBean> tier_variations) {
            this.tier_variations = tier_variations;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public List<Integer> getLabel_ids() {
            return label_ids;
        }

        public void setLabel_ids(List<Integer> label_ids) {
            this.label_ids = label_ids;
        }

        public static class ItemRatingBean {
            /**
             * rcount_with_image : 795
             * rcount_with_context : 916
             * rating_star : 4.905551
             * rating_count : [2414,2,3,28,155,2226]
             */

            private double rating_star;//好评率

            public double getRating_star() {
                return rating_star;
            }

            public void setRating_star(double rating_star) {
                this.rating_star = rating_star;
            }
        }


        public static class WholeSaleTierBean {
            /**
             * 批发价格
             * max_count: 60
             * min_count: 12
             * price: 5400000
             */

            private int min_count;            //SKU 类名
            private int max_count;            //SKU 类名
            private int price;            //SKU 类名

            public int getMin_count() {
                return min_count;
            }

            public void setMin_count(int min_count) {
                this.min_count = min_count;
            }

            public int getMax_count() {
                return max_count;
            }

            public void setMax_count(int max_count) {
                this.max_count = max_count;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }




        public static class TierVariationsBean {
            /**
             * images : ["3a709d3a1be3be3373388bcefeebe080","8aff24dda3e15a8e0d388b71c0c34d31","2aa8ce9c68575ffd004c702b1176824f","97454cf043654644b503690e8375ad20","4e361eb4fef1a616c70e33b8cc28e5a1","354716a16ee0c3f1100a1ff914fbf764","4851ec1d47bd64dd71615af433476c67","279d3d0bac6871824802fa1d84cd8e09","64dabb800d5be5b77ec1613174838abb","6ba32cd12b455dc88677eea5c463c3d6","6567c80e6bc7f14ee9fc09d0f6a0c8ee","4e22c5dd75716c89bf8499fea26502b4","cfec03602d9439a648ac6e5405073880","030d64e1ed44152d11d977490df2dd70","43d32dde5467989656af492d1cf242b8","4663403e285e809db5418f1a5b84fd27","d870b4f1548760a51ddb821da5c5c62c"]
             * name : สูตร
             * options : ["ทูน่า","ทูน่า เนื้อไก่","ทูน่า ปูอัด","ทูน่า ปลาโออบแห้ง","ทูน่า ชีส","สาหร่ายและไข่ตุ๋น","ทูน่า ปลาข้าวสาร","กุ้งและหอยเชลล์","ทูน่า ปลาทรายแดง","ทูน่า แซลมอน(เกรวี่)","ทูน่า ไก่(เกรวี่)","ทูน่า กุ้ง (เกรวี่)","ทูน่า (เกรวี่)","ทูน่ามูส","ไก่มูส","ทูน่ามูสนมแพะ","ทูน่ามูสแซลมอน"]
             * type : 0
             */

            private String name;            //SKU 类名
            private List<String> images;    //SKU图片
            private List<String> options;   //SKU名称

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<String> getImages() {
                return images;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }

            public List<String> getOptions() {
                return options;
            }

            public void setOptions(List<String> options) {
                this.options = options;
            }
        }


    }
}
