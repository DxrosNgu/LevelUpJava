package edu.designpatterns.behavioral.chainofresponsability;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

  public ClientCertificateAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(String requestType) {
    if (requestType.equals("certificate")) {
      System.out.println("Handling Client Certificate Authentication");
  } else {
    super.handleRequest(requestType);
  }
}

}
