package com.deppon.ebm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2012-08-29T10:35:52.515+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://ws.shared.aliOrder.module.alibaba.deppon.com/", name = "QueryOrderStatusService")
@XmlSeeAlso({ObjectFactory.class})
public interface QueryOrderStatusService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "queryOrderStatus", targetNamespace = "http://ws.shared.aliOrder.module.alibaba.deppon.com/", className = "com.deppon.ebm.QueryOrderStatus")
    @WebMethod
    @ResponseWrapper(localName = "queryOrderStatusResponse", targetNamespace = "http://ws.shared.aliOrder.module.alibaba.deppon.com/", className = "com.deppon.ebm.QueryOrderStatusResponse")
    public com.deppon.ebm.OrderStatusTraceInfo queryOrderStatus(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}