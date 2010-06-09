/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.hypertable.thriftgen;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

/**
 * Describes a ColumnFamily
 * <dl>
 *   <dt>name</dt>
 *   <dd>Name of the column family</dd>
 * 
 *   <dt>ag</dt>
 *   <dd>Name of the access group for this CF</dd>
 * 
 *   <dt>max_versions</dt>
 *   <dd>Max versions of the same cell to be stored</dd>
 * 
 *   <dt>ttl</dt>
 *   <dd>Time to live for cells in the CF (ie delete cells older than this time)</dd>
 * </dl>
 */
public class ColumnFamily implements TBase<ColumnFamily, ColumnFamily._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ColumnFamily");

  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField AG_FIELD_DESC = new TField("ag", TType.STRING, (short)2);
  private static final TField MAX_VERSIONS_FIELD_DESC = new TField("max_versions", TType.I32, (short)3);
  private static final TField TTL_FIELD_DESC = new TField("ttl", TType.STRING, (short)4);

  public String name;
  public String ag;
  public int max_versions;
  public String ttl;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    NAME((short)1, "name"),
    AG((short)2, "ag"),
    MAX_VERSIONS((short)3, "max_versions"),
    TTL((short)4, "ttl");

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
        case 1: // NAME
          return NAME;
        case 2: // AG
          return AG;
        case 3: // MAX_VERSIONS
          return MAX_VERSIONS;
        case 4: // TTL
          return TTL;
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
  private static final int __MAX_VERSIONS_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.AG, new FieldMetaData("ag", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.MAX_VERSIONS, new FieldMetaData("max_versions", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.TTL, new FieldMetaData("ttl", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ColumnFamily.class, metaDataMap);
  }

  public ColumnFamily() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ColumnFamily(ColumnFamily other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetAg()) {
      this.ag = other.ag;
    }
    this.max_versions = other.max_versions;
    if (other.isSetTtl()) {
      this.ttl = other.ttl;
    }
  }

  public ColumnFamily deepCopy() {
    return new ColumnFamily(this);
  }

  @Deprecated
  public ColumnFamily clone() {
    return new ColumnFamily(this);
  }

  public String getName() {
    return this.name;
  }

  public ColumnFamily setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getAg() {
    return this.ag;
  }

  public ColumnFamily setAg(String ag) {
    this.ag = ag;
    return this;
  }

  public void unsetAg() {
    this.ag = null;
  }

  /** Returns true if field ag is set (has been asigned a value) and false otherwise */
  public boolean isSetAg() {
    return this.ag != null;
  }

  public void setAgIsSet(boolean value) {
    if (!value) {
      this.ag = null;
    }
  }

  public int getMax_versions() {
    return this.max_versions;
  }

  public ColumnFamily setMax_versions(int max_versions) {
    this.max_versions = max_versions;
    setMax_versionsIsSet(true);
    return this;
  }

  public void unsetMax_versions() {
    __isset_bit_vector.clear(__MAX_VERSIONS_ISSET_ID);
  }

  /** Returns true if field max_versions is set (has been asigned a value) and false otherwise */
  public boolean isSetMax_versions() {
    return __isset_bit_vector.get(__MAX_VERSIONS_ISSET_ID);
  }

  public void setMax_versionsIsSet(boolean value) {
    __isset_bit_vector.set(__MAX_VERSIONS_ISSET_ID, value);
  }

  public String getTtl() {
    return this.ttl;
  }

  public ColumnFamily setTtl(String ttl) {
    this.ttl = ttl;
    return this;
  }

  public void unsetTtl() {
    this.ttl = null;
  }

  /** Returns true if field ttl is set (has been asigned a value) and false otherwise */
  public boolean isSetTtl() {
    return this.ttl != null;
  }

  public void setTtlIsSet(boolean value) {
    if (!value) {
      this.ttl = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case AG:
      if (value == null) {
        unsetAg();
      } else {
        setAg((String)value);
      }
      break;

    case MAX_VERSIONS:
      if (value == null) {
        unsetMax_versions();
      } else {
        setMax_versions((Integer)value);
      }
      break;

    case TTL:
      if (value == null) {
        unsetTtl();
      } else {
        setTtl((String)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case AG:
      return getAg();

    case MAX_VERSIONS:
      return new Integer(getMax_versions());

    case TTL:
      return getTtl();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case NAME:
      return isSetName();
    case AG:
      return isSetAg();
    case MAX_VERSIONS:
      return isSetMax_versions();
    case TTL:
      return isSetTtl();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ColumnFamily)
      return this.equals((ColumnFamily)that);
    return false;
  }

  public boolean equals(ColumnFamily that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_ag = true && this.isSetAg();
    boolean that_present_ag = true && that.isSetAg();
    if (this_present_ag || that_present_ag) {
      if (!(this_present_ag && that_present_ag))
        return false;
      if (!this.ag.equals(that.ag))
        return false;
    }

    boolean this_present_max_versions = true && this.isSetMax_versions();
    boolean that_present_max_versions = true && that.isSetMax_versions();
    if (this_present_max_versions || that_present_max_versions) {
      if (!(this_present_max_versions && that_present_max_versions))
        return false;
      if (this.max_versions != that.max_versions)
        return false;
    }

    boolean this_present_ttl = true && this.isSetTtl();
    boolean that_present_ttl = true && that.isSetTtl();
    if (this_present_ttl || that_present_ttl) {
      if (!(this_present_ttl && that_present_ttl))
        return false;
      if (!this.ttl.equals(that.ttl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ColumnFamily other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ColumnFamily typedOther = (ColumnFamily)other;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAg()).compareTo(typedOther.isSetAg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAg()) {      lastComparison = TBaseHelper.compareTo(this.ag, typedOther.ag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMax_versions()).compareTo(typedOther.isSetMax_versions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMax_versions()) {      lastComparison = TBaseHelper.compareTo(this.max_versions, typedOther.max_versions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTtl()).compareTo(typedOther.isSetTtl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTtl()) {      lastComparison = TBaseHelper.compareTo(this.ttl, typedOther.ttl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // AG
          if (field.type == TType.STRING) {
            this.ag = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // MAX_VERSIONS
          if (field.type == TType.I32) {
            this.max_versions = iprot.readI32();
            setMax_versionsIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // TTL
          if (field.type == TType.STRING) {
            this.ttl = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      if (isSetName()) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(this.name);
        oprot.writeFieldEnd();
      }
    }
    if (this.ag != null) {
      if (isSetAg()) {
        oprot.writeFieldBegin(AG_FIELD_DESC);
        oprot.writeString(this.ag);
        oprot.writeFieldEnd();
      }
    }
    if (isSetMax_versions()) {
      oprot.writeFieldBegin(MAX_VERSIONS_FIELD_DESC);
      oprot.writeI32(this.max_versions);
      oprot.writeFieldEnd();
    }
    if (this.ttl != null) {
      if (isSetTtl()) {
        oprot.writeFieldBegin(TTL_FIELD_DESC);
        oprot.writeString(this.ttl);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ColumnFamily(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetAg()) {
      if (!first) sb.append(", ");
      sb.append("ag:");
      if (this.ag == null) {
        sb.append("null");
      } else {
        sb.append(this.ag);
      }
      first = false;
    }
    if (isSetMax_versions()) {
      if (!first) sb.append(", ");
      sb.append("max_versions:");
      sb.append(this.max_versions);
      first = false;
    }
    if (isSetTtl()) {
      if (!first) sb.append(", ");
      sb.append("ttl:");
      if (this.ttl == null) {
        sb.append("null");
      } else {
        sb.append(this.ttl);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

