plugins {
    id("conventions.java")
}

dependencies {
    implementation(enforcedPlatform("com.google.protobuf:protobuf-bom:${libs.versions.protobuf.v4.get()}"))
    implementation("com.google.protobuf:protobuf-java")
    implementation(projects.libs.protobufV3)
}
