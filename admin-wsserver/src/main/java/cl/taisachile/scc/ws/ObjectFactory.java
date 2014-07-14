
package cl.taisachile.scc.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.taisachile.scc.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetGeneratedChallengeByClientResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "getGeneratedChallengeByClientResponse");
    private final static QName _AssignGrid_QNAME = new QName("http://ws.scc.taisachile.cl/", "assignGrid");
    private final static QName _LockDeviceResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "lockDeviceResponse");
    private final static QName _GetUserMG_QNAME = new QName("http://ws.scc.taisachile.cl/", "getUserMG");
    private final static QName _ActivateSoftTokenResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "ActivateSoftTokenResponse");
    private final static QName _LockDevice_QNAME = new QName("http://ws.scc.taisachile.cl/", "lockDevice");
    private final static QName _AddDailyAmount_QNAME = new QName("http://ws.scc.taisachile.cl/", "addDailyAmount");
    private final static QName _CreateSoftToken_QNAME = new QName("http://ws.scc.taisachile.cl/", "CreateSoftToken");
    private final static QName _AssignGridResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "assignGridResponse");
    private final static QName _AssignToken_QNAME = new QName("http://ws.scc.taisachile.cl/", "assignToken");
    private final static QName _AddDailyAmountResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "addDailyAmountResponse");
    private final static QName _UnlockDeviceResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "unlockDeviceResponse");
    private final static QName _GetGeneratedChallengeByClient_QNAME = new QName("http://ws.scc.taisachile.cl/", "getGeneratedChallengeByClient");
    private final static QName _ActivateSoftToken_QNAME = new QName("http://ws.scc.taisachile.cl/", "ActivateSoftToken");
    private final static QName _GetCells_QNAME = new QName("http://ws.scc.taisachile.cl/", "getCells");
    private final static QName _GetUserMGResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "getUserMGResponse");
    private final static QName _GetUser_QNAME = new QName("http://ws.scc.taisachile.cl/", "getUser");
    private final static QName _GetUserResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "getUserResponse");
    private final static QName _CreateSoftTokenResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "CreateSoftTokenResponse");
    private final static QName _UnlockDevice_QNAME = new QName("http://ws.scc.taisachile.cl/", "unlockDevice");
    private final static QName _GetCellsResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "getCellsResponse");
    private final static QName _AssignTokenResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "assignTokenResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.taisachile.scc.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link CreateSoftTokenParamVO }
     * 
     */
    public CreateSoftTokenParamVO createCreateSoftTokenParamVO() {
        return new CreateSoftTokenParamVO();
    }

    /**
     * Create an instance of {@link AssignGridResponse }
     * 
     */
    public AssignGridResponse createAssignGridResponse() {
        return new AssignGridResponse();
    }

    /**
     * Create an instance of {@link AssignTokenParamVO }
     * 
     */
    public AssignTokenParamVO createAssignTokenParamVO() {
        return new AssignTokenParamVO();
    }

    /**
     * Create an instance of {@link GetUserResponseMGVO }
     * 
     */
    public GetUserResponseMGVO createGetUserResponseMGVO() {
        return new GetUserResponseMGVO();
    }

    /**
     * Create an instance of {@link AddDailyAmountParamVO }
     * 
     */
    public AddDailyAmountParamVO createAddDailyAmountParamVO() {
        return new AddDailyAmountParamVO();
    }

    /**
     * Create an instance of {@link UnlockDeviceResponseVO }
     * 
     */
    public UnlockDeviceResponseVO createUnlockDeviceResponseVO() {
        return new UnlockDeviceResponseVO();
    }

    /**
     * Create an instance of {@link DeviceMGVO }
     * 
     */
    public DeviceMGVO createDeviceMGVO() {
        return new DeviceMGVO();
    }

    /**
     * Create an instance of {@link GetUserParamVO }
     * 
     */
    public GetUserParamVO createGetUserParamVO() {
        return new GetUserParamVO();
    }

    /**
     * Create an instance of {@link GetTransaParamVO }
     * 
     */
    public GetTransaParamVO createGetTransaParamVO() {
        return new GetTransaParamVO();
    }

    /**
     * Create an instance of {@link CreateSoftToken }
     * 
     */
    public CreateSoftToken createCreateSoftToken() {
        return new CreateSoftToken();
    }

    /**
     * Create an instance of {@link LockDeviceParamVO }
     * 
     */
    public LockDeviceParamVO createLockDeviceParamVO() {
        return new LockDeviceParamVO();
    }

    /**
     * Create an instance of {@link UnlockDeviceParamVO }
     * 
     */
    public UnlockDeviceParamVO createUnlockDeviceParamVO() {
        return new UnlockDeviceParamVO();
    }

    /**
     * Create an instance of {@link GetCellsParamVO }
     * 
     */
    public GetCellsParamVO createGetCellsParamVO() {
        return new GetCellsParamVO();
    }

    /**
     * Create an instance of {@link LockDeviceResponse }
     * 
     */
    public LockDeviceResponse createLockDeviceResponse() {
        return new LockDeviceResponse();
    }

    /**
     * Create an instance of {@link AssignTokenResponse }
     * 
     */
    public AssignTokenResponse createAssignTokenResponse() {
        return new AssignTokenResponse();
    }

    /**
     * Create an instance of {@link AssignGrid }
     * 
     */
    public AssignGrid createAssignGrid() {
        return new AssignGrid();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link UnlockDevice }
     * 
     */
    public UnlockDevice createUnlockDevice() {
        return new UnlockDevice();
    }

    /**
     * Create an instance of {@link GetCells }
     * 
     */
    public GetCells createGetCells() {
        return new GetCells();
    }

    /**
     * Create an instance of {@link AssignToken }
     * 
     */
    public AssignToken createAssignToken() {
        return new AssignToken();
    }

    /**
     * Create an instance of {@link ContextVO }
     * 
     */
    public ContextVO createContextVO() {
        return new ContextVO();
    }

    /**
     * Create an instance of {@link AddDailyAmountResponse }
     * 
     */
    public AddDailyAmountResponse createAddDailyAmountResponse() {
        return new AddDailyAmountResponse();
    }

    /**
     * Create an instance of {@link LockDeviceResponseVO }
     * 
     */
    public LockDeviceResponseVO createLockDeviceResponseVO() {
        return new LockDeviceResponseVO();
    }

    /**
     * Create an instance of {@link TransactionVO }
     * 
     */
    public TransactionVO createTransactionVO() {
        return new TransactionVO();
    }

    /**
     * Create an instance of {@link AssignGridParamVO }
     * 
     */
    public AssignGridParamVO createAssignGridParamVO() {
        return new AssignGridParamVO();
    }

    /**
     * Create an instance of {@link CreateSoftTokenResponse }
     * 
     */
    public CreateSoftTokenResponse createCreateSoftTokenResponse() {
        return new CreateSoftTokenResponse();
    }

    /**
     * Create an instance of {@link UnlockDeviceResponse }
     * 
     */
    public UnlockDeviceResponse createUnlockDeviceResponse() {
        return new UnlockDeviceResponse();
    }

    /**
     * Create an instance of {@link GetGeneratedChallengeByClient }
     * 
     */
    public GetGeneratedChallengeByClient createGetGeneratedChallengeByClient() {
        return new GetGeneratedChallengeByClient();
    }

    /**
     * Create an instance of {@link GetCellsResponseVO }
     * 
     */
    public GetCellsResponseVO createGetCellsResponseVO() {
        return new GetCellsResponseVO();
    }

    /**
     * Create an instance of {@link AssignTokenResponseVO }
     * 
     */
    public AssignTokenResponseVO createAssignTokenResponseVO() {
        return new AssignTokenResponseVO();
    }

    /**
     * Create an instance of {@link AddDailyAmount }
     * 
     */
    public AddDailyAmount createAddDailyAmount() {
        return new AddDailyAmount();
    }

    /**
     * Create an instance of {@link UserVO }
     * 
     */
    public UserVO createUserVO() {
        return new UserVO();
    }

    /**
     * Create an instance of {@link GetCellsResponse }
     * 
     */
    public GetCellsResponse createGetCellsResponse() {
        return new GetCellsResponse();
    }

    /**
     * Create an instance of {@link AssignGridResponseVO }
     * 
     */
    public AssignGridResponseVO createAssignGridResponseVO() {
        return new AssignGridResponseVO();
    }

    /**
     * Create an instance of {@link GetUserMG }
     * 
     */
    public GetUserMG createGetUserMG() {
        return new GetUserMG();
    }

    /**
     * Create an instance of {@link DeviceVO }
     * 
     */
    public DeviceVO createDeviceVO() {
        return new DeviceVO();
    }

    /**
     * Create an instance of {@link GetTransaResponseVO }
     * 
     */
    public GetTransaResponseVO createGetTransaResponseVO() {
        return new GetTransaResponseVO();
    }

    /**
     * Create an instance of {@link ActivateSoftTokenResponse }
     * 
     */
    public ActivateSoftTokenResponse createActivateSoftTokenResponse() {
        return new ActivateSoftTokenResponse();
    }

    /**
     * Create an instance of {@link GetUserResponseVO }
     * 
     */
    public GetUserResponseVO createGetUserResponseVO() {
        return new GetUserResponseVO();
    }

    /**
     * Create an instance of {@link AddDailyAmountResponseVO }
     * 
     */
    public AddDailyAmountResponseVO createAddDailyAmountResponseVO() {
        return new AddDailyAmountResponseVO();
    }

    /**
     * Create an instance of {@link CellVO }
     * 
     */
    public CellVO createCellVO() {
        return new CellVO();
    }

    /**
     * Create an instance of {@link MoneyVO }
     * 
     */
    public MoneyVO createMoneyVO() {
        return new MoneyVO();
    }

    /**
     * Create an instance of {@link ContactoInfoVO }
     * 
     */
    public ContactoInfoVO createContactoInfoVO() {
        return new ContactoInfoVO();
    }

    /**
     * Create an instance of {@link ActivateSoftTokenParamVO }
     * 
     */
    public ActivateSoftTokenParamVO createActivateSoftTokenParamVO() {
        return new ActivateSoftTokenParamVO();
    }

    /**
     * Create an instance of {@link GetGeneratedChallengeByClientResponse }
     * 
     */
    public GetGeneratedChallengeByClientResponse createGetGeneratedChallengeByClientResponse() {
        return new GetGeneratedChallengeByClientResponse();
    }

    /**
     * Create an instance of {@link ActivateSoftToken }
     * 
     */
    public ActivateSoftToken createActivateSoftToken() {
        return new ActivateSoftToken();
    }

    /**
     * Create an instance of {@link GetUserMGResponse }
     * 
     */
    public GetUserMGResponse createGetUserMGResponse() {
        return new GetUserMGResponse();
    }

    /**
     * Create an instance of {@link ActivateSoftTokenResponseVO }
     * 
     */
    public ActivateSoftTokenResponseVO createActivateSoftTokenResponseVO() {
        return new ActivateSoftTokenResponseVO();
    }

    /**
     * Create an instance of {@link LockDevice }
     * 
     */
    public LockDevice createLockDevice() {
        return new LockDevice();
    }

    /**
     * Create an instance of {@link CreateSoftTokenResponseVO }
     * 
     */
    public CreateSoftTokenResponseVO createCreateSoftTokenResponseVO() {
        return new CreateSoftTokenResponseVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeneratedChallengeByClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "getGeneratedChallengeByClientResponse")
    public JAXBElement<GetGeneratedChallengeByClientResponse> createGetGeneratedChallengeByClientResponse(GetGeneratedChallengeByClientResponse value) {
        return new JAXBElement<GetGeneratedChallengeByClientResponse>(_GetGeneratedChallengeByClientResponse_QNAME, GetGeneratedChallengeByClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignGrid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "assignGrid")
    public JAXBElement<AssignGrid> createAssignGrid(AssignGrid value) {
        return new JAXBElement<AssignGrid>(_AssignGrid_QNAME, AssignGrid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "lockDeviceResponse")
    public JAXBElement<LockDeviceResponse> createLockDeviceResponse(LockDeviceResponse value) {
        return new JAXBElement<LockDeviceResponse>(_LockDeviceResponse_QNAME, LockDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserMG }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "getUserMG")
    public JAXBElement<GetUserMG> createGetUserMG(GetUserMG value) {
        return new JAXBElement<GetUserMG>(_GetUserMG_QNAME, GetUserMG.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateSoftTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "ActivateSoftTokenResponse")
    public JAXBElement<ActivateSoftTokenResponse> createActivateSoftTokenResponse(ActivateSoftTokenResponse value) {
        return new JAXBElement<ActivateSoftTokenResponse>(_ActivateSoftTokenResponse_QNAME, ActivateSoftTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "lockDevice")
    public JAXBElement<LockDevice> createLockDevice(LockDevice value) {
        return new JAXBElement<LockDevice>(_LockDevice_QNAME, LockDevice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDailyAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "addDailyAmount")
    public JAXBElement<AddDailyAmount> createAddDailyAmount(AddDailyAmount value) {
        return new JAXBElement<AddDailyAmount>(_AddDailyAmount_QNAME, AddDailyAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSoftToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "CreateSoftToken")
    public JAXBElement<CreateSoftToken> createCreateSoftToken(CreateSoftToken value) {
        return new JAXBElement<CreateSoftToken>(_CreateSoftToken_QNAME, CreateSoftToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignGridResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "assignGridResponse")
    public JAXBElement<AssignGridResponse> createAssignGridResponse(AssignGridResponse value) {
        return new JAXBElement<AssignGridResponse>(_AssignGridResponse_QNAME, AssignGridResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "assignToken")
    public JAXBElement<AssignToken> createAssignToken(AssignToken value) {
        return new JAXBElement<AssignToken>(_AssignToken_QNAME, AssignToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDailyAmountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "addDailyAmountResponse")
    public JAXBElement<AddDailyAmountResponse> createAddDailyAmountResponse(AddDailyAmountResponse value) {
        return new JAXBElement<AddDailyAmountResponse>(_AddDailyAmountResponse_QNAME, AddDailyAmountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlockDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "unlockDeviceResponse")
    public JAXBElement<UnlockDeviceResponse> createUnlockDeviceResponse(UnlockDeviceResponse value) {
        return new JAXBElement<UnlockDeviceResponse>(_UnlockDeviceResponse_QNAME, UnlockDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeneratedChallengeByClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "getGeneratedChallengeByClient")
    public JAXBElement<GetGeneratedChallengeByClient> createGetGeneratedChallengeByClient(GetGeneratedChallengeByClient value) {
        return new JAXBElement<GetGeneratedChallengeByClient>(_GetGeneratedChallengeByClient_QNAME, GetGeneratedChallengeByClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateSoftToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "ActivateSoftToken")
    public JAXBElement<ActivateSoftToken> createActivateSoftToken(ActivateSoftToken value) {
        return new JAXBElement<ActivateSoftToken>(_ActivateSoftToken_QNAME, ActivateSoftToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCells }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "getCells")
    public JAXBElement<GetCells> createGetCells(GetCells value) {
        return new JAXBElement<GetCells>(_GetCells_QNAME, GetCells.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserMGResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "getUserMGResponse")
    public JAXBElement<GetUserMGResponse> createGetUserMGResponse(GetUserMGResponse value) {
        return new JAXBElement<GetUserMGResponse>(_GetUserMGResponse_QNAME, GetUserMGResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSoftTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "CreateSoftTokenResponse")
    public JAXBElement<CreateSoftTokenResponse> createCreateSoftTokenResponse(CreateSoftTokenResponse value) {
        return new JAXBElement<CreateSoftTokenResponse>(_CreateSoftTokenResponse_QNAME, CreateSoftTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlockDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "unlockDevice")
    public JAXBElement<UnlockDevice> createUnlockDevice(UnlockDevice value) {
        return new JAXBElement<UnlockDevice>(_UnlockDevice_QNAME, UnlockDevice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCellsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "getCellsResponse")
    public JAXBElement<GetCellsResponse> createGetCellsResponse(GetCellsResponse value) {
        return new JAXBElement<GetCellsResponse>(_GetCellsResponse_QNAME, GetCellsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "assignTokenResponse")
    public JAXBElement<AssignTokenResponse> createAssignTokenResponse(AssignTokenResponse value) {
        return new JAXBElement<AssignTokenResponse>(_AssignTokenResponse_QNAME, AssignTokenResponse.class, null, value);
    }

}
