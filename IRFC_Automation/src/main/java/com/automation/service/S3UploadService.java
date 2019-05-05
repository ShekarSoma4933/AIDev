package com.automation.service;

import java.io.ByteArrayOutputStream;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

import com.automation.dto.S3UploaderDto;

public abstract interface S3UploadService{
	
  public abstract ByteArrayOutputStream downloadFile(String paramString);
  
  public abstract S3UploaderDto uploadFile(String paramString, MultipartFile paramMultipartFile);
  
  public abstract List<String> listFiles();
  
  public abstract void deleteFile(String paramString);
}