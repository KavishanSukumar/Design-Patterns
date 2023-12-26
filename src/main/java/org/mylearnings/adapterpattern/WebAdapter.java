package org.mylearnings.adapterpattern;

import netscape.javascript.JSObject;

public class WebAdapter implements WebRequester{
    private WebService service;

    public void connect(WebService service){
        this.service=service;
    }
    @Override
    public int request(Object object) {
      JSObject jsObject=this.toJson(object);
      JSObject response=service.request(jsObject);
      if (response!=null){
          return 200;
      }
      return 500;
    }

    private JSObject toJson(Object request) {
        return null;
    }
}
