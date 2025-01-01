package com.example.exploremnimages.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * Domain Document Class for an Image.
 */
@Document(collection = "images")
@Data
public class Image {

    @Id
    private String id;
    
    private String fileName;
    private byte[] data;
    
	public void setFileName(String originalFilename) {
		this.fileName=originalFilename;		
	}
	public void setData(byte[] bytes) {
		this.data=bytes;
		
	}
	public String getId() {
		
		return this.id;
	}
	public String getFileName() {
		return this.fileName;
	}
	public byte[] getData() {
		 
		return this.data;
	}
    
    
}
