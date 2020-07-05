package com.xsbl.uploadingfiles;

import com.xsbl.uploadingfiles.storage.StorageProperties;
import com.xsbl.uploadingfiles.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Springboot已经为我们自动注册了用于文件上传的MultipartConfigElement
 */
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class UploadingFilesApplication {

  public static void main(String[] args) {
    SpringApplication.run(UploadingFilesApplication.class, args);
  }

  @Bean
  CommandLineRunner init(StorageService storageService){
    return (args -> {
      storageService.deleteAll();
      storageService.init();
    });
  }
}
