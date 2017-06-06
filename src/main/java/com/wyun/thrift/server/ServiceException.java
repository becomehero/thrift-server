/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wyun.thrift.server;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-05-17")
public class ServiceException extends TException implements org.apache.thrift.TBase<ServiceException, ServiceException._Fields>, java.io.Serializable, Cloneable, Comparable<ServiceException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ServiceException");

  private static final org.apache.thrift.protocol.TField EXCEPTION_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("exceptionCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField EXCEPTION_MESS_FIELD_DESC = new org.apache.thrift.protocol.TField("exceptionMess", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ServiceExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ServiceExceptionTupleSchemeFactory());
  }

  public EXCCODE exceptionCode; // required
  public String exceptionMess; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXCEPTION_CODE((short)1, "exceptionCode"),
    EXCEPTION_MESS((short)2, "exceptionMess");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EXCEPTION_CODE
          return EXCEPTION_CODE;
        case 2: // EXCEPTION_MESS
          return EXCEPTION_MESS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXCEPTION_CODE, new org.apache.thrift.meta_data.FieldMetaData("exceptionCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.ENUM        , "EXCCODE")));
    tmpMap.put(_Fields.EXCEPTION_MESS, new org.apache.thrift.meta_data.FieldMetaData("exceptionMess", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ServiceException.class, metaDataMap);
  }

  public ServiceException() {
  }

  public ServiceException(
    EXCCODE exceptionCode,
    String exceptionMess)
  {
    this();
    this.exceptionCode = exceptionCode;
    this.exceptionMess = exceptionMess;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServiceException(ServiceException other) {
    if (other.isSetExceptionCode()) {
      this.exceptionCode = other.exceptionCode;
    }
    if (other.isSetExceptionMess()) {
      this.exceptionMess = other.exceptionMess;
    }
  }

  public ServiceException deepCopy() {
    return new ServiceException(this);
  }

  @Override
  public void clear() {
    this.exceptionCode = null;
    this.exceptionMess = null;
  }

  public EXCCODE getExceptionCode() {
    return this.exceptionCode;
  }

  public ServiceException setExceptionCode(EXCCODE exceptionCode) {
    this.exceptionCode = exceptionCode;
    return this;
  }

  public void unsetExceptionCode() {
    this.exceptionCode = null;
  }

  /** Returns true if field exceptionCode is set (has been assigned a value) and false otherwise */
  public boolean isSetExceptionCode() {
    return this.exceptionCode != null;
  }

  public void setExceptionCodeIsSet(boolean value) {
    if (!value) {
      this.exceptionCode = null;
    }
  }

  public String getExceptionMess() {
    return this.exceptionMess;
  }

  public ServiceException setExceptionMess(String exceptionMess) {
    this.exceptionMess = exceptionMess;
    return this;
  }

  public void unsetExceptionMess() {
    this.exceptionMess = null;
  }

  /** Returns true if field exceptionMess is set (has been assigned a value) and false otherwise */
  public boolean isSetExceptionMess() {
    return this.exceptionMess != null;
  }

  public void setExceptionMessIsSet(boolean value) {
    if (!value) {
      this.exceptionMess = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXCEPTION_CODE:
      if (value == null) {
        unsetExceptionCode();
      } else {
        setExceptionCode((EXCCODE)value);
      }
      break;

    case EXCEPTION_MESS:
      if (value == null) {
        unsetExceptionMess();
      } else {
        setExceptionMess((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXCEPTION_CODE:
      return getExceptionCode();

    case EXCEPTION_MESS:
      return getExceptionMess();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXCEPTION_CODE:
      return isSetExceptionCode();
    case EXCEPTION_MESS:
      return isSetExceptionMess();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ServiceException)
      return this.equals((ServiceException)that);
    return false;
  }

  public boolean equals(ServiceException that) {
    if (that == null)
      return false;

    boolean this_present_exceptionCode = true && this.isSetExceptionCode();
    boolean that_present_exceptionCode = true && that.isSetExceptionCode();
    if (this_present_exceptionCode || that_present_exceptionCode) {
      if (!(this_present_exceptionCode && that_present_exceptionCode))
        return false;
      if (!this.exceptionCode.equals(that.exceptionCode))
        return false;
    }

    boolean this_present_exceptionMess = true && this.isSetExceptionMess();
    boolean that_present_exceptionMess = true && that.isSetExceptionMess();
    if (this_present_exceptionMess || that_present_exceptionMess) {
      if (!(this_present_exceptionMess && that_present_exceptionMess))
        return false;
      if (!this.exceptionMess.equals(that.exceptionMess))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_exceptionCode = true && (isSetExceptionCode());
    list.add(present_exceptionCode);
    if (present_exceptionCode)
      list.add(exceptionCode.getValue());

    boolean present_exceptionMess = true && (isSetExceptionMess());
    list.add(present_exceptionMess);
    if (present_exceptionMess)
      list.add(exceptionMess);

    return list.hashCode();
  }

  @Override
  public int compareTo(ServiceException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExceptionCode()).compareTo(other.isSetExceptionCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExceptionCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exceptionCode, other.exceptionCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExceptionMess()).compareTo(other.isSetExceptionMess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExceptionMess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exceptionMess, other.exceptionMess);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ServiceException(");
    boolean first = true;

    sb.append("exceptionCode:");
    if (this.exceptionCode == null) {
      sb.append("null");
    } else {
      sb.append(this.exceptionCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("exceptionMess:");
    if (this.exceptionMess == null) {
      sb.append("null");
    } else {
      sb.append(this.exceptionMess);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (exceptionCode == null) {
      throw new TProtocolException("Required field 'exceptionCode' was not present! Struct: " + toString());
    }
    if (exceptionMess == null) {
      throw new TProtocolException("Required field 'exceptionMess' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ServiceExceptionStandardSchemeFactory implements SchemeFactory {
    public ServiceExceptionStandardScheme getScheme() {
      return new ServiceExceptionStandardScheme();
    }
  }

  private static class ServiceExceptionStandardScheme extends StandardScheme<ServiceException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ServiceException struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // EXCEPTION_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.exceptionCode = EXCCODE.findByValue(iprot.readI32());
              struct.setExceptionCodeIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXCEPTION_MESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exceptionMess = iprot.readString();
              struct.setExceptionMessIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ServiceException struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.exceptionCode != null) {
        oprot.writeFieldBegin(EXCEPTION_CODE_FIELD_DESC);
        oprot.writeI32(struct.exceptionCode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.exceptionMess != null) {
        oprot.writeFieldBegin(EXCEPTION_MESS_FIELD_DESC);
        oprot.writeString(struct.exceptionMess);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ServiceExceptionTupleSchemeFactory implements SchemeFactory {
    public ServiceExceptionTupleScheme getScheme() {
      return new ServiceExceptionTupleScheme();
    }
  }

  private static class ServiceExceptionTupleScheme extends TupleScheme<ServiceException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ServiceException struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.exceptionCode.getValue());
      oprot.writeString(struct.exceptionMess);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ServiceException struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.exceptionCode = EXCCODE.findByValue(iprot.readI32());
      struct.setExceptionCodeIsSet(true);
      struct.exceptionMess = iprot.readString();
      struct.setExceptionMessIsSet(true);
    }
  }

}

