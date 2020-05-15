package com.example.final_image_fetch_app;

public class MyObjects {

    //{"id":"1","imagename":"BomJesus.jpg","imagepath":"http:\/\/www.fabridgeengg.com\/Root_NavlakhUmbre\/Fetch-Image-Server\/BomJesus.jpg","imageinfo":"Bom Jesus Church image"}
    private String id,imagename,imagepath,imageinfo;

    public MyObjects(String id, String imagename, String imagepath, String imageinfo) {
        this.id = id;
        this.imagename = imagename;
        this.imagepath = imagepath;
        this.imageinfo = imageinfo;
    }

    public String getId() {
        return id;
    }

    public String getImagename() {
        return imagename;
    }

    public String getImagepath() {
        return imagepath;
    }

    public String getImageinfo() {
        return imageinfo;
    }
}
