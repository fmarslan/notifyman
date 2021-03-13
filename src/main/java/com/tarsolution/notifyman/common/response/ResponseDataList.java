/*
 * Copyright (C) 2011 The Best Company in the World
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * https://github.com/fmarslan/notifyman/blob/master/LICENSE
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tarsolution.notifyman.common.response;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
/**
 * 
 * @author FMARSLAN
 *
 */
public class ResponseDataList<T> extends ResponseData<List<T>> {

  private int totalCount;
  private int offset, limit;

  public ResponseDataList(HttpStatus status) {
    super(status);
  }

  public ResponseDataList(List<T> body, HttpStatus status) {
    super(body, status);
  }

  public ResponseDataList(
      MultiValueMap<String, String> headers,
      HttpStatus status) {
    super(headers, status);
  }

  public ResponseDataList(List<T> body,
      MultiValueMap<String, String> headers,
      HttpStatus status) {
    super(body, headers, status);
  }

  public int getTotalCount() {
    return totalCount;
  }

  public ResponseDataList<T> setTotalCount(int totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  public int getOffset() {
    return offset;
  }

  public ResponseDataList<T> setOffset(int offset) {
    this.offset = offset;
    return this;
  }

  public int getLimit() {
    return limit;
  }

  public ResponseDataList<T> setLimit(int limit) {
    this.limit = limit;
    return this;
  }
}
