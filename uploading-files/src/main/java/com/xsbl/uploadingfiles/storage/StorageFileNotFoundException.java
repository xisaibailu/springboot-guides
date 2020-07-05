package com.xsbl.uploadingfiles.storage;

/**
 * @描述:
 * @创建人: Isaac
 * @创建日期: 2020/7/2 17:03
 */
public class StorageFileNotFoundException extends StorageException {

  public StorageFileNotFoundException(String message) {
    super(message);
  }

  public StorageFileNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
