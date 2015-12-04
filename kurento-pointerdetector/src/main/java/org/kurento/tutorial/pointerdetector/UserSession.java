
package org.kurento.tutorial.pointerdetector;

import org.kurento.client.IceCandidate;
import org.kurento.client.MediaPipeline;
import org.kurento.client.WebRtcEndpoint;

public class UserSession {
  private WebRtcEndpoint webRtcEndpoint;
  private MediaPipeline mediaPipeline;

  UserSession() {
  }

  public WebRtcEndpoint getWebRtcEndpoint() {
    return webRtcEndpoint;
  }

  public void setWebRtcEndpoint(WebRtcEndpoint webRtcEndpoint) {
    this.webRtcEndpoint = webRtcEndpoint;
  }

  public MediaPipeline getMediaPipeline() {
    return mediaPipeline;
  }

  public void setMediaPipeline(MediaPipeline mediaPipeline) {
    this.mediaPipeline = mediaPipeline;
  }

  public void addCandidate(IceCandidate candidate) {
    webRtcEndpoint.addIceCandidate(candidate);
  }

  public void release() {
    this.mediaPipeline.release();
  }
}
