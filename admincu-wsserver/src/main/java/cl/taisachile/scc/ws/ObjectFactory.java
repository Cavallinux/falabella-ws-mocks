
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

    private final static QName _ValidateSecurityCodeResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "validateSecurityCodeResponse");
    private final static QName _GenerateChangePasswordSecurityCode_QNAME = new QName("http://ws.scc.taisachile.cl/", "generateChangePasswordSecurityCode");
    private final static QName _CreateUserResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "createUserResponse");
    private final static QName _ValidateSecurityCode_QNAME = new QName("http://ws.scc.taisachile.cl/", "validateSecurityCode");
    private final static QName _LockUserByDeviceResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "lockUserByDeviceResponse");
    private final static QName _DeleteUserCUResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "deleteUserCUResponse");
    private final static QName _DeleteUserCU_QNAME = new QName("http://ws.scc.taisachile.cl/", "deleteUserCU");
    private final static QName _ChangePassword_QNAME = new QName("http://ws.scc.taisachile.cl/", "changePassword");
    private final static QName _GetGenericOptionsResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "getGenericOptionsResponse");
    private final static QName _GetUserCUResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "getUserCUResponse");
    private final static QName _GenerateChangePasswordSecurityCodeResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "generateChangePasswordSecurityCodeResponse");
    private final static QName _GetGenericOptions_QNAME = new QName("http://ws.scc.taisachile.cl/", "getGenericOptions");
    private final static QName _ChangePasswordResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "changePasswordResponse");
    private final static QName _GetUserCU_QNAME = new QName("http://ws.scc.taisachile.cl/", "getUserCU");
    private final static QName _LockUserByDevice_QNAME = new QName("http://ws.scc.taisachile.cl/", "lockUserByDevice");
    private final static QName _ValidateChangePasswordSecurityCode_QNAME = new QName("http://ws.scc.taisachile.cl/", "validateChangePasswordSecurityCode");
    private final static QName _ExistChangePasswordSecurityCodeCurrentResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "existChangePasswordSecurityCodeCurrentResponse");
    private final static QName _ExistChangePasswordSecurityCodeCurrent_QNAME = new QName("http://ws.scc.taisachile.cl/", "existChangePasswordSecurityCodeCurrent");
    private final static QName _ValidateChangePasswordSecurityCodeResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "validateChangePasswordSecurityCodeResponse");
    private final static QName _ChangeLevelSecurity_QNAME = new QName("http://ws.scc.taisachile.cl/", "changeLevelSecurity");
    private final static QName _ChangeLevelSecurityResponse_QNAME = new QName("http://ws.scc.taisachile.cl/", "changeLevelSecurityResponse");
    private final static QName _CreateUser_QNAME = new QName("http://ws.scc.taisachile.cl/", "createUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.taisachile.scc.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateUserParamVO }
     * 
     */
    public CreateUserParamVO createCreateUserParamVO() {
        return new CreateUserParamVO();
    }

    /**
     * Create an instance of {@link GenerateChangePasswordSecurityCodeResponse }
     * 
     */
    public GenerateChangePasswordSecurityCodeResponse createGenerateChangePasswordSecurityCodeResponse() {
        return new GenerateChangePasswordSecurityCodeResponse();
    }

    /**
     * Create an instance of {@link ValidateSecurityCode }
     * 
     */
    public ValidateSecurityCode createValidateSecurityCode() {
        return new ValidateSecurityCode();
    }

    /**
     * Create an instance of {@link ValidateSecurityCodeResponseVO }
     * 
     */
    public ValidateSecurityCodeResponseVO createValidateSecurityCodeResponseVO() {
        return new ValidateSecurityCodeResponseVO();
    }

    /**
     * Create an instance of {@link ExistActivationCodeCurrentResponseVO }
     * 
     */
    public ExistActivationCodeCurrentResponseVO createExistActivationCodeCurrentResponseVO() {
        return new ExistActivationCodeCurrentResponseVO();
    }

    /**
     * Create an instance of {@link ChangePasswordResponseVO }
     * 
     */
    public ChangePasswordResponseVO createChangePasswordResponseVO() {
        return new ChangePasswordResponseVO();
    }

    /**
     * Create an instance of {@link DeviceVO }
     * 
     */
    public DeviceVO createDeviceVO() {
        return new DeviceVO();
    }

    /**
     * Create an instance of {@link ContactoInfoVO }
     * 
     */
    public ContactoInfoVO createContactoInfoVO() {
        return new ContactoInfoVO();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link DeleteUserCU }
     * 
     */
    public DeleteUserCU createDeleteUserCU() {
        return new DeleteUserCU();
    }

    /**
     * Create an instance of {@link ChangeLevelSecurityResponseVO }
     * 
     */
    public ChangeLevelSecurityResponseVO createChangeLevelSecurityResponseVO() {
        return new ChangeLevelSecurityResponseVO();
    }

    /**
     * Create an instance of {@link GetUserCUParamVO }
     * 
     */
    public GetUserCUParamVO createGetUserCUParamVO() {
        return new GetUserCUParamVO();
    }

    /**
     * Create an instance of {@link GetGenericOptionsParamVO }
     * 
     */
    public GetGenericOptionsParamVO createGetGenericOptionsParamVO() {
        return new GetGenericOptionsParamVO();
    }

    /**
     * Create an instance of {@link ValidateChangePasswordSecurityCodeResponseVO }
     * 
     */
    public ValidateChangePasswordSecurityCodeResponseVO createValidateChangePasswordSecurityCodeResponseVO() {
        return new ValidateChangePasswordSecurityCodeResponseVO();
    }

    /**
     * Create an instance of {@link ChangeLevelSecurityParamVO }
     * 
     */
    public ChangeLevelSecurityParamVO createChangeLevelSecurityParamVO() {
        return new ChangeLevelSecurityParamVO();
    }

    /**
     * Create an instance of {@link UserVO }
     * 
     */
    public UserVO createUserVO() {
        return new UserVO();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link GenericOptionVO }
     * 
     */
    public GenericOptionVO createGenericOptionVO() {
        return new GenericOptionVO();
    }

    /**
     * Create an instance of {@link GetUserCUResponseVO }
     * 
     */
    public GetUserCUResponseVO createGetUserCUResponseVO() {
        return new GetUserCUResponseVO();
    }

    /**
     * Create an instance of {@link GetGenericOptions }
     * 
     */
    public GetGenericOptions createGetGenericOptions() {
        return new GetGenericOptions();
    }

    /**
     * Create an instance of {@link ValidateChangePasswordSecurityCodeResponse }
     * 
     */
    public ValidateChangePasswordSecurityCodeResponse createValidateChangePasswordSecurityCodeResponse() {
        return new ValidateChangePasswordSecurityCodeResponse();
    }

    /**
     * Create an instance of {@link LockUserResponseVO }
     * 
     */
    public LockUserResponseVO createLockUserResponseVO() {
        return new LockUserResponseVO();
    }

    /**
     * Create an instance of {@link ChangeLevelSecurityResponse }
     * 
     */
    public ChangeLevelSecurityResponse createChangeLevelSecurityResponse() {
        return new ChangeLevelSecurityResponse();
    }

    /**
     * Create an instance of {@link CreateUserResponseVO }
     * 
     */
    public CreateUserResponseVO createCreateUserResponseVO() {
        return new CreateUserResponseVO();
    }

    /**
     * Create an instance of {@link ValidateChangePasswordSecurityCodeParamVO }
     * 
     */
    public ValidateChangePasswordSecurityCodeParamVO createValidateChangePasswordSecurityCodeParamVO() {
        return new ValidateChangePasswordSecurityCodeParamVO();
    }

    /**
     * Create an instance of {@link ContextVO }
     * 
     */
    public ContextVO createContextVO() {
        return new ContextVO();
    }

    /**
     * Create an instance of {@link LockUserParamVO }
     * 
     */
    public LockUserParamVO createLockUserParamVO() {
        return new LockUserParamVO();
    }

    /**
     * Create an instance of {@link GetGenericOptionsResponseVO }
     * 
     */
    public GetGenericOptionsResponseVO createGetGenericOptionsResponseVO() {
        return new GetGenericOptionsResponseVO();
    }

    /**
     * Create an instance of {@link GenerateChangePasswordSecurityCodeParamVO }
     * 
     */
    public GenerateChangePasswordSecurityCodeParamVO createGenerateChangePasswordSecurityCodeParamVO() {
        return new GenerateChangePasswordSecurityCodeParamVO();
    }

    /**
     * Create an instance of {@link GetGenericOptionsResponse }
     * 
     */
    public GetGenericOptionsResponse createGetGenericOptionsResponse() {
        return new GetGenericOptionsResponse();
    }

    /**
     * Create an instance of {@link ChangePasswordParamVO }
     * 
     */
    public ChangePasswordParamVO createChangePasswordParamVO() {
        return new ChangePasswordParamVO();
    }

    /**
     * Create an instance of {@link GenerateChangePasswordSecurityCodeResponseVO }
     * 
     */
    public GenerateChangePasswordSecurityCodeResponseVO createGenerateChangePasswordSecurityCodeResponseVO() {
        return new GenerateChangePasswordSecurityCodeResponseVO();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link QuestionAnswerVO }
     * 
     */
    public QuestionAnswerVO createQuestionAnswerVO() {
        return new QuestionAnswerVO();
    }

    /**
     * Create an instance of {@link DeleteUserCUParamVO }
     * 
     */
    public DeleteUserCUParamVO createDeleteUserCUParamVO() {
        return new DeleteUserCUParamVO();
    }

    /**
     * Create an instance of {@link ValidateSecurityCodeResponse }
     * 
     */
    public ValidateSecurityCodeResponse createValidateSecurityCodeResponse() {
        return new ValidateSecurityCodeResponse();
    }

    /**
     * Create an instance of {@link ChangeLevelSecurity }
     * 
     */
    public ChangeLevelSecurity createChangeLevelSecurity() {
        return new ChangeLevelSecurity();
    }

    /**
     * Create an instance of {@link ExistActivationCodeCurrentParamVO }
     * 
     */
    public ExistActivationCodeCurrentParamVO createExistActivationCodeCurrentParamVO() {
        return new ExistActivationCodeCurrentParamVO();
    }

    /**
     * Create an instance of {@link LockUserByDeviceResponse }
     * 
     */
    public LockUserByDeviceResponse createLockUserByDeviceResponse() {
        return new LockUserByDeviceResponse();
    }

    /**
     * Create an instance of {@link ExistChangePasswordSecurityCodeCurrentResponse }
     * 
     */
    public ExistChangePasswordSecurityCodeCurrentResponse createExistChangePasswordSecurityCodeCurrentResponse() {
        return new ExistChangePasswordSecurityCodeCurrentResponse();
    }

    /**
     * Create an instance of {@link LockUserByDevice }
     * 
     */
    public LockUserByDevice createLockUserByDevice() {
        return new LockUserByDevice();
    }

    /**
     * Create an instance of {@link DeleteUserCUResponse }
     * 
     */
    public DeleteUserCUResponse createDeleteUserCUResponse() {
        return new DeleteUserCUResponse();
    }

    /**
     * Create an instance of {@link GenerateChangePasswordSecurityCode }
     * 
     */
    public GenerateChangePasswordSecurityCode createGenerateChangePasswordSecurityCode() {
        return new GenerateChangePasswordSecurityCode();
    }

    /**
     * Create an instance of {@link DeleteUserCUResponseVO }
     * 
     */
    public DeleteUserCUResponseVO createDeleteUserCUResponseVO() {
        return new DeleteUserCUResponseVO();
    }

    /**
     * Create an instance of {@link GetUserCUResponse }
     * 
     */
    public GetUserCUResponse createGetUserCUResponse() {
        return new GetUserCUResponse();
    }

    /**
     * Create an instance of {@link ExistChangePasswordSecurityCodeCurrent }
     * 
     */
    public ExistChangePasswordSecurityCodeCurrent createExistChangePasswordSecurityCodeCurrent() {
        return new ExistChangePasswordSecurityCodeCurrent();
    }

    /**
     * Create an instance of {@link GetUserCU }
     * 
     */
    public GetUserCU createGetUserCU() {
        return new GetUserCU();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link ValidateChangePasswordSecurityCode }
     * 
     */
    public ValidateChangePasswordSecurityCode createValidateChangePasswordSecurityCode() {
        return new ValidateChangePasswordSecurityCode();
    }

    /**
     * Create an instance of {@link ValidateSecurityCodeParamVO }
     * 
     */
    public ValidateSecurityCodeParamVO createValidateSecurityCodeParamVO() {
        return new ValidateSecurityCodeParamVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSecurityCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "validateSecurityCodeResponse")
    public JAXBElement<ValidateSecurityCodeResponse> createValidateSecurityCodeResponse(ValidateSecurityCodeResponse value) {
        return new JAXBElement<ValidateSecurityCodeResponse>(_ValidateSecurityCodeResponse_QNAME, ValidateSecurityCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateChangePasswordSecurityCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "generateChangePasswordSecurityCode")
    public JAXBElement<GenerateChangePasswordSecurityCode> createGenerateChangePasswordSecurityCode(GenerateChangePasswordSecurityCode value) {
        return new JAXBElement<GenerateChangePasswordSecurityCode>(_GenerateChangePasswordSecurityCode_QNAME, GenerateChangePasswordSecurityCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSecurityCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "validateSecurityCode")
    public JAXBElement<ValidateSecurityCode> createValidateSecurityCode(ValidateSecurityCode value) {
        return new JAXBElement<ValidateSecurityCode>(_ValidateSecurityCode_QNAME, ValidateSecurityCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockUserByDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "lockUserByDeviceResponse")
    public JAXBElement<LockUserByDeviceResponse> createLockUserByDeviceResponse(LockUserByDeviceResponse value) {
        return new JAXBElement<LockUserByDeviceResponse>(_LockUserByDeviceResponse_QNAME, LockUserByDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserCUResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "deleteUserCUResponse")
    public JAXBElement<DeleteUserCUResponse> createDeleteUserCUResponse(DeleteUserCUResponse value) {
        return new JAXBElement<DeleteUserCUResponse>(_DeleteUserCUResponse_QNAME, DeleteUserCUResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserCU }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "deleteUserCU")
    public JAXBElement<DeleteUserCU> createDeleteUserCU(DeleteUserCU value) {
        return new JAXBElement<DeleteUserCU>(_DeleteUserCU_QNAME, DeleteUserCU.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "changePassword")
    public JAXBElement<ChangePassword> createChangePassword(ChangePassword value) {
        return new JAXBElement<ChangePassword>(_ChangePassword_QNAME, ChangePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGenericOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "getGenericOptionsResponse")
    public JAXBElement<GetGenericOptionsResponse> createGetGenericOptionsResponse(GetGenericOptionsResponse value) {
        return new JAXBElement<GetGenericOptionsResponse>(_GetGenericOptionsResponse_QNAME, GetGenericOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserCUResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "getUserCUResponse")
    public JAXBElement<GetUserCUResponse> createGetUserCUResponse(GetUserCUResponse value) {
        return new JAXBElement<GetUserCUResponse>(_GetUserCUResponse_QNAME, GetUserCUResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateChangePasswordSecurityCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "generateChangePasswordSecurityCodeResponse")
    public JAXBElement<GenerateChangePasswordSecurityCodeResponse> createGenerateChangePasswordSecurityCodeResponse(GenerateChangePasswordSecurityCodeResponse value) {
        return new JAXBElement<GenerateChangePasswordSecurityCodeResponse>(_GenerateChangePasswordSecurityCodeResponse_QNAME, GenerateChangePasswordSecurityCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGenericOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "getGenericOptions")
    public JAXBElement<GetGenericOptions> createGetGenericOptions(GetGenericOptions value) {
        return new JAXBElement<GetGenericOptions>(_GetGenericOptions_QNAME, GetGenericOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "changePasswordResponse")
    public JAXBElement<ChangePasswordResponse> createChangePasswordResponse(ChangePasswordResponse value) {
        return new JAXBElement<ChangePasswordResponse>(_ChangePasswordResponse_QNAME, ChangePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserCU }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "getUserCU")
    public JAXBElement<GetUserCU> createGetUserCU(GetUserCU value) {
        return new JAXBElement<GetUserCU>(_GetUserCU_QNAME, GetUserCU.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockUserByDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "lockUserByDevice")
    public JAXBElement<LockUserByDevice> createLockUserByDevice(LockUserByDevice value) {
        return new JAXBElement<LockUserByDevice>(_LockUserByDevice_QNAME, LockUserByDevice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateChangePasswordSecurityCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "validateChangePasswordSecurityCode")
    public JAXBElement<ValidateChangePasswordSecurityCode> createValidateChangePasswordSecurityCode(ValidateChangePasswordSecurityCode value) {
        return new JAXBElement<ValidateChangePasswordSecurityCode>(_ValidateChangePasswordSecurityCode_QNAME, ValidateChangePasswordSecurityCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExistChangePasswordSecurityCodeCurrentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "existChangePasswordSecurityCodeCurrentResponse")
    public JAXBElement<ExistChangePasswordSecurityCodeCurrentResponse> createExistChangePasswordSecurityCodeCurrentResponse(ExistChangePasswordSecurityCodeCurrentResponse value) {
        return new JAXBElement<ExistChangePasswordSecurityCodeCurrentResponse>(_ExistChangePasswordSecurityCodeCurrentResponse_QNAME, ExistChangePasswordSecurityCodeCurrentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExistChangePasswordSecurityCodeCurrent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "existChangePasswordSecurityCodeCurrent")
    public JAXBElement<ExistChangePasswordSecurityCodeCurrent> createExistChangePasswordSecurityCodeCurrent(ExistChangePasswordSecurityCodeCurrent value) {
        return new JAXBElement<ExistChangePasswordSecurityCodeCurrent>(_ExistChangePasswordSecurityCodeCurrent_QNAME, ExistChangePasswordSecurityCodeCurrent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateChangePasswordSecurityCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "validateChangePasswordSecurityCodeResponse")
    public JAXBElement<ValidateChangePasswordSecurityCodeResponse> createValidateChangePasswordSecurityCodeResponse(ValidateChangePasswordSecurityCodeResponse value) {
        return new JAXBElement<ValidateChangePasswordSecurityCodeResponse>(_ValidateChangePasswordSecurityCodeResponse_QNAME, ValidateChangePasswordSecurityCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeLevelSecurity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "changeLevelSecurity")
    public JAXBElement<ChangeLevelSecurity> createChangeLevelSecurity(ChangeLevelSecurity value) {
        return new JAXBElement<ChangeLevelSecurity>(_ChangeLevelSecurity_QNAME, ChangeLevelSecurity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeLevelSecurityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "changeLevelSecurityResponse")
    public JAXBElement<ChangeLevelSecurityResponse> createChangeLevelSecurityResponse(ChangeLevelSecurityResponse value) {
        return new JAXBElement<ChangeLevelSecurityResponse>(_ChangeLevelSecurityResponse_QNAME, ChangeLevelSecurityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.scc.taisachile.cl/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

}
