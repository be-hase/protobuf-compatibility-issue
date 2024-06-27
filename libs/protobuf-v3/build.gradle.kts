plugins {
    id("conventions.java")
    `java-library`
    alias(libs.plugins.protobuf)
}

dependencies {
    api("com.google.protobuf:protobuf-java:${libs.versions.protobuf.v3.get()}")
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:${libs.versions.protobuf.v3.get()}"
    }
}
