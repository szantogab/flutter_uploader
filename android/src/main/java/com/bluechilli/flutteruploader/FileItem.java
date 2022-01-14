package com.bluechilli.flutteruploader;

import java.util.Map;

public class FileItem {

  private String f;
  private String p;

  public FileItem(String path) {
    this.path = path;
  }

  public FileItem(String path, String fieldname) {
    this.f = fieldname;
    this.p = path;
  }

  public static FileItem fromJson(Map<String, String> map) {
    return new FileItem(map.get("p"), map.get("f"));
  }

  public String getFieldname() {
    return f;
  }

  public String getPath() {
    return p;
  }
}
