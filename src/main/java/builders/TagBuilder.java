package builders;

import petstore_entities.Tag;
import utils.RestUtils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TagBuilder {
   Map<String,Object> tag1 = new HashMap<String, Object>();
   Map<String,Object> tag2 = new HashMap<String, Object>();

  List<Map<String,Object>> tagList = new LinkedList<Map<String,Object>>();

   RestUtils restUtils = new RestUtils();

   public TagBuilder(){
      //tag1
     tag1.put("id",restUtils.getTagId());
     tag1.put("name",restUtils.getTagName());

     //tag2
      tag2.put("id",restUtils.getTagId());
      tag2.put("name",restUtils.getTagName());

      //tagList
      tagList.add(tag1);
      tagList.add(tag2);

   }
  public List<Map<String,Object>> build(){
      return tagList;
  }

}
