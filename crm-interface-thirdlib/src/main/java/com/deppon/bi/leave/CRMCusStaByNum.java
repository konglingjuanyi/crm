package com.deppon.bi.leave;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2012-05-08T15:22:57.147+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://www.example.org/CRM_CusStaByNum/", name = "CRM_CusStaByNum")
@XmlSeeAlso({ObjectFactory.class})
public interface CRMCusStaByNum {

    @WebResult(name = "out1", targetNamespace = "http://www.example.org/CRM_CusStaByNum/")
    @RequestWrapper(localName = "NewOperation", targetNamespace = "http://www.example.org/CRM_CusStaByNum/", className = "com.deppon.bi.leave.NewOperation")
    @WebMethod(operationName = "NewOperation")
    @ResponseWrapper(localName = "NewOperationResponse", targetNamespace = "http://www.example.org/CRM_CusStaByNum/", className = "com.deppon.bi.leave.NewOperationResponse")
    public java.lang.String newOperation(
        @WebParam(name = "in0", targetNamespace = "http://www.example.org/CRM_CusStaByNum/")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://www.example.org/CRM_CusStaByNum/")
        java.util.Date in1
    );
}
