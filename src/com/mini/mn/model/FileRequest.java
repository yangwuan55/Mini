package com.mini.mn.model;

import java.util.ArrayList;
import java.util.List;

import android.os.Parcel;
/**
 * 客户端发送文件数据结构
 *
 * @version 1.0.0
 * @date 2014-2-20
 * @author S.Kei.Cheung
 */
public class FileRequest extends AbstractRequest {

	private static final long serialVersionUID = -4264439118166879834L;

	// 所有文件
	private List<FileContent> files;
	
	public FileRequest() {
		files = new ArrayList<FileContent>();
	}

    public List<FileContent> getFiles() {
        return files;  
    }

    public void setFiles(List<FileContent> files) {
        this.files = files;
    }
    
    @Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeList(files);
		super.writeToParcel(dest, flags);
	}
}
