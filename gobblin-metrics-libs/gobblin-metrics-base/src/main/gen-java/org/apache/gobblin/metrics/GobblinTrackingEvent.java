/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.gobblin.metrics;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class GobblinTrackingEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6700465194787422943L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GobblinTrackingEvent\",\"namespace\":\"gobblin.metrics\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\",\"doc\":\"Time at which event was created.\",\"default\":0},{\"name\":\"namespace\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"Namespace used for filtering of events.\"},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Event name.\"},{\"name\":\"metadata\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},\"doc\":\"Event metadata.\",\"default\":{}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Time at which event was created. */
  @Deprecated public long timestamp;
  /** Namespace used for filtering of events. */
  @Deprecated public java.lang.String namespace;
  /** Event name. */
  @Deprecated public java.lang.String name;
  /** Event metadata. */
  @Deprecated public java.util.Map<java.lang.String,java.lang.String> metadata;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GobblinTrackingEvent() {}

  /**
   * All-args constructor.
   * @param timestamp Time at which event was created.
   * @param namespace Namespace used for filtering of events.
   * @param name Event name.
   * @param metadata Event metadata.
   */
  public GobblinTrackingEvent(java.lang.Long timestamp, java.lang.String namespace, java.lang.String name, java.util.Map<java.lang.String,java.lang.String> metadata) {
    this.timestamp = timestamp;
    this.namespace = namespace;
    this.name = name;
    this.metadata = metadata;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return timestamp;
    case 1: return namespace;
    case 2: return name;
    case 3: return metadata;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: timestamp = (java.lang.Long)value$; break;
    case 1: namespace = (java.lang.String)value$; break;
    case 2: name = (java.lang.String)value$; break;
    case 3: metadata = (java.util.Map<java.lang.String,java.lang.String>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return Time at which event was created.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * Time at which event was created.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'namespace' field.
   * @return Namespace used for filtering of events.
   */
  public java.lang.String getNamespace() {
    return namespace;
  }

  /**
   * Sets the value of the 'namespace' field.
   * Namespace used for filtering of events.
   * @param value the value to set.
   */
  public void setNamespace(java.lang.String value) {
    this.namespace = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return Event name.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Event name.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'metadata' field.
   * @return Event metadata.
   */
  public java.util.Map<java.lang.String,java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * Sets the value of the 'metadata' field.
   * Event metadata.
   * @param value the value to set.
   */
  public void setMetadata(java.util.Map<java.lang.String,java.lang.String> value) {
    this.metadata = value;
  }

  /**
   * Creates a new GobblinTrackingEvent RecordBuilder.
   * @return A new GobblinTrackingEvent RecordBuilder
   */
  public static org.apache.gobblin.metrics.GobblinTrackingEvent.Builder newBuilder() {
    return new org.apache.gobblin.metrics.GobblinTrackingEvent.Builder();
  }

  /**
   * Creates a new GobblinTrackingEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GobblinTrackingEvent RecordBuilder
   */
  public static org.apache.gobblin.metrics.GobblinTrackingEvent.Builder newBuilder(org.apache.gobblin.metrics.GobblinTrackingEvent.Builder other) {
    return new org.apache.gobblin.metrics.GobblinTrackingEvent.Builder(other);
  }

  /**
   * Creates a new GobblinTrackingEvent RecordBuilder by copying an existing GobblinTrackingEvent instance.
   * @param other The existing instance to copy.
   * @return A new GobblinTrackingEvent RecordBuilder
   */
  public static org.apache.gobblin.metrics.GobblinTrackingEvent.Builder newBuilder(org.apache.gobblin.metrics.GobblinTrackingEvent other) {
    return new org.apache.gobblin.metrics.GobblinTrackingEvent.Builder(other);
  }

  /**
   * RecordBuilder for GobblinTrackingEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GobblinTrackingEvent>
    implements org.apache.avro.data.RecordBuilder<GobblinTrackingEvent> {

    /** Time at which event was created. */
    private long timestamp;
    /** Namespace used for filtering of events. */
    private java.lang.String namespace;
    /** Event name. */
    private java.lang.String name;
    /** Event metadata. */
    private java.util.Map<java.lang.String,java.lang.String> metadata;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.gobblin.metrics.GobblinTrackingEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.namespace)) {
        this.namespace = data().deepCopy(fields()[1].schema(), other.namespace);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.metadata)) {
        this.metadata = data().deepCopy(fields()[3].schema(), other.metadata);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing GobblinTrackingEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.gobblin.metrics.GobblinTrackingEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.namespace)) {
        this.namespace = data().deepCopy(fields()[1].schema(), other.namespace);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.metadata)) {
        this.metadata = data().deepCopy(fields()[3].schema(), other.metadata);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'timestamp' field.
      * Time at which event was created.
      * @return The value.
      */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * Time at which event was created.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public org.apache.gobblin.metrics.GobblinTrackingEvent.Builder setTimestamp(long value) {
      validate(fields()[0], value);
      this.timestamp = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * Time at which event was created.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * Time at which event was created.
      * @return This builder.
      */
    public org.apache.gobblin.metrics.GobblinTrackingEvent.Builder clearTimestamp() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'namespace' field.
      * Namespace used for filtering of events.
      * @return The value.
      */
    public java.lang.String getNamespace() {
      return namespace;
    }

    /**
      * Sets the value of the 'namespace' field.
      * Namespace used for filtering of events.
      * @param value The value of 'namespace'.
      * @return This builder.
      */
    public org.apache.gobblin.metrics.GobblinTrackingEvent.Builder setNamespace(java.lang.String value) {
      validate(fields()[1], value);
      this.namespace = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'namespace' field has been set.
      * Namespace used for filtering of events.
      * @return True if the 'namespace' field has been set, false otherwise.
      */
    public boolean hasNamespace() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'namespace' field.
      * Namespace used for filtering of events.
      * @return This builder.
      */
    public org.apache.gobblin.metrics.GobblinTrackingEvent.Builder clearNamespace() {
      namespace = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * Event name.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * Event name.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public org.apache.gobblin.metrics.GobblinTrackingEvent.Builder setName(java.lang.String value) {
      validate(fields()[2], value);
      this.name = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * Event name.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'name' field.
      * Event name.
      * @return This builder.
      */
    public org.apache.gobblin.metrics.GobblinTrackingEvent.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'metadata' field.
      * Event metadata.
      * @return The value.
      */
    public java.util.Map<java.lang.String,java.lang.String> getMetadata() {
      return metadata;
    }

    /**
      * Sets the value of the 'metadata' field.
      * Event metadata.
      * @param value The value of 'metadata'.
      * @return This builder.
      */
    public org.apache.gobblin.metrics.GobblinTrackingEvent.Builder setMetadata(java.util.Map<java.lang.String,java.lang.String> value) {
      validate(fields()[3], value);
      this.metadata = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'metadata' field has been set.
      * Event metadata.
      * @return True if the 'metadata' field has been set, false otherwise.
      */
    public boolean hasMetadata() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'metadata' field.
      * Event metadata.
      * @return This builder.
      */
    public org.apache.gobblin.metrics.GobblinTrackingEvent.Builder clearMetadata() {
      metadata = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public GobblinTrackingEvent build() {
      try {
        GobblinTrackingEvent record = new GobblinTrackingEvent();
        record.timestamp = fieldSetFlags()[0] ? this.timestamp : (java.lang.Long) defaultValue(fields()[0]);
        record.namespace = fieldSetFlags()[1] ? this.namespace : (java.lang.String) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.String) defaultValue(fields()[2]);
        record.metadata = fieldSetFlags()[3] ? this.metadata : (java.util.Map<java.lang.String,java.lang.String>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
