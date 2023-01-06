dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation(project(":subprojects:domain"))
}

tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}
