package com.automation.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(path={"/welcome"})
public class FileToFileController{
	
	
	 private static final Logger logger = LoggerFactory.getLogger(FileToFileController.class);
 
	 @RequestMapping(value={"/signIn"}, method={RequestMethod.GET})
	 public ModelAndView homePage() { 
		 logger.info("Welcome signIn!");
	   ModelAndView modelAndView = new ModelAndView("main");
	   return modelAndView;
	 }
	 
	 @RequestMapping(value={"/uploadFilePage"}, method={RequestMethod.GET})
	 public ModelAndView uploadFilePage() { 
		 logger.info("Welcome to uploadFilePage!");
	   ModelAndView modelAndView = new ModelAndView("uploadFile");
	   return modelAndView;
	 }
	 
	/* @PostMapping({"/upload"})
	 public String uploadMultipartFile(@RequestParam("uploadfile") MultipartFile file) {
	   String keyName = file.getOriginalFilename();
	   if ((file != null) && (!file.isEmpty())) {
	     s3UploadService.uploadFile(keyName, file);
	     return keyName + " File Uploaded Successfully ";
	   }
	   return "Please select some file";
	 }
	
	 @GetMapping({"/getfile/{keyname}"})
	 public ResponseEntity<byte[]> downloadFile(@PathVariable String keyname){
	   ByteArrayOutputStream downloadInputStream = s3UploadService.downloadFile(keyname);
	   
	   return ((ResponseEntity.BodyBuilder)ResponseEntity.ok().contentType(contentType(keyname)).header("Content-Disposition", new String[] { "attachment; filename=\"" + keyname + "\"" }))
	     .body(downloadInputStream.toByteArray());
	 }

	 @GetMapping({"/getAllFiles"})
	 public List<String> listAllFiles(){
	   List<String> listOfFiles = s3UploadService.listFiles();
	   return listOfFiles;
	 }
	 
	 private MediaType contentType(String keyname) {
			String[] arr = keyname.split("\\.");
			String type = arr[arr.length-1];
			switch(type) {
				case "txt": return MediaType.TEXT_PLAIN;
				case "png": return MediaType.IMAGE_PNG;
				case "jpg": return MediaType.IMAGE_JPEG;
				default: return MediaType.APPLICATION_OCTET_STREAM;
			}
		}
	
	
	 @RequestMapping(value={"/deleteFile"}, method={org.springframework.web.bind.annotation.RequestMethod.POST, org.springframework.web.bind.annotation.RequestMethod.GET}, produces={"application/json"}, consumes={"application/json"})
	 @ResponseBody
	 public void deleteMultipartFile(@RequestBody S3UploaderDto s3UploaderDto){
	   try{
	     s3UploadService.deleteFile(s3UploaderDto.getKeyName());
	   }
	   catch (Exception e) {
	     e.printStackTrace();
	   }
	 }*/
	}

