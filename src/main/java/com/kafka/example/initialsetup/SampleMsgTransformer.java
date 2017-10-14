package com.kafka.example.initialsetup;

import com.kafka.example.dto.SampleClassToCreateJsonResponse;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Created by manjit on 14-Oct-17.
 */
public class SampleMsgTransformer {

     public String convertStringToJson(String message){
         SampleClassToCreateJsonResponse msg = SampleClassToCreateJsonResponse.builder()
                 .msg(message).build();
         String jsonMessage = null;
         try {
             jsonMessage = new ObjectMapper().writeValueAsString(msg);
         }catch(IOException e){
             e.printStackTrace();
         }
         return jsonMessage;
     }
}
