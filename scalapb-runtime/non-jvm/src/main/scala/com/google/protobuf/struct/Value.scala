// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.struct

/** `Value` represents a dynamically typed value which can be either
  * null, a number, a string, a boolean, a recursive struct value, or a
  * list of values. A producer of value is expected to set one of that
  * variants, absence of any variant indicates an error.
  *
  * The JSON representation for `Value` is JSON value.
  */
@SerialVersionUID(0L)
final case class Value(
    kind: com.google.protobuf.struct.Value.Kind = com.google.protobuf.struct.Value.Kind.Empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[Value] with scalapb.lenses.Updatable[Value] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (kind.nullValue.isDefined) {
        val __value = kind.nullValue.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, __value.value)
      };
      if (kind.numberValue.isDefined) {
        val __value = kind.numberValue.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(2, __value)
      };
      if (kind.stringValue.isDefined) {
        val __value = kind.stringValue.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
      };
      if (kind.boolValue.isDefined) {
        val __value = kind.boolValue.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(4, __value)
      };
      if (kind.structValue.isDefined) {
        val __value = kind.structValue.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (kind.listValue.isDefined) {
        val __value = kind.listValue.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      kind.nullValue.foreach { __v =>
        val __m = __v
        _output__.writeEnum(1, __m.value)
      };
      kind.numberValue.foreach { __v =>
        val __m = __v
        _output__.writeDouble(2, __m)
      };
      kind.stringValue.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      kind.boolValue.foreach { __v =>
        val __m = __v
        _output__.writeBool(4, __m)
      };
      kind.structValue.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      kind.listValue.foreach { __v =>
        val __m = __v
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.struct.Value = {
      var __kind = this.kind
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __kind = com.google.protobuf.struct.Value.Kind.NullValue(com.google.protobuf.struct.NullValue.fromValue(_input__.readEnum()))
          case 17 =>
            __kind = com.google.protobuf.struct.Value.Kind.NumberValue(_input__.readDouble())
          case 26 =>
            __kind = com.google.protobuf.struct.Value.Kind.StringValue(_input__.readString())
          case 32 =>
            __kind = com.google.protobuf.struct.Value.Kind.BoolValue(_input__.readBool())
          case 42 =>
            __kind = com.google.protobuf.struct.Value.Kind.StructValue(_root_.scalapb.LiteParser.readMessage(_input__, kind.structValue.getOrElse(com.google.protobuf.struct.Struct.defaultInstance)))
          case 50 =>
            __kind = com.google.protobuf.struct.Value.Kind.ListValue(_root_.scalapb.LiteParser.readMessage(_input__, kind.listValue.getOrElse(com.google.protobuf.struct.ListValue.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.struct.Value(
          kind = __kind
      )
    }
    def getNullValue: com.google.protobuf.struct.NullValue = kind.nullValue.getOrElse(com.google.protobuf.struct.NullValue.NULL_VALUE)
    def withNullValue(__v: com.google.protobuf.struct.NullValue): Value = copy(kind = com.google.protobuf.struct.Value.Kind.NullValue(__v))
    def getNumberValue: _root_.scala.Double = kind.numberValue.getOrElse(0.0)
    def withNumberValue(__v: _root_.scala.Double): Value = copy(kind = com.google.protobuf.struct.Value.Kind.NumberValue(__v))
    def getStringValue: _root_.scala.Predef.String = kind.stringValue.getOrElse("")
    def withStringValue(__v: _root_.scala.Predef.String): Value = copy(kind = com.google.protobuf.struct.Value.Kind.StringValue(__v))
    def getBoolValue: _root_.scala.Boolean = kind.boolValue.getOrElse(false)
    def withBoolValue(__v: _root_.scala.Boolean): Value = copy(kind = com.google.protobuf.struct.Value.Kind.BoolValue(__v))
    def getStructValue: com.google.protobuf.struct.Struct = kind.structValue.getOrElse(com.google.protobuf.struct.Struct.defaultInstance)
    def withStructValue(__v: com.google.protobuf.struct.Struct): Value = copy(kind = com.google.protobuf.struct.Value.Kind.StructValue(__v))
    def getListValue: com.google.protobuf.struct.ListValue = kind.listValue.getOrElse(com.google.protobuf.struct.ListValue.defaultInstance)
    def withListValue(__v: com.google.protobuf.struct.ListValue): Value = copy(kind = com.google.protobuf.struct.Value.Kind.ListValue(__v))
    def clearKind: Value = copy(kind = com.google.protobuf.struct.Value.Kind.Empty)
    def withKind(__v: com.google.protobuf.struct.Value.Kind): Value = copy(kind = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => kind.nullValue.map(_.javaValueDescriptor).orNull
        case 2 => kind.numberValue.orNull
        case 3 => kind.stringValue.orNull
        case 4 => kind.boolValue.orNull
        case 5 => kind.structValue.orNull
        case 6 => kind.listValue.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => kind.nullValue.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => kind.numberValue.map(_root_.scalapb.descriptors.PDouble).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => kind.stringValue.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => kind.boolValue.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => kind.structValue.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => kind.listValue.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.struct.Value
}

object Value extends scalapb.GeneratedMessageCompanion[com.google.protobuf.struct.Value] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.struct.Value] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.protobuf.struct.Value = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.struct.Value(
      kind = __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => com.google.protobuf.struct.Value.Kind.NullValue(com.google.protobuf.struct.NullValue.fromValue(__e.getNumber)))
    .orElse[com.google.protobuf.struct.Value.Kind](__fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[_root_.scala.Double]].map(com.google.protobuf.struct.Value.Kind.NumberValue))
    .orElse[com.google.protobuf.struct.Value.Kind](__fieldsMap.get(__fields.get(2)).asInstanceOf[_root_.scala.Option[_root_.scala.Predef.String]].map(com.google.protobuf.struct.Value.Kind.StringValue))
    .orElse[com.google.protobuf.struct.Value.Kind](__fieldsMap.get(__fields.get(3)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]].map(com.google.protobuf.struct.Value.Kind.BoolValue))
    .orElse[com.google.protobuf.struct.Value.Kind](__fieldsMap.get(__fields.get(4)).asInstanceOf[_root_.scala.Option[com.google.protobuf.struct.Struct]].map(com.google.protobuf.struct.Value.Kind.StructValue))
    .orElse[com.google.protobuf.struct.Value.Kind](__fieldsMap.get(__fields.get(5)).asInstanceOf[_root_.scala.Option[com.google.protobuf.struct.ListValue]].map(com.google.protobuf.struct.Value.Kind.ListValue))
    .getOrElse(com.google.protobuf.struct.Value.Kind.Empty)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.struct.Value] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.struct.Value(
        kind = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => com.google.protobuf.struct.Value.Kind.NullValue(com.google.protobuf.struct.NullValue.fromValue(__e.number)))
    .orElse[com.google.protobuf.struct.Value.Kind](__fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Double]]).map(com.google.protobuf.struct.Value.Kind.NumberValue))
    .orElse[com.google.protobuf.struct.Value.Kind](__fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]).map(com.google.protobuf.struct.Value.Kind.StringValue))
    .orElse[com.google.protobuf.struct.Value.Kind](__fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]).map(com.google.protobuf.struct.Value.Kind.BoolValue))
    .orElse[com.google.protobuf.struct.Value.Kind](__fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.struct.Struct]]).map(com.google.protobuf.struct.Value.Kind.StructValue))
    .orElse[com.google.protobuf.struct.Value.Kind](__fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.struct.ListValue]]).map(com.google.protobuf.struct.Value.Kind.ListValue))
    .getOrElse(com.google.protobuf.struct.Value.Kind.Empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = StructProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = StructProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 5 => __out = com.google.protobuf.struct.Struct
      case 6 => __out = com.google.protobuf.struct.ListValue
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => com.google.protobuf.struct.NullValue
    }
  }
  lazy val defaultInstance = com.google.protobuf.struct.Value(
  )
  sealed trait Kind extends _root_.scalapb.GeneratedOneof {
    def isEmpty: _root_.scala.Boolean = false
    def isDefined: _root_.scala.Boolean = true
    def isNullValue: _root_.scala.Boolean = false
    def isNumberValue: _root_.scala.Boolean = false
    def isStringValue: _root_.scala.Boolean = false
    def isBoolValue: _root_.scala.Boolean = false
    def isStructValue: _root_.scala.Boolean = false
    def isListValue: _root_.scala.Boolean = false
    def nullValue: _root_.scala.Option[com.google.protobuf.struct.NullValue] = None
    def numberValue: _root_.scala.Option[_root_.scala.Double] = None
    def stringValue: _root_.scala.Option[_root_.scala.Predef.String] = None
    def boolValue: _root_.scala.Option[_root_.scala.Boolean] = None
    def structValue: _root_.scala.Option[com.google.protobuf.struct.Struct] = None
    def listValue: _root_.scala.Option[com.google.protobuf.struct.ListValue] = None
  }
  object Kind extends {
    @SerialVersionUID(0L)
    case object Empty extends com.google.protobuf.struct.Value.Kind {
      type ValueType = _root_.scala.Nothing
      override def isEmpty: _root_.scala.Boolean = true
      override def isDefined: _root_.scala.Boolean = false
      override def number: _root_.scala.Int = 0
      override def value: _root_.scala.Nothing = throw new java.util.NoSuchElementException("Empty.value")
    }
  
    @SerialVersionUID(0L)
    final case class NullValue(value: com.google.protobuf.struct.NullValue) extends com.google.protobuf.struct.Value.Kind {
      type ValueType = com.google.protobuf.struct.NullValue
      override def isNullValue: _root_.scala.Boolean = true
      override def nullValue: _root_.scala.Option[com.google.protobuf.struct.NullValue] = Some(value)
      override def number: _root_.scala.Int = 1
    }
    @SerialVersionUID(0L)
    final case class NumberValue(value: _root_.scala.Double) extends com.google.protobuf.struct.Value.Kind {
      type ValueType = _root_.scala.Double
      override def isNumberValue: _root_.scala.Boolean = true
      override def numberValue: _root_.scala.Option[_root_.scala.Double] = Some(value)
      override def number: _root_.scala.Int = 2
    }
    @SerialVersionUID(0L)
    final case class StringValue(value: _root_.scala.Predef.String) extends com.google.protobuf.struct.Value.Kind {
      type ValueType = _root_.scala.Predef.String
      override def isStringValue: _root_.scala.Boolean = true
      override def stringValue: _root_.scala.Option[_root_.scala.Predef.String] = Some(value)
      override def number: _root_.scala.Int = 3
    }
    @SerialVersionUID(0L)
    final case class BoolValue(value: _root_.scala.Boolean) extends com.google.protobuf.struct.Value.Kind {
      type ValueType = _root_.scala.Boolean
      override def isBoolValue: _root_.scala.Boolean = true
      override def boolValue: _root_.scala.Option[_root_.scala.Boolean] = Some(value)
      override def number: _root_.scala.Int = 4
    }
    @SerialVersionUID(0L)
    final case class StructValue(value: com.google.protobuf.struct.Struct) extends com.google.protobuf.struct.Value.Kind {
      type ValueType = com.google.protobuf.struct.Struct
      override def isStructValue: _root_.scala.Boolean = true
      override def structValue: _root_.scala.Option[com.google.protobuf.struct.Struct] = Some(value)
      override def number: _root_.scala.Int = 5
    }
    @SerialVersionUID(0L)
    final case class ListValue(value: com.google.protobuf.struct.ListValue) extends com.google.protobuf.struct.Value.Kind {
      type ValueType = com.google.protobuf.struct.ListValue
      override def isListValue: _root_.scala.Boolean = true
      override def listValue: _root_.scala.Option[com.google.protobuf.struct.ListValue] = Some(value)
      override def number: _root_.scala.Int = 6
    }
  }
  implicit class ValueLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.Value]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.struct.Value](_l) {
    def nullValue: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.NullValue] = field(_.getNullValue)((c_, f_) => c_.copy(kind = com.google.protobuf.struct.Value.Kind.NullValue(f_)))
    def numberValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.getNumberValue)((c_, f_) => c_.copy(kind = com.google.protobuf.struct.Value.Kind.NumberValue(f_)))
    def stringValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getStringValue)((c_, f_) => c_.copy(kind = com.google.protobuf.struct.Value.Kind.StringValue(f_)))
    def boolValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getBoolValue)((c_, f_) => c_.copy(kind = com.google.protobuf.struct.Value.Kind.BoolValue(f_)))
    def structValue: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.Struct] = field(_.getStructValue)((c_, f_) => c_.copy(kind = com.google.protobuf.struct.Value.Kind.StructValue(f_)))
    def listValue: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.ListValue] = field(_.getListValue)((c_, f_) => c_.copy(kind = com.google.protobuf.struct.Value.Kind.ListValue(f_)))
    def kind: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.Value.Kind] = field(_.kind)((c_, f_) => c_.copy(kind = f_))
  }
  final val NULL_VALUE_FIELD_NUMBER = 1
  final val NUMBER_VALUE_FIELD_NUMBER = 2
  final val STRING_VALUE_FIELD_NUMBER = 3
  final val BOOL_VALUE_FIELD_NUMBER = 4
  final val STRUCT_VALUE_FIELD_NUMBER = 5
  final val LIST_VALUE_FIELD_NUMBER = 6
  def of(
    kind: com.google.protobuf.struct.Value.Kind
  ): _root_.com.google.protobuf.struct.Value = _root_.com.google.protobuf.struct.Value(
    kind
  )
}
