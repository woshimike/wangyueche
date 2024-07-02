package com.example.ft2.test;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TxLayoutUtils {

    public static Map[] layout(List<String> streamList) {

        int size = streamList.size();
        Map[] input_stream_list = new HashMap[size + 1];

        Map stream0 = new HashMap();
        stream0.put("input_stream_id", "canvas1");
        Map lay0 = new HashMap();
        lay0.put("image_layer", 1);
        lay0.put("input_type", 3);
        lay0.put("image_width", 368);
        lay0.put("image_height", 640);
        lay0.put("color", "0x000000");
        stream0.put("layout_params", lay0);
        input_stream_list[0] = stream0;

        if (size == 2) {
            return layoutForTwo(input_stream_list, streamList);
        } else if (size == 3) {
            return layoutForThree(input_stream_list, streamList);
        } else if (size == 4) {
            return layoutForFour(input_stream_list, streamList);
        } else {
            return null;
        }

    }

    private static Map[] layoutForTwo(Map[] input_stream_list, List<String> streamList) {
        Map stream1 = new HashMap();
        stream1.put("input_stream_id", streamList.get(0));
        Map lay1 = new HashMap();
        lay1.put("image_layer", 2);
        lay1.put("image_width", 184);
        lay1.put("image_height", 320);
        lay1.put("location_x", 0);
        lay1.put("location_y", 160);
        stream1.put("layout_params", lay1);
        input_stream_list[1] = stream1;

        Map stream2 = new HashMap();
        stream2.put("input_stream_id", streamList.get(1));
        Map lay2 = new HashMap();
        lay2.put("image_layer", 3);
        lay2.put("image_width", 184);
        lay2.put("image_height", 320);
        lay2.put("location_x", 184);
        lay2.put("location_y", 160);
        stream2.put("layout_params", lay2);
        input_stream_list[2] = stream2;
        return input_stream_list;
    }

    private static Map[] layoutForThree(Map[] input_stream_list, List<String> streamList) {
        Map<String,Object> stream1 = new HashMap();
        stream1.put("input_stream_id", streamList.get(0));
        Map lay1 = new HashMap();
        lay1.put("image_layer", 2);
        lay1.put("image_width", 184);
        lay1.put("image_height", 320);
        lay1.put("location_x", 0);
        lay1.put("location_y", 0);
        stream1.put("layout_params", lay1);
        input_stream_list[1] = stream1;

        Map<String,Object> stream2 = new HashMap();
        stream2.put("input_stream_id", streamList.get(1));
        Map lay2 = new HashMap();
        lay2.put("image_layer", 3);
        lay2.put("image_width", 184);
        lay2.put("image_height", 320);
        lay2.put("location_x", 184);
        lay2.put("location_y", 0);
        stream2.put("layout_params", lay2);
        input_stream_list[2] = stream2;

        Map<String,Object> stream3 = new HashMap();
        stream3.put("input_stream_id", streamList.get(2));
        Map lay3 = new HashMap();
        lay3.put("image_layer", 4);
        lay3.put("image_width", 184);
        lay3.put("image_height", 320);
        lay3.put("location_x", 92);
        lay3.put("location_y", 320);
        stream3.put("layout_params", lay3);
        input_stream_list[3] = stream3;
        return input_stream_list;
    }

    private static Map[] layoutForFour(Map[] input_stream_list, List<String> streamList) {
        Map<String,Object> stream1 = new HashMap();
        stream1.put("input_stream_id", streamList.get(0));
        Map lay1 = new HashMap();
        lay1.put("image_layer", 2);
        lay1.put("image_width", 184);
        lay1.put("image_height", 320);
        lay1.put("location_x", 0);
        lay1.put("location_y", 0);
        stream1.put("layout_params", lay1);
        input_stream_list[1] = stream1;

        Map<String,Object> stream2 = new HashMap();
        stream2.put("input_stream_id", streamList.get(1));
        Map lay2 = new HashMap();
        lay2.put("image_layer", 3);
        lay2.put("image_width", 184);
        lay2.put("image_height", 320);
        lay2.put("location_x", 184);
        lay2.put("location_y", 0);
        stream2.put("layout_params", lay2);
        input_stream_list[2] = stream2;

        Map<String,Object> stream3 = new HashMap();
        stream3.put("input_stream_id", streamList.get(2));
        Map lay3 = new HashMap();
        lay3.put("image_layer", 4);
        lay3.put("image_width", 184);
        lay3.put("image_height", 320);
        lay3.put("location_x", 0);
        lay3.put("location_y", 320);
        stream3.put("layout_params", lay3);
        input_stream_list[3] = stream3;


        Map<String,Object> stream4 = new HashMap();
        stream4.put("input_stream_id", streamList.get(3));
        Map lay4 = new HashMap();
        lay4.put("image_layer", 5);
        lay4.put("image_width", 184);
        lay4.put("image_height", 320);
        lay4.put("location_x", 184);
        lay4.put("location_y", 320);
        stream4.put("layout_params", lay4);
        input_stream_list[4] = stream4;
        return input_stream_list;
    }

    /**
     * 通过streamId 获取房间号
     * @param streamId
     * @return
     */
    public static String gainRoomId(String streamId){
        if (streamId.contains("_")){
            String[] tempStrArr = streamId.split("_");
            return tempStrArr[1];
        } else {
            return null;
        }
    }

    /**
     * 通过streamId 获取用户id
     * @param streamId
     * @return
     */
    public static Long gainUserId(String streamId){
        if (streamId.contains("_")){
            String[] tempStrArr = streamId.split("_");
            return Long.valueOf(tempStrArr[2]);
        } else {
            return null;
        }
    }

    /**
     * 根据用户房间号 和 用户id 获取用户的视频流id
     * @param roomId
     * @param userId
     * @return
     */
    public static String gainUserStreamId(String roomId, String userId){
        if (StringUtils.isNotBlank(roomId) && StringUtils.isNotBlank(userId)){
            StringBuffer bf = new StringBuffer();
            bf.append("1400322647_").append(roomId).append("_").append(userId).append("_main");
            return bf.toString();
        }
        return null;
    }
}
