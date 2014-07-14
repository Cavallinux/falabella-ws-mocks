package cl.taisachile.scc.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-07-13T16:03:56.498-04:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://ws.scc.taisachile.cl/", name = "AdministrationWS")
@XmlSeeAlso({ObjectFactory.class})
public interface AdministrationWS {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "CreateSoftToken", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.CreateSoftToken")
    @WebMethod(operationName = "CreateSoftToken")
    @ResponseWrapper(localName = "CreateSoftTokenResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.CreateSoftTokenResponse")
    public cl.taisachile.scc.ws.CreateSoftTokenResponseVO createSoftToken(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.CreateSoftTokenParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "assignToken", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.AssignToken")
    @WebMethod
    @ResponseWrapper(localName = "assignTokenResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.AssignTokenResponse")
    public cl.taisachile.scc.ws.AssignTokenResponseVO assignToken(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.AssignTokenParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "assignGrid", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.AssignGrid")
    @WebMethod
    @ResponseWrapper(localName = "assignGridResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.AssignGridResponse")
    public cl.taisachile.scc.ws.AssignGridResponseVO assignGrid(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.AssignGridParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getGeneratedChallengeByClient", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GetGeneratedChallengeByClient")
    @WebMethod
    @ResponseWrapper(localName = "getGeneratedChallengeByClientResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GetGeneratedChallengeByClientResponse")
    public cl.taisachile.scc.ws.GetTransaResponseVO getGeneratedChallengeByClient(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.GetTransaParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getUserMG", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GetUserMG")
    @WebMethod
    @ResponseWrapper(localName = "getUserMGResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GetUserMGResponse")
    public cl.taisachile.scc.ws.GetUserResponseMGVO getUserMG(
        @WebParam(name = "getUserParam", targetNamespace = "")
        cl.taisachile.scc.ws.GetUserParamVO getUserParam
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GetUser")
    @WebMethod
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GetUserResponse")
    public cl.taisachile.scc.ws.GetUserResponseVO getUser(
        @WebParam(name = "getUserParam", targetNamespace = "")
        cl.taisachile.scc.ws.GetUserParamVO getUserParam
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "addDailyAmount", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.AddDailyAmount")
    @WebMethod
    @ResponseWrapper(localName = "addDailyAmountResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.AddDailyAmountResponse")
    public cl.taisachile.scc.ws.AddDailyAmountResponseVO addDailyAmount(
        @WebParam(name = "addDailyAmountParam", targetNamespace = "")
        cl.taisachile.scc.ws.AddDailyAmountParamVO addDailyAmountParam
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "ActivateSoftToken", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.ActivateSoftToken")
    @WebMethod(operationName = "ActivateSoftToken")
    @ResponseWrapper(localName = "ActivateSoftTokenResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.ActivateSoftTokenResponse")
    public cl.taisachile.scc.ws.ActivateSoftTokenResponseVO activateSoftToken(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.ActivateSoftTokenParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "lockDevice", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.LockDevice")
    @WebMethod
    @ResponseWrapper(localName = "lockDeviceResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.LockDeviceResponse")
    public cl.taisachile.scc.ws.LockDeviceResponseVO lockDevice(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.LockDeviceParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCells", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GetCells")
    @WebMethod
    @ResponseWrapper(localName = "getCellsResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GetCellsResponse")
    public cl.taisachile.scc.ws.GetCellsResponseVO getCells(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.GetCellsParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "unlockDevice", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.UnlockDevice")
    @WebMethod
    @ResponseWrapper(localName = "unlockDeviceResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.UnlockDeviceResponse")
    public cl.taisachile.scc.ws.UnlockDeviceResponseVO unlockDevice(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.UnlockDeviceParamVO params
    );
}
