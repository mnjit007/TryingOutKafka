package com.kafka.example.dto;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

/**
 * Created by manjit on 14-Oct-17.
 */
@Getter
@Builder
public class SampleClassToCreateJsonResponse implements Serializable{

    private String msg;
}
