package cn.shine.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 工商企业基本信息表
 * </p>
 *
 * @author zhj
 * @since 2020-10-13
 */
public class PudongEnterpriseInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 原始id
     */
    private String hrowkey;

    /**
     * 公司名称
     */
    private String corporateName;

    /**
     * 法人姓名
     */
    private String nameOfLegalPerson;

    /**
     * 法人类型  1个人 2企业 0其他
     */
    private String corporateType;

    /**
     * 注册号
     */
    private String registrationNumber;

    /**
     * 公司类型
     */
    private String companyType;

    /**
     * 成立日期
     */
    private String dateOfEstablishment;

    /**
     * 营业期限开始日期
     */
    private String dateOfCommencementOfBusinessTerm;

    /**
     * 营业期限终止日期
     */
    private String terminationDateOfBusinessTerm;

    /**
     * 经营范围
     */
    private String businessScope;

    /**
     * 注册地址
     */
    private String registeredAddress;

    /**
     * 登记机关
     */
    private String registrationAuthority;

    /**
     * 核准日期
     */
    private String approvalDate;

    /**
     * 企业状态
     */
    private String enterpriseState;

    /**
     * 注册资金
     */
    private String registeredCapital;

    /**
     * 实收注册资金
     */
    private String actuallyRegisteredCapital;

    /**
     * 组织机构代码
     */
    private String organizationCode;

    /**
     * 统一社会信用代码
     */
    private String unifiedSocialCreditCode;

    /**
     * 纳税人识别号
     */
    private String taxpayerIdentificationNumber;

    /**
     * 扩展信息
     */
    private String extendInfo;

    /**
     * 省份
     */
    private String province;

    /**
     * 是否删除
     */
    private String isDeleted;

    /**
     * 原企业名称
     */
    private String beforeName;

    /**
     * 公司电话
     */
    private String telephone;

    /**
     * 公司住所
     */
    private String companyAddress;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getHrowkey() {
        return hrowkey;
    }

    public void setHrowkey(String hrowkey) {
        this.hrowkey = hrowkey;
    }
    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }
    public String getNameOfLegalPerson() {
        return nameOfLegalPerson;
    }

    public void setNameOfLegalPerson(String nameOfLegalPerson) {
        this.nameOfLegalPerson = nameOfLegalPerson;
    }
    public String getCorporateType() {
        return corporateType;
    }

    public void setCorporateType(String corporateType) {
        this.corporateType = corporateType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }
    public String getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    public void setDateOfEstablishment(String dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }
    public String getDateOfCommencementOfBusinessTerm() {
        return dateOfCommencementOfBusinessTerm;
    }

    public void setDateOfCommencementOfBusinessTerm(String dateOfCommencementOfBusinessTerm) {
        this.dateOfCommencementOfBusinessTerm = dateOfCommencementOfBusinessTerm;
    }
    public String getTerminationDateOfBusinessTerm() {
        return terminationDateOfBusinessTerm;
    }

    public void setTerminationDateOfBusinessTerm(String terminationDateOfBusinessTerm) {
        this.terminationDateOfBusinessTerm = terminationDateOfBusinessTerm;
    }
    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }
    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }
    public String getRegistrationAuthority() {
        return registrationAuthority;
    }

    public void setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority;
    }
    public String getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(String approvalDate) {
        this.approvalDate = approvalDate;
    }
    public String getEnterpriseState() {
        return enterpriseState;
    }

    public void setEnterpriseState(String enterpriseState) {
        this.enterpriseState = enterpriseState;
    }
    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }
    public String getActuallyRegisteredCapital() {
        return actuallyRegisteredCapital;
    }

    public void setActuallyRegisteredCapital(String actuallyRegisteredCapital) {
        this.actuallyRegisteredCapital = actuallyRegisteredCapital;
    }
    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }
    public String getUnifiedSocialCreditCode() {
        return unifiedSocialCreditCode;
    }

    public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode;
    }
    public String getTaxpayerIdentificationNumber() {
        return taxpayerIdentificationNumber;
    }

    public void setTaxpayerIdentificationNumber(String taxpayerIdentificationNumber) {
        this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
    }
    public String getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
    }
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
    public String getBeforeName() {
        return beforeName;
    }

    public void setBeforeName(String beforeName) {
        this.beforeName = beforeName;
    }
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "PudongEnterpriseInformation{" +
            "id=" + id +
            ", hrowkey=" + hrowkey +
            ", corporateName=" + corporateName +
            ", nameOfLegalPerson=" + nameOfLegalPerson +
            ", corporateType=" + corporateType +
            ", registrationNumber=" + registrationNumber +
            ", companyType=" + companyType +
            ", dateOfEstablishment=" + dateOfEstablishment +
            ", dateOfCommencementOfBusinessTerm=" + dateOfCommencementOfBusinessTerm +
            ", terminationDateOfBusinessTerm=" + terminationDateOfBusinessTerm +
            ", businessScope=" + businessScope +
            ", registeredAddress=" + registeredAddress +
            ", registrationAuthority=" + registrationAuthority +
            ", approvalDate=" + approvalDate +
            ", enterpriseState=" + enterpriseState +
            ", registeredCapital=" + registeredCapital +
            ", actuallyRegisteredCapital=" + actuallyRegisteredCapital +
            ", organizationCode=" + organizationCode +
            ", unifiedSocialCreditCode=" + unifiedSocialCreditCode +
            ", taxpayerIdentificationNumber=" + taxpayerIdentificationNumber +
            ", extendInfo=" + extendInfo +
            ", province=" + province +
            ", isDeleted=" + isDeleted +
            ", beforeName=" + beforeName +
            ", telephone=" + telephone +
            ", companyAddress=" + companyAddress +
            ", gmtCreate=" + gmtCreate +
            ", gmtModified=" + gmtModified +
        "}";
    }
}
