package com.example;

import com.example.SampleTaskOuterClass.SampleTask;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        final var obj = SampleTask.newBuilder().setTaskId("taskId").addAllTags(List.of("a", "b")).build();
        final var serialized = obj.toByteArray();
        final var parsed = SampleTask.parseFrom(serialized);

        System.out.println(obj);
        System.out.println(parsed);
    }
}
