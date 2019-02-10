package com.nayanatech.recyclerviewvmedo;

public class ItemModel {
    private String logo_name,time,desc,like_Update,like_wd_btn,share_wd_btn;
    private int logo_Image,orange_Image,like_image,share_image;

    public String getLogo_name() {
        return logo_name;
    }

    public void setLogo_name(String logo_name) {
        this.logo_name = logo_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLike_Update() {
        return like_Update;
    }

    public void setLike_Update(String like_Update) {
        this.like_Update = like_Update;
    }

    public String getLike_wd_btn() {
        return like_wd_btn;
    }

    public void setLike_wd_btn(String like_wd_btn) {
        this.like_wd_btn = like_wd_btn;
    }

    public String getShare_wd_btn() {
        return share_wd_btn;
    }

    public void setShare_wd_btn(String share_wd_btn) {
        this.share_wd_btn = share_wd_btn;
    }

    public int getLogo_Image() {
        return logo_Image;
    }

    public void setLogo_Image(int logo_Image) {
        this.logo_Image = logo_Image;
    }

    public int getOrange_Image() {
        return orange_Image;
    }

    public void setOrange_Image(int orange_Image) {
        this.orange_Image = orange_Image;
    }

    public int getLike_image() {
        return like_image;
    }

    public void setLike_image(int like_image) {
        this.like_image = like_image;
    }

    public int getShare_image() {
        return share_image;
    }

    public void setShare_image(int share_image) {
        this.share_image = share_image;
    }

    public ItemModel(String logo_name, String time, String desc, String like_Update, String like_wd_btn, String share_wd_btn, int logo_Image, int orange_Image, int like_image, int share_image) {
        this.logo_name = logo_name;
        this.time = time;
        this.desc = desc;
        this.like_Update = like_Update;
        this.like_wd_btn = like_wd_btn;
        this.share_wd_btn = share_wd_btn;
        this.logo_Image = logo_Image;
        this.orange_Image = orange_Image;
        this.like_image = like_image;
        this.share_image = share_image;
    }
}
