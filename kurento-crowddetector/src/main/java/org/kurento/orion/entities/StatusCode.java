/*
 * (C) Copyright 2014 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */

package org.kurento.orion.entities;

import com.google.gson.annotations.SerializedName;

/**
 * Status object, that holds the result of the request.
 *
 * @author Ivan Gracia (izanmail@gmail.com)
 *
 */
public final class StatusCode {

  @SerializedName("code")
  private int code;

  @SerializedName("reasonPhrase")
  private String reason;

  @SerializedName("details")
  private String details;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append(" Code: ").append(code).append("\n");
    sb.append(" Reason: ").append(reason).append("\n");
    sb.append(" Details: ").append(details).append("\n");

    return sb.toString();
  }
}
