/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-01-14 17:53:03 UTC)
 * on 2015-03-19 at 20:55:27 UTC 
 * Modify at your own risk.
 */

package com.appspot.enhanced_cable_88320.aroundmeapi.model;

/**
 * Model definition for UserLocation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the aroundmeapi. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserLocation extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeoPt point;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime timeStamp;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public UserLocation setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GeoPt getPoint() {
    return point;
  }

  /**
   * @param point point or {@code null} for none
   */
  public UserLocation setPoint(GeoPt point) {
    this.point = point;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getTimeStamp() {
    return timeStamp;
  }

  /**
   * @param timeStamp timeStamp or {@code null} for none
   */
  public UserLocation setTimeStamp(com.google.api.client.util.DateTime timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  @Override
  public UserLocation set(String fieldName, Object value) {
    return (UserLocation) super.set(fieldName, value);
  }

  @Override
  public UserLocation clone() {
    return (UserLocation) super.clone();
  }

}
