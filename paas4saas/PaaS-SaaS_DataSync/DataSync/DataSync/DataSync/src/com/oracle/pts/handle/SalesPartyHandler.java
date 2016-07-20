package com.oracle.pts.handle;

import com.oracle.pts.ws.CRMProcessor;

import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SalesPartyHandler extends EntityHandler {
    public boolean handleMessage(SOAPMessageContext ctx) {
        objectName = CRMProcessor.SALEA_PARTY;
        
        return super.handleMessage(ctx);
    }
}
